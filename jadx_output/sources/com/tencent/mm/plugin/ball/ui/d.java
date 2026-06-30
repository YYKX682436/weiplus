package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class d implements mp1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.n f93283a;

    public d(com.tencent.mm.plugin.ball.ui.n nVar) {
        this.f93283a = nVar;
    }

    @Override // mp1.e
    public void a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ballInfo);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuItemClicked");
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93283a;
        nVar.f93328m.a(3);
        nVar.f93319d.c(new com.tencent.mm.plugin.ball.ui.c(this, ballInfo));
        yj0.a.h(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V");
    }

    @Override // mp1.e
    public void b(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(ballInfo);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuItemRemoved");
        ballInfo.M.f93090m = 9;
        com.tencent.mm.plugin.ball.ui.n nVar = this.f93283a;
        nVar.f93317b.U(ballInfo);
        if (!ballInfo.I && nVar.f93330o) {
            nVar.f93328m.a(4);
            nVar.f93319d.setCanAddFloatBallWhenHide(true);
            nVar.i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V");
    }
}
