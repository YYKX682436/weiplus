package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class pr implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f214390a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f214391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f214392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f214393d;

    public pr(yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, p3325xe03a0797.p3326xc267989b.y0 y0Var, yz5.p pVar) {
        this.f214390a = aVar;
        this.f214391b = c15371xf336b8cc;
        this.f214392c = y0Var;
        this.f214393d = pVar;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        boolean booleanValue = ((java.lang.Boolean) this.f214390a.mo152xb9724478()).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc = this.f214391b;
        if (z17 == booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15371xf336b8cc.R, "setSwitchListener isCheck:" + z17 + " equals currentState, skip");
            return;
        }
        if (!p3325xe03a0797.p3326xc267989b.z0.h(this.f214392c)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15371xf336b8cc.R, "setSwitchListener isCheck:" + z17 + " but !scope.isActive");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15371xf336b8cc.R, "click:" + z17);
        c15371xf336b8cc.setEnabled(false);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f214392c;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.or(c15371xf336b8cc, this.f214393d, z17, null), 2, null);
    }
}
