package sz4;

/* loaded from: classes12.dex */
public class a0 extends sz4.u {

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f495717y;

    public a0(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f495767i.setVisibility(8);
        this.f495764f.setVisibility(8);
        this.f495772q.setVisibility(8);
        this.f495767i.setOnClickListener(null);
        this.f495773r.setOnClickListener(new sz4.z(this));
    }

    @Override // sz4.a
    public int i() {
        return -1;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        super.j(cVar, i17, i18);
        if (cVar.d() != -1) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.f495774s;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        linearLayout.setLayoutParams(layoutParams);
        this.f495773r.setVisibility(0);
        this.f495717y = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567695kf0);
    }
}
