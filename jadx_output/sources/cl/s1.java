package cl;

/* loaded from: classes7.dex */
public class s1 implements com.eclipsesource.mmv8.JavaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl.v1 f42759a;

    public s1(cl.v1 v1Var) {
        this.f42759a = v1Var;
    }

    @Override // com.eclipsesource.mmv8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
        return java.lang.Integer.valueOf(this.f42759a.f42802b.generateId());
    }
}
