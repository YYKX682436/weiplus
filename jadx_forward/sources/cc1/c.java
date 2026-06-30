package cc1;

/* loaded from: classes7.dex */
public final class c extends cc1.g {

    /* renamed from: d, reason: collision with root package name */
    public final javax.crypto.Cipher f121954d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121955e;

    public c(javax.crypto.Cipher cipher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cipher, "cipher");
        this.f121954d = cipher;
    }

    @Override // cc1.g
    public java.lang.Object a(org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new cc1.a(this, null), interfaceC29045xdcb5ca57);
    }

    @Override // cc1.g
    public java.lang.Object c(org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new cc1.b(jSONObject, this, null), interfaceC29045xdcb5ca57);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f121955e) {
            return;
        }
        this.f121955e = true;
    }
}
