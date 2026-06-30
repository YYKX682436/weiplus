package v73;

/* loaded from: classes9.dex */
public class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f515230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v73.j f515231e;

    public i(v73.j jVar, java.util.List list) {
        this.f515231e = jVar;
        this.f515230d = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        v73.j jVar = this.f515231e;
        jVar.f515234d.G = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) this.f515230d.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344 activityC16099xbf243344 = jVar.f515234d;
        java.lang.String str = activityC16099xbf243344.f223793d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = activityC16099xbf243344.G;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "select bankcard: %s, %s", c19091x9511676c.f69225xed6d60f6, c19091x9511676c.f69224xba2240f6);
        activityC16099xbf243344.I = activityC16099xbf243344.H;
        r45.n75 n75Var = new r45.n75();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 = activityC16099xbf243344.G;
        n75Var.f462667d = c19091x9511676c2.f69233x225aa2b6;
        n75Var.f462669f = c19091x9511676c2.f69223x58802fcb;
        n75Var.f462670g = c19091x9511676c2.f69225xed6d60f6;
        n75Var.f462671h = c19091x9511676c2.f69222x587fd4e1;
        activityC16099xbf243344.H = n75Var;
        activityC16099xbf243344.Y6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16099xbf243344.f223793d, "do modify pay way");
        r73.j jVar2 = new r73.j(activityC16099xbf243344.H, activityC16099xbf243344.M, activityC16099xbf243344.L);
        jVar2.K(activityC16099xbf243344);
        activityC16099xbf243344.m83099x5406100e(jVar2, false);
    }
}
