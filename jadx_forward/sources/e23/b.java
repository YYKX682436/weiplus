package e23;

/* loaded from: classes12.dex */
public class b extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.c f328310b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e23.c cVar) {
        super(cVar);
        this.f328310b = cVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.a aVar = (e23.a) eVar;
        android.view.View view = aVar.f328301a;
        e23.c cVar = this.f328310b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.i(view, cVar.f505294d);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(cVar.f328326q, aVar.f328303c);
        aVar.f328302b.setImageResource(com.p314xaae8f345.mm.R.raw.f81002xa8135192);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570654bd0, viewGroup, false);
        e23.a aVar = new e23.a(this.f328310b);
        aVar.f328302b = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        aVar.f328303c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o_q);
        aVar.f328301a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
