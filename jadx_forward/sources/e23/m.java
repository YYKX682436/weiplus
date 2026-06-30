package e23;

/* loaded from: classes11.dex */
public class m extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.o f328426b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e23.o oVar) {
        super(oVar);
        this.f328426b = oVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.n nVar = (e23.n) eVar;
        e23.o oVar = this.f328426b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(oVar.f328386q, nVar.f328436b);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(nVar.f328437c, oVar.f328450v, null);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str = oVar.f328450v;
        java.lang.CharSequence displayName = oVar.f328451w;
        float h17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        we0.j1 j1Var = (we0.j1) l0Var;
        j1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "displayName");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(j1Var.Bi(null, str, displayName, bi4.c.DEFAULT, h17, new xe0.v0()), nVar.f328439e);
        nVar.f328435a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        nVar.f328435a.setOnClickListener(new e23.l(this, context));
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bby, viewGroup, false);
        e23.n nVar = this.f328426b.f328454z;
        nVar.f328435a = inflate.findViewById(com.p314xaae8f345.mm.R.id.gzi);
        nVar.f328436b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzf);
        nVar.f328438d = inflate.findViewById(com.p314xaae8f345.mm.R.id.knz);
        nVar.f328437c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        nVar.f328439e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        inflate.setTag(nVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
