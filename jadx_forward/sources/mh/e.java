package mh;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh.f f407796e;

    public e(java.lang.String str, mh.f fVar) {
        this.f407795d = str;
        this.f407796e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "errAccStats", null, null, "mapOverHeat", this.f407795d, java.lang.String.valueOf(this.f407796e.size()));
    }
}
