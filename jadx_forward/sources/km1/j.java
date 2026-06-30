package km1;

/* loaded from: classes7.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f390537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f390538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km1.s f390539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, android.util.Size size, km1.s sVar) {
        super(1);
        this.f390537d = z17;
        this.f390538e = size;
        this.f390539f = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue() && this.f390537d) {
            android.util.Size size = km1.s.G;
            android.util.Size size2 = this.f390538e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(size, size2)) {
                this.f390539f.p(size2);
            }
        }
        return jz5.f0.f384359a;
    }
}
