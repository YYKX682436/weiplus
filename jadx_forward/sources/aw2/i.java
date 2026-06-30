package aw2;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f96286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96287e;

    public i(aw2.n nVar, java.lang.String str) {
        this.f96286d = nVar;
        this.f96287e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f96286d.a(this.f96287e, false);
    }
}
