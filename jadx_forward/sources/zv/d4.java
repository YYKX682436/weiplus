package zv;

/* loaded from: classes8.dex */
public final class d4 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557468b;

    public d4(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, yz5.l lVar) {
        this.f557467a = c10465x1b7ee7d;
        this.f557468b = lVar;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        java.lang.String str = this.f557467a.f146722d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "requestBusinessLocationPermission result: ".concat(bool.booleanValue() ? "granted" : "denied"));
        this.f557468b.mo146xb9724478(bool);
    }
}
