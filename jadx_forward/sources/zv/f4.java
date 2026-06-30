package zv;

/* loaded from: classes8.dex */
public final class f4 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557503b;

    public f4(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, yz5.l lVar) {
        this.f557502a = c10465x1b7ee7d;
        this.f557503b = lVar;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d = this.f557502a;
        java.lang.String str = c10465x1b7ee7d.f146722d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[BRS]requestLocationAuth requestLocationAuth result: ".concat(bool.booleanValue() ? "granted" : "denied"));
        if (!bool.booleanValue()) {
            c10465x1b7ee7d.getClass();
            c10465x1b7ee7d.f146728m.c(c10465x1b7ee7d, com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d.B[0], java.lang.Boolean.TRUE);
        }
        this.f557503b.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bool)));
    }
}
