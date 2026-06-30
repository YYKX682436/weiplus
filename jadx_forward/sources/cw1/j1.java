package cw1;

/* loaded from: classes12.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db f304550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aw1.n f304551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304552f;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db, aw1.n nVar, android.view.View view) {
        this.f304550d = activityC13108x43db50db;
        this.f304551e = nVar;
        this.f304552f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f304550d.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13108x43db50db activityC13108x43db50db = this.f304550d;
        aw1.n nVar = this.f304551e;
        activityC13108x43db50db.f177199q = nVar.f96143a;
        activityC13108x43db50db.f177200r = nVar.f96144b;
        activityC13108x43db50db.f177204v = nVar.f96145c;
        yv1.g1 g1Var = activityC13108x43db50db.f177196n;
        if (g1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("session");
            throw null;
        }
        synchronized (g1Var) {
            g1Var.f547584j = nVar.f96143a;
            g1Var.f547585k = nVar.f96144b;
            g1Var.f547589o = nVar.f96145c;
        }
        cw1.t0 t0Var = this.f304550d.f177189d;
        if (t0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        t0Var.B();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f304550d.f177190e;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        c1163xf1deaba4.setVisibility(0);
        android.view.View view = this.f304552f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$loadOriginalMediaData$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheNewUI$loadOriginalMediaData$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
