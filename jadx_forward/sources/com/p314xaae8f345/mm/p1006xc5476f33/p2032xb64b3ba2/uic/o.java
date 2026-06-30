package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final /* synthetic */ class o extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public o(java.lang.Object obj) {
        super(2, obj, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v.class, "onClickAvatar", "onClickAvatar(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.List m82898xfb7e5820;
        int intValue = ((java.lang.Number) obj).intValue();
        ox3.g p17 = (ox3.g) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p1");
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v) this.f72685xcfcbe9ef;
        vVar.getClass();
        int i17 = vVar.f240040p;
        if (intValue != i17 && i17 >= 0) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = vVar.f240036i;
            ox3.f fVar = (c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null) ? null : (ox3.f) kz5.n0.a0(m82898xfb7e5820, vVar.f240040p);
            if (fVar != null) {
                ((ox3.g) fVar).f431283e = false;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = vVar.f240036i;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.m8148xed6e4d18(vVar.f240040p, java.lang.Boolean.FALSE);
            }
        }
        boolean z17 = !p17.f431283e;
        p17.f431283e = z17;
        if (z17) {
            vx3.i a17 = qx3.d.a(p17.mo2128x1ed62e84());
            if (a17 != null) {
                long mo2128x1ed62e84 = p17.mo2128x1ed62e84();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = vVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class)).P6(a17, mo2128x1ed62e84, true, !a17.j(), true);
            }
            return jz5.f0.f384359a;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = vVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.z1.class)).O6();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf3 = vVar.f240036i;
        if (c22848x6ddd90cf3 != null) {
            c22848x6ddd90cf3.m8148xed6e4d18(intValue, java.lang.Boolean.TRUE);
        }
        boolean z18 = p17.f431283e;
        if (!z18) {
            intValue = -1;
        }
        vVar.f240040p = intValue;
        if (!z18) {
            p17 = null;
        }
        vVar.f240041q = p17;
        return jz5.f0.f384359a;
    }
}
