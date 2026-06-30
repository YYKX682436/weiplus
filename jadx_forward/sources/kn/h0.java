package kn;

/* loaded from: classes13.dex */
public class h0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f390936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f390938f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f390939g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f390940h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390941i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390942m;

    public h0(int i17, java.lang.String str, int i18, boolean z17, int i19, java.lang.String str2, java.lang.String str3) {
        this.f390936d = i17;
        this.f390937e = str;
        this.f390938f = i18;
        this.f390939g = z17;
        this.f390940h = i19;
        this.f390941i = str2;
        this.f390942m = str3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        int i17 = this.f390936d;
        if (i17 == 2) {
            kn.k0.c(this.f390937e, 1, this.f390938f, this.f390939g ? 1 : 2, this.f390940h, this.f390941i, this.f390942m);
        }
        if (i17 == 1) {
            kn.k0.b(this.f390937e, this.f390938f, 3, 1, this.f390941i, this.f390942m);
        }
    }
}
