package al5;

/* loaded from: classes5.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.y4 f6089d;

    public x4(al5.y4 y4Var) {
        this.f6089d = y4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.WeSwitch weSwitch = this.f6089d.f6103a.f6109g;
        al5.w4 w4Var = weSwitch.M;
        if (w4Var != null) {
            w4Var.onStatusChange(weSwitch.f211515x);
        }
    }
}
