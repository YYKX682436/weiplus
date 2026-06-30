package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9;

/* renamed from: com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer */
/* loaded from: classes13.dex */
public class C25401x58f18ffd {

    /* renamed from: dataSource */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f45941x4bd85c65;

    /* renamed from: totalPcmInByte */
    private long f45945x43af8a63;

    /* renamed from: speedMap */
    private final java.util.Map<java.lang.String, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck> f45944x80f87395 = new java.util.LinkedHashMap();

    /* renamed from: lastTimeStampNanoSecond */
    private long f45942x5d7f3f68 = 0;

    /* renamed from: playStartTimestampNanoSec */
    private long f45943xe40818b5 = 0;

    /* renamed from: totalTimeCostInNanoSec */
    private long f45946xa160121a = 0;

    /* renamed from: com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer$BufferSizeCheck */
    /* loaded from: classes8.dex */
    public static class BufferSizeCheck {

        /* renamed from: name */
        private final java.lang.String f45949x337a8b;

        /* renamed from: sizeMismatchCount */
        private int f45950xe5d6d960 = 0;

        /* renamed from: lastSize */
        private int f45947xa902abb7 = 0;

        /* renamed from: maxMismatch */
        private int f45948x30dbf752 = 0;

        public BufferSizeCheck(java.lang.String str) {
            this.f45949x337a8b = str;
        }

        /* renamed from: getMaxMismatch */
        public int m94110xab23e1c() {
            return this.f45948x30dbf752;
        }

        /* renamed from: getName */
        public java.lang.String m94111xfb82e301() {
            return this.f45949x337a8b;
        }

        /* renamed from: getSizeMismatchCount */
        public int m94112x390b60aa() {
            return this.f45950xe5d6d960;
        }

        /* renamed from: onEnd */
        public void m94113x64f427c(int i17) {
            int i18 = this.f45947xa902abb7;
            if (i17 != i18) {
                int i19 = i18 - i17;
                if (java.lang.Math.abs(i19) > this.f45948x30dbf752) {
                    this.f45948x30dbf752 = i19;
                }
                this.f45950xe5d6d960++;
            }
        }

