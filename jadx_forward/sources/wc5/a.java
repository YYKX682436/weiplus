package wc5;

/* loaded from: classes5.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed5.m f526060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f526061e;

    public a(ed5.m mVar, int i17) {
        this.f526060d = mVar;
        this.f526061e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f526060d.b(this.f526061e);
    }
}
