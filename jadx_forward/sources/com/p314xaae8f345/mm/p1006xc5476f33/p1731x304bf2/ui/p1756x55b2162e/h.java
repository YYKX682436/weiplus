package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836 f222806d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC15995xdf941836 activityC15995xdf941836) {
        this.f222806d = activityC15995xdf941836;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            this.f222806d.f222636s = bundle.getInt("msg_unread_count");
            this.f222806d.f222637t = bundle.getInt("notify_unread_count");
            this.f222806d.f222638u = bundle.getInt("game_life_unread_count");
            this.f222806d.f222639v = bundle.getBoolean("has_chat_room_unread_msg");
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.g(this));
        }
    }
}
