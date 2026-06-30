package mz0;

/* loaded from: classes5.dex */
public final class r2 implements com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f414569a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f414570b = "";

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onPanelShow: ");
        dx1.f.n(dx1.g.f326022a, "SnsTemplate", "editdetail", "musicSearchFlag", 1, null, false, null, null, 240, null);
        this.f414570b = "";
        this.f414569a = 0;
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0
    public void b(java.lang.String keyword) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onSearch: ");
        if (this.f414570b.length() > 0) {
            dx1.f.n(dx1.g.f326022a, "SnsTemplate", "editdetail", "musicSearchClk", java.lang.String.valueOf(this.f414569a), bx1.u.f117843e, false, null, null, 224, null);
        }
        this.f414569a = 0;
        this.f414570b = keyword;
        dx1.f.n(dx1.g.f326022a, "SnsTemplate", "editdetail", "musicSearchKw", keyword, bx1.u.f117843e, false, null, null, 224, null);
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onPanelClose: ");
        if (this.f414570b.length() > 0) {
            dx1.f.n(dx1.g.f326022a, "SnsTemplate", "editdetail", "musicSearchClk", java.lang.String.valueOf(this.f414569a), bx1.u.f117843e, false, null, null, 224, null);
        }
        this.f414570b = "";
        this.f414569a = 0;
    }

    @Override // com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0
    public void d(java.lang.String musicId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicId, "musicId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsTemplate.TemplateControlUIC", "onMusicSelected: ");
        this.f414569a++;
    }
}
