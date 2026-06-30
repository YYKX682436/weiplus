package m2;

/* loaded from: classes13.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.o f404479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f404480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f404481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 f404482i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.lang.String str2, n0.o oVar, java.lang.Class cls, int i17, p012xc85e97e9.p064x38a77192.ui.p070xbc0ba74a.C1069x2505018 c1069x2505018) {
        super(0);
        this.f404477d = str;
        this.f404478e = str2;
        this.f404479f = oVar;
        this.f404480g = cls;
        this.f404481h = i17;
        this.f404482i = c1069x2505018;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Throwable cause;
        try {
            m2.a.f404434a.d(this.f404477d, this.f404478e, this.f404479f, java.util.Arrays.copyOf(m2.h0.a(this.f404480g, this.f404481h), 0));
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable th7 = th6;
            while ((th7 instanceof java.lang.ReflectiveOperationException) && (cause = th7.getCause()) != null) {
                th7 = cause;
            }
            m2.i0 i0Var = this.f404482i.f92375n;
            i0Var.getClass();
            synchronized (i0Var.f404456b) {
                i0Var.f404455a = th7;
                throw th6;
            }
        }
    }
}
