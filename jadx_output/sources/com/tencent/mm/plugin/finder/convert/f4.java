package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f103333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f103335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f103336g;

    public f4(so2.y0 y0Var, in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.plugin.finder.convert.u4 u4Var) {
        this.f103333d = y0Var;
        this.f103334e = s0Var;
        this.f103335f = finderJumpInfo;
        this.f103336g = u4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.lang.String string2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.y0 y0Var = this.f103333d;
        boolean j17 = y0Var.f410703d.j1();
        in5.s0 s0Var = this.f103334e;
        com.tencent.mm.plugin.finder.convert.u4 u4Var = this.f103336g;
        if (j17) {
            if (y0Var.f410703d.a1()) {
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                android.content.Context context2 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.report.u.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ((com.tencent.mm.plugin.finder.report.u) a17).O6(s0Var, V6, y0Var, 2);
            } else if (y0Var.f410703d.i1()) {
                android.content.Context context3 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.lifecycle.c1 a18 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.report.x.class);
                kotlin.jvm.internal.o.f(a18, "get(...)");
                ((com.tencent.mm.plugin.finder.report.x) a18).P6(pm0.v.u(y0Var.f410703d.field_feedId), 2);
            }
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f103335f;
            if (finderJumpInfo != null) {
                xc2.y2 y2Var = xc2.y2.f453343a;
                android.content.Context context4 = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
                if (advertisement_info == null || (string2 = advertisement_info.getString(4)) == null) {
                    r45.qy0 promotion_info = y0Var.f410703d.u0().getPromotion_info();
                    string = promotion_info != null ? promotion_info.getString(4) : null;
                } else {
                    string = string2;
                }
                if (string == null) {
                    string = "";
                }
                p0Var.f453254p = string;
                p0Var.f453244f = u4Var.f104672g;
                xc2.y2.i(y2Var, context4, p0Var, 0, null, 12, null);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        u4Var.W(y0Var, s0Var, false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
