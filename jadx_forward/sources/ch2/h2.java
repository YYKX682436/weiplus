package ch2;

/* loaded from: classes.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f122902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2);
        this.f122902d = h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        ((org.json.JSONObject) this.f122902d.f391656d).put(key, intValue);
        return jz5.f0.f384359a;
    }
}
