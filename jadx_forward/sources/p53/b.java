package p53;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m53.c2 f433583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16018xae0b4e2b f433584e;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16018xae0b4e2b activityC16018xae0b4e2b, m53.c2 c2Var) {
        this.f433584e = activityC16018xae0b4e2b;
        this.f433583d = c2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        m53.c2 c2Var = this.f433583d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.a3.I(c2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16018xae0b4e2b activityC16018xae0b4e2b = this.f433584e;
        if (c2Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(c2Var.f405131d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameRouteUI", "get GameIndex4TabNavData err");
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16018xae0b4e2b.f223300i;
            activityC16018xae0b4e2b.Z6();
        } else {
            java.util.LinkedList linkedList = c2Var.f405131d;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.tab.ActivityC16018xae0b4e2b.f223300i;
            activityC16018xae0b4e2b.a7(linkedList, false);
        }
    }
}
