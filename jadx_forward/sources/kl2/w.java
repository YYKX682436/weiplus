package kl2;

/* loaded from: classes3.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.e0 f390358d;

    public w(kl2.e0 e0Var) {
        this.f390358d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<r45.uw4> m75941xfb821914;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeSettingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.e0 e0Var = this.f390358d;
        e0Var.f390293c.mo152xb9724478();
        r45.f82 f82Var = e0Var.f390299i;
        if (f82Var != null) {
            kl2.v vVar = (kl2.v) ((jz5.n) e0Var.f390301k).mo141623x754a37bb();
            vVar.getClass();
            vVar.w();
            vVar.f390357p = f82Var;
            java.util.LinkedList linkedList = vVar.f390355n;
            linkedList.clear();
            r45.ql1 ql1Var = (r45.ql1) f82Var.m75936x14adae67(2);
            long m75942xfb822ef2 = ql1Var != null ? ql1Var.m75942xfb822ef2(1) : 0L;
            r45.f82 f82Var2 = vVar.f390357p;
            if (f82Var2 != null && (m75941xfb821914 = f82Var2.m75941xfb821914(1)) != null) {
                for (r45.uw4 uw4Var : m75941xfb821914) {
                    boolean z17 = false;
                    long m75942xfb822ef22 = uw4Var.m75942xfb822ef2(0);
                    if (m75942xfb822ef2 == uw4Var.m75942xfb822ef2(0)) {
                        z17 = true;
                    }
                    linkedList.add(new kl2.t(m75942xfb822ef22, z17));
                }
            }
            vVar.f390356o.m8146xced61ae5();
        }
        ll2.e.b(ll2.e.f400666a, "audience.more.morefunction.rewardlimitamount", false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/RestrictConsumeSettingHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
