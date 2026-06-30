package n91;

/* loaded from: classes7.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f {

    /* renamed from: orientationHandler */
    private zi1.b f72898x4cf7cf5a;

    /* renamed from: runtime */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f72899x5c71cfd8;

    /* renamed from: softOrientation */
    private java.lang.String f72900xdf0b4b46;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, xi1.g gVar) {
        super(o6Var, gVar);
        this.f72899x5c71cfd8 = o6Var;
    }

    /* renamed from: defaultDisplay */
    private android.view.Display m149338xdb197f41() {
        android.app.Activity r07 = this.f72899x5c71cfd8.r0();
        java.util.Objects.requireNonNull(r07);
        return ((android.view.WindowManager) r07.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f
    /* renamed from: applyWindowConfig */
    public void mo53406x416eb9e0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.b bVar) {
        n91.g gVar;
        if (n91.t.b(this.f72899x5c71cfd8) && (gVar = this.f72899x5c71cfd8.K2) != null && gVar.f417406c.ordinal() >= 3) {
            n91.t.a(c11809xbc286be4);
        }
        super.mo53406x416eb9e0(c11809xbc286be4, bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f, xi1.s
    /* renamed from: getOrientationHandler */
    public xi1.p mo51612x60543150() {
        n91.g gVar = this.f72899x5c71cfd8.K2;
        if (gVar != null && gVar.f417406c.ordinal() >= 3) {
            this.f72898x4cf7cf5a = null;
            return super.mo51612x60543150();
        }
        if (this.f72898x4cf7cf5a == null) {
            this.f72898x4cf7cf5a = new zi1.b(this.f72899x5c71cfd8.mo48803xee5260a9());
        }
        return this.f72898x4cf7cf5a;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001e  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f, xi1.s
    /* renamed from: getVDisplayMetrics */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.DisplayMetrics mo48807xad90d981() {
        /*
            r3 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r1 = 30
            boolean r1 = fp.h.c(r1)
            if (r1 == 0) goto L1b
            com.tencent.mm.plugin.appbrand.o6 r1 = r3.f72899x5c71cfd8     // Catch: java.lang.UnsupportedOperationException -> L1b
            android.app.Activity r1 = r1.r0()     // Catch: java.lang.UnsupportedOperationException -> L1b
            java.util.Objects.requireNonNull(r1)     // Catch: java.lang.UnsupportedOperationException -> L1b
            android.view.Display r1 = r1.getDisplay()     // Catch: java.lang.UnsupportedOperationException -> L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 != 0) goto L22
            android.view.Display r1 = r3.m149338xdb197f41()
        L22:
            r1.getRealMetrics(r0)
            java.lang.String r1 = "landscape"
            java.lang.String r2 = r3.f72900xdf0b4b46
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L39
            int r1 = r0.widthPixels
            int r2 = r0.heightPixels
            if (r1 >= r2) goto L39
            r0.widthPixels = r2
            r0.heightPixels = r1
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n91.u.mo48807xad90d981():android.util.DisplayMetrics");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.f, xi1.s
    /* renamed from: setSoftOrientation */
    public void mo51619xfa43b684(java.lang.String str) {
        this.f72900xdf0b4b46 = str;
    }
}
