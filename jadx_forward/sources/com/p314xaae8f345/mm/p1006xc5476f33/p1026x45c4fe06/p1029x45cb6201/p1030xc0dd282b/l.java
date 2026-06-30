package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes4.dex */
public final class l implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o f157397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f157398b;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o oVar, boolean z17) {
        this.f157397a = oVar;
        this.f157398b = z17;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        r45.lj6 lj6Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6 r6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.r6.Fail_SvrConnectFail;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o oVar = this.f157397a;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f157409r, "onCgiBack NULL result");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157286a.a(oVar.f157415x, r6Var);
            return;
        }
        java.lang.String str = oVar.f157409r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiBack appId:");
        java.lang.String str2 = oVar.f157405n;
        sb6.append(str2);
        sb6.append(" moduleName:");
        sb6.append(oVar.f157408q);
        sb6.append(", errType[");
        sb6.append(fVar.f152148a);
        sb6.append("], errCode[");
        sb6.append(fVar.f152149b);
        sb6.append("], errMsg[");
        sb6.append(fVar.f152150c);
        sb6.append("], dealPluginOnly[");
        boolean z17 = this.f157398b;
        sb6.append(z17);
        sb6.append("], splitPluginCode:[true]");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        oVar.f157414w = java.lang.System.currentTimeMillis();
        if (th1.a.b(fVar)) {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            r45.jb5 jb5Var = (r45.jb5) fVar.f152151d;
            if (jb5Var != null && (lj6Var = jb5Var.f459221d) != null) {
                linkedList2.add(lj6Var);
            }
            r45.jb5 jb5Var2 = (r45.jb5) fVar.f152151d;
            if (jb5Var2 != null && (linkedList = jb5Var2.f459222e) != null) {
                linkedList2.addAll(linkedList);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f157409r, "cmdList size:[" + linkedList2.size() + ']');
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.o.f157403y.a(linkedList2, z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.z0.a(linkedList2, oVar);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.d0.f157286a.a(oVar.f157415x, r6Var);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7114x434b470c c7114x434b470c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7114x434b470c();
        c7114x434b470c.f144343d = c7114x434b470c.b("UserName", oVar.f157404m, true);
        c7114x434b470c.f144344e = c7114x434b470c.b("AppId", str2, true);
        c7114x434b470c.f144345f = oVar.f157412u;
        c7114x434b470c.f144347h = oVar.f157407p;
        long j17 = oVar.f157414w;
        long j18 = oVar.f157413v;
        c7114x434b470c.f144346g = j17 - j18;
        c7114x434b470c.f144348i = j18;
        c7114x434b470c.f144349j = j17;
        c7114x434b470c.f144350k = fVar.f152148a;
        c7114x434b470c.f144351l = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.u.c();
        c7114x434b470c.k();
    }
}
