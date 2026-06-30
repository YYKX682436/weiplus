package s12;

/* loaded from: classes7.dex */
public final class e extends wp0.c {

    /* renamed from: h, reason: collision with root package name */
    public final xp0.e f483661h;

    public e(xp0.e emojiDelegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiDelegate, "emojiDelegate");
        this.f483661h = emojiDelegate;
    }

    @Override // wp0.c
    public com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 K0() {
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 c10860xa01d8e29 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo) this.f483661h).f217687m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10860xa01d8e29);
        return c10860xa01d8e29;
    }

    @Override // wp0.c
    public wp0.b M0(java.lang.String msgTalker, java.lang.String id6, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo) this.f483661h;
        uoVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo qoVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo) uoVar.f217681d.get(id6);
        if (qoVar != null) {
            return qoVar.f217258b;
        }
        return null;
    }

    @Override // wp0.c
    public java.util.Map N0(boolean z17) {
        return new java.util.HashMap();
    }

    @Override // wp0.c
    public void S0(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        java.lang.String name = t12.a.class.getName();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        config.f229351e.add(name);
    }
}
