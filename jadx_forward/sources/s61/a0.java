package s61;

/* loaded from: classes15.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 f484850d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69) {
        this.f484850d = activityC11376x2afd0f69;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1010xb4860a9e.ui.ActivityC11376x2afd0f69 activityC11376x2afd0f69 = this.f484850d;
        if (activityC11376x2afd0f69.f154679t == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb6.append(gm0.m.e());
            sb6.append(",");
            sb6.append(s61.a0.class.getName());
            sb6.append(",R300_500_QQ,");
            gm0.j1.b();
            sb6.append(gm0.m.f("R300_500_QQ"));
            sb6.append(",3");
            n71.a.b(10645, sb6.toString());
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            gm0.j1.b();
            sb7.append(gm0.m.e());
            sb7.append(",");
            sb7.append(s61.a0.class.getName());
            sb7.append(",R300_500_phone,");
            gm0.j1.b();
            sb7.append(gm0.m.f("R300_500_phone"));
            sb7.append(",3");
            n71.a.b(10645, sb7.toString());
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        s61.y yVar = new s61.y(this);
        activityC11376x2afd0f69.f154677r = yVar;
        d17.a(com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60883xc58bd72e, yVar);
        activityC11376x2afd0f69.f154669g = db5.e1.Q(activityC11376x2afd0f69.mo55332x76847179(), activityC11376x2afd0f69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC11376x2afd0f69.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cgj), true, true, new s61.z(this));
        r61.n0 n0Var = activityC11376x2afd0f69.f154668f;
        java.lang.String str = activityC11376x2afd0f69.f154676q;
        n0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i18 = 0;
        while (true) {
            java.util.LinkedList linkedList = (java.util.LinkedList) n0Var.f474446h;
            if (i18 >= linkedList.size()) {
                gm0.j1.d().g(new r61.q1(str, arrayList));
                return;
            } else {
                if (n0Var.f474447i[i18] == 2) {
                    arrayList.add(((java.lang.String[]) linkedList.get(i18))[0]);
                }
                i18++;
            }
        }
    }
}
