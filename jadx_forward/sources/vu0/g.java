package vu0;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.h f521620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f521622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f521623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f521624h;

    public g(vu0.h hVar, java.lang.String str, java.util.List list, boolean z17, boolean z18) {
        this.f521620d = hVar;
        this.f521621e = str;
        this.f521622f = list;
        this.f521623g = z17;
        this.f521624h = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f521620d.b(this.f521621e, this.f521622f, this.f521623g, this.f521624h);
    }
}
