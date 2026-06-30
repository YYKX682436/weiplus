package yg;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f543657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f543659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f543660g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f543661h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f543662i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f543663m;

    public t(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83, int i17, int i18, android.view.Surface surface, int i19, int i27, boolean z17) {
        this.f543663m = abstractC4208x204d5c83;
        this.f543657d = i17;
        this.f543658e = i18;
        this.f543659f = surface;
        this.f543660g = i19;
        this.f543661h = i27;
        this.f543662i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f543663m;
        abstractC4208x204d5c83.m34780x9c1bbadd(abstractC4208x204d5c83.f130110a, this.f543657d, this.f543658e, this.f543659f, this.f543660g, this.f543661h, this.f543662i);
    }
}
