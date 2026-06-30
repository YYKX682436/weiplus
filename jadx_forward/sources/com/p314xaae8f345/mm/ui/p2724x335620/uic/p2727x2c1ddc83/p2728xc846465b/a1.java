package com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b;

/* loaded from: classes.dex */
public final class a1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f290793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1 f290794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f290795f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f290796g;

    public a1(java.util.List list, com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1 h1Var, java.util.HashMap hashMap, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        this.f290793d = list;
        this.f290794e = h1Var;
        this.f290795f = hashMap;
        this.f290796g = i2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p13.v vVar = (p13.v) obj;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.h1 h1Var = this.f290794e;
        java.lang.String string = h1Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.util.List U6 = h1Var.U6(0, true, vVar, string, false, null);
        java.util.List list = this.f290793d;
        list.addAll(U6);
        this.f290795f.put(new java.lang.Integer(0), vVar);
        java.lang.Object mo771x2f8fd3 = this.f290796g.mo771x2f8fd3(list, interfaceC29045xdcb5ca57);
        return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : jz5.f0.f384359a;
    }
}
