package e33;

/* loaded from: classes10.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e33.n1 f328887d;

    public m1(e33.n1 n1Var) {
        this.f328887d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd;
        java.lang.ref.WeakReference weakReference = this.f328887d.f328912d;
        if (weakReference == null || (activityC15653x403456cd = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) weakReference.get()) == null) {
            return;
        }
        activityC15653x403456cd.m78584xbdfaa6d9(true);
        activityC15653x403456cd.f220060l2 = true;
    }
}
