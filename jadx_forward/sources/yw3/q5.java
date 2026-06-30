package yw3;

/* loaded from: classes11.dex */
public final class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548393d;

    public q5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI) {
        this.f548393d = repairerPatchDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((wv.i0) ((xv.o0) i95.n0.c(xv.o0.class))).getClass();
        dp.a.m125854x26a183b((android.content.Context) this.f548393d, (java.lang.CharSequence) ((ak0.z.a(new java.io.File(c83.e.j())) && ak0.z.a(new java.io.File("/data/data/com.tencent.mm/MicroMsg/WebNetFile/"))) ? "删除成功" : "删除失败"), 1).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
