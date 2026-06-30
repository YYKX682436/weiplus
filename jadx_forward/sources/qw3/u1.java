package qw3;

/* loaded from: classes9.dex */
public class u1 implements fb5.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.C17110xe48466cc f448746a;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.C17110xe48466cc c17110xe48466cc) {
        this.f448746a = c17110xe48466cc;
    }

    @Override // fb5.l
    public android.view.View a(fb5.n nVar, android.view.View view, android.view.ViewGroup viewGroup, int i17, int i18, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.C17110xe48466cc c17110xe48466cc = this.f448746a;
        android.content.Context context = c17110xe48466cc.getContext();
        if (view == null) {
            view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569724k1, (android.view.ViewGroup) null);
            qw3.v1 v1Var = new qw3.v1(c17110xe48466cc, null);
            v1Var.f448750b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bdd);
            v1Var.f448751c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.az6);
            v1Var.f448749a = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.f565007az5);
            view.setTag(v1Var);
        }
        qw3.v1 v1Var2 = (qw3.v1) view.getTag();
        r45.qd qdVar = (r45.qd) nVar.f342431b;
        if (qdVar != null) {
            if (c17110xe48466cc.f279405p && z17) {
                if (nVar.f342430a.equals("☆")) {
                    v1Var2.f448750b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.aes);
                } else {
                    v1Var2.f448750b.setText(nVar.f342430a);
                }
                v1Var2.f448750b.setVisibility(0);
            } else {
                v1Var2.f448750b.setVisibility(8);
            }
            v1Var2.f448749a.m75397xc185581c(true);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 c19659x677e0913 = v1Var2.f448749a;
            java.lang.String str = qdVar.f465373f;
            c19659x677e0913.c(str, -1, 0, 0, dt4.b.a(str));
            v1Var2.f448751c.setText(qdVar.f465372e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BankcardSortView", "elem is null: %s", java.lang.Integer.valueOf(i17));
        }
        return view;
    }
}
