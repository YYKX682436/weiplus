package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class vm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm f201608d;

    public vm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar) {
        this.f201608d = wmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm wmVar = this.f201608d;
        java.lang.String str = wmVar.f201745m;
        java.lang.String str2 = wmVar.f201741f;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleClick - giftId is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "handleClick - giftId=".concat(str));
            dk2.u7 u7Var = dk2.u7.f315714a;
            ce2.i e17 = u7Var.e(str);
            if (e17 != null) {
                u7Var.a(e17);
            }
            android.content.Context context = wmVar.f201739d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            if (wmVar.k(context, 1, str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wm.m(wmVar, null, str, 1, 1, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
