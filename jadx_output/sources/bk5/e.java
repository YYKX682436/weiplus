package bk5;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.toast.ForwardSnackBarReceiver f21658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f21659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21661g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21662h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f21663i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f21664m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.ui.toast.ForwardSnackBarReceiver forwardSnackBarReceiver, android.content.Context context, java.lang.CharSequence charSequence, int i17, java.lang.String str, java.lang.String str2, int i18) {
        super(0);
        this.f21658d = forwardSnackBarReceiver;
        this.f21659e = context;
        this.f21660f = charSequence;
        this.f21661g = i17;
        this.f21662h = str;
        this.f21663i = str2;
        this.f21664m = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.toast.ForwardSnackBarReceiver forwardSnackBarReceiver = this.f21658d;
        android.content.Context context = this.f21659e;
        java.lang.CharSequence charSequence = this.f21660f;
        int i17 = this.f21661g;
        java.lang.String str = this.f21662h;
        java.lang.String str2 = this.f21663i;
        int i18 = this.f21664m - 1;
        int i19 = com.tencent.mm.ui.toast.ForwardSnackBarReceiver.f209957a;
        forwardSnackBarReceiver.a(context, charSequence, i17, str, str2, i18);
        return jz5.f0.f302826a;
    }
}
