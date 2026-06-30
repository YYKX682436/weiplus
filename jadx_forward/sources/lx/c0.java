package lx;

/* loaded from: classes11.dex */
public final class c0 implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10489xb9bf491d f403237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a f403238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 f403239f;

    public c0(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10489xb9bf491d c10489xb9bf491d, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a c23514x26e27c3a, com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23517x16019274 c23517x16019274) {
        this.f403237d = c10489xb9bf491d;
        this.f403238e = c23514x26e27c3a;
        this.f403239f = c23517x16019274;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23431x9f40eee8 c23431x9f40eee8;
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23514x26e27c3a c23514x26e27c3a = this.f403238e;
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10489xb9bf491d c10489xb9bf491d = this.f403237d;
        if (i17 != 2003) {
            if (i17 != 2006) {
                if (i17 == 2103 && (c23431x9f40eee8 = c10489xb9bf491d.f146767e) != null) {
                    java.lang.Long m86784xebddad52 = c23514x26e27c3a.m86784xebddad52();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad52);
                    c23431x9f40eee8.m86398x63a55eee(m86784xebddad52.longValue(), lx.b0.f403226d);
                    return;
                }
                return;
            }
            com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23431x9f40eee8 c23431x9f40eee82 = c10489xb9bf491d.f146767e;
            if (c23431x9f40eee82 != null) {
                java.lang.Long m86784xebddad522 = c23514x26e27c3a.m86784xebddad52();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad522);
                c23431x9f40eee82.m86397x323a4a28(m86784xebddad522.longValue(), lx.a0.f403214d);
                return;
            }
            return;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23431x9f40eee8 c23431x9f40eee83 = c10489xb9bf491d.f146767e;
        if (c23431x9f40eee83 != null) {
            java.lang.Long m86784xebddad523 = c23514x26e27c3a.m86784xebddad52();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m86784xebddad523);
            c23431x9f40eee83.m86399x72ca19ae(m86784xebddad523.longValue(), lx.z.f403553d);
        }
        lx.x xVar = lx.x.f403533a;
        java.lang.String m86837x40d5f4b8 = this.f403239f.m86837x40d5f4b8();
        if (m86837x40d5f4b8 == null) {
            m86837x40d5f4b8 = "";
        }
        if (m86837x40d5f4b8.length() == 0) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) lx.x.f403534b;
        if (!hashMap.containsKey(m86837x40d5f4b8)) {
            hashMap.put(m86837x40d5f4b8, new java.util.HashMap());
        }
        java.util.Map map = (java.util.Map) hashMap.get(m86837x40d5f4b8);
        if (map != null) {
            map.put("playstatus", 1);
        }
    }
}
