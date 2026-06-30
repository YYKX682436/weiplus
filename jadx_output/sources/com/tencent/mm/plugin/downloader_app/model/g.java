package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class g implements k02.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h02.a f97270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.model.r0 f97271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97272c;

    public g(h02.a aVar, com.tencent.mm.plugin.downloader_app.model.r0 r0Var, android.content.Context context) {
        this.f97270a = aVar;
        this.f97271b = r0Var;
        this.f97272c = context;
    }

    @Override // k02.k
    public void a() {
    }

    @Override // k02.k
    public void b() {
        com.tencent.mm.plugin.downloader_app.model.o.f(this.f97272c, this.f97270a, this.f97271b, true, null);
    }

    @Override // k02.k
    public void c() {
        h02.a aVar = this.f97270a;
        java.lang.String str = aVar.field_appId;
        java.util.Iterator it = com.tencent.mm.plugin.downloader_app.model.x.f97338g.iterator();
        while (it.hasNext()) {
            r02.y0 y0Var = (r02.y0) ((com.tencent.mm.plugin.downloader_app.model.w) it.next());
            y0Var.getClass();
            int i17 = com.tencent.mm.plugin.downloader_app.ui.TaskListView.f97417s2;
            com.tencent.mm.plugin.downloader_app.ui.TaskListView taskListView = y0Var.f368344a;
            taskListView.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it6 = taskListView.f97418f2.f368324d.iterator();
            int i18 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) it6.next();
                if (r0Var.f97317f.equals(str)) {
                    linkedList.add(r0Var);
                    com.tencent.mm.plugin.downloader_app.model.s0.e(r0Var.f97317f);
                    break;
                }
                i18++;
            }
            if (linkedList.size() != 0) {
                taskListView.f97418f2.x(linkedList);
                taskListView.f97418f2.notifyItemRemoved(i18);
                if (taskListView.f97418f2.f368324d.size() <= 5) {
                    if (taskListView.getContext() instanceof com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) {
                        ((com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI) taskListView.getContext()).W6(true);
                    }
                    taskListView.f97418f2.notifyDataSetChanged();
                }
            }
        }
        com.tencent.mm.plugin.downloader_app.model.o.e(aVar, this.f97271b);
    }

    @Override // k02.k
    public void d() {
    }
}
