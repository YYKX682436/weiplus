package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class r3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt1.i f95148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.s3 f95149e;

    public r3(com.tencent.mm.plugin.card.ui.s3 s3Var, xt1.i iVar) {
        this.f95149e = s3Var;
        this.f95148d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xt1.i iVar = this.f95148d;
        if (android.text.TextUtils.isEmpty(iVar.f456492d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardNewMsgUI", "card msg button url is empty");
        } else {
            lu1.d.j(this.f95149e.f95159q, iVar.f456492d, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
