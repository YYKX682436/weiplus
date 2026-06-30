package ax2;

/* loaded from: classes4.dex */
public final class m implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView f15069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f15070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f15071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15073e;

    public m(com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView, android.widget.TextView textView, android.text.SpannableString spannableString, int i17, int i18) {
        this.f15069a = livePkCritAnounceView;
        this.f15070b = textView;
        this.f15071c = spannableString;
        this.f15072d = i17;
        this.f15073e = i18;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            pm0.v.X(new ax2.l(this.f15070b, bitmap, this.f15069a, this.f15071c, this.f15072d, this.f15073e));
        } else {
            com.tencent.mars.xlog.Log.i(this.f15069a.f131807d, "resource is null!");
        }
    }
}
