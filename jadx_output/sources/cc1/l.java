package cc1;

/* loaded from: classes7.dex */
public final class l extends cc1.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.security.Signature f40435d;

    /* renamed from: e, reason: collision with root package name */
    public final java.nio.ByteBuffer f40436e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40437f;

    public l(java.security.Signature signature, java.nio.ByteBuffer signatureBuffer) {
        kotlin.jvm.internal.o.g(signature, "signature");
        kotlin.jvm.internal.o.g(signatureBuffer, "signatureBuffer");
        this.f40435d = signature;
        this.f40436e = signatureBuffer;
    }

    @Override // cc1.g
    public java.lang.Object a(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new cc1.j(this, null), continuation);
    }

    @Override // cc1.g
    public java.lang.Object c(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new cc1.k(jSONObject, this, null), continuation);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f40437f) {
            return;
        }
        this.f40437f = true;
    }
}
