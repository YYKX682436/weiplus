package c30;

/* loaded from: classes12.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.s f119684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f119685e;

    public o(c30.s sVar, java.util.List list) {
        this.f119684d = sVar;
        this.f119685e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f119684d.c(c30.j.f119669f, this.f119685e);
    }
}
