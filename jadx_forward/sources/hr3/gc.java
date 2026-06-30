package hr3;

/* loaded from: classes11.dex */
public class gc implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d f365119a;

    public gc(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d) {
        this.f365119a = activityC16864x5bbaf71d;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        gr3.g gVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
        am.jw jwVar = c6082xbd84dd0a.f136360g;
        jwVar.getClass();
        jwVar.f88635a = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d = this.f365119a;
        java.lang.String str = activityC16864x5bbaf71d.f235300o;
        jwVar.f88636b = str;
        boolean U6 = activityC16864x5bbaf71d.U6(str, 5L);
        jwVar.f88637c = U6;
        java.lang.String str2 = activityC16864x5bbaf71d.f235300o;
        int i17 = U6 ? 2 : 1;
        activityC16864x5bbaf71d.getClass();
        if (i17 == 1) {
            activityC16864x5bbaf71d.f235302q = true;
            activityC16864x5bbaf71d.f235303r = false;
        } else {
            activityC16864x5bbaf71d.f235302q = false;
            activityC16864x5bbaf71d.f235303r = false;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str2);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469 c5845xa0f7b469 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5845xa0f7b469();
        am.oo ooVar = c5845xa0f7b469.f136154g;
        ooVar.f89103e = linkedList;
        ooVar.f89099a = i17;
        ooVar.f89100b = 5L;
        ooVar.f89101c = activityC16864x5bbaf71d.f235305t;
        c5845xa0f7b469.e();
        activityC16864x5bbaf71d.f235299n = db5.e1.Q(activityC16864x5bbaf71d, activityC16864x5bbaf71d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16864x5bbaf71d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572493bd4), true, true, null);
        c6082xbd84dd0a.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16864x5bbaf71d.getIntent(), 22, U6 ? 2 : 3, activityC16864x5bbaf71d.f235300o);
        boolean z18 = !U6;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = activityC16864x5bbaf71d.f235301p;
        if (z3Var == null || (gVar = activityC16864x5bbaf71d.f235307v) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsPermissionUI2", "ct is null in method reportWithModifySnsBlackPermission");
            return;
        }
        gVar.f356397e = z18 ? gr3.j.f356417i : gr3.j.f356419n;
        gVar.f356398f = z3Var.y2();
        activityC16864x5bbaf71d.f235307v.f356399g = activityC16864x5bbaf71d.f235301p.x2();
        gr3.g gVar2 = activityC16864x5bbaf71d.f235307v;
        gVar2.f356400h = z18;
        gVar2.c();
    }
}
