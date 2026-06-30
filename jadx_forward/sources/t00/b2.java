package t00;

/* loaded from: classes9.dex */
public final class b2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f495801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495802e;

    public b2(android.content.Context context, c00.n3 n3Var) {
        this.f495801d = context;
        this.f495802e = n3Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34 c10531x377cba34 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34) obj;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c10531x377cba34.f147169h);
        c00.n3 n3Var = this.f495802e;
        if (!K0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            u1Var.g(c10531x377cba34.f147169h);
            u1Var.n(this.f495801d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1));
            u1Var.l(t00.a2.f495797a);
            u1Var.q(false);
            n3Var.mo13720x3d6f0539();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = c10531x377cba34.f147165d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("displayName", str);
        java.lang.String str2 = c10531x377cba34.f147166e;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("headImgUrl", str2);
        java.lang.Object obj2 = c10531x377cba34.f147167f;
        if (obj2 == null) {
            obj2 = "";
        }
        jSONObject.put("recipientType", obj2);
        java.lang.Integer num = c10531x377cba34.f147168g;
        jSONObject.put("chatRoomMemberNum", num != null ? num : "");
        n3Var.b(jSONObject);
    }
}
