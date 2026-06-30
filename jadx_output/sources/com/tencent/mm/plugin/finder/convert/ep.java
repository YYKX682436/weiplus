package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class ep implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f103277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.fp f103278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103279f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.n3 f103280g;

    public ep(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.plugin.finder.convert.fp fpVar, in5.s0 s0Var, so2.n3 n3Var) {
        this.f103277d = weImageView;
        this.f103278e = fpVar;
        this.f103279f = s0Var;
        this.f103280g = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f103277d;
        java.lang.Object tag = weImageView.getTag(com.tencent.mm.R.id.qco);
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        boolean z17 = !(bool != null ? bool.booleanValue() : false);
        in5.s0 s0Var = this.f103279f;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.convert.fp fpVar = this.f103278e;
        fpVar.getClass();
        so2.n3 n3Var = this.f103280g;
        dm.pd pdVar = n3Var.f410411d;
        com.tencent.mars.xlog.Log.i("FinderMsgBulletConvert", "[onLikeBullet] isLike=" + z17 + " id=" + pdVar.field_commentId);
        pf5.z zVar = pf5.z.f353948a;
        boolean z18 = context instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = new com.tencent.mm.plugin.finder.storage.yj0();
        yj0Var.u0().setCommentId(pdVar.field_commentId);
        nv2.x1 x1Var = z17 ? nv2.x1.f340631i : nv2.x1.f340632m;
        long j17 = pdVar.field_objectId;
        java.lang.String field_objectNonceId = pdVar.field_objectNonceId;
        kotlin.jvm.internal.o.f(field_objectNonceId, "field_objectNonceId");
        int i17 = fpVar.f103404h.f103851a;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
        if (!z18) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.fp fpVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a(appCompatActivity).e(com.tencent.mm.plugin.finder.viewmodel.component.fp.class);
        java.lang.String j18 = finderMsgContract.j(fpVar2 != null ? fpVar2.f134417w == 1 ? 3 : 2 : 0);
        if (!hz2.d.f286313a.a("like")) {
            nv2.n1.f340551h.d(j17, null, field_objectNonceId, yj0Var, x1Var, i17, null, V6, false, null, 0, j18);
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ok(z17, pdVar.field_commentId);
        weImageView.setTag(com.tencent.mm.R.id.qco, java.lang.Boolean.valueOf(z17));
        android.content.Context context2 = s0Var.f293121e;
        dm.pd pdVar2 = n3Var.f410411d;
        if (z17) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_good);
            weImageView.setIconColor(context2.getResources().getColor(com.tencent.mm.R.color.Red_100));
            int i18 = pdVar2.field_extFlag;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            pdVar2.field_extFlag = i18 | 128;
            kotlin.jvm.internal.o.d(view);
            hc2.f1.d(view);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_star_new);
            weImageView.setIconColor(context2.getResources().getColor(com.tencent.mm.R.color.FG_0));
            int i19 = pdVar2.field_extFlag;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            pdVar2.field_extFlag = i19 & (-129);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgBulletConvert$bindOperateLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
