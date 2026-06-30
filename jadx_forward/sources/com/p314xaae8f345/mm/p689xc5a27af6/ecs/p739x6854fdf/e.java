package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* loaded from: classes.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f147513d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f147514e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.a f147515f;

    public e(android.content.Context context, java.util.List customMenuItem, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.a callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customMenuItem, "customMenuItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f147513d = context;
        this.f147514e = customMenuItem;
        this.f147515f = callback;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var == null || !g4Var.z()) {
            return;
        }
        for (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p pVar : this.f147514e) {
            int ordinal = pVar.f147531a.ordinal();
            android.content.Context context = this.f147513d;
            boolean z17 = pVar.f147533c;
            if (ordinal == 0) {
                org.json.JSONObject jSONObject = pVar.f147532b;
                int optInt = jSONObject != null ? jSONObject.optInt(dm.i4.f66865x76d1ec5a) : 0;
                java.lang.String optString = jSONObject != null ? jSONObject.optString("icon") : null;
                if (optString == null) {
                    optString = "";
                }
                t00.e1 e1Var = (t00.e1) this.f147515f;
                e1Var.getClass();
                org.json.JSONObject jSONObject2 = e1Var.f495811c;
                java.lang.String optString2 = jSONObject2 != null ? jSONObject2.optString(optString) : null;
                if (optString2 != null) {
                    optString = optString2;
                }
                java.lang.String optString3 = jSONObject != null ? jSONObject.optString("darkIcon") : null;
                java.lang.String str = optString3 != null ? optString3 : "";
                e1Var.getClass();
                org.json.JSONObject jSONObject3 = e1Var.f495811c;
                java.lang.String optString4 = jSONObject3 != null ? jSONObject3.optString(str) : null;
                if (optString4 != null) {
                    str = optString4;
                }
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    optString = str;
                }
                android.graphics.drawable.Drawable createFromPath = android.graphics.drawable.Drawable.createFromPath(optString);
                if (createFromPath != null) {
                    com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c cVar = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c(context, optInt + 10000, pVar);
                    cVar.f309901i = jSONObject != null ? jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28) : null;
                    cVar.setIcon(createFromPath);
                    cVar.f309908s = z17;
                    g4Var.v(cVar);
                }
            } else if (ordinal == 3) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147503e;
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c cVar2 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c(context, 3, pVar);
                cVar2.f309901i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.la_);
                cVar2.setIcon(com.p314xaae8f345.mm.R.raw.f80145xebd70552);
                cVar2.f309908s = z17;
                g4Var.v(cVar2);
            } else if (ordinal == 4) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar2 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b.f147503e;
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c cVar3 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.c(context, 4, pVar);
                cVar3.f309901i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571927tr);
                cVar3.setIcon(com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec);
                cVar3.f309908s = z17;
                g4Var.v(cVar3);
            }
        }
    }
}
