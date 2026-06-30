package fc3;

/* loaded from: classes5.dex */
public abstract class j {
    public static boolean a(android.content.Context context, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291) {
        if (abstractC19636xc6b37291 == null) {
            return false;
        }
        abstractC19636xc6b37291.h();
        if (abstractC19636xc6b37291.getVisibility() != 0) {
            return false;
        }
        abstractC19636xc6b37291.setVisibility(8);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        loadAnimation.setAnimationListener(new fc3.i(abstractC19636xc6b37291));
        abstractC19636xc6b37291.startAnimation(loadAnimation);
        return true;
    }

    public static void b(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291) {
        abstractC19636xc6b37291.mo75351x4aab89d0(false);
        abstractC19636xc6b37291.mo75347xe8c09ab9(true);
        abstractC19636xc6b37291.mo75354x8aa5e079(true);
        abstractC19636xc6b37291.p(true, true);
        abstractC19636xc6b37291.mo75349x4a374107(true);
    }

    public static void c(java.lang.String str, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291, int i17, qk.u9 u9Var) {
        abstractC19636xc6b37291.mo75358x658d5272(str);
        abstractC19636xc6b37291.mo75331xef640234(i17);
        abstractC19636xc6b37291.setVisibility(0);
        abstractC19636xc6b37291.i();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(viewGroup.getContext()));
        layoutParams.gravity = 80;
        viewGroup.removeAllViews();
        viewGroup.addView(abstractC19636xc6b37291, layoutParams);
        qk.v9 d17 = qk.w9.d();
        d17.f445884a = u9Var;
        abstractC19636xc6b37291.mo75328x6c4ebec7(d17);
    }
}
