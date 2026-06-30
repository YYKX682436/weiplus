package eu0;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f338246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.l lVar) {
        super(1);
        this.f338246d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject result = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String jSONObject = result.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        this.f338246d.mo146xb9724478(jSONObject);
        return jz5.f0.f384359a;
    }
}
