package mp5;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f412030d;

    public s(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223) {
        this.f412030d = c22894x55bf3223;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412030d;
        android.animation.AnimatorSet animatorSet = c22894x55bf3223.f295353x.M;
        if (animatorSet != null) {
            animatorSet.start();
        }
        c22894x55bf3223.j(false);
    }
}
