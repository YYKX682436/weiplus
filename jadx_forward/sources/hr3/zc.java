package hr3;

/* loaded from: classes10.dex */
public final class zc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f365775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d) {
        super(1);
        this.f365775d = activityC16867xd9c62d0d;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xb5.a viewModel = (xb5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "itemClickListener:" + viewModel.f534539d + ' ' + viewModel.f534541f + ' ');
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", viewModel.f534539d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d = this.f365775d;
        j45.l.n(activityC16867xd9c62d0d.mo55332x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, 1);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d.A;
        ((cy1.a) rVar).Hj("infrequentcontactsortpage_contact_info_button", "view_clk", kz5.c1.k(new jz5.l("contacts_max_limit_sort_sessionid", activityC16867xd9c62d0d.W6()), new jz5.l("infrequentcontactsortpage_sessionid", activityC16867xd9c62d0d.f235338y), new jz5.l("wx_username", viewModel.f534539d)), 32337);
        return jz5.f0.f384359a;
    }
}
