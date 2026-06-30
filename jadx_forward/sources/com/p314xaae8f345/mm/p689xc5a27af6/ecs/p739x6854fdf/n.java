package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* loaded from: classes.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f147526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f147527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.a f147528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f147529h;

    public n(android.content.Context context, java.util.List list, java.util.List list2, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.a aVar, java.lang.Object obj) {
        this.f147525d = context;
        this.f147526e = list;
        this.f147527f = list2;
        this.f147528g = aVar;
        this.f147529h = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f147525d;
        boolean z17 = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 0, false);
        java.util.List list = this.f147526e;
        k0Var.f293405n = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.d(context, list);
        java.lang.Object obj = this.f147529h;
        k0Var.f293413r = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.g(obj);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.a aVar = this.f147528g;
        k0Var.f293414s = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.h(aVar);
        java.util.List list2 = this.f147527f;
        k0Var.f293407o = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.e(context, list2, aVar);
        k0Var.f293417v = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.i(aVar);
        java.util.Iterator it = ((java.util.ArrayList) kz5.n0.t0(list, list2)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p pVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p) it.next();
            if (pVar.f147531a == com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147504f && !pVar.f147533c) {
                z17 = true;
                break;
            }
        }
        if (z17 && ((o25.y1) i95.n0.c(o25.y1.class)) != null) {
            new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m().Di(this.f147525d, k0Var, 1, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.j.f147520d, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.k(aVar));
        }
        k0Var.f293393g = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.l(obj, aVar);
        k0Var.f293389e = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.m(aVar);
        k0Var.v();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Bj("ecs_share_dialog", "page_enter", kz5.b1.e(new jz5.l("source_report_data", obj)), 12, false);
        }
    }
}
