package f93;

/* loaded from: classes11.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f341833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f341834e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea, java.lang.String str) {
        this.f341833d = activityC16165x57283aea;
        this.f341834e = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String username = this.f341834e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "$username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f341833d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16165x57283aea.f224724d, "cpan[dealRemoveContact]");
        java.util.ArrayList arrayList = activityC16165x57283aea.f224734q;
        if (arrayList != null && arrayList.contains(username)) {
            activityC16165x57283aea.f224734q.remove(username);
        }
        java.util.ArrayList arrayList2 = activityC16165x57283aea.f224735r;
        if (arrayList2 != null && arrayList2.contains(username)) {
            activityC16165x57283aea.f224738u.add(username);
        }
        java.util.HashSet hashSet = activityC16165x57283aea.f224736s;
        if (hashSet != null && hashSet.contains(username)) {
            hashSet.remove(username);
            activityC16165x57283aea.f224737t.remove(username);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16165x57283aea.f224728h)) {
            activityC16165x57283aea.m78501x43e00957(true);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC16165x57283aea.E;
        if (n3Var != null) {
            n3Var.mo50305x3d8a09a2(activityC16165x57283aea.f224726f);
        }
    }
}
