package c61;

/* loaded from: classes2.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f38967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f38968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f38969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f38970g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(long j17, long j18, android.content.Context context, c61.p2 p2Var) {
        super(1);
        this.f38967d = j17;
        this.f38968e = j18;
        this.f38969f = context;
        this.f38970g = p2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String nickname = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        com.tencent.mars.xlog.Log.i("FinderCommonService", "jumpAtProfileUIOfAtContact nickname:".concat(nickname));
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            java.lang.String u17 = pm0.v.u(this.f38967d);
            java.lang.String u18 = pm0.v.u(this.f38968e);
            android.content.Context context = this.f38969f;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            c61.p2 p2Var = this.f38970g;
            android.content.Context context2 = this.f38969f;
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("view_id", "remind_finder_comment");
            lVarArr[1] = new jz5.l("comment_scene", nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
            lVarArr[2] = new jz5.l("finder_tab_context_id", nyVar != null ? nyVar.f135386r : null);
            lVarArr[3] = new jz5.l("finder_context_id", nyVar != null ? nyVar.f135382p : null);
            lVarArr[4] = new jz5.l("comment_id", u18);
            lVarArr[5] = new jz5.l("feed_id", u17);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            cl0.g gVar = new cl0.g();
            gVar.o("entry_mode", 2);
            gVar.h("remind_comment_feedid", u17);
            gVar.h("remind_commentid", u18);
            p2Var.uj(context2, nickname, null, true, l17, gVar);
        }
        return jz5.f0.f302826a;
    }
}
