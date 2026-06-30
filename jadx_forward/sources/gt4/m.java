package gt4;

/* loaded from: classes9.dex */
public class m implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19141xe17e052b f357001a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19141xe17e052b c19141xe17e052b) {
        this.f357001a = c19141xe17e052b;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19141xe17e052b c19141xe17e052b = this.f357001a;
        android.content.Context context = c19141xe17e052b.getContext();
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569724k1, (android.view.ViewGroup) null);
            view.setImportantForAccessibility(2);
            gt4.o oVar = new gt4.o(null);
            oVar.f357012b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bdd);
            oVar.f357013c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.az6);
            oVar.f357011a = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.f565007az5);
            view.setTag(oVar);
        }
        gt4.o oVar2 = (gt4.o) view.getTag();
        if (c19141xe17e052b.f279405p && z17) {
            oVar2.f357012b.setText(nVar.f342430a);
            oVar2.f357012b.setContentDescription(c19141xe17e052b.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kgj, nVar.f342430a));
            oVar2.f357012b.setVisibility(0);
        } else {
            oVar2.f357012b.setVisibility(8);
        }
        gt4.n nVar2 = (gt4.n) nVar.f342431b;
        oVar2.f357013c.setText(nVar2.f357006c);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar2.f357004a)) {
            oVar2.f357011a.setImageBitmap(null);
        } else {
            oVar2.f357011a.m75397xc185581c(true);
            oVar2.f357011a.c(nVar2.f357004a, -1, 0, 0, nVar2.f357005b);
        }
        return view;
    }
}
