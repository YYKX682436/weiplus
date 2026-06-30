package c61;

/* loaded from: classes2.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f120500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f120501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f120503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(long j17, long j18, android.content.Context context, c61.p2 p2Var) {
        super(1);
        this.f120500d = j17;
        this.f120501e = j18;
        this.f120502f = context;
        this.f120503g = p2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String nickname = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "jumpAtProfileUIOfAtContact nickname:".concat(nickname));
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            java.lang.String u17 = pm0.v.u(this.f120500d);
            java.lang.String u18 = pm0.v.u(this.f120501e);
            android.content.Context context = this.f120502f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            c61.p2 p2Var = this.f120503g;
            android.content.Context context2 = this.f120502f;
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", "remind_finder_comment");
            lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f216913n) : null);
            lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f216919r : null);
            lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f216915p : null);
            lVarArr[4] = new jz5.l("comment_id", u18);
            lVarArr[5] = new jz5.l("feed_id", u17);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            cl0.g gVar = new cl0.g();
            gVar.o("entry_mode", 2);
            gVar.h("remind_comment_feedid", u17);
            gVar.h("remind_commentid", u18);
            p2Var.uj(context2, nickname, null, true, l17, gVar);
        }
        return jz5.f0.f384359a;
    }
}
