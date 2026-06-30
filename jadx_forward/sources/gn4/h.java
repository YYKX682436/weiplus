package gn4;

/* loaded from: classes15.dex */
public class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gn4.i f355158a;

    public h(gn4.i iVar) {
        this.f355158a = iVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            gn4.i iVar = this.f355158a;
            gn4.z zVar = iVar.f355162d;
            int i17 = gn4.z.V;
            pm4.y.i(zVar.A.r0(), iVar.f355162d.E, 2);
            l81.b1 b1Var = new l81.b1();
            r45.on6 on6Var = iVar.f355162d.E.Y.f464776n;
            b1Var.f398547b = on6Var.f463920i;
            b1Var.f398555f = on6Var.f463917f;
            b1Var.f398565k = dc1.e.f65819x366c91de;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(iVar.f355162d.getContext(), b1Var);
            android.view.View view = iVar.f355162d.P;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoContainer$11$1", "onDialogClick", "(ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
