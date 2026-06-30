package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f179105a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f179106b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f179107c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f179108d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f179109e;

    public l(android.content.Context context, java.util.List groupList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupList, "groupList");
        this.f179105a = context;
        this.f179106b = groupList;
        this.f179107c = "MicroMsg.EmojiGroupRemove";
        this.f179108d = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    public final java.lang.Object a(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f179107c, "removeOne: " + str);
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        z12.w wVar = new z12.w(str, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.h(h0Var, wVar, this, str, rVar);
        gm0.j1.n().f354821b.a(413, (com.p314xaae8f345.mm.p944x882e457a.u0) h0Var.f391656d);
        rVar.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.i(h0Var));
        gm0.j1.n().f354821b.g(wVar);
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }
}
