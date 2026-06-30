package d85;

/* loaded from: classes15.dex */
public final class b1 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f308669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d85.l0 f308670b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d85.d1 f308671c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f308672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f308674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f308675g;

    public b1(d85.f0 f0Var, d85.l0 l0Var, d85.d1 d1Var, android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17) {
        this.f308669a = f0Var;
        this.f308670b = l0Var;
        this.f308671c = d1Var;
        this.f308672d = activity;
        this.f308673e = str;
        this.f308674f = str2;
        this.f308675g = i17;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.mm.p2611x1bbd4e96.p2612xbba4bfc0.C21019x1c5c1f66.f274716f.b().a("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT", this.f308669a.name());
        boolean z17 = true;
        if (iArr != null) {
            int length = iArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                if (iArr[i18] == -1) {
                    z17 = false;
                    break;
                }
                i18++;
            }
        }
        if (z17) {
            this.f308671c.uj(this.f308672d, this.f308673e, this.f308674f, this.f308675g, this.f308670b);
        } else {
            this.f308670b.a(d85.h0.SYSTEM_REFUSE);
        }
    }
}
