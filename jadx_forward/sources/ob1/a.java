package ob1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob1.c f425516d;

    public a(ob1.c cVar) {
        this.f425516d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f425516d.f425530l) {
            return;
        }
        this.f425516d.p(ob1.m.f425565s);
        this.f425516d.m();
    }
}
