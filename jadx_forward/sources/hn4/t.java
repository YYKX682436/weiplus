package hn4;

/* loaded from: classes15.dex */
public class t implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hn4.u f364134a;

    public t(hn4.u uVar) {
        this.f364134a = uVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        r45.pn6 pn6Var;
        if (z17) {
            hn4.u uVar = this.f364134a;
            hn4.z zVar = uVar.f364135d;
            int i17 = hn4.z.T;
            r45.xn6 xn6Var = zVar.E;
            if (xn6Var == null || (pn6Var = xn6Var.Y) == null || pn6Var.f464776n == null) {
                return;
            }
            pm4.y.i(zVar.A.r0(), uVar.f364135d.E, 2);
            l81.b1 b1Var = new l81.b1();
            r45.on6 on6Var = uVar.f364135d.E.Y.f464776n;
            b1Var.f398547b = on6Var.f463920i;
            b1Var.f398555f = on6Var.f463917f;
            b1Var.f398565k = dc1.e.f65819x366c91de;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(uVar.f364135d.getContext(), b1Var);
            android.view.View view = uVar.f364135d.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$7$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
