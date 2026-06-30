package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.o f147530d = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.o(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b f147531a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f147532b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f147533c;

    public p(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b menuItem, org.json.JSONObject jSONObject, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        this.f147531a = menuItem;
        this.f147532b = jSONObject;
        this.f147533c = z17;
    }

    /* renamed from: equals */
    public boolean m44424xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p pVar = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.p) obj;
        return this.f147531a == pVar.f147531a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f147532b, pVar.f147532b) && this.f147533c == pVar.f147533c;
    }

    /* renamed from: hashCode */
    public int m44425x8cdac1b() {
        int hashCode = this.f147531a.hashCode() * 31;
        org.json.JSONObject jSONObject = this.f147532b;
        return ((hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f147533c);
    }

    /* renamed from: toString */
    public java.lang.String m44426x9616526c() {
        return "EcsShareMenuItem(menuItem=" + this.f147531a + ", customItem=" + this.f147532b + ", disable=" + this.f147533c + ')';
    }

    public /* synthetic */ p(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.b bVar, org.json.JSONObject jSONObject, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(bVar, (i17 & 2) != 0 ? null : jSONObject, (i17 & 4) != 0 ? false : z17);
    }
}
