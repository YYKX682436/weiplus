package fi1;

/* loaded from: classes8.dex */
public final class f implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi1.g f344315d;

    public f(fi1.g gVar) {
        this.f344315d = gVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12 = this.f344315d.f344316f;
        c12478x3e6e5e12.D = true;
        float f17 = c12478x3e6e5e12.f167811i ? c12478x3e6e5e12.f167815p : c12478x3e6e5e12.f167816q;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c12478x3e6e5e12.f167809g;
        if (c22633x83752a59 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c22633x83752a59.getLayoutParams();
            if (-1 != layoutParams.width || -1 != layoutParams.height) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                c12478x3e6e5e12.f167809g.setLayoutParams(layoutParams);
            }
            c12478x3e6e5e12.f167809g.setBackgroundColor(c12478x3e6e5e12.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        }
        float f18 = c12478x3e6e5e12.f167814o;
        android.widget.LinearLayout linearLayout = c12478x3e6e5e12.f167806d;
        linearLayout.setTranslationY(f18);
        linearLayout.animate().translationY(f17).setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator()).setUpdateListener(new fi1.o(c12478x3e6e5e12)).setListener(new fi1.n(c12478x3e6e5e12)).start();
    }
}
