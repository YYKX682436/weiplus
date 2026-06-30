package ch2;

/* loaded from: classes.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(kotlin.jvm.internal.h0 h0Var) {
        super(2);
        this.f41369d = h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String key = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(key, "key");
        ((org.json.JSONObject) this.f41369d.f310123d).put(key, intValue);
        return jz5.f0.f302826a;
    }
}
