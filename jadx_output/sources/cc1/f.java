package cc1;

/* loaded from: classes7.dex */
public final class f extends cc1.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.security.Signature f40426d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40427e;

    public f(java.security.Signature signature) {
        kotlin.jvm.internal.o.g(signature, "signature");
        this.f40426d = signature;
    }

    @Override // cc1.g
    public java.lang.Object a(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new cc1.d(this, null), continuation);
    }

    @Override // cc1.g
    public java.lang.Object c(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new cc1.e(jSONObject, this, null), continuation);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f40427e) {
            return;
        }
        this.f40427e = true;
    }
}
