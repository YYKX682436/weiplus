package cc1;

/* loaded from: classes7.dex */
public final class c extends cc1.g {

    /* renamed from: d, reason: collision with root package name */
    public final javax.crypto.Cipher f40421d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40422e;

    public c(javax.crypto.Cipher cipher) {
        kotlin.jvm.internal.o.g(cipher, "cipher");
        this.f40421d = cipher;
    }

    @Override // cc1.g
    public java.lang.Object a(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new cc1.a(this, null), continuation);
    }

    @Override // cc1.g
    public java.lang.Object c(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new cc1.b(jSONObject, this, null), continuation);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f40422e) {
            return;
        }
        this.f40422e = true;
    }
}
