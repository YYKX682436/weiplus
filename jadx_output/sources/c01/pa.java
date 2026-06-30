package c01;

/* loaded from: classes11.dex */
public class pa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.ra f37378d;

    public pa(c01.ra raVar) {
        this.f37378d = raVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37378d.onGYNetEnd(0, 0, 0, null, null, null);
    }

    public java.lang.String toString() {
        return super.toString() + "|doScene";
    }
}
