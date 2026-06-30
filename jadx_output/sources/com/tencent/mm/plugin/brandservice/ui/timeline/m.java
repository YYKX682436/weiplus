package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes11.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94159d;

    public m(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        this.f94159d = bizTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.wechat.aff.brand_service.v b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).getClass();
        yw.a3 a3Var = yw.a3.f466266a;
        if (yw.a3.f466272g && (b17 = a3Var.b()) != null) {
            b17.t();
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI.T6(this.f94159d);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/timeline/BizTestUI$onCreate$5$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
