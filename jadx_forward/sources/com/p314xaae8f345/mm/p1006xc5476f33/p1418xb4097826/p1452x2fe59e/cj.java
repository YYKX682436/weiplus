package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class cj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj f188013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj djVar) {
        super(1);
        this.f188013d = djVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj djVar = this.f188013d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = djVar.f187957g;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa = i0Var != null ? i0Var.m56068x4905e9fa() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m56068x4905e9fa, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56068x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c13728x20aad6ea.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c13728x20aad6ea.p0(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager).w());
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        android.view.View view = p07 != null ? p07.f3639x46306858 : null;
        if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var).kk(view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null)) {
            s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
            android.view.KeyEvent.Callback callback = p07 != null ? p07.f3639x46306858 : null;
            boolean Jk = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) w0Var2).Jk(ev6, callback instanceof android.view.ViewGroup ? (android.view.ViewGroup) callback : null);
            if ((ev6.getAction() == 0 && Jk) || djVar.f188104u) {
                int action = ev6.getAction();
                if (action == 0) {
                    djVar.f188104u = true;
                } else if (action == 1 || action == 3) {
                    djVar.f188104u = false;
                }
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
