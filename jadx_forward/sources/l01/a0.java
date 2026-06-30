package l01;

/* loaded from: classes7.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.b0 f396270d;

    public a0(l01.b0 b0Var) {
        this.f396270d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.c0 c0Var = this.f396270d.f396278d;
        c0Var.f396292p = false;
        c0Var.c();
    }
}
