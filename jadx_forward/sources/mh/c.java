package mh;

/* loaded from: classes11.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh.d f407792e;

    public c(java.lang.String str, mh.d dVar) {
        this.f407791d = str;
        this.f407792e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ap.a.a(1, "errAccStats", null, null, "listOverHeat", this.f407791d, java.lang.String.valueOf(this.f407792e.size()));
    }
}
