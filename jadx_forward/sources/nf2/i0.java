package nf2;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418284d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(nf2.d1 d1Var) {
        super(0);
        this.f418284d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nf2.d1 d1Var = this.f418284d;
        d1Var.f418233u = true;
        android.view.View view = d1Var.f418229q;
        if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.f92441s = -1;
                layoutParams2.f92432k = -1;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = view.getLeft();
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = view.getTop();
                layoutParams2.f92439q = 0;
                layoutParams2.f92426h = 0;
                view.setLayoutParams(layoutParams2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "releaseCollapsedButtonConstraints: btn position=(" + view.getLeft() + ", " + view.getTop() + ')');
            }
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = d1Var.f418230r;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.setVisibility(0);
            c22789xd23e9a9b.m82584xebcf33cb(3);
            c22789xd23e9a9b.m82583xcde73672(-1);
            c22789xd23e9a9b.d();
            c22789xd23e9a9b.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "startCollapsedPagAnim: PAG animation started, duration=" + c22789xd23e9a9b.c() + ", isPlaying=" + c22789xd23e9a9b.f());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLyricsView", "collapse: animation completed");
        return jz5.f0.f384359a;
    }
}
