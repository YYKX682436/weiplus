package t00;

/* loaded from: classes9.dex */
public final class h0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495818d;

    public h0(c00.n3 n3Var) {
        this.f495818d = n3Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e c10527x84c4b5e = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10527x84c4b5e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10527x84c4b5e);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("errCode", c10527x84c4b5e.f147154d);
        jSONObject.put("longitude", java.lang.Float.valueOf(c10527x84c4b5e.f147155e));
        jSONObject.put("latitude", java.lang.Float.valueOf(c10527x84c4b5e.f147156f));
        jSONObject.put(dm.i4.f66874x4c6b1f55, c10527x84c4b5e.f147157g);
        this.f495818d.b(jSONObject);
    }
}
