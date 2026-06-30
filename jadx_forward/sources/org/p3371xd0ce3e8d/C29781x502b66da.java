package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.GlRectDrawer */
/* loaded from: classes14.dex */
public class C29781x502b66da extends org.p3371xd0ce3e8d.C29780x5172a8a3 {

    /* renamed from: FRAGMENT_SHADER */
    private static final java.lang.String f75416xb30c5cb4 = "void main() {\n  gl_FragColor = sample(tc);\n}\n";

    /* renamed from: org.webrtc.GlRectDrawer$ShaderCallbacks */
    /* loaded from: classes14.dex */
    public static class ShaderCallbacks implements org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks {
        private ShaderCallbacks() {
        }

        @Override // org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks
        /* renamed from: onNewShader */
        public void mo155543xd9f79286(org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a) {
        }

        @Override // org.p3371xd0ce3e8d.C29780x5172a8a3.ShaderCallbacks
        /* renamed from: onPrepareShader */
        public void mo155544x7a6c342d(org.p3371xd0ce3e8d.C29782xb41dd54a c29782xb41dd54a, float[] fArr, int i17, int i18, int i19, int i27) {
        }
    }

    public C29781x502b66da() {
        super(f75416xb30c5cb4, new org.p3371xd0ce3e8d.C29781x502b66da.ShaderCallbacks());
    }

    @Override // org.p3371xd0ce3e8d.C29780x5172a8a3, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: drawOes */
    public /* bridge */ /* synthetic */ void mo155539x7205d179(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        super.mo155539x7205d179(i17, fArr, i18, i19, i27, i28, i29, i37);
    }

    @Override // org.p3371xd0ce3e8d.C29780x5172a8a3, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: drawRgb */
    public /* bridge */ /* synthetic */ void mo155540x7205dce9(int i17, float[] fArr, int i18, int i19, int i27, int i28, int i29, int i37) {
        super.mo155540x7205dce9(i17, fArr, i18, i19, i27, i28, i29, i37);
    }

    @Override // org.p3371xd0ce3e8d.C29780x5172a8a3, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: drawYuv */
    public /* bridge */ /* synthetic */ void mo155541x7205f8f6(int[] iArr, float[] fArr, int i17, int i18, int i19, int i27, int i28, int i29) {
        super.mo155541x7205f8f6(iArr, fArr, i17, i18, i19, i27, i28, i29);
    }

    @Override // org.p3371xd0ce3e8d.C29780x5172a8a3, org.p3371xd0ce3e8d.C29847x54db44ae.GlDrawer
    /* renamed from: release */
    public /* bridge */ /* synthetic */ void mo155542x41012807() {
        super.mo155542x41012807();
    }
}
