package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class qz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f217278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 f217279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz f217280f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz lzVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217279e = h00Var;
        this.f217280f = lzVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qz(this.f217279e, this.f217280f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var;
        java.lang.Object mo144003x754a37bb;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f217278d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz lzVar = this.f217280f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pz pzVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pz(lzVar, null);
            this.f217278d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, pzVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.h00 h00Var = this.f217279e;
        if (!b17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SelfOftenReadAuthorUIC", "deleteItemAfterResp failed: oldResp=" + fVar);
            db5.t7.g(h00Var.m80379x76847179(), h00Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oyl));
            return f0Var;
        }
        db5.t7.h(h00Var.m80379x76847179(), h00Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oym));
        java.lang.String str = lzVar.f216633d;
        if (str == null) {
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh bhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215410a;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bh.f215413d;
        do {
            h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var;
            mo144003x754a37bb = h3Var.mo144003x754a37bb();
            java.util.List list = (java.util.List) mo144003x754a37bb;
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.lz) obj2).f216633d, str)) {
                    arrayList.add(obj2);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowAggregationRepo", "delete username.len=" + str.length() + ": old.size=" + list.size() + " -> new.size=" + arrayList.size());
        } while (!h3Var.j(mo144003x754a37bb, arrayList));
        return f0Var;
    }
}
