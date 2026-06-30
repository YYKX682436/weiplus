package androidx.fragment.app;

/* loaded from: classes14.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m3 f11338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.m3 f11339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f11340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x.b f11341g;

    public i(androidx.fragment.app.p pVar, androidx.fragment.app.m3 m3Var, androidx.fragment.app.m3 m3Var2, boolean z17, x.b bVar) {
        this.f11338d = m3Var;
        this.f11339e = m3Var2;
        this.f11340f = z17;
        this.f11341g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.fragment.app.r2.c(this.f11338d.f11402c, this.f11339e.f11402c, this.f11340f, this.f11341g, false);
    }
}
