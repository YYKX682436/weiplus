package sz4;

/* loaded from: classes12.dex */
public class h extends sz4.u {
    public h(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f495767i.setVisibility(0);
        this.f495764f.setVisibility(8);
        this.f495772q.setVisibility(8);
        this.f495767i.setTag(this);
        this.f495767i.setOnClickListener(this.f495777v);
    }

    @Override // sz4.a
    public int i() {
        return 5;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.d dVar = (iz4.d) cVar;
        java.lang.String str = dVar.f377691v;
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        this.f495770o.setImageResource(o25.y.a(str));
        this.f495768m.setText(dVar.f377689t);
        this.f495769n.setText(dVar.f377690u);
        super.j(cVar, i17, i18);
    }

    @Override // sz4.u
    public android.view.View k() {
        return this.f495770o;
    }
}
