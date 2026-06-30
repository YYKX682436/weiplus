package cw1;

/* loaded from: classes12.dex */
public final class q1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a f304788a;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a activityC13109x1b5b413a) {
        this.f304788a = activityC13109x1b5b413a;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_clk")) {
            return kz5.q0.f395534d;
        }
        jz5.l[] lVarArr = new jz5.l[5];
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a.f177206q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13109x1b5b413a activityC13109x1b5b413a = this.f304788a;
        lVarArr[0] = new jz5.l("storage_ui_version", java.lang.Integer.valueOf(activityC13109x1b5b413a.U6() ? 2 : 1));
        lVarArr[1] = new jz5.l("storage_enter_scene", java.lang.Integer.valueOf(activityC13109x1b5b413a.f177216p));
        yv1.g1 a17 = yv1.g1.f547573p.a(activityC13109x1b5b413a.f177212i);
        lVarArr[2] = new jz5.l("storage_manage_sessionid", a17 != null ? a17.f547576b : null);
        lVarArr[3] = new jz5.l("cache_remove_size", java.lang.Long.valueOf(activityC13109x1b5b413a.f177215o));
        lVarArr[4] = new jz5.l("cache_removed_size", java.lang.Long.valueOf(activityC13109x1b5b413a.f177214n));
        return kz5.c1.k(lVarArr);
    }
}
