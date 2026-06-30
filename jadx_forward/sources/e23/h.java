package e23;

/* loaded from: classes12.dex */
public class h extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.i f328392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e23.i iVar) {
        super(iVar);
        this.f328392b = iVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.g gVar2 = (e23.g) eVar;
        e23.i iVar = (e23.i) gVar;
        android.content.res.Resources resources = context.getResources();
        if (this.f328392b.f328402t) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idk, resources.getString(iVar.f328401s)), gVar2.f328384a);
            gVar2.f328385b.setRotation(0.0f);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.idl), gVar2.f328384a);
            gVar2.f328385b.setRotation(180.0f);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbv, viewGroup, false);
        e23.g gVar = this.f328392b.f328404v;
        gVar.f328384a = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jrw);
        gVar.f328385b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jqn);
        inflate.setTag(gVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
