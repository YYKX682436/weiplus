package bm2;

/* loaded from: classes10.dex */
public final class m8 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView f22116d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f22117e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f22118f;

    /* renamed from: g, reason: collision with root package name */
    public bm2.n8 f22119g;

    /* renamed from: h, reason: collision with root package name */
    public fn2.c f22120h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bm2.p8 f22121i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(bm2.p8 p8Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f22121i = p8Var;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.vny);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = (com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView) findViewById;
        this.f22116d = finderLiveSongInfoView;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.vnx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f22117e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.vnv);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f22118f = (android.widget.RelativeLayout) findViewById3;
        this.f22119g = bm2.n8.f22168d;
        finderLiveSongInfoView.B();
    }
}
