package gx1;

/* loaded from: classes12.dex */
public class b extends gx1.l {
    public b(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.f358840i.setVisibility(0);
        this.f358837f.setVisibility(8);
        this.f358845q.setVisibility(8);
        this.f358840i.setTag(this);
        this.f358840i.setOnClickListener(this.f358851w);
    }

    @Override // gx1.a
    public int i() {
        return 5;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        ix1.b bVar = (ix1.b) aVar;
        java.lang.String str = bVar.f376874u;
        kk.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u1.f182997a;
        this.f358843o.setImageResource(o25.y.a(str));
        this.f358841m.setText(bVar.f376872s);
        this.f358842n.setText(bVar.f376873t);
        super.j(aVar, i17, i18);
    }
}
