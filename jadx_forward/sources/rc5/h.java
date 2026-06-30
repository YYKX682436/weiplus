package rc5;

/* loaded from: classes5.dex */
public final class h implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f475693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f475695f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rc5.m f475696g;

    public h(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18, rc5.m mVar) {
        this.f475693d = c1163xf1deaba4;
        this.f475694e = i17;
        this.f475695f = i18;
        this.f475696g = mVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = -(this.f475694e - this.f475695f);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f475693d;
        c1163xf1deaba4.scrollBy(0, i17);
        if (c1163xf1deaba4.mo7958x54496c8e() == 2) {
            return false;
        }
        this.f475696g.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
