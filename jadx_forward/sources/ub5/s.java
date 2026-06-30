package ub5;

/* loaded from: classes8.dex */
public final class s implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp f507781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f507783c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f507784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub5.k f507785e;

    public s(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp wpVar, java.lang.String str, java.util.List list, java.lang.String str2, ub5.k kVar) {
        this.f507781a = wpVar;
        this.f507782b = str;
        this.f507783c = list;
        this.f507784d = str2;
        this.f507785e = kVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d1
    /* renamed from: onShow */
    public final void mo14645xc39f557c() {
        gm0.b bVar;
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wp wpVar = this.f507781a;
        if (wpVar != null && (bVar = gm0.j1.b().f354778h) != null && (c20976x6ba6452a = bVar.f354678e) != null) {
            v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.tp(wpVar, null), 1, null);
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l lVar = new jz5.l("multi_select_more_actionsheet_btn_list", this.f507782b);
        java.util.List msgList = this.f507783c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
        ((cy1.a) rVar).Hj("multi_select_more_actionsheet", "view_exp", kz5.c1.k(lVar, new jz5.l("selected_msg_list", kz5.n0.g0(msgList, "#", null, null, 0, null, tb5.h0.f498586d, 30, null)), new jz5.l("selected_how_many_msgs_to_forward", java.lang.Integer.valueOf(msgList.size())), new jz5.l("share_session_id", this.f507784d), new jz5.l("chat_username", ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.d6) this.f507785e).f280458a.f280113d.x())), 35480);
    }
}
