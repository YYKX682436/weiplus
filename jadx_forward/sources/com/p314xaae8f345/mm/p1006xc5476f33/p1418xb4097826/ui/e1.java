package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b f210619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v41 f210620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b, r45.v41 v41Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f210619d = activityC15013x60db486b;
        this.f210620e = v41Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e1(this.f210619d, this.f210620e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e1 e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.v41 v41Var = this.f210620e;
        boolean z17 = v41Var.m75939xb282bd08(2) != 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b = this.f210619d;
        activityC15013x60db486b.f210051x = z17;
        activityC15013x60db486b.f210053z = v41Var.m75934xbce7f2f(3);
        java.util.LinkedList m75941xfb821914 = v41Var.m75941xfb821914(1);
        activityC15013x60db486b.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("black contact ");
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderBlackListUI", sb6.toString());
        if (m75941xfb821914 != null) {
            java.util.ArrayList arrayList = activityC15013x60db486b.f210050w;
            arrayList.addAll(m75941xfb821914);
            activityC15013x60db486b.e7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar = activityC15013x60db486b.f210049v;
            eVar.c(arrayList);
            eVar.notifyDataSetChanged();
        } else {
            activityC15013x60db486b.e7();
        }
        return jz5.f0.f384359a;
    }
}
