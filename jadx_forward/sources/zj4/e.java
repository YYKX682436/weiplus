package zj4;

/* loaded from: classes11.dex */
public final class e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f554875d;

    /* renamed from: e, reason: collision with root package name */
    public qj4.k f554876e;

    /* renamed from: f, reason: collision with root package name */
    public final iy1.c f554877f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f554878g;

    /* renamed from: h, reason: collision with root package name */
    public qj4.h f554879h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f554880i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f554875d = "MicroMsg.TextStatusPublishIconPickerReportUIC";
        this.f554876e = qj4.k.f445457g;
        this.f554877f = iy1.c.StatusPublishIconPickerPage;
        this.f554878g = jz5.h.b(new zj4.d(this));
        this.f554879h = new qj4.h(0, 0, 0, null, null, 31, null);
        this.f554880i = new java.util.LinkedList();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 O6() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if (m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9) m158354x19263085;
        }
        return null;
    }

    public final bi4.d1 P6() {
        jz5.g gVar = this.f554878g;
        if (((bi4.d1) ((jz5.n) gVar).mo141623x754a37bb()) != null) {
            return (bi4.d1) ((jz5.n) gVar).mo141623x754a37bb();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 O6 = O6();
        if (O6 != null) {
            return O6.f255077n;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View tvOk;
        dy1.r rVar;
        android.widget.TextView tvInputTips;
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar2 != null) {
            cy1.a aVar = (cy1.a) rVar2;
            aVar.Zj(m158354x19263085(), this.f554877f.f377392d);
            aVar.ik(m158354x19263085(), 12, 33629);
            aVar.Ai(m158354x19263085(), new zj4.a(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 O6 = O6();
        if (O6 != null) {
            android.view.View a76 = O6.a7();
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(a76, "status_page_x");
            dy1.r ik6 = aVar2.ik(a76, 40, 33629);
            bi4.d1 P6 = P6();
            kz5.q0 q0Var = kz5.q0.f395534d;
            jz5.l[] lVarArr = new jz5.l[2];
            java.lang.String str = P6 != null ? P6.G : null;
            if (str == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("status_clipostid", str);
            java.lang.String str2 = P6 != null ? P6.f436474h : null;
            lVarArr[1] = new jz5.l("status_sessionid", str2 != null ? str2 : "");
            java.util.Map m17 = kz5.c1.m(kz5.c1.k(lVarArr), q0Var);
            m17.toString();
            ((cy1.a) ik6).gk(a76, m17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 O62 = O6();
        if (O62 != null && (tvInputTips = O62.b7().getTvInputTips()) != null) {
            cy1.a aVar3 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar3.pk(tvInputTips, "fill_in_status_word_button");
            aVar3.ik(tvInputTips, 32, 33629);
            aVar3.Ai(m158354x19263085(), new zj4.b(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 O63 = O6();
        if (O63 == null || (tvOk = O63.b7().getTvOk()) == null || (rVar = (dy1.r) i95.n0.c(dy1.r.class)) == null) {
            return;
        }
        cy1.a aVar4 = (cy1.a) rVar;
        aVar4.pk(tvOk, "custom_status_panel_confirm_btn");
        aVar4.Vj(tvOk, 160, new zj4.c(this));
    }
}
