package c23;

/* loaded from: classes.dex */
public final class f implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.m f38028d;

    public f(c23.m mVar) {
        this.f38028d = mVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        b23.b bVar = (b23.b) state.a(b23.b.class);
        c23.m mVar = this.f38028d;
        if (bVar != null) {
            mVar.V6().addJavascriptInterface(mVar.T6(), "ftsJSApi");
            ((android.widget.FrameLayout) ((jz5.n) mVar.f38048i).getValue()).addView(mVar.V6(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            mVar.V6().setBackgroundColor(mVar.getResources().getColor(com.tencent.mm.plugin.fts.ui.n3.g(mVar.getActivity()) ? com.tencent.mm.R.color.akw : com.tencent.mm.R.color.f479153rh));
            mVar.V6().loadUrl(state.f17385e);
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSHotSearchUIC", "load url " + state.f17385e);
            mVar.V6().setVisibility(4);
            mVar.V6().D0(new c23.e(mVar));
        }
        b23.f fVar = (b23.f) state.a(b23.f.class);
        if (fVar != null) {
            if (fVar.f17391b) {
                ((android.widget.FrameLayout) ((jz5.n) mVar.f38048i).getValue()).setVisibility(0);
            } else {
                ((android.widget.FrameLayout) ((jz5.n) mVar.f38048i).getValue()).setVisibility(8);
            }
        }
    }
}
