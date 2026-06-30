package nf2;

/* loaded from: classes10.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(nf2.d1 d1Var) {
        super(0);
        this.f418292d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nf2.d1 d1Var = this.f418292d;
        d1Var.f418233u = false;
        android.view.View view = d1Var.f418229q;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
                layoutParams2.f92439q = -1;
                layoutParams2.f92426h = -1;
                layoutParams2.f92441s = -1;
                layoutParams2.f92432k = -1;
                int ordinal = d1Var.f418215c.f418265n.ordinal();
                if (ordinal == 0) {
                    layoutParams2.f92441s = com.p314xaae8f345.mm.R.id.tkv;
                    layoutParams2.f92432k = com.p314xaae8f345.mm.R.id.tkv;
                } else if (ordinal == 1) {
                    layoutParams2.f92439q = com.p314xaae8f345.mm.R.id.tkv;
                    layoutParams2.f92441s = com.p314xaae8f345.mm.R.id.tkv;
                    layoutParams2.f92432k = com.p314xaae8f345.mm.R.id.tkv;
                }
                view.setLayoutParams(layoutParams2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "restoreCollapsedButtonConstraints: restored to menu container, mode=" + d1Var.f418215c.f418265n);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "expand: animation completed, alignment: " + d1Var.E);
        return jz5.f0.f384359a;
    }
}
