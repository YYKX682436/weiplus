package sz4;

/* loaded from: classes12.dex */
public class g0 extends sz4.u {
    public g0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f495767i.setVisibility(0);
        this.f495764f.setVisibility(8);
        this.f495772q.setVisibility(8);
        this.f495767i.setTag(this);
        this.f495767i.setOnClickListener(this.f495777v);
    }

    @Override // sz4.a
    public int i() {
        return 0;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        this.f495770o.setImageResource(com.p314xaae8f345.mm.R.raw.f80661xd7ecf890);
        iz4.j jVar = (iz4.j) cVar;
        this.f495768m.setText(jVar.f377661t);
        this.f495769n.setText(jVar.f377662u);
        super.j(cVar, i17, i18);
    }
}
