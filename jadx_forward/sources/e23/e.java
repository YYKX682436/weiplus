package e23;

/* loaded from: classes11.dex */
public abstract class e extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.f f328358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e23.f fVar) {
        super(fVar);
        this.f328358b = fVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        int i17;
        e23.d dVar = (e23.d) eVar;
        e23.f fVar = (e23.f) gVar;
        android.view.View view = dVar.f328335a;
        e23.f fVar2 = this.f328358b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(view, fVar2.f505294d);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(dVar.f328336b, fVar.f328374s, null);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(fVar.f328375t, dVar.f328337c);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(dVar.f328337c, fVar.f328374s, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs));
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(fVar.f328376u, dVar.f328338d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f328377v)) {
            dVar.f328341g.setVisibility(8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b("@" + fVar.f328377v, dVar.f328341g);
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(fVar2.f328374s)) {
            dm.u8 Di = ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Di(fVar2.f328374s);
            if (Di == null || !((i17 = Di.f68600x1c5d3c28) == 2 || i17 == 3 || i17 == 4)) {
                dVar.f328339e.setVisibility(8);
            } else {
                dVar.f328339e.setVisibility(0);
            }
        }
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(fVar2.f328374s)) {
            dVar.f328340f.setVisibility(0);
        } else {
            dVar.f328339e.setVisibility(8);
            dVar.f328340f.setVisibility(8);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbw, viewGroup, false);
        e23.d dVar = this.f328358b.f328378w;
        dVar.f328336b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        dVar.f328337c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        dVar.f328338d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        dVar.f328341g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhi);
        dVar.f328335a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        dVar.f328339e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hhr);
        dVar.f328340f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.spk);
        inflate.setTag(dVar);
        return inflate;
    }
}
