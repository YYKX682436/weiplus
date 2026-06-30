package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedList f97332a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f97333b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedList f97334c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f97335d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f97336e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedList f97337f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.LinkedList f97338g = new java.util.LinkedList();

    public static void a(long j17) {
        java.util.Iterator it = f97337f.iterator();
        while (it.hasNext()) {
            ((r02.t0) ((com.tencent.mm.plugin.downloader_app.model.s) it.next())).a(5, j17);
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.tencent.mm.plugin.downloader_app.model.u.class)).all()) {
            if (fs.g.d(fs.g.f266086c, qVar)) {
                ((n02.e) ((com.tencent.mm.plugin.downloader_app.model.u) ((fs.n) qVar.get()))).Z(5, j17);
            }
        }
    }

    public static void b(boolean z17) {
        java.util.Iterator it = f97334c.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.ui.DeleteTaskFooterView deleteTaskFooterView = ((r02.d) ((com.tencent.mm.plugin.downloader_app.model.r) it.next())).f368293a;
            if (z17) {
                deleteTaskFooterView.f97365f.setClickable(true);
                l02.n.a(deleteTaskFooterView.f97367h, "download_delete_enable");
                deleteTaskFooterView.f97366g.setTextColor(deleteTaskFooterView.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac));
            } else {
                deleteTaskFooterView.f97365f.setClickable(false);
                l02.n.a(deleteTaskFooterView.f97367h, "download_delete_disable");
                deleteTaskFooterView.f97366g.setTextColor(deleteTaskFooterView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_4));
            }
        }
    }

    public static void c(java.lang.String str) {
        java.util.Iterator it = f97335d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = ((r02.w0) ((com.tencent.mm.plugin.downloader_app.model.v) it.next())).f368340a;
            com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) ((java.util.HashMap) taskListView.f97419g2).get(str);
            if (r0Var != null) {
                if (r0Var.f97314c == 6) {
                    r0Var.f97314c = 2;
                    taskListView.m1(r0Var);
                }
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) taskListView.getLayoutManager();
                int childCount = linearLayoutManager.getChildCount();
                for (int i17 = 0; i17 <= childCount; i17++) {
                    if (linearLayoutManager.getChildAt(i17) != null) {
                        android.view.View childAt = ((android.view.ViewGroup) linearLayoutManager.getChildAt(i17)).getChildAt(0);
                        if (childAt.getVisibility() == 0 && (childAt instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView)) {
                            com.tencent.mm.plugin.downloader_app.ui.TaskItemView taskItemView = (com.tencent.mm.plugin.downloader_app.ui.TaskItemView) childAt;
                            if (taskItemView.B.f97317f.equals(str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.TaskItemView", "onTaskPreStartDownload, appId: %s", str);
                                taskItemView.C = true;
                                taskItemView.post(new r02.l0(taskItemView));
                            }
                        }
                    }
                }
            }
        }
    }
}
