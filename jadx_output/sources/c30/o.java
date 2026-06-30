package c30;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.s f38151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f38152e;

    public o(c30.s sVar, java.util.List list) {
        this.f38151d = sVar;
        this.f38152e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38151d.c(c30.j.f38136f, this.f38152e);
    }
}
