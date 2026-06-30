package ax2;

/* loaded from: classes4.dex */
public final class h0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f15050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f15051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15053d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f15054e;

    public h0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView, android.text.SpannableString spannableString, int i17, int i18, android.widget.TextView textView) {
        this.f15050a = livePkCritDoingView;
        this.f15051b = spannableString;
        this.f15052c = i17;
        this.f15053d = i18;
        this.f15054e = textView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new ax2.g0(this.f15050a, bitmap, this.f15051b, this.f15052c, this.f15053d, this.f15054e));
        } else {
            com.tencent.mars.xlog.Log.i(this.f15050a.f131829d, "onBindComboLiveRewardMsg resource is null!");
        }
    }
}
