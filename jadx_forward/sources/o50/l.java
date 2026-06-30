package o50;

/* loaded from: classes.dex */
public final class l implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o50.n f424606a;

    public l(o50.n nVar) {
        this.f424606a = nVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String m75945x2fec8307;
        vg5.a aVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("forward_sid", com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290828b);
        o50.n nVar = this.f424606a;
        hashMap.put("forward_obj_list", nVar.f424610f);
        j75.f Q6 = nVar.Q6();
        co.a aVar2 = (Q6 == null || (aVar = (vg5.a) Q6.mo140437x75286adb()) == null) ? null : aVar.f518309g;
        com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e eVar = com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.f290827a;
        hashMap.put("selected_msg_list", eVar.h(aVar2));
        hashMap.put("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(eVar.g(aVar2)));
        hashMap.put("forward_version", 20250731);
        hashMap.put("forw_confirm_screen_from", java.lang.Integer.valueOf(nVar.f424611g));
        hashMap.put("forwarding_lists_state", java.lang.Integer.valueOf(eVar.e()));
        hashMap.put("forward_from_scene", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.k(nVar.f424612h)));
        if (aVar2 != null) {
            hashMap.put("forward_msgtype", java.lang.Integer.valueOf(eVar.c(aVar2, nVar.f424613i)));
            hashMap.put("forward_source_scene", java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2724x335620.uic.p2727x2c1ddc83.p2728xc846465b.e.d(nVar.f424612h, aVar2.m75945x2fec8307(aVar2.f125235d + 1))));
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "page_out")) {
            hashMap.put("forward_close_type", java.lang.Integer.valueOf(nVar.f424608d));
        }
        if (aVar2 != null && (m75945x2fec8307 = aVar2.m75945x2fec8307(aVar2.f125235d + 1)) != null) {
            hashMap.put("chat_username", m75945x2fec8307);
        }
        return hashMap;
    }
}
