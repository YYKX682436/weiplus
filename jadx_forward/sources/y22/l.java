package y22;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y22.m f540630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f540631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f540632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f540633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f540634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f540635i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y22.m mVar, android.content.Context context, java.lang.CharSequence charSequence, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        super(0);
        this.f540630d = mVar;
        this.f540631e = context;
        this.f540632f = charSequence;
        this.f540633g = z17;
        this.f540634h = i17;
        this.f540635i = onCancelListener;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        y22.m mVar = this.f540630d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = mVar.f540636a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        mVar.f540636a = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(this.f540631e, this.f540632f, this.f540633g, this.f540634h, this.f540635i);
        return jz5.f0.f384359a;
    }
}
