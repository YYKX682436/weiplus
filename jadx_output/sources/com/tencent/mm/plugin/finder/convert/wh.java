package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class wh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104875d;

    public wh(in5.s0 s0Var) {
        this.f104875d = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Class cls;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        java.lang.String str;
        in5.s0 s0Var;
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
        int r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
        int r19 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
        int r27 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
        int r28 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        in5.s0 s0Var2 = this.f104875d;
        android.content.Context context = s0Var2.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.zk(context, null);
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLWxBubble");
        r45.f03 I0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("TLWxBubble");
        if (L0 != null) {
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
                i17 = r18 > 0 ? 1 : 0;
                if (r17 > 0) {
                    i17 |= 8;
                }
                if (r19 > 0) {
                    i17 |= 2;
                }
                if (r27 > 0) {
                    i17 |= 4;
                }
                i18 = 5;
            } else {
                i17 = 1;
                i18 = 1;
            }
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            int i19 = r17 + r18 + r19 + r27 + r28;
            java.lang.String str2 = L0.field_tipsId;
            android.content.Context context2 = s0Var2.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            jbVar = L0;
            int i27 = i17;
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
            str = "getContext(...)";
            s0Var = s0Var2;
            com.tencent.mm.plugin.finder.report.o3.uj(o3Var, "7", i18, 2, 2, i27, i19, str2, null, 0L, nyVar != null ? nyVar.V6() : null, 0, 0, 3456, null);
        } else {
            cls = com.tencent.mm.plugin.finder.viewmodel.component.ny.class;
            jbVar = L0;
            str = "getContext(...)";
            s0Var = s0Var2;
        }
        if (jbVar != null && I0 != null) {
            int i28 = r17 + r18 + r19 + r27 + r28;
            int i29 = r18 + r19 + r27;
            com.tencent.mm.plugin.finder.feed.ew ewVar = com.tencent.mm.plugin.finder.feed.pz.M1;
            in5.s0 s0Var3 = s0Var;
            android.content.Context context3 = s0Var3.f293121e;
            java.lang.String str3 = str;
            kotlin.jvm.internal.o.f(context3, str3);
            java.lang.String obj = ewVar.d(context3, r28, i29, r17, i28).toString();
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            android.content.Context context4 = s0Var3.f293121e;
            kotlin.jvm.internal.o.f(context4, str3);
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context4 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context4).a(cls) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "7", jbVar, I0, 2, nyVar2 != null ? nyVar2.V6() : null, i28, obj, 1, 0, 256, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedMsgNotifyConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
