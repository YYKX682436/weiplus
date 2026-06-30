package yk3;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yk3.i f544343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f544344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fr4 f544345f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f544346g;

    public c(yk3.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, r45.fr4 fr4Var, android.view.View view) {
        this.f544343d = iVar;
        this.f544344e = c16601x7ed0e40c;
        this.f544345f = fr4Var;
        this.f544346g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yk3.i iVar = this.f544343d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f544344e;
        pk3.h c17 = iVar.c(c16601x7ed0e40c);
        if (c17 != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = iVar.f544335d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).U6(c16601x7ed0e40c);
            java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
            r45.fr4 fr4Var = this.f544345f;
            fr4Var.set(8, valueOf);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = iVar.f544335d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            c17.P6(this.f544346g, c16601x7ed0e40c, fr4Var, ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).V6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onAnimationCancel,onGridItemClick, id:%s", c16601x7ed0e40c.f66791xc8a07680);
        }
    }
}
