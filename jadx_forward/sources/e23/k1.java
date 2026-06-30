package e23;

/* loaded from: classes12.dex */
public class k1 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l1 f328419b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(e23.l1 l1Var) {
        super(l1Var);
        this.f328419b = l1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.i1 i1Var = (e23.i1) eVar;
        e23.l1 l1Var = this.f328419b;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idw, l1Var.f505295e.f432662a);
        android.widget.TextView textView = i1Var.f328406a;
        p13.r rVar = l1Var.f505295e;
        p13.i iVar = new p13.i();
        iVar.f432626a = string;
        iVar.f432627b = rVar;
        iVar.f432628c = false;
        iVar.f432629d = false;
        iVar.f432633h = textView.getPaint();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(o13.q.e(iVar).f432638a, i1Var.f328406a);
        if (((e23.l1) gVar).f328423v > 3) {
            i1Var.f328407b.setVisibility(0);
            i1Var.f328407b.setOnClickListener(new e23.j1(this, context));
        } else {
            i1Var.f328407b.setVisibility(8);
            i1Var.f328407b.setOnClickListener(null);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570658bd4, viewGroup, false);
        e23.i1 i1Var = this.f328419b.f328425x;
        i1Var.f328406a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        i1Var.f328407b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jrw);
        inflate.setTag(i1Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
