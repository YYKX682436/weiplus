package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse;", "", "Lcom/tencent/tav/coremedia/CMPerformance;", "performanceData", "Ljz5/f0;", "analyseSingleStage", "", "analyseToString", "Lcom/tencent/tav/coremedia/CMSampleBuffer;", "sample", "analyseGetSampleBuffer", "analyseAppendSampleBuffer", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "info", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "getInfo", "()Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "setInfo", "(Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;)V", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse$StageAnalyse;", "Lkotlin/collections/ArrayList;", "stageAnalysis", "Ljava/util/ArrayList;", "<init>", "Companion", "StageAnalyse", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.tav.core.parallel.control.ParallelExportAnalyse */
/* loaded from: classes15.dex */
public final class C25714xf04ca338 {
    private static final java.lang.String TAG = "MicroMsg.ParallelExportAnalyse";
    private com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041 info;
    private final java.util.ArrayList<com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse> stageAnalysis;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse$StageAnalyse;", "", "stage", "Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;", "count", "", "totalCostMs", "", "(Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;IJ)V", "getCount", "()I", "setCount", "(I)V", "getStage", "()Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;", "setStage", "(Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;)V", "getTotalCostMs", "()J", "setTotalCostMs", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.tav.core.parallel.control.ParallelExportAnalyse$StageAnalyse */
    /* loaded from: classes15.dex */
    public static final /* data */ class StageAnalyse {
        private int count;
        private com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage stage;
        private long totalCostMs;

        public StageAnalyse(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage stage, int i17, long j17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
            this.stage = stage;
            this.count = i17;
            this.totalCostMs = j17;
        }

        /* renamed from: copy$default */
        public static /* synthetic */ com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse m96980x75149012(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse stageAnalyse, com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage cMPerformanceStage, int i17, long j17, int i18, java.lang.Object obj) {
            if ((i18 & 1) != 0) {
                cMPerformanceStage = stageAnalyse.stage;
            }
            if ((i18 & 2) != 0) {
                i17 = stageAnalyse.count;
            }
            if ((i18 & 4) != 0) {
                j17 = stageAnalyse.totalCostMs;
            }
            return stageAnalyse.m96984x2eaf75(cMPerformanceStage, i17, j17);
        }

        /* renamed from: component1, reason: from getter */
        public final com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage getStage() {
            return this.stage;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTotalCostMs() {
            return this.totalCostMs;
        }

        /* renamed from: copy */
        public final com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse m96984x2eaf75(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage stage, int count, long totalCostMs) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stage, "stage");
            return new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse(stage, count, totalCostMs);
        }

        /* renamed from: equals */
        public boolean m96985xb2c87fbf(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse)) {
                return false;
            }
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse stageAnalyse = (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse) other;
            return this.stage == stageAnalyse.stage && this.count == stageAnalyse.count && this.totalCostMs == stageAnalyse.totalCostMs;
        }

        /* renamed from: getCount */
        public final int m96986x7444f759() {
            return this.count;
        }

        /* renamed from: getStage */
        public final com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage m96987x75286948() {
            return this.stage;
        }

        /* renamed from: getTotalCostMs */
        public final long m96988x926b8581() {
            return this.totalCostMs;
        }

        /* renamed from: hashCode */
        public int m96989x8cdac1b() {
            return (((this.stage.hashCode() * 31) + java.lang.Integer.hashCode(this.count)) * 31) + java.lang.Long.hashCode(this.totalCostMs);
        }

        /* renamed from: setCount */
        public final void m96990x52d311cd(int i17) {
            this.count = i17;
        }

        /* renamed from: setStage */
        public final void m96991x53b683bc(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage cMPerformanceStage) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cMPerformanceStage, "<set-?>");
            this.stage = cMPerformanceStage;
        }

        /* renamed from: setTotalCostMs */
        public final void m96992x28d0f8f5(long j17) {
            this.totalCostMs = j17;
        }

        /* renamed from: toString */
        public java.lang.String m96993x9616526c() {
            return "StageAnalyse(stage=" + this.stage + ", count=" + this.count + ", totalCostMs=" + this.totalCostMs + ')';
        }
    }

    public C25714xf04ca338(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.info = info;
        this.stageAnalysis = new java.util.ArrayList<>();
    }

    /* renamed from: analyseSingleStage */
    private final void m96974x7068d123(com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.stageAnalysis.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse) obj).m96987x75286948() == c25733xc7e62966.f47837x68ac2fe) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse stageAnalyse = (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse) obj;
        if (stageAnalyse == null) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage stage = c25733xc7e62966.f47837x68ac2fe;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stage, "stage");
            this.stageAnalysis.add(new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse(stage, 1, c25733xc7e62966.m97181xaf41fa53()));
        } else {
            stageAnalyse.m96990x52d311cd(stageAnalyse.m96986x7444f759() + 1);
            stageAnalyse.m96992x28d0f8f5(stageAnalyse.m96988x926b8581() + c25733xc7e62966.m97181xaf41fa53());
        }
        java.util.ArrayList<com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966> preNodes = c25733xc7e62966.f47836xb1e29dce;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(preNodes, "preNodes");
        for (com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e629662 : preNodes) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25733xc7e629662);
            m96974x7068d123(c25733xc7e629662);
        }
    }

    /* renamed from: analyseToString */
    private final java.lang.String m96975xee0defff() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("\n");
        for (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse stageAnalyse : this.stageAnalysis) {
            stringBuffer.append("[" + stageAnalyse.m96987x75286948() + ':' + (stageAnalyse.m96988x926b8581() / stageAnalyse.m96986x7444f759()) + "]\n");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    /* renamed from: analyseAppendSampleBuffer */
    public final void m96976xe529dc97(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 sample) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sample, "sample");
        com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966 = sample.m97193x75286adb().f47857xa7c31030;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25733xc7e62966);
        m96974x7068d123(c25733xc7e62966);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "[" + this.info.m97038xd4fd2f59().m97027x7498cf1c() + "]analyse output buffer: " + m96975xee0defff());
    }

    /* renamed from: analyseGetSampleBuffer */
    public final void m96977x1daca80d(com.p314xaae8f345.tav.p2957xa228aba5.C25734xcdff9c14 sample) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sample, "sample");
        com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966 c25733xc7e62966 = sample.m97193x75286adb().f47857xa7c31030;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c25733xc7e62966);
        m96974x7068d123(c25733xc7e62966);
        java.util.Iterator<T> it = this.stageAnalysis.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse stageAnalyse = (com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse) obj;
            if (stageAnalyse.m96987x75286948() == com.p314xaae8f345.tav.p2957xa228aba5.C25733xc7e62966.CMPerformanceStage.RENDER && stageAnalyse.m96986x7444f759() % 30 == 0) {
                break;
            }
        }
        if (((com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2952x38b7655d.C25714xf04ca338.StageAnalyse) obj) != null) {
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "[" + this.info.m97038xd4fd2f59().m97027x7498cf1c() + "]analyse input buffer: " + m96975xee0defff());
        }
    }

    public final com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041 getInfo() {
        return this.info;
    }

    /* renamed from: setInfo */
    public final void m96979x764b9430(com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2953x3164ae.C25720x10844041 c25720x10844041) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c25720x10844041, "<set-?>");
        this.info = c25720x10844041;
    }
}
