package androidx.fragment.app;

/* loaded from: classes14.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int f11328a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.fragment.app.Fragment f11329b;

    /* renamed from: c, reason: collision with root package name */
    public int f11330c;

    /* renamed from: d, reason: collision with root package name */
    public int f11331d;

    /* renamed from: e, reason: collision with root package name */
    public int f11332e;

    /* renamed from: f, reason: collision with root package name */
    public int f11333f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.n f11334g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.n f11335h;

    public h2(int i17, androidx.fragment.app.Fragment fragment) {
        this.f11328a = i17;
        this.f11329b = fragment;
        androidx.lifecycle.n nVar = androidx.lifecycle.n.RESUMED;
        this.f11334g = nVar;
        this.f11335h = nVar;
    }

    public h2(int i17, androidx.fragment.app.Fragment fragment, androidx.lifecycle.n nVar) {
        this.f11328a = i17;
        this.f11329b = fragment;
        this.f11334g = fragment.mMaxState;
        this.f11335h = nVar;
    }
}
