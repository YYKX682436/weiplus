package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes13.dex */
public class kd implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd f280894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld f280895e;

    public kd(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ld ldVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fd fdVar) {
        this.f280895e = ldVar;
        this.f280894d = fdVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.dd ddVar = this.f280895e.f280945f;
        if (ddVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        int m8183xf806b362 = this.f280894d.m8183xf806b362();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd bdVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bd) ddVar;
        bdVar.getClass();
        java.lang.Object tag = view.getTag();
        if (tag instanceof rn.c) {
            rn.c cVar = (rn.c) tag;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.qc qcVar = bdVar.f280265a;
            rl5.r rVar = new rl5.r(qcVar.f280113d.g(), view);
            rVar.B = true;
            rVar.N = true;
            rVar.P = true;
            rVar.f478884u = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xc(bdVar);
            rVar.f478887x = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.zc(bdVar, cVar, m8183xf806b362);
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1] - 32;
            if (i17 <= 0) {
                i17 = 16;
            }
            if (i18 < 0) {
                i18 = 16;
            }
            if (i17 > wl5.y.n(qcVar.f280113d.g())) {
                i17 = wl5.y.n(qcVar.f280113d.g()) - 16;
            }
            rVar.L = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ad(bdVar, view);
            rVar.f478883t = view;
            rVar.n(i17, i18);
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562731mw);
            kn.k0.b(qcVar.f280113d.x(), cVar.v0() ? 1 : 0, 4, 2, cVar.f66264x1210aac6, cVar.f66266xdec927b);
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/component/GroupTodoComponent$ToDoAdapter$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
