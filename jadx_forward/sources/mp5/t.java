package mp5;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 f412031d;

    public t(com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223) {
        this.f412031d = c22894x55bf3223;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223.S;
        com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 c22894x55bf3223 = this.f412031d;
        c22894x55bf3223.setVisibility(0);
        c22894x55bf3223.f295352w.setVisibility(4);
        c22894x55bf3223.f295352w.post(new mp5.g(c22894x55bf3223, false));
        android.animation.AnimatorSet animatorSet = c22894x55bf3223.f295353x.Q;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }
}
