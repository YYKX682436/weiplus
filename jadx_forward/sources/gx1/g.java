package gx1;

/* loaded from: classes12.dex */
public class g extends gx1.l {
    public g(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        gx1.f fVar = new gx1.f(this);
        this.f358840i.setVisibility(0);
        this.f358837f.setVisibility(8);
        this.f358845q.setVisibility(8);
        this.f358840i.setTag(this);
        this.f358840i.setOnClickListener(fVar);
    }

    @Override // gx1.a
    public int i() {
        return 3;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        this.f358843o.setImageResource(com.p314xaae8f345.mm.R.raw.f78424x902f66d4);
        ix1.e eVar = (ix1.e) aVar;
        this.f358841m.setText(eVar.f376863s);
        this.f358842n.setText(eVar.f376867w);
        super.j(aVar, i17, i18);
    }
}
