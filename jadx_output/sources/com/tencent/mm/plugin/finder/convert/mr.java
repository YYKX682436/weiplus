package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class mr implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f104025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f104026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f104027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f104028e;

    public mr(in5.s0 s0Var, so2.u1 u1Var, int i17, boolean z17, long j17) {
        this.f104024a = s0Var;
        this.f104025b = u1Var;
        this.f104026c = i17;
        this.f104027d = z17;
        this.f104028e = j17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[8];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", b17);
        android.content.Context context = this.f104024a.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        lVarArr[1] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n));
        so2.u1 u1Var = this.f104025b;
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(u1Var.getFeedObject().getId()));
        lVarArr[3] = new jz5.l("feed_location_id", java.lang.Integer.valueOf(this.f104026c));
        r45.ru2 flow_card_recommand_reason = u1Var.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
        lVarArr[4] = new jz5.l("recommend_reason", flow_card_recommand_reason != null ? flow_card_recommand_reason.getString(0) : null);
        lVarArr[5] = new jz5.l("follow_type", java.lang.Integer.valueOf(this.f104027d ? 1 : 0));
        lVarArr[6] = new jz5.l("session_buffer", u1Var.getFeedObject().getFeedObject().getSessionBuffer());
        lVarArr[7] = new jz5.l("pagein_feedid", pm0.v.u(this.f104028e));
        return kz5.c1.k(lVarArr);
    }
}
