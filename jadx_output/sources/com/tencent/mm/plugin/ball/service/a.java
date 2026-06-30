package com.tencent.mm.plugin.ball.service;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp1.u f93120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.model.BallInfo f93121e;

    public a(gp1.u uVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        this.f93120d = uVar;
        this.f93121e = ballInfo;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/service/FloatBallCustomViewFlatFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gp1.u uVar = this.f93120d;
        if (uVar != null) {
            uVar.a(this.f93121e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/service/FloatBallCustomViewFlatFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
