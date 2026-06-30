package gx1;

/* loaded from: classes12.dex */
public class n extends gx1.l {

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f358853z;

    public n(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.f358840i.setVisibility(8);
        this.f358837f.setVisibility(8);
        this.f358845q.setVisibility(8);
        this.f358840i.setOnClickListener(null);
        this.f358846r.setOnClickListener(new gx1.m(this));
    }

    @Override // gx1.a
    public int i() {
        return -1;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        super.j(aVar, i17, i18);
        if (aVar.b() != -1) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.f358847s;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.bottomMargin = 0;
        layoutParams.topMargin = 0;
        linearLayout.setLayoutParams(layoutParams);
        this.f358846r.setVisibility(0);
        this.f358853z = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567695kf0);
    }
}
