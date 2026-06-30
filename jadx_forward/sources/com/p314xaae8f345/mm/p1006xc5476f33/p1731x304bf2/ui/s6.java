package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class s6 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            int i17 = bundle.getInt("msg_unread_count");
            int i18 = bundle.getInt("notify_unread_count");
            boolean z17 = bundle.getBoolean("has_chat_room_unread_msg");
            boolean z18 = bundle.getBoolean("bottom_red_dot");
            int i19 = bundle.getInt("game_life_unread_count");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55 c5625x88b37a55 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5625x88b37a55();
            am.ug ugVar = c5625x88b37a55.f135952g;
            ugVar.f89613a = i17;
            ugVar.f89614b = i18;
            ugVar.f89615c = i19;
            ugVar.f89616d = z17;
            ugVar.f89617e = z18;
            c5625x88b37a55.e();
        }
    }
}
