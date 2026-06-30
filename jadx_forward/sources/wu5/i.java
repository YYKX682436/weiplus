package wu5;

/* loaded from: classes16.dex */
public abstract class i implements java.lang.Runnable, wu5.e {
    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        b(this);
        try {
            c();
        } finally {
            a(this);
        }
    }
}
