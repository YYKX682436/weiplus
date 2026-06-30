package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f235404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f235405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 f235406f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f235407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f235408h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f235409i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 j0Var, int i17, java.util.List list2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f235405e = list;
        this.f235406f = j0Var;
        this.f235407g = i17;
        this.f235408h = list2;
        this.f235409i = f4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.a0(this.f235405e, this.f235406f, this.f235407g, this.f235408h, this.f235409i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0 j0Var;
        mr3.l a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f235404d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = this.f235409i;
        try {
            try {
                if (i17 == 0) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    java.util.Iterator it = this.f235405e.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        list = this.f235408h;
                        j0Var = this.f235406f;
                        if (!hasNext) {
                            break;
                        }
                        java.lang.String str = (java.lang.String) it.next();
                        fc0.e eVar = (fc0.e) i95.n0.c(fc0.e.class);
                        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.A;
                        java.lang.String Ai = ((br3.f) eVar).Ai(j0Var.m144223x6c03c64c(), str);
                        if (Ai != null && (a17 = mr3.l.f412407n.a(j0Var.m144223x6c03c64c(), Ai, this.f235407g)) != null) {
                            list.add(a17);
                        }
                    }
                    p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                    p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.z(j0Var, list, null);
                    this.f235404d = 1;
                    if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i17 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ModProfile.ModImageDescriptionUI", "handleImagePathList error: " + e17.getMessage());
            }
            return jz5.f0.f384359a;
        } finally {
            f4Var.dismiss();
        }
    }
}
