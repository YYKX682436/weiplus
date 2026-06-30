package e23;

/* loaded from: classes12.dex */
public class r0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.s0 f328486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(e23.s0 s0Var) {
        super(s0Var);
        this.f328486b = s0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.q0 q0Var = (e23.q0) eVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.i(q0Var.f328475a, this.f328486b.f505294d);
        q0Var.f328476b.setText(((e23.s0) gVar).f328489q);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bch, viewGroup, false);
        e23.q0 q0Var = new e23.q0(this.f328486b);
        q0Var.f328476b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        q0Var.f328475a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
        inflate.setTag(q0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(z13.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        k23.r2 r2Var = ((z13.f) a17).f550939o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2Var, "<this>");
        boolean z17 = r2Var == k23.r2.f385218g;
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = z17 ? "yes" : "no";
        e23.s0 s0Var = this.f328486b;
        objArr2[1] = s0Var.i();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMoreDataItem", "onItemClick: isFloatingVoiceText=%s, query: %s", objArr2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Floating_VoiceText", z17);
        intent.putExtra("detail_query", s0Var.i());
        intent.putExtra("detail_type", s0Var.f505297g);
        intent.putExtra("Search_Scene", s0Var.f505298h);
        intent.putExtra("home_page_search_id", o13.p.f423784d);
        o13.n.q(context, ".ui.FTSDetailUI", intent);
        return true;
    }
}
