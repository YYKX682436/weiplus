package hr3;

/* loaded from: classes11.dex */
public class ac implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f364929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 f364930b;

    public ac(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5, boolean z17) {
        this.f364930b = activityC16863xc0e4ffb5;
        this.f364929a = z17;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        android.content.res.Resources resources;
        int i17;
        gr3.g gVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
        am.jw jwVar = c6082xbd84dd0a.f136360g;
        jwVar.getClass();
        jwVar.f88635a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activity = this.f364930b;
        java.lang.String str = activity.f235282n;
        jwVar.f88636b = str;
        boolean U6 = activity.U6(str, 5L);
        jwVar.f88637c = U6;
        java.lang.String str2 = activity.f235282n;
        int i18 = U6 ? 2 : 1;
        activity.getClass();
        if (i18 == 1) {
            activity.f235284p = true;
            activity.f235285q = false;
        } else {
            activity.f235284p = false;
            activity.f235285q = false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469 c5845xa0f7b469 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469();
        am.oo ooVar = c5845xa0f7b469.f136154g;
        ooVar.f89103e = linkedList;
        ooVar.f89099a = i18;
        ooVar.f89100b = 5L;
        ooVar.f89101c = activity.f235287s;
        c5845xa0f7b469.e();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activity.f235281m;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activity.f235281m = db5.e1.Q(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572493bd4), true, true, null);
        c6082xbd84dd0a.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activity.getIntent(), this.f364929a ? 13 : 22, U6 ? 2 : 3, activity.f235282n);
        boolean z18 = !U6;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activity.f235283o;
        if (z3Var == null || (gVar = activity.f235289u) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI", "ct is null in method reportWithModifySnsBlackPermission");
        } else {
            gVar.f356397e = z18 ? gr3.j.f356417i : gr3.j.f356419n;
            gVar.f356398f = z3Var.y2();
            activity.f235289u.f356399g = activity.f235283o.x2();
            gr3.g gVar2 = activity.f235289u;
            gVar2.f356400h = z18;
            gVar2.c();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ir3.e eVar = (ir3.e) pf5.z.f435481a.a(activity).a(ir3.e.class);
        if (z17) {
            resources = activity.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.i8l;
        } else {
            resources = activity.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.i8m;
        }
        eVar.m42291x53d8522f("not_see_sns_permission_tv_key", resources.getString(i17));
    }
}
