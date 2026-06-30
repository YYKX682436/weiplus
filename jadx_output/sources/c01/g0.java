package c01;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c01.h0 f37197d;

    public g0(c01.h0 h0Var) {
        this.f37197d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c01.da daVar = this.f37197d.f37220f;
        if (daVar != null) {
            daVar.c();
        }
    }
}
