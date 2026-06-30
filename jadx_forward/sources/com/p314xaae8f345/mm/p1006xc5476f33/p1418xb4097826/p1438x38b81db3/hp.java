package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class hp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp f185134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.o3 f185135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185136f;

    public hp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp jpVar, so2.o3 o3Var, in5.s0 s0Var) {
        this.f185134d = jpVar;
        this.f185135e = o3Var;
        this.f185136f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jp jpVar = this.f185134d;
        yz5.l lVar = jpVar.f185304i;
        so2.o3 o3Var = this.f185135e;
        lVar.mo146xb9724478(o3Var);
        long j17 = jpVar.f185303h.f185384a == 2 ? 15L : 14L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d c14727x5e078d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.f204353a;
        in5.s0 s0Var = this.f185136f;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        int i17 = jpVar.f185303h.f185384a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = o3Var.f491944d.f66078xad49d1db;
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.l(c14727x5e078d, context, i17, false, str, o3Var.f491944d, false, false, true, false, 356, null);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, context2, j17, 1L, false, jpVar.f185303h.f185384a, 5, l17, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderMsgCommentNewConvert$bindOperateLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
