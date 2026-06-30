package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class sf0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 f195783d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var) {
        super(0);
        this.f195783d = ag0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q30 q30Var = this.f195783d.f193417z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30 n17 = q30Var.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q30Var.f201003g, "checkLinkMicGroup state change to " + n17);
        q30Var.q();
        if (n17 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h30.f200056d && (view = q30Var.f201010q) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "checkLinkMicGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "checkLinkMicGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jf2.k0 k0Var = (jf2.k0) q30Var.f201002f.U0(jf2.k0.class);
        if (k0Var != null) {
            k0Var.a7("MicEntranceTrigger", true);
        }
        return jz5.f0.f384359a;
    }
}
