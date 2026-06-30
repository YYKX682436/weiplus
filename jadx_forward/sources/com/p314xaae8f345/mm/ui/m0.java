package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class m0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.n0 f290618d;

    public m0(com.p314xaae8f345.mm.ui.n0 n0Var, com.p314xaae8f345.mm.ui.ActivityC21341x70473b8f activityC21341x70473b8f) {
        this.f290618d = n0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(this.f290618d.f290928i.mo55332x76847179());
        int[] iArr = new int[2];
        if (view.getTag(com.p314xaae8f345.mm.R.id.ohu) instanceof int[]) {
            iArr = (int[]) view.getTag(com.p314xaae8f345.mm.R.id.ohu);
        }
        rVar.h(view, new com.p314xaae8f345.mm.ui.k0(this), new com.p314xaae8f345.mm.ui.l0(this, view), iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/ui/AllRemindMsgUI$RemindHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
