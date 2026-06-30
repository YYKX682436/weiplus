package zw1;

/* loaded from: classes8.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f558171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.o90 f558173f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f558174g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.mu5 f558175h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.nu5 f558176i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f558177m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558178n;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, android.widget.LinearLayout linearLayout, ww1.a3 a3Var, r45.o90 o90Var, int i17, r45.mu5 mu5Var, r45.nu5 nu5Var, int i18) {
        this.f558178n = activityC13149x63b02cb3;
        this.f558171d = linearLayout;
        this.f558172e = a3Var;
        this.f558173f = o90Var;
        this.f558174g = i17;
        this.f558175h = mu5Var;
        this.f558176i = nu5Var;
        this.f558177m = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f558171d.postDelayed(new zw1.f4(this), 50L);
    }
}
