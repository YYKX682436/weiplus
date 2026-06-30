package gd2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f352090d;

    public s(gd2.x xVar) {
        this.f352090d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gd2.x xVar = this.f352090d;
        ((gd2.j) xVar.f352100d).a();
        xVar.b();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0 c5227x1de104c0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0();
        int i17 = xVar.f352101e ? 6 : 5;
        am.r1 r1Var = c5227x1de104c0.f135560g;
        r1Var.f89290a = i17;
        r1Var.f89291b = xVar.f352103g;
        c5227x1de104c0.e();
        xVar.c();
        xVar.f352103g = 0;
        xVar.f352104h = null;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
