package rm5;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 f479018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f479019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f479020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, android.graphics.Bitmap bitmap) {
        super(1);
        this.f479018d = c25736x76b98a57;
        this.f479019e = g0Var;
        this.f479020f = bitmap;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        rm5.d it = (rm5.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.f479016c, this.f479018d)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f479019e;
            long j17 = it.f479014a;
            g0Var.f391654d = j17;
            it.f479015b.mo149xb9724478(java.lang.Long.valueOf(j17), this.f479020f);
            z17 = true;
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
