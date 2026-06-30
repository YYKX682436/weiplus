package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class qa implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb f214418d;

    public qa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb c15291x1a6f20cb) {
        this.f214418d = c15291x1a6f20cb;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15291x1a6f20cb c15291x1a6f20cb = this.f214418d;
        android.widget.TextView textView = c15291x1a6f20cb.f212640g;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaTypeTv");
            throw null;
        }
        textView.setText(c15291x1a6f20cb.f212638e[i17]);
        e60.f1 f1Var = c15291x1a6f20cb.f212644n;
        if (f1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("queryService");
            throw null;
        }
        ((t23.x1) f1Var).g(c15291x1a6f20cb.f212639f[i17]);
        e33.j2 j2Var = c15291x1a6f20cb.f212643m;
        if (j2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
            throw null;
        }
        ((e33.b0) j2Var).f328663f.clear();
        e33.j2 j2Var2 = c15291x1a6f20cb.f212643m;
        if (j2Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("albumAdapter");
            throw null;
        }
        e60.f1 f1Var2 = c15291x1a6f20cb.f212644n;
        if (f1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("queryService");
            throw null;
        }
        ((e33.b0) j2Var2).f328667m = ((t23.x1) f1Var2).f496831g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c15291x1a6f20cb.f212648r = currentTimeMillis;
        e60.f1 f1Var3 = c15291x1a6f20cb.f212644n;
        if (f1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("queryService");
            throw null;
        }
        t23.x1 x1Var = (t23.x1) f1Var3;
        x1Var.e("", x1Var.f496831g, currentTimeMillis);
    }
}
