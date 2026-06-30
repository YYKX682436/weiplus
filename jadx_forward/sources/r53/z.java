package r53;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lr53/z;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class z implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = new android.os.Bundle();
        boolean z17 = r53.f.f474186a;
        java.lang.Long valueOf = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r1((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG, 0L)));
        boolean z18 = true;
        boolean z19 = valueOf.longValue() != 0 && java.lang.Math.abs(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.H1(valueOf.longValue())) < 172800;
        if ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.b() == null || !com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.b().f405596d) && !z19) {
            z18 = false;
        }
        bundle.putBoolean("navigationToChatroom", z18);
        return bundle;
    }
}
