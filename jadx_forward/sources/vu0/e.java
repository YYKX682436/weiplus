package vu0;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vu0.h f521610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f521612f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f521613g;

    public e(vu0.h hVar, java.lang.String str, java.util.List list, boolean z17) {
        this.f521610d = hVar;
        this.f521611e = str;
        this.f521612f = list;
        this.f521613g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f521610d.a(this.f521611e, this.f521612f, this.f521613g);
    }
}
