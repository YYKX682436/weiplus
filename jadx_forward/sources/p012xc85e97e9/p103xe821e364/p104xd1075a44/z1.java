package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93841d;

    public z1(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f93841d = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93841d;
        if (!c1163xf1deaba4.f93446z || c1163xf1deaba4.isLayoutRequested()) {
            return;
        }
        if (!c1163xf1deaba4.f93440x) {
            c1163xf1deaba4.requestLayout();
        } else if (c1163xf1deaba4.C) {
            c1163xf1deaba4.B = true;
        } else {
            c1163xf1deaba4.U();
        }
    }
}