        /* renamed from: onStart */
        public void m94114xb05099c3(int i17) {
            this.f45947xa902abb7 = i17;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer$OverallInfo */
    /* loaded from: classes13.dex */
    public static class OverallInfo {

        /* renamed from: dataSource */
        final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e f45951x4bd85c65;

        /* renamed from: timeCostInMs */
        final long f45952xfb167105;

        /* renamed from: totalPcmToBePlayed */
        final long f45953x26df6427;

        public OverallInfo(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e, long j17, long j18) {
            this.f45951x4bd85c65 = interfaceC25439x37e1318e;
            this.f45952xfb167105 = j17;
            this.f45953x26df6427 = j18;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer$SpeedCheck */
    /* loaded from: classes13.dex */
    public static class SpeedCheck {

        /* renamed from: f, reason: collision with root package name */
        private static final double f296787f = 1000000.0d;
        private double avg;
        private double max;
        private double min;

        /* renamed from: name */
        private final java.lang.String f45954x337a8b;

        /* renamed from: totalBufferLength */
        private long f45955xc99df4aa;

        /* renamed from: totalTimeNanoSecond */
        private long f45956x11e94759;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: compute */
        public void m94117x38a78837() {
            this.avg = (this.f45955xc99df4aa * f296787f) / this.f45956x11e94759;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: update */
        public void m94118xce0038c9(int i17, long j17) {
            this.f45955xc99df4aa += i17;
            this.f45956x11e94759 += j17;
            double d17 = (i17 * f296787f) / j17;
            double d18 = this.max;
            if (d17 > d18 || d18 == 0.0d) {
                this.max = d17;
                return;
            }
            double d19 = this.min;
            if (d17 < d19 || d19 == 0.0d) {
                this.min = d17;
            }
        }

        /* renamed from: getAvg */
        public double m94119xb5882b9c() {
            return this.avg;
        }

        /* renamed from: getMax */
        public double m94120xb588562e() {
            return this.max;
        }

        /* renamed from: getMin */
        public double m94121xb588571c() {
            return this.min;
        }

        /* renamed from: getName */
        public java.lang.String m94122xfb82e301() {
            return this.f45954x337a8b;
        }

        /* renamed from: getTotalBufferLength */
        public long m94123x1cd27bf4() {
            return this.f45955xc99df4aa;
        }

        /* renamed from: getTotalTimeMs */
        public long m94124xaf166881() {
            return java.lang.Math.round(this.f45956x11e94759 / f296787f);
        }

        /* renamed from: reset */
        public void m94125x6761d4f() {
            this.avg = 0.0d;
            this.max = 0.0d;
            this.min = 0.0d;
            this.f45956x11e94759 = 0L;
            this.f45955xc99df4aa = 0L;
        }

        /* renamed from: toString */
        public java.lang.String m94126x9616526c() {
            m94117x38a78837();
            return java.lang.String.format(java.util.Locale.getDefault(), "%10s%15.2f%15.2f%15.2f%10d%15d", this.f45954x337a8b, java.lang.Double.valueOf(this.avg), java.lang.Double.valueOf(this.max), java.lang.Double.valueOf(this.min), java.lang.Long.valueOf(this.f45956x11e94759), java.lang.Long.valueOf(this.f45955xc99df4aa));
        }

        private SpeedCheck(java.lang.String str) {
            this.f45954x337a8b = str;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer$Visitor */
    /* loaded from: classes13.dex */
    public interface Visitor {
        /* renamed from: visitSpeedCheck */
        void mo94127x6e6650ac(java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck> list, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.OverallInfo overallInfo);
    }

    /* renamed from: getSpeedCheck */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck m94102x1260c0f7(java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck speedCheck = this.f45944x80f87395.get(str);
        if (speedCheck != null) {
            return speedCheck;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck speedCheck2 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck(str);
        this.f45944x80f87395.put(str, speedCheck2);
        return speedCheck2;
    }

    /* renamed from: accept */
    public void m94103xab27b508(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.Visitor visitor) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.f45944x80f87395.values());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck) it.next()).m94117x38a78837();
        }
        visitor.mo94127x6e6650ac(arrayList, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.OverallInfo(this.f45941x4bd85c65, java.lang.Math.round(this.f45946xa160121a / 1000000.0d), this.f45945x43af8a63));
    }

    public void end(java.lang.String str, int i17) {
        m94102x1260c0f7(str).m94118xce0038c9(i17, java.lang.System.nanoTime() - this.f45942x5d7f3f68);
    }

    /* renamed from: init */
    public void m94104x316510(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        this.f45941x4bd85c65 = interfaceC25439x37e1318e;
        this.f45942x5d7f3f68 = 0L;
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2909x3472e9.C25401x58f18ffd.SpeedCheck> it = this.f45944x80f87395.values().iterator();
        while (it.hasNext()) {
            it.next().m94125x6761d4f();
        }
    }

    /* renamed from: playEnd */
    public void m94105xe2944907() {
    }

    /* renamed from: playStart */
    public void m94106x8f6e298e() {
        this.f45945x43af8a63 = 0L;
    }

    /* renamed from: roundEnd */
    public void m94107xfffd4c6d(int i17) {
        this.f45945x43af8a63 += i17;
        this.f45946xa160121a += java.lang.System.nanoTime() - this.f45943xe40818b5;
    }

    /* renamed from: roundStart */
    public void m94108xf6a3eb74() {
        this.f45943xe40818b5 = java.lang.System.nanoTime();
    }

    /* renamed from: start */
    public void m94109x68ac462(java.lang.String str) {
        m94102x1260c0f7(str);
        this.f45942x5d7f3f68 = java.lang.System.nanoTime();
    }
}
