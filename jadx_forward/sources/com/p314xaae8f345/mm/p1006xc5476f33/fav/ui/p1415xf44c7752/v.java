package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class v implements com.p314xaae8f345.mm.ui.p2740x696c9db.s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd f182620a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd) {
        this.f182620a = activityC13597x28c5d1bd;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.s5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.ActivityC13597x28c5d1bd activityC13597x28c5d1bd = this.f182620a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC13597x28c5d1bd.f182406g.getItem(activityC13597x28c5d1bd.f182403d);
        if (item != null && item.l() == 0 && item.k() != 2 && com.p314xaae8f345.mm.vfs.w6.j(item.j())) {
            java.util.List<android.view.View> list = (java.util.List) activityC13597x28c5d1bd.f182411o.get(item.j());
            if (list != null && list.size() > 0) {
                for (android.view.View view : list) {
                    if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) view).a();
                    }
                }
                return;
            }
        }
        if (!activityC13597x28c5d1bd.U6() || activityC13597x28c5d1bd.f182417u.f182835d == 1) {
            return;
        }
        activityC13597x28c5d1bd.T6();
    }
}
