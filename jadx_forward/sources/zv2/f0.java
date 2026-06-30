package zv2;

/* loaded from: classes10.dex */
public final class f0 extends zv2.b {

    /* renamed from: h, reason: collision with root package name */
    public final int f557936h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView, int i17) {
        super(activity, jumpView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        this.f557936h = i17;
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        java.lang.String concat = "jumpType=".concat(this.f557936h == 34 ? "1" : "2");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.G).mo141623x754a37bb()).r()).booleanValue();
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.f(ya2.e1.f542005a, this.f557928d, "wxaliteb74f4307807cc9004781ffe66f3b87c3", "pages/EventPicker", concat, booleanValue, false, false, null, new zv2.b0(this), 224, null);
    }

    @Override // zv2.b
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
        if (c19786x6a1e2862 == null || (str = c19786x6a1e2862.m76523x98b23862()) == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(this.f557929e, str, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        int i17 = this.f557936h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        if (i17 == 34) {
            c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f79310xedc72f5e);
            c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f79309xca219d60);
        } else {
            c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f79324x3130d128);
            c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f79323x71779a56);
        }
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f482931a.a(this.f557928d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.c0(this), null, 22, null), new ry2.f(6, 0, 0, new zv2.d0(this), null, 22, null), new ry2.f(2, 0, 0, new zv2.e0(this), null, 22, null)), null);
    }
}
