package ix3;

/* loaded from: classes7.dex */
public final class l2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final ix3.k f377015d;

    /* renamed from: e, reason: collision with root package name */
    public final ix3.j f377016e;

    /* renamed from: f, reason: collision with root package name */
    public final ix3.l f377017f;

    /* renamed from: g, reason: collision with root package name */
    public final ix3.m f377018g;

    /* renamed from: h, reason: collision with root package name */
    public final ix3.n f377019h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f377020i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f377015d = new ix3.k();
        this.f377016e = new ix3.j();
        this.f377017f = new ix3.l();
        this.f377018g = new ix3.m();
        this.f377019h = new ix3.n();
        this.f377020i = jz5.h.b(new ix3.k2(this));
    }

    public final em.b3 T6() {
        return (em.b3) ((jz5.n) this.f377020i).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.emj;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 != null) {
            P6.mo54450xbf7c1df6("浮窗调试页面");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
        if (P62 != null) {
            P62.mo54448x9c8c0d33(new ix3.c2(this));
        }
        em.b3 T6 = T6();
        if (T6.f335668f == null) {
            T6.f335668f = (android.widget.Button) T6.f335663a.findViewById(com.p314xaae8f345.mm.R.id.f564235rt2);
        }
        T6.f335668f.setOnClickListener(new ix3.d2(this));
        em.b3 T62 = T6();
        if (T62.f335669g == null) {
            T62.f335669g = (android.widget.Button) T62.f335663a.findViewById(com.p314xaae8f345.mm.R.id.rmc);
        }
        T62.f335669g.setOnClickListener(new ix3.e2(this));
        em.b3 T63 = T6();
        if (T63.f335664b == null) {
            T63.f335664b = (android.widget.Button) T63.f335663a.findViewById(com.p314xaae8f345.mm.R.id.rma);
        }
        T63.f335664b.setOnClickListener(new ix3.f2(this));
        em.b3 T64 = T6();
        if (T64.f335666d == null) {
            T64.f335666d = (android.widget.Button) T64.f335663a.findViewById(com.p314xaae8f345.mm.R.id.rt9);
        }
        T64.f335666d.setOnClickListener(new ix3.g2(this));
        em.b3 T65 = T6();
        if (T65.f335665c == null) {
            T65.f335665c = (android.widget.Button) T65.f335663a.findViewById(com.p314xaae8f345.mm.R.id.f564233rt1);
        }
        T65.f335665c.setOnClickListener(new ix3.h2(this));
        em.b3 T66 = T6();
        if (T66.f335670h == null) {
            T66.f335670h = (android.widget.Button) T66.f335663a.findViewById(com.p314xaae8f345.mm.R.id.ssy);
        }
        T66.f335670h.setOnClickListener(new ix3.i2(this));
        em.b3 T67 = T6();
        if (T67.f335667e == null) {
            T67.f335667e = (android.widget.Button) T67.f335663a.findViewById(com.p314xaae8f345.mm.R.id.f565280st0);
        }
        T67.f335667e.setOnClickListener(new ix3.j2(this));
        ix3.k kVar = this.f377015d;
        kVar.b(7, "wx26377be1b78047fa#0#1");
        kVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        kVar.Z("跑步记录仪");
        kVar.b0(1);
        ix3.j jVar = this.f377016e;
        jVar.b(33, "wx26377be1b78047fa#0#2");
        jVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        jVar.Z("跑步记录仪");
        jVar.b0(4096);
        ix3.l lVar = this.f377017f;
        lVar.b(17, "wx26377be1b78047fa#0#3");
        lVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        lVar.Z("小程序Voip");
        lVar.b0(32);
        ix3.m mVar = this.f377018g;
        mVar.b(16, "wx26377be1b78047fa#0#4");
        mVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        mVar.Z("王者荣耀");
        mVar.b0(16);
        ix3.n nVar = this.f377019h;
        nVar.b(6, "wx26377be1b78047fa#0#5");
        nVar.X("http://wx.qlogo.cn/mmhead/Q3auHgzwzM7cib02bUAQiaOxzSFVxZXDQiccCjibshBnZsic3MdbxMv1qew/96");
        nVar.Z("音乐测试最大字符数量");
        nVar.b0(2);
    }
}
