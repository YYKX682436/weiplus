package qe5;

/* loaded from: classes8.dex */
public final class w1 implements zh1.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 f443741a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 f443742b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f443743c;

    public w1(qe5.z1 ui6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.k5 openMaterialService) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materialModel, "materialModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialService, "openMaterialService");
        this.f443741a = materialModel;
        this.f443742b = openMaterialService;
        this.f443743c = new java.lang.ref.WeakReference(ui6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r9.G == true) goto L15;
     */
    @Override // zh1.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r9, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 r10) {
        /*
            r8 = this;
            java.lang.String r0 = "openMaterialCollection"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.ref.WeakReference r0 = r8.f443743c
            java.lang.Object r0 = r0.get()
            qe5.z1 r0 = (qe5.z1) r0
            java.lang.String r1 = "MicroMsg.File.LoadOpenMaterialsUIC"
            if (r0 != 0) goto L17
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, ui is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return
        L17:
            if (r9 != 0) goto L1f
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, fail"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return
        L1f:
            com.tencent.mm.plugin.appbrand.openmaterial.model.MaterialModel r9 = r8.f443741a
            java.lang.String r9 = r9.f167804f
            r0.f443761d = r9
            r0.f443762e = r10
            kd5.e r9 = r0.T6()
            if (r9 == 0) goto L33
            boolean r9 = r9.G
            r2 = 1
            if (r9 != r2) goto L33
            goto L34
        L33:
            r2 = 0
        L34:
            if (r2 != 0) goto L3c
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, download not finish"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return
        L3c:
            com.tencent.mm.plugin.appbrand.service.k5 r9 = r8.f443742b
            r9.getClass()
            zh1.a r2 = zh1.n.f554442o
            boolean r9 = r2.a(r10)
            if (r9 != 0) goto L4f
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, can not create"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return
        L4f:
            zh1.v0 r9 = r0.f443763f
            if (r9 == 0) goto L56
            r9.mo10668x2efc64()
        L56:
            bi1.g r9 = bi1.g.ATTACH
            r9.toString()
            zh1.n.f554443p = r9
            android.app.Activity r3 = r0.m80379x76847179()
            r4 = 0
            r6 = 0
            r7 = 0
            r5 = r10
            zh1.v0 r9 = r2.b(r3, r4, r5, r6, r7)
            r0.f443763f = r9
            androidx.appcompat.app.AppCompatActivity r9 = r0.m158354x19263085()
            java.lang.String r10 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r10)
            pf5.z r10 = pf5.z.f435481a
            pf5.v r9 = r10.a(r9)
            java.lang.Class<qe5.z> r10 = qe5.z.class
            androidx.lifecycle.c1 r9 = r9.a(r10)
            qe5.z r9 = (qe5.z) r9
            r9.getClass()
            java.lang.String r9 = "loadOpenMaterials#onMyOpenMaterialsGot, bottomSheet is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.w1.a(boolean, com.tencent.mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection):void");
    }
}
