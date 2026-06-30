package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e f91177d;

    public l1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e) {
        this.f91177d = c0099x7ccac81e;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0099x7ccac81e c0099x7ccac81e = this.f91177d;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.b1 b1Var = c0099x7ccac81e.f90952f;
        if (b1Var != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!n3.x0.b(b1Var) || c0099x7ccac81e.f90952f.getCount() <= c0099x7ccac81e.f90952f.getChildCount() || c0099x7ccac81e.f90952f.getChildCount() > c0099x7ccac81e.f90962s) {
                return;
            }
            c0099x7ccac81e.E.setInputMethodMode(2);
            c0099x7ccac81e.mo2735x35dafd();
        }
    }
}
