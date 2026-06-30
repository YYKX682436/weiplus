package e23;

/* loaded from: classes12.dex */
public class c0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.d0 f328328b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e23.d0 d0Var) {
        super(d0Var);
        this.f328328b = d0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.b0 b0Var = (e23.b0) eVar;
        e23.d0 d0Var = (e23.d0) gVar;
        android.view.View view = b0Var.f328311a;
        e23.d0 d0Var2 = this.f328328b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.i(view, d0Var2.f505294d);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(d0Var2.f328343r, b0Var.f328313c);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(d0Var2.f328344s, b0Var.f328314d);
        p13.f fVar = d0Var.f328347v;
        if (fVar == null || fVar.f68145x818dc9ac != 98 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f328342q.f432720e) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(d0Var.f328342q.f432720e)) {
            b0Var.f328315e.setVisibility(4);
        } else {
            b0Var.f328315e.setVisibility(0);
        }
        p13.f fVar2 = d0Var.f328347v;
        if (fVar2 != null && fVar2.f68145x818dc9ac == 98 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d0Var.f328342q.f432720e)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(b0Var.f328312b, d0Var.f328342q.f432720e, null);
        } else {
            int i17 = d0Var2.f328346u;
            if (i17 != -1) {
                b0Var.f328312b.setImageResource(i17);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.k(context, b0Var.f328312b, null, d0Var.f328345t, com.p314xaae8f345.mm.R.raw.f79416xbad90eb, true, 0, 0);
            }
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbw, viewGroup, false);
        e23.b0 b0Var = this.f328328b.f328349x;
        b0Var.f328312b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        b0Var.f328313c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        b0Var.f328314d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
        b0Var.f328311a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
        b0Var.f328315e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.spk);
        inflate.setTag(b0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).hj(this.f328328b.f505291a).b(context, view, gVar, objArr);
    }
}
