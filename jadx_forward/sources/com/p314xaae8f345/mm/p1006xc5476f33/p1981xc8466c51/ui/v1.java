package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class v1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f237031a;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf) {
        this.f237031a = activityC16972xc3ec91bf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.s5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f237031a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.r item = activityC16972xc3ec91bf.f236848i.getItem(activityC16972xc3ec91bf.f236847h.getSelectedItemPosition());
        if (item != null && item.l() == 0 && item.k() != 2 && com.p314xaae8f345.mm.vfs.w6.j(item.j())) {
            java.util.List<android.view.View> list = (java.util.List) activityC16972xc3ec91bf.f236845f.get(item.j());
            if (list != null && list.size() > 0) {
                for (android.view.View view : list) {
                    if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505) view).a();
                    }
                }
                return;
            }
        }
        if (activityC16972xc3ec91bf.f236858v.f182835d != 1) {
            activityC16972xc3ec91bf.U6();
        }
    }
}
