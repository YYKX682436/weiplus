package bm2;

/* loaded from: classes10.dex */
public final class i6 extends in5.r0 implements hn2.l {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView f21979e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.button.WeButton f21980f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMProcessBar f21981g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f21982h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(bm2.o6 o6Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.v9l);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = (com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView) findViewById;
        this.f21979e = finderLiveSongInfoView;
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) itemView.findViewById(com.tencent.mm.R.id.slp);
        this.f21980f = weButton;
        this.f21981g = (com.tencent.mm.ui.widget.MMProcessBar) itemView.findViewById(com.tencent.mm.R.id.ree);
        android.widget.TextView textView = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.opx);
        this.f21982h = textView;
        finderLiveSongInfoView.B();
        weButton.setText(o6Var.f22195h.getString(com.tencent.mm.R.string.mnb));
        textView.setText(o6Var.f22195h.getString(com.tencent.mm.R.string.mnh));
    }

    @Override // hn2.l
    /* renamed from: getAuditionBackgroundView */
    public android.view.View getF119781w() {
        return this.f21979e.getF119781w();
    }

    @Override // hn2.l
    public android.view.View getAuditionPlayView() {
        return this.f21979e.getAuditionPlayView();
    }

    @Override // hn2.l
    public com.tencent.mm.view.MMPAGView getAuditionPlayingAnim() {
        return this.f21979e.getAuditionPlayingAnim();
    }

    @Override // hn2.l
    /* renamed from: getAuditionProgressView */
    public android.view.View getF119783y() {
        return this.f21979e.getF119783y();
    }
}
