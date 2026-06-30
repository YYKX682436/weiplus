package by5;

/* loaded from: classes13.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f117953d;

    public b1(android.content.Context context) {
        this.f117953d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        by5.c4.f("XWebCleaner", "tryClean start");
        by5.c1.i(this.f117953d, false);
        by5.c1.j(this.f117953d, false);
        by5.c1.a(false);
        by5.c1.b(this.f117953d);
        by5.c1.f117955a = false;
        by5.c4.f("XWebCleaner", "tryClean finished");
    }
}
