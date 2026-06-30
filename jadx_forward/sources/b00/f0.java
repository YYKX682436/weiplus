package b00;

/* loaded from: classes8.dex */
public final class f0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public f0() {
        super(0);
    }

    public static final r45.f03 b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5526xf28eaa6d c5526xf28eaa6d, java.lang.String str, java.lang.String str2) {
        r45.f03 I0 = c5526xf28eaa6d.f135852g.f89986a.I0(str);
        if (I0 != null) {
            c00.b4 b4Var = (c00.b4) i95.n0.c(c00.b4.class);
            c00.a4 a4Var = c00.a4.f118485g;
            am.yc ycVar = c5526xf28eaa6d.f135852g;
            r45.vs2 field_ctrInfo = ycVar.f89986a.f65874xb5f7102a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ctrInfo, "field_ctrInfo");
            ((b00.q2) b4Var).Ai(a4Var, str2, field_ctrInfo, I0, ycVar.f89986a.f65879x2261f6f2);
        }
        return I0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5526xf28eaa6d event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5526xf28eaa6d) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int i17 = event.f135852g.f89986a.f65875xb5fc3ab6;
        if (i17 >= 700000 && i17 < 799999) {
            r45.f03 b17 = b(event, "Card.Entrance.Left", "order_card_reddot");
            r45.f03 b18 = b(event, "Card.Entrance.Right", "order_card_reddot");
            r45.f03 b19 = b(event, "MyTab", "me_reddot");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handlerEcsRedDotExpiredEventListener myTabShowInfo:");
            sb6.append(b19 != null);
            sb6.append(" leftShowInfo:");
            sb6.append(b17 != null);
            sb6.append(",rightShowInfo:");
            sb6.append(b18 != null);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsRedDotExpiredEventListener", sb6.toString());
        }
        return false;
    }
}
