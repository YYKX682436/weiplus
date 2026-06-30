package ww1;

/* loaded from: classes5.dex */
public final class d extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.f f531701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y63.a f531702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ww1.f fVar, y63.a aVar) {
        super(false);
        this.f531701d = fVar;
        this.f531702e = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        ww1.b bVar = this.f531701d.f531713g;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l5 l5Var = (com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.l5) bVar;
            com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = l5Var.f154255b.f154281d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.LaunchAAUI", "importGroupSolitatireData：%s", java.lang.Integer.valueOf(activityC11351x975a7907.f154037h));
            activityC11351x975a7907.D1 = 1;
            y63.a aVar = this.f531702e;
            activityC11351x975a7907.E1 = aVar;
            java.lang.String j17 = h61.o.j(200, aVar.H);
            activityC11351x975a7907.f154043p.mo81583x7e4f2d39(new android.text.InputFilter[]{new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.o5(activityC11351x975a7907, j17.length() > 100 ? j17.length() : 100)});
            activityC11351x975a7907.f154043p.setText(j17);
            java.util.ArrayList arrayList = activityC11351x975a7907.F1;
            arrayList.clear();
            java.util.ArrayList arrayList2 = activityC11351x975a7907.G1;
            arrayList2.clear();
            ((java.util.HashMap) activityC11351x975a7907.R).clear();
            activityC11351x975a7907.H.clear();
            ((java.util.ArrayList) activityC11351x975a7907.H1).clear();
            activityC11351x975a7907.f154039l1 = 2;
            activityC11351x975a7907.f154055x1 = "";
            activityC11351x975a7907.A.setVisibility(8);
            activityC11351x975a7907.f154056y.setVisibility(0);
            activityC11351x975a7907.f154059z.setVisibility(0);
            if (activityC11351x975a7907.A.getVisibility() == 0) {
                activityC11351x975a7907.f154053x.setClickable(false);
            } else {
                activityC11351x975a7907.f154053x.setClickable(true);
            }
            java.util.HashMap h17 = h61.o.h(activityC11351x975a7907.E1);
            for (int i17 = 1; i17 <= h17.size(); i17++) {
                y63.b bVar2 = (y63.b) h17.get(java.lang.Integer.valueOf(i17));
                if (bVar2 != null) {
                    arrayList.add(bVar2.f541185a);
                    arrayList2.add(bVar2.f541189e);
                }
            }
            activityC11351x975a7907.H7();
            activityC11351x975a7907.A7();
            activityC11351x975a7907.z7();
            db5.t7.e(activityC11351x975a7907.mo55332x76847179(), activityC11351x975a7907.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ga8), com.p314xaae8f345.mm.R.raw.f80084xebd378da);
            l5Var.f154254a.q();
        }
    }
}
