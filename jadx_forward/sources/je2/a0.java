package je2;

/* loaded from: classes3.dex */
public final class a0 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f380727f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f380728g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380729h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f380730i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f380727f = "Finder.LiveVipSlice";
    }

    public final void N6(r45.nw1 liveInfo, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveInfo, "liveInfo");
        r45.cg2 cg2Var = (r45.cg2) liveInfo.m75936x14adae67(59);
        this.f380728g = cg2Var != null ? cg2Var.m75933x41a8a7f2(0) : false;
        r45.o52 o52Var = (r45.o52) liveInfo.m75936x14adae67(28);
        this.f380729h = (o52Var != null ? o52Var.m75939xb282bd08(8) : 0) > 0;
        this.f380730i = pm0.v.z(liveInfo.m75939xb282bd08(37), 1048576);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        android.content.Context context = k0Var != null ? k0Var.getContext() : null;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
        if (activityC0065xcd7aa112 != null) {
            if (this.f380730i && (dk2.ef.f314913e instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419)) {
                zl2.r4.f555483a.X2(activityC0065xcd7aa112, 8192, 8192);
            } else {
                zl2.r4.f555483a.E(activityC0065xcd7aa112, 8192);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f380727f, "[refreshData] scene:" + str + ", isVisitorVip:" + this.f380728g + ", isChargeLiveVipFree:" + this.f380729h + ", isVipLive:" + this.f380730i);
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        this.f380728g = false;
        this.f380729h = false;
        this.f380730i = false;
    }
}
