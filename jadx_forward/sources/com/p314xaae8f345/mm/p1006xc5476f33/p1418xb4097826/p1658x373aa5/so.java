package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class so extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hk implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dp {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f214603d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kp f214604e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp f214605f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oo f214606g;

    public so(yz5.p selectListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectListener, "selectListener");
        this.f214603d = selectListener;
        this.f214604e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kp(this);
        this.f214605f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp(this);
        this.f214606g = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oo();
    }

    public void d(int i17) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTeamConditionBottomSheet", "selectValue " + i17);
        java.util.Iterator it = this.f213783c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            boolean z17 = true;
            if (((r45.u24) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk) obj).f213433d).m75939xb282bd08(1) != 7) {
                z17 = false;
            }
            if (z17) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk dkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk) obj;
        if (dkVar != null) {
            this.f214603d.mo149xb9724478(dkVar.f213433d, java.lang.Integer.valueOf(i17));
        }
        b().q();
    }
}
