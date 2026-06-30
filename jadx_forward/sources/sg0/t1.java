package sg0;

/* loaded from: classes.dex */
public final class t1 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f489345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f489347c;

    public t1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, yz5.l lVar) {
        this.f489345a = h0Var;
        this.f489346b = str;
        this.f489347c = lVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f489345a;
        ((org.json.JSONObject) h0Var.f391656d).put("err_code", -1);
        ((org.json.JSONObject) h0Var.f391656d).put("err_msg", "ensureLiteAppStoreAlive:fail createStore failed");
        this.f489347c.mo146xb9724478(h0Var.f391656d);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f489345a;
        ((org.json.JSONObject) h0Var.f391656d).put("requestId", this.f489346b);
        ((org.json.JSONObject) h0Var.f391656d).put("err_code", 0);
        ((org.json.JSONObject) h0Var.f391656d).put("err_msg", "ensureLiteAppStoreAlive:ok");
        this.f489347c.mo146xb9724478(h0Var.f391656d);
    }
}
