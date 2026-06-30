package fk2;

/* loaded from: classes3.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f344905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f344907g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.yh1 f344908h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344909i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f344910m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f344911n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, fk2.g0 g0Var, android.content.Context context, bm2.h1 h1Var, r45.yh1 yh1Var, java.lang.String str2, dk2.zf zfVar, boolean z17) {
        super(3);
        this.f344904d = str;
        this.f344905e = g0Var;
        this.f344906f = context;
        this.f344907g = h1Var;
        this.f344908h = yh1Var;
        this.f344909i = str2;
        this.f344910m = zfVar;
        this.f344911n = z17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 userMessage = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userMessage, "userMessage");
        jz5.f0 f0Var = jz5.f0.f384359a;
        jz5.f0 f0Var2 = null;
        java.lang.String str = this.f344904d;
        if (str != null) {
            android.content.Context context = this.f344906f;
            bm2.h1 h1Var = this.f344907g;
            java.lang.String str2 = this.f344909i;
            boolean z17 = this.f344911n;
            java.lang.String m75945x2fec8307 = this.f344908h.m75945x2fec8307(4);
            java.lang.String u17 = this.f344910m.u();
            fk2.g0 g0Var = this.f344905e;
            g0Var.getClass();
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.n(str, null, 2, null));
            a17.f529406d = new fk2.a0(h1Var, m75945x2fec8307, context, userMessage, intValue, intValue2, z17, g0Var, str2, u17);
            a17.f();
            f0Var2 = f0Var;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CommentItemComboLiveReward", "null giftThumbUrl");
        }
        return f0Var;
    }
}
