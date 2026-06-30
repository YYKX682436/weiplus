package kn;

/* loaded from: classes13.dex */
public class g0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kn.i0 f390927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f390928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f390929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390930g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f390931h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f390932i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390933m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390934n;

    public g0(kn.i0 i0Var, boolean z17, int i17, java.lang.String str, int i18, int i19, java.lang.String str2, java.lang.String str3) {
        this.f390927d = i0Var;
        this.f390928e = z17;
        this.f390929f = i17;
        this.f390930g = str;
        this.f390931h = i18;
        this.f390932i = i19;
        this.f390933m = str2;
        this.f390934n = str3;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        kn.i0 i0Var;
        if (menuItem.getItemId() != 0 || (i0Var = this.f390927d) == null) {
            return;
        }
        boolean z17 = this.f390928e;
        if (z17) {
            i0Var.a();
        } else {
            i0Var.b();
        }
        int i18 = this.f390929f;
        if (i18 == 2) {
            kn.k0.c(this.f390930g, 2, this.f390931h, z17 ? 1 : 2, this.f390932i, this.f390933m, this.f390934n);
        } else if (i18 == 1) {
            kn.k0.b(this.f390930g, this.f390931h, 3, 2, this.f390933m, this.f390934n);
        }
    }
}
