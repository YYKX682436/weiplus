package k91;

/* loaded from: classes7.dex */
public class i1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d {
    public i1(java.util.List list, k91.h1 h1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g i17;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(list.size());
        java.lang.String name = h1Var.name();
        int i18 = h1Var.f387142d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiBatchWxaAttrSync", "create sync request, list_size %d, scene %s(%d)", valueOf, name, java.lang.Integer.valueOf(i18));
        r45.fh fhVar = new r45.fh();
        fhVar.f455864e = i18;
        fhVar.f455867h = wo.w0.m();
        fhVar.f455868i = android.os.Build.VERSION.RELEASE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.a();
        if (a17 != null) {
            r45.fd7 fd7Var = new r45.fd7();
            fhVar.f455866g = fd7Var;
            fd7Var.f455779d = a17.i();
            fhVar.f455870n = a17.W0();
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                r45.ad7 ad7Var = new r45.ad7();
                ad7Var.f451482d = str2;
                k91.v5 n17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().n1(str2, k91.a5.f387072a);
                boolean z17 = false;
                if (n17 == null) {
                    i17 = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(new byte[0], 0, 0);
                } else if (k91.h5.a(n17)) {
                    i17 = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(new byte[0], 0, 0);
                } else if (k91.h5.b(n17)) {
                    r81.f.INSTANCE.b(((t81.s) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.s.class)).b(n17.f68924xdec927b), 199);
                    i17 = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(new byte[0], 0, 0);
                } else {
                    i17 = k91.j4.i1(n17);
                }
                ad7Var.f451483e = i17;
                fhVar.f455863d.add(ad7Var);
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = ad7Var.f451482d;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ad7Var.f451483e;
                    if (gVar != null && gVar.f273689a.length > 0) {
                        z17 = true;
                    }
                    objArr[1] = java.lang.Boolean.valueOf(z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiBatchWxaAttrSync", "create sync request, username[%s], has cache?[%b]", objArr);
                }
            }
        }
        D(fhVar);
    }

    public final void D(r45.fh fhVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = fhVar;
        lVar.f152198b = new r45.gh();
        lVar.f152200d = 1192;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaattr/batchwxaattrsync";
        p(lVar.a());
    }

    public i1(java.lang.String str) {
        r45.fh fhVar = new r45.fh();
        fhVar.f455864e = 113;
        r45.ad7 ad7Var = new r45.ad7();
        ad7Var.f451485g = str;
        fhVar.f455863d.add(ad7Var);
        D(fhVar);
    }
}
