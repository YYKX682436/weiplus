package hr3;

/* loaded from: classes11.dex */
public class dh implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365028c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f365029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f365030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f365031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f365032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 f365033h;

    public dh(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.util.LinkedList linkedList, r45.dz3 dz3Var, java.util.LinkedList linkedList2) {
        this.f365033h = activityC16871x34c232c9;
        this.f365026a = str;
        this.f365027b = str2;
        this.f365028c = str3;
        this.f365029d = map;
        this.f365030e = linkedList;
        this.f365031f = dz3Var;
        this.f365032g = linkedList2;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16871x34c232c9 activityC16871x34c232c9 = this.f365033h;
        boolean z17 = activityC16871x34c232c9.H;
        java.util.LinkedList linkedList = this.f365030e;
        java.util.Map map = this.f365029d;
        java.lang.String str5 = this.f365026a;
        if (i17 == -4000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "addTextOptionMenu:send addcontact.");
            r35.a aVar = new r35.a(activityC16871x34c232c9, null);
            if (activityC16871x34c232c9.H) {
                str5 = "";
            }
            aVar.H = str5;
            aVar.f450552t = this.f365027b;
            aVar.f450553u = this.f365028c;
            aVar.I = map;
            aVar.f450551s = activityC16871x34c232c9.f235356p;
            aVar.f450540e = new hr3.zg(this);
            aVar.f450555w = false;
            aVar.G = new hr3.ah(this);
            aVar.L = str4;
            gm0.j1.i();
            aVar.k(activityC16871x34c232c9, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC16871x34c232c9.f235359q, true), activityC16871x34c232c9.f235359q, linkedList);
            activityC16871x34c232c9.Z6();
            activityC16871x34c232c9.f235355o = db5.e1.Q(activityC16871x34c232c9.mo55332x76847179(), activityC16871x34c232c9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16871x34c232c9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.bh(this, aVar));
        } else if (activityC16871x34c232c9.H) {
            activityC16871x34c232c9.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(activityC16871x34c232c9.f235359q, true);
            if (n17 != null) {
                activityC16871x34c232c9.M1 = activityC16871x34c232c9.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bj9, n17.P0());
            } else {
                activityC16871x34c232c9.M1 = activityC16871x34c232c9.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bj_);
            }
            activityC16871x34c232c9.K1 = android.view.View.inflate(activityC16871x34c232c9, com.p314xaae8f345.mm.R.C30864xbddafb2a.ckf, null);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(activityC16871x34c232c9.M1 == null);
            java.lang.String str6 = activityC16871x34c232c9.M1;
            objArr[1] = java.lang.Integer.valueOf(str6 == null ? 0 : str6.length());
            objArr[2] = activityC16871x34c232c9.M1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16871x34c232c9.M1)) {
                ((android.widget.TextView) activityC16871x34c232c9.K1.findViewById(com.p314xaae8f345.mm.R.id.mmq)).setText(activityC16871x34c232c9.M1);
            }
            activityC16871x34c232c9.N1 = activityC16871x34c232c9.K1.findViewById(com.p314xaae8f345.mm.R.id.d9b);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) activityC16871x34c232c9.K1.findViewById(com.p314xaae8f345.mm.R.id.mmp);
            activityC16871x34c232c9.L1 = c21503x6e5a020a;
            c21503x6e5a020a.m79040x765074af((java.lang.String) null);
            activityC16871x34c232c9.L1.setVisibility(8);
            android.view.View view = activityC16871x34c232c9.N1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 z18 = db5.e1.z(activityC16871x34c232c9, "", null, activityC16871x34c232c9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bj7), activityC16871x34c232c9.K1, new hr3.ng(activityC16871x34c232c9), new hr3.og(activityC16871x34c232c9));
            activityC16871x34c232c9.J1 = z18;
            if (z18 == null) {
                activityC16871x34c232c9.onStop();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI", "dealAddContactError, resend request ver.");
            java.lang.String stringExtra = activityC16871x34c232c9.getIntent().getStringExtra("source_from_user_name");
            java.lang.String stringExtra2 = activityC16871x34c232c9.getIntent().getStringExtra("source_from_nick_name");
            r35.e4 e4Var = new r35.e4(activityC16871x34c232c9, null);
            e4Var.f450627q = str5;
            e4Var.f450629s = stringExtra;
            e4Var.f450630t = stringExtra2;
            e4Var.f450628r = map;
            e4Var.f450631u = activityC16871x34c232c9.f235356p;
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            linkedList2.add(activityC16871x34c232c9.b7(activityC16871x34c232c9.L));
            e4Var.f450624n = linkedList2;
            e4Var.f450636z = this.f365031f;
            e4Var.g(this.f365032g, linkedList);
            activityC16871x34c232c9.Z6();
            activityC16871x34c232c9.f235355o = db5.e1.Q(activityC16871x34c232c9.mo55332x76847179(), activityC16871x34c232c9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16871x34c232c9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.ch(this, e4Var));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.g) vg3.n3.f518269n1.a()).wi(new vg3.e(vg3.d.f518212e, vg3.b.f518178e, vg3.c.f518188g, 0, new java.util.ArrayList(java.util.Collections.singletonList(activityC16871x34c232c9.f235359q))));
        }
        return true;
    }
}
