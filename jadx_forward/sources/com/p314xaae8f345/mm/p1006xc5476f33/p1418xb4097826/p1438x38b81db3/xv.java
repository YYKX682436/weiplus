package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class xv implements zy2.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew f186505b;

    public xv(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar) {
        this.f186504a = s0Var;
        this.f186505b = ewVar;
    }

    @Override // zy2.u6
    public void a(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        in5.s0 s0Var = this.f186504a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) s0Var.f374658i;
        if (ysVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderStreamCardAlbumConvert", "[onClick] position=" + i17 + ' ' + ysVar.f192725d.m75942xfb822ef2(14));
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew.o(this.f186505b, context, 1, s0Var);
        }
    }
}
