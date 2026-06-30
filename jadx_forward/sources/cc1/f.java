package cc1;

/* loaded from: classes7.dex */
public final class f extends cc1.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.security.Signature f121959d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121960e;

    public f(java.security.Signature signature) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        this.f121959d = signature;
    }

    @Override // cc1.g
    public java.lang.Object a(org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new cc1.d(this, null), interfaceC29045xdcb5ca57);
    }

    @Override // cc1.g
    public java.lang.Object c(org.json.JSONObject jSONObject, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new cc1.e(jSONObject, this, null), interfaceC29045xdcb5ca57);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f121960e) {
            return;
        }
        this.f121960e = true;
    }
}
