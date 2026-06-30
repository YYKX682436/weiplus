package e23;

/* loaded from: classes12.dex */
public class s extends e23.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.t f328488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e23.t tVar) {
        super(tVar);
        this.f328488c = tVar;
    }

    @Override // e23.o0, u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.t tVar = (e23.t) gVar;
        e23.n0 n0Var = (e23.n0) eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(n0Var.f328440a, this.f328488c.f505294d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tVar.f328458q.f432722g)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f328442c, tVar.f328458q.f432720e, null);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(n0Var.f328442c, tVar.f328458q.f432722g, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(tVar.C, n0Var.f328443d);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(tVar.f328462u, n0Var.f328444e);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(tVar.f328464w, n0Var.f328447h);
    }

    @Override // e23.o0, u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate;
        e23.n0 n0Var = this.f328488c.f328467z;
        if (e23.p0.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSConvTalkerMessageDataItem", "fts multi_msg_show_details enabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.efh, viewGroup, false);
            n0Var.f328441b = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
            n0Var.f328445f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rte);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSConvTalkerMessageDataItem", "fts multi_msg_show_details disabled");
            inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bcg, viewGroup, false);
        }
        n0Var.f328442c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        n0Var.f328443d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        n0Var.f328444e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jue);
        n0Var.f328440a = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        n0Var.f328447h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        n0Var.f328442c.getLayoutParams().width = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.it);
        n0Var.f328442c.getLayoutParams().height = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.it);
        inflate.setTag(n0Var);
        return inflate;
    }
}
