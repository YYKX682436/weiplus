package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.uic;

/* loaded from: classes8.dex */
public final class q0 extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        hb0.a aVar = new hb0.a();
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        aVar.f361549i = stringExtra;
        aVar.f361546f = m158359x1e885992().getBooleanExtra("key_is_multi_select", false);
        aVar.f361547g = m158359x1e885992().getLongExtra("key_msg_id", 0L);
        long[] longArrayExtra = m158359x1e885992().getLongArrayExtra("key_msg_id_list");
        aVar.f361548h = longArrayExtra != null ? kz5.z.y0(longArrayExtra) : new java.util.ArrayList();
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("key_material_origin");
        aVar.f361545e = stringExtra2 != null ? stringExtra2 : "";
        aVar.f361550m = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) m158359x1e885992().getParcelableExtra("key_material_model");
        aVar.f361551n = m158359x1e885992().getLongExtra("key_open_type", 2L);
        aVar.f361552o = m158359x1e885992().getStringExtra("key_session_id");
        aVar.f361553p = m158359x1e885992().getLongExtra("key_scene_type", 0L);
        return aVar;
    }
}
