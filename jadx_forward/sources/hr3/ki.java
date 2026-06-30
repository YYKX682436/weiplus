package hr3;

/* loaded from: classes11.dex */
public class ki implements ns.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365264c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f365265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f365266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f365267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f365268g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365269h;

    public ki(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, java.util.LinkedList linkedList, r45.dz3 dz3Var, java.util.LinkedList linkedList2) {
        this.f365269h = activityC16872x6384268a;
        this.f365262a = str;
        this.f365263b = str2;
        this.f365264c = str3;
        this.f365265d = map;
        this.f365266e = linkedList;
        this.f365267f = dz3Var;
        this.f365268g = linkedList2;
    }

    @Override // ns.f
    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        java.util.LinkedList linkedList = this.f365266e;
        java.util.Map map = this.f365265d;
        java.lang.String str5 = this.f365262a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365269h;
        if (i17 == -4000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "addTextOptionMenu:send addcontact.");
            r35.a aVar = new r35.a(activityC16872x6384268a, null);
            if (activityC16872x6384268a.V) {
                str5 = "";
            }
            aVar.H = str5;
            aVar.f450552t = this.f365263b;
            aVar.f450553u = this.f365264c;
            aVar.I = map;
            aVar.f450551s = activityC16872x6384268a.f235392u;
            aVar.f450540e = new hr3.gi(this);
            aVar.f450555w = false;
            aVar.G = new hr3.hi(this);
            aVar.L = str4;
            gm0.j1.i();
            aVar.k(activityC16872x6384268a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(activityC16872x6384268a.f235393v, true), activityC16872x6384268a.f235393v, linkedList);
            activityC16872x6384268a.Y6();
            activityC16872x6384268a.f235391t = db5.e1.Q(activityC16872x6384268a.mo55332x76847179(), activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.ii(this, aVar));
        } else if (activityC16872x6384268a.V) {
            activityC16872x6384268a.getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(activityC16872x6384268a.f235393v, true);
            if (n17 != null) {
                activityC16872x6384268a.P1 = activityC16872x6384268a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bj9, n17.P0());
            } else {
                activityC16872x6384268a.P1 = activityC16872x6384268a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bj_);
            }
            activityC16872x6384268a.N1 = android.view.View.inflate(activityC16872x6384268a, com.p314xaae8f345.mm.R.C30864xbddafb2a.ckf, null);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(activityC16872x6384268a.P1 == null);
            java.lang.String str6 = activityC16872x6384268a.P1;
            objArr[1] = java.lang.Integer.valueOf(str6 == null ? 0 : str6.length());
            objArr[2] = activityC16872x6384268a.P1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16872x6384268a.P1)) {
                ((android.widget.TextView) activityC16872x6384268a.N1.findViewById(com.p314xaae8f345.mm.R.id.mmq)).setText(activityC16872x6384268a.P1);
            }
            activityC16872x6384268a.Q1 = activityC16872x6384268a.N1.findViewById(com.p314xaae8f345.mm.R.id.d9b);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a) activityC16872x6384268a.N1.findViewById(com.p314xaae8f345.mm.R.id.mmp);
            activityC16872x6384268a.O1 = c21503x6e5a020a;
            c21503x6e5a020a.m79040x765074af((java.lang.String) null);
            activityC16872x6384268a.O1.setVisibility(8);
            android.view.View view = activityC16872x6384268a.Q1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3", "gotoSelfPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 z17 = db5.e1.z(activityC16872x6384268a, "", null, activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bj7), activityC16872x6384268a.N1, new hr3.uh(activityC16872x6384268a), new hr3.vh(activityC16872x6384268a));
            activityC16872x6384268a.M1 = z17;
            if (z17 == null) {
                activityC16872x6384268a.onStop();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiWithSnsPermissionUI3", "dealAddContactError, resend request ver.");
            java.lang.String stringExtra = activityC16872x6384268a.getIntent().getStringExtra("source_from_user_name");
            java.lang.String stringExtra2 = activityC16872x6384268a.getIntent().getStringExtra("source_from_nick_name");
            r35.e4 e4Var = new r35.e4(activityC16872x6384268a, null);
            e4Var.f450627q = str5;
            e4Var.f450629s = stringExtra;
            e4Var.f450630t = stringExtra2;
            e4Var.f450628r = map;
            e4Var.f450631u = activityC16872x6384268a.f235392u;
            e4Var.f450636z = this.f365267f;
            e4Var.g(this.f365268g, linkedList);
            activityC16872x6384268a.Y6();
            activityC16872x6384268a.f235391t = db5.e1.Q(activityC16872x6384268a.mo55332x76847179(), activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new hr3.ji(this, e4Var));
        }
        return true;
    }
}
