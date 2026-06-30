package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class nm implements tg2.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm f200726a;

    public nm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar) {
        this.f200726a = wmVar;
    }

    @Override // tg2.h
    public void a(java.lang.String giftId, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = this.f200726a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wmVar.f201741f, "on gift batch send, giftId: " + giftId + ", batchNum: " + i17);
        vg2.y1 y1Var = wmVar.f201754v;
        if (y1Var != null) {
            y1Var.f518159e.dismiss();
        }
        android.content.Context context = wmVar.f201739d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (wmVar.k(context, i17, giftId)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm.m(this.f200726a, null, giftId, i17, 1, null);
        }
    }

    @Override // tg2.h
    public void b(android.view.ViewGroup view, java.lang.String giftId, boolean z17, ce2.i iVar, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
    }

    @Override // tg2.h
    public void c(android.view.ViewGroup view, java.lang.String giftId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
    }

    @Override // tg2.h
    public void e(android.view.ViewGroup view, java.lang.String giftId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
    }

    @Override // tg2.h
    public void f(android.view.ViewGroup view, ce2.i giftInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftInfo, "giftInfo");
    }
}
