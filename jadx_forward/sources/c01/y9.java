package c01;

/* loaded from: classes11.dex */
public class y9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.da f119107d;

    public y9(c01.da daVar) {
        this.f119107d = daVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.da daVar = this.f119107d;
        if (daVar != null) {
            daVar.c();
        }
    }
}
