package sz4;

/* loaded from: classes12.dex */
public class l extends sz4.u {
    public l(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f495767i.setVisibility(0);
        this.f495764f.setVisibility(8);
        this.f495772q.setVisibility(8);
        this.f495767i.setTag(this);
        this.f495767i.setOnClickListener(this.f495777v);
    }

    @Override // sz4.a
    public int i() {
        return 3;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        this.f495770o.setImageResource(com.p314xaae8f345.mm.R.raw.f78424x902f66d4);
        iz4.g gVar = (iz4.g) cVar;
        this.f495768m.setText(gVar.f377681t);
        this.f495769n.setText(gVar.f377685x);
        super.j(cVar, i17, i18);
    }

    @Override // sz4.u
    public android.view.View k() {
        return this.f495770o;
    }
}
