package or2;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.view.Display.Mode f429149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or2.f f429150e;

    public b(or2.f fVar, android.view.Display.Mode mode) {
        this.f429150e = fVar;
        this.f429149d = mode;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Display.Mode mode = this.f429149d;
        if (mode != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mode);
            this.f429150e.Q6(mode);
        }
    }
}
