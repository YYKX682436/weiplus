package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* loaded from: classes.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f147511d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f147512e;

    public d(android.content.Context context, java.util.List customMenuItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customMenuItem, "customMenuItem");
        this.f147511d = context;
        this.f147512e = customMenuItem;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var == null || !g4Var.z()) {
            return;
        }
        for (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p pVar : this.f147512e) {
            int i17 = pVar.f147531a.f147510d;
            android.content.Context context = this.f147511d;
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c cVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c(context, i17, pVar);
            boolean z17 = pVar.f147533c;
            cVar.f309908s = z17;
            int ordinal = pVar.f147531a.ordinal();
            if (ordinal == 1) {
                cVar.f309901i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.ned : com.p314xaae8f345.mm.R.C30867xcad56011.hr_);
                cVar.d(com.p314xaae8f345.mm.R.raw.f79902x4225bfc7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                g4Var.v(cVar);
            } else if (ordinal == 2) {
                cVar.f309901i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.nee : com.p314xaae8f345.mm.R.C30867xcad56011.hra);
                cVar.d(com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0);
                g4Var.v(cVar);
            } else if (ordinal == 5) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147503e;
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c cVar2 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c(context, 5, pVar);
                cVar2.f309901i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572774cg4);
                cVar2.d(com.p314xaae8f345.mm.R.raw.f79900xa7cf43ca, -65536);
                g4Var.v(cVar2);
            }
        }
    }
}
