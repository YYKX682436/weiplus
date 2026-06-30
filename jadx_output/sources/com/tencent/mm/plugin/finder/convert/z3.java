package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f105077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f105079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f105080g;

    public z3(so2.y0 y0Var, in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.plugin.finder.convert.u4 u4Var) {
        this.f105077d = y0Var;
        this.f105078e = s0Var;
        this.f105079f = finderJumpInfo;
        this.f105080g = u4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        so2.y0 y0Var = this.f105077d;
        boolean a17 = y0Var.f410703d.a1();
        java.lang.String string2 = null;
        in5.s0 s0Var = this.f105078e;
        if (a17) {
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
            androidx.lifecycle.c1 a18 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.report.u.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            ((com.tencent.mm.plugin.finder.report.u) a18).O6(s0Var, V6, y0Var, 1);
        } else if (y0Var.f410703d.i1()) {
            android.content.Context context3 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a19 = zVar2.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.report.x.class);
            kotlin.jvm.internal.o.f(a19, "get(...)");
            ((com.tencent.mm.plugin.finder.report.x) a19).P6(pm0.v.u(y0Var.f410703d.field_feedId), 1);
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f105079f;
        if (finderJumpInfo == null) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            java.lang.String Z0 = y0Var.f410703d.Z0();
            android.content.Context context4 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context4, "getContext(...)");
            i0Var.Bk(Z0, context4);
            android.content.Context context5 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context5, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context5 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context5).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar2 != null) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zi(1, y0Var.f410703d.field_feedId, nyVar2.V6(), 2, y0Var.f410703d.Z0());
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context6 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context6, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        r45.ky0 advertisement_info = y0Var.f410703d.u0().getAdvertisement_info();
        if (advertisement_info == null || (string = advertisement_info.getString(4)) == null) {
            r45.qy0 promotion_info = y0Var.f410703d.u0().getPromotion_info();
            if (promotion_info != null) {
                string2 = promotion_info.getString(4);
            }
        } else {
            string2 = string;
        }
        if (string2 == null) {
            string2 = "";
        }
        p0Var.f453254p = string2;
        p0Var.f453244f = this.f105080g.f104672g;
        xc2.y2.i(y2Var, context6, p0Var, 0, null, 12, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
