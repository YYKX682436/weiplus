package t00;

/* loaded from: classes9.dex */
public final class d2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f495807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495808e;

    public d2(android.content.Context context, c00.n3 n3Var) {
        this.f495807d = context;
        this.f495808e = n3Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c c10530x4ae8da5c = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c) obj;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10530x4ae8da5c.f147164f);
        c00.n3 n3Var = this.f495808e;
        if (!K0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g(c10530x4ae8da5c.f147164f);
            u1Var.n(this.f495807d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1));
            u1Var.l(t00.c2.f495804a);
            u1Var.q(false);
            n3Var.mo13720x3d6f0539();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = c10530x4ae8da5c.f147162d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("displayName", str);
        java.lang.String str2 = c10530x4ae8da5c.f147163e;
        jSONObject.put("headImgUrl", str2 != null ? str2 : "");
        int i17 = h20.g.f359800a;
        jSONObject.put("selectType", 2);
        n3Var.b(jSONObject);
    }
}
