package md3;

/* loaded from: classes.dex */
public final class k implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3.l f407389a;

    public k(md3.l lVar) {
        this.f407389a = lVar;
    }

    @Override // c00.n3
    public void a() {
        md3.l lVar = this.f407389a;
        yz5.l s17 = lVar.s();
        lc3.a0 a0Var = new lc3.a0(new java.util.HashMap());
        lVar.m(a0Var);
        a0Var.put("errMsg", "onFail");
        s17.mo146xb9724478(a0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiHandleEcsAction", "onFail");
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        md3.l lVar = this.f407389a;
        if (jSONObject != null) {
            yz5.l s17 = lVar.s();
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            lc3.a0 a0Var = new lc3.a0(jSONObject2);
            lVar.m(a0Var);
            s17.mo146xb9724478(a0Var);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            lVar.s().mo146xb9724478(lVar.k());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiHandleEcsAction", "onSuc: " + jSONObject);
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        iq0.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        lc3.e eVar = this.f407389a.f399423a;
        jz5.f0 f0Var = null;
        android.content.ComponentCallbacks2 B0 = eVar != null ? eVar.B0() : null;
        c00.h4 h4Var = B0 instanceof c00.h4 ? (c00.h4) B0 : null;
        if (h4Var != null && (cVar = ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1) h4Var).f147372h) != null) {
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(cVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d("onEcsEvent", ((v00.a) event).a()));
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            ((v00.a) event).f513726a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiHandleEcsAction", "sendEvent: EcsEventActionShareDialogHandle with out biz handler");
        }
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        if (jSONObject != null) {
            md3.l lVar = this.f407389a;
            yz5.l s17 = lVar.s();
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            lc3.a0 a0Var = new lc3.a0(jSONObject2);
            lVar.m(a0Var);
            a0Var.put("errMsg", "onFail");
            s17.mo146xb9724478(a0Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiHandleEcsAction", "onFail: " + jSONObject);
    }

    @Override // c00.n3
    /* renamed from: onCancel */
    public void mo13720x3d6f0539() {
        md3.l lVar = this.f407389a;
        yz5.l s17 = lVar.s();
        lc3.a0 a0Var = new lc3.a0(new java.util.HashMap());
        lVar.m(a0Var);
        a0Var.put("errMsg", "onCancel");
        s17.mo146xb9724478(a0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiHandleEcsAction", "onCancel");
    }
}
