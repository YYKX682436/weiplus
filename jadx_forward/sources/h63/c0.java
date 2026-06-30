package h63;

/* loaded from: classes7.dex */
public final class c0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.m1 f360750d;

    public c0(h63.m1 m1Var) {
        this.f360750d = m1Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Parcelable parcelable = ((com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57) obj).f148644g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parcelable, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService.LiveCurrentRoomInfoPayload");
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16053xd062253d c16053xd062253d = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16053xd062253d) parcelable;
        h63.m1 m1Var = this.f360750d;
        if (m1Var != null) {
            mc1.C29137x2e00fd c29137x2e00fd = (mc1.C29137x2e00fd) m1Var;
            mc1.d dVar = c29137x2e00fd.f407113a;
            dVar.getClass();
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("startTime", java.lang.Long.valueOf(((java.lang.System.currentTimeMillis() - c01.id.b()) / 1000) + c16053xd062253d.f223554d));
            hashMap.put("topic", c16053xd062253d.f223555e);
            c29137x2e00fd.f407114b.a(c29137x2e00fd.f407115c, dVar.p("ok", hashMap));
        }
    }
}
