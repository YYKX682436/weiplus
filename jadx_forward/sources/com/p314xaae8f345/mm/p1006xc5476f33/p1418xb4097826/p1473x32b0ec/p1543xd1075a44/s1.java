package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 f201229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var) {
        super(0);
        this.f201229d = t1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var = this.f201229d;
        return new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.live.widget.BaseLbsBottomPanelSheet$lifeObserver$2$1

            /* renamed from: d, reason: collision with root package name */
            public boolean f199112d;

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m57874xb01dfb57() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1.this.i0(), "onPause");
                this.f199112d = true;
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m57875x57429eec() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1 t1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.t1.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t1Var2.i0(), "onResume hadPause: " + this.f199112d);
                if (this.f199112d) {
                    this.f199112d = false;
                    t1Var2.n0(t1Var2.j0());
                }
            }
        };
    }
}
