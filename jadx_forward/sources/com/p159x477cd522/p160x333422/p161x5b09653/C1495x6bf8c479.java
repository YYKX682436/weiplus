package com.p159x477cd522.p160x333422.p161x5b09653;

/* renamed from: com.eclipsesource.mmv8.debug.ExecutionState */
/* loaded from: classes7.dex */
public class C1495x6bf8c479 implements com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98 {

    /* renamed from: FRAME */
    private static final java.lang.String f4892x400b14d = "frame";

    /* renamed from: FRAME_COUNT */
    private static final java.lang.String f4893xc2297f7d = "frameCount";

    /* renamed from: PREPARE_STEP */
    private static final java.lang.String f4894x12fe9724 = "prepareStep";

    /* renamed from: v8Object */
    private com.p159x477cd522.p160x333422.C1477x4679881 f4895x8d3461;

    public C1495x6bf8c479(com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881) {
        this.f4895x8d3461 = c1477x4679881.mo16314x3686e8();
    }

    /* renamed from: getFrame */
    public com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1501x40fb94d m16506x74704fb7(int i17) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4895x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(i17);
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = null;
        try {
            c1477x4679881 = this.f4895x8d3461.mo16322x2919df0c(f4892x400b14d, c1469x28b0ccd7);
            return new com.p159x477cd522.p160x333422.p161x5b09653.p162xbffd6bbf.C1501x40fb94d(c1477x4679881);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
            if (c1477x4679881 != null) {
                c1477x4679881.mo15825x41012807();
            }
        }
    }

    /* renamed from: getFrameCount */
    public int m16507xdc944b98() {
        return this.f4895x8d3461.mo16321xb7588301(f4893xc2297f7d, null);
    }

    /* renamed from: prepareStep */
    public void m16508xb1c1ac73(com.p159x477cd522.p160x333422.p161x5b09653.EnumC1497xf7f70442 enumC1497xf7f70442) {
        com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7 = new com.p159x477cd522.p160x333422.C1469x28b0ccd7(this.f4895x8d3461.mo16331x9a3f0ba2());
        c1469x28b0ccd7.mo16306x34af1a(enumC1497xf7f70442.f4906x5fb28d2);
        try {
            this.f4895x8d3461.mo16324x725c19a1(f4894x12fe9724, c1469x28b0ccd7);
        } finally {
            c1469x28b0ccd7.mo15825x41012807();
        }
    }

    @Override // com.p159x477cd522.p160x333422.InterfaceC1464x1c628e98
    /* renamed from: release */
    public void mo15825x41012807() {
        com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881 = this.f4895x8d3461;
        if (c1477x4679881 == null || c1477x4679881.mo16335xafdb8087()) {
            return;
        }
        this.f4895x8d3461.mo15825x41012807();
        this.f4895x8d3461 = null;
    }
}
