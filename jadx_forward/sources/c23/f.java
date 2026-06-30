package c23;

/* loaded from: classes.dex */
public final class f implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.m f119561d;

    public f(c23.m mVar) {
        this.f119561d = mVar;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        b23.a state = (b23.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        b23.b bVar = (b23.b) state.a(b23.b.class);
        c23.m mVar = this.f119561d;
        if (bVar != null) {
            mVar.V6().mo120128x74041feb(mVar.T6(), "ftsJSApi");
            ((android.widget.FrameLayout) ((jz5.n) mVar.f119581i).mo141623x754a37bb()).addView(mVar.V6(), new android.widget.FrameLayout.LayoutParams(-1, -1));
            mVar.V6().setBackgroundColor(mVar.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(mVar.m158354x19263085()) ? com.p314xaae8f345.mm.R.C30859x5a72f63.akw : com.p314xaae8f345.mm.R.C30859x5a72f63.f560686rh));
            mVar.V6().mo32265x141096a9(state.f98918e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSHotSearchUIC", "load url " + state.f98918e);
            mVar.V6().setVisibility(4);
            mVar.V6().D0(new c23.e(mVar));
        }
        b23.f fVar = (b23.f) state.a(b23.f.class);
        if (fVar != null) {
            if (fVar.f98924b) {
                ((android.widget.FrameLayout) ((jz5.n) mVar.f119581i).mo141623x754a37bb()).setVisibility(0);
            } else {
                ((android.widget.FrameLayout) ((jz5.n) mVar.f119581i).mo141623x754a37bb()).setVisibility(8);
            }
        }
    }
}
