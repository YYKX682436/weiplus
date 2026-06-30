package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e f91135d;

    public h1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e) {
        this.f91135d = c0099x7ccac81e;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 b1Var = this.f91135d.f90952f;
        if (b1Var != null) {
            b1Var.m2863xbfc13616(true);
            b1Var.requestLayout();
        }
    }
}
