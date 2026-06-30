package al5;

/* loaded from: classes10.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.e2 f5880d;

    public d2(al5.e2 e2Var) {
        this.f5880d = e2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f5880d.f5884a.f5906g;
        al5.c2 c2Var = mMSwitchBtn.N;
        if (c2Var != null) {
            c2Var.onStatusChange(mMSwitchBtn.f211363x);
        }
    }
}
