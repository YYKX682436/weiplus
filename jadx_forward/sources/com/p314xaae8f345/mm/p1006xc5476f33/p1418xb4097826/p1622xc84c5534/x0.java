package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class x0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f206960b;

    public x0(int i17, boolean z17) {
        this.f206959a = i17;
        this.f206960b = z17;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int i17 = this.f206959a;
        boolean z18 = this.f206960b;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 y0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onLoadingExposed] tabType:" + i17 + " isTop:" + z18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 c17 = y0Var.c(i17);
            c17.f206949d = true;
            c17.f206950e = z18;
            y0Var.h(i17, 9, false);
            y0Var.g(context, i17, new jz5.l(9, 0), false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0 y0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.y0.f206975a;
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HomeActionReporter", "[onLoadingDisposed] tabType:" + i17 + " isTop:" + z18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.w0 c18 = y0Var2.c(i17);
        c18.f206949d = false;
        c18.f206950e = z18;
        y0Var2.h(i17, 10, false);
        long g17 = y0Var2.g(context2, i17, new jz5.l(10, 9), false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1 r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206932g.get(java.lang.Integer.valueOf(i17));
        if (r1Var != null) {
            r1Var.f206847l0 = g17;
        }
    }
}
