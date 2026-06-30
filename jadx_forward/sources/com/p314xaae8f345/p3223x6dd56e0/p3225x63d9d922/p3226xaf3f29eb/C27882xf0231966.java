package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.CommonUtils */
/* loaded from: classes13.dex */
public class C27882xf0231966 {

    /* renamed from: MAX_TIMEOUT_MS */
    public static final int f61495xe0f2fb3f = 30000;

    /* renamed from: MIN_TIMEOUT_MS */
    public static final int f61496x81ab991 = 0;
    private static final java.lang.String TAG = "CommonUtils";

    /* renamed from: benchMarkMaps */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.BenchMarkTime> f61497x183f1954 = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.youtu.sdkkitframework.common.CommonUtils$BenchMarkTime */
    /* loaded from: classes13.dex */
    public static class BenchMarkTime {

        /* renamed from: begin */
        long f61499x59478a9;

        /* renamed from: total */
        long f61501x696db44 = 0;

        /* renamed from: tick */
        long f61500x36519d = 0;
        long cur = 0;
        long avg = 0;
        long min = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        long max = Long.MIN_VALUE;

        /* renamed from: update */
        private void m120569xce0038c9(long j17) {
            this.f61500x36519d++;
            this.min = java.lang.Math.min(j17, this.min);
            this.max = java.lang.Math.max(j17, this.max);
            long j18 = this.f61501x696db44 + j17;
            this.f61501x696db44 = j18;
            this.avg = j18 / this.f61500x36519d;
        }

        /* renamed from: begin */
        public void m120570x59478a9() {
            this.f61499x59478a9 = java.lang.System.currentTimeMillis();
        }

        public void end() {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f61499x59478a9;
            this.cur = currentTimeMillis;
            m120569xce0038c9(currentTimeMillis);
        }

        /* renamed from: getTime */
        public java.lang.String m120571xfb85bb43() {
            return "avg: " + this.avg + "ms min: " + this.min + "ms max: " + this.max + "ms cur: " + this.cur + "ms";
        }
    }

    /* renamed from: benchMarkBegin */
    public static void m120562xef0abd8c(java.lang.String str) {
        if (!f61497x183f1954.containsKey(str)) {
            f61497x183f1954.put(str, new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.BenchMarkTime());
        }
        f61497x183f1954.get(str).m120570x59478a9();
    }

    /* renamed from: benchMarkEnd */
    public static long m120563xc6f9aa7e(java.lang.String str) {
        if (!f61497x183f1954.containsKey(str)) {
            return 0L;
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.BenchMarkTime benchMarkTime = f61497x183f1954.get(str);
        benchMarkTime.end();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "benchMarkEnd -- " + str + " : " + benchMarkTime.cur + "ms");
        return benchMarkTime.cur;
    }

    /* renamed from: getBenchMarkTime */
    public static java.lang.String m120564xd5a221d4(java.lang.String str) {
        if (!f61497x183f1954.containsKey(str)) {
            return "";
        }
        return "[" + str + "]" + f61497x183f1954.get(str).m120571xfb85bb43();
    }

    /* renamed from: getSignature */
    private static byte[] m120565x3f6b0a02(java.lang.String str, java.lang.String str2) {
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA1");
        mac.init(new javax.crypto.spec.SecretKeySpec(str2.getBytes(), mac.getAlgorithm()));
        return mac.doFinal(str.getBytes());
    }

    /* renamed from: getYoutuOpenAppSign */
    public static java.lang.String m120566x36352a4a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.lang.String str5 = "a=" + str + "&k=" + str2 + "&e=" + (2592000 + currentTimeMillis) + "&t=" + currentTimeMillis + "&r=" + java.lang.Math.abs(new java.util.Random().nextInt()) + "&u=" + str4 + "&f=";
        byte[] m120565x3f6b0a02 = m120565x3f6b0a02(str5, str3);
        byte[] bArr = new byte[m120565x3f6b0a02.length + str5.getBytes().length];
        java.lang.System.arraycopy(m120565x3f6b0a02, 0, bArr, 0, m120565x3f6b0a02.length);
        java.lang.System.arraycopy(str5.getBytes(), 0, bArr, m120565x3f6b0a02.length, str5.getBytes().length);
        return new java.lang.String(android.util.Base64.encode(bArr, 2));
    }

    /* renamed from: makeMessageJson */
    public static java.lang.String m120567xc0aa46c1(int i17, java.lang.String str, java.lang.String str2) {
        try {
            new org.json.JSONObject(str2);
            return str2;
        } catch (java.lang.Exception unused) {
            return "{ \"errorcode\":" + i17 + ",\"errormsg\": \"" + str + "\",\"extrainfo\":\"" + str2 + "\"}";
        }
    }

    /* renamed from: reportException */
    public static void m120568x9e70357b(java.lang.String str, java.lang.Exception exc) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120663x73197402(str + " cause exception: " + exc.getLocalizedMessage());
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(new java.util.HashMap<java.lang.String, java.lang.Object>(exc) { // from class: com.tencent.youtu.sdkkitframework.common.CommonUtils.1

            /* renamed from: val$e */
            final /* synthetic */ java.lang.Exception f61498x6ac87a2;

            {
                this.f61498x6ac87a2 = exc;
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61553xee211641, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61535x8c7929fb);
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61555x12657603, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9);
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61551x1c41a80d, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd));
                put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27882xf0231966.m120567xc0aa46c1(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27883x8b0ecff5.f61514x5b76a9cd, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27886x1906edbe.f61634x843277c9, exc.getLocalizedMessage()));
            }
        });
    }
}
