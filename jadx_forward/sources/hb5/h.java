package hb5;

/* loaded from: classes11.dex */
public class h implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb5.i f361728a;

    public h(hb5.i iVar) {
        this.f361728a = iVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = i65.a.D(context) ? android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck7, viewGroup, false) : android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck6, viewGroup, false);
        hb5.g gVar = this.f361728a.F;
        gVar.f361723a = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        gVar.f361724b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut)).setVisibility(8);
        inflate.setTag(gVar);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar, boolean z17, boolean z18) {
        o11.g gVar;
        hb5.i iVar = (hb5.i) dVar;
        hb5.g gVar2 = (hb5.g) bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(iVar.f288351y, gVar2.f361724b);
        n11.a b17 = n11.a.b();
        java.lang.String str = iVar.C;
        android.widget.ImageView imageView = gVar2.f361723a;
        java.lang.String str2 = iVar.f288352z;
        this.f361728a.getClass();
        if (str2 == null) {
            gVar = null;
        } else {
            java.util.HashMap hashMap = (java.util.HashMap) hb5.i.G;
            if (!hashMap.containsKey(str2) || hashMap.get(str2) == null) {
                o11.f fVar = new o11.f();
                fVar.f423616g = qk.b.a(str2);
                fVar.f423611b = true;
                fVar.f423628s = true;
                fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
                o11.g a17 = fVar.a();
                hashMap.put(str2, a17);
                gVar = a17;
            } else {
                gVar = (o11.g) hashMap.get(str2);
            }
        }
        b17.h(str, imageView, gVar);
    }
}
