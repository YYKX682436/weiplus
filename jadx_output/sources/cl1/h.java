package cl1;

/* loaded from: classes8.dex */
public class h implements dl1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView f42871a;

    public h(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView) {
        this.f42871a = appBrandDesktopDragView;
    }

    public android.widget.ImageView a() {
        rh4.j0 j0Var;
        android.view.View n17;
        cl1.l0 l0Var = this.f42871a.I;
        if (l0Var == null || (j0Var = ((rh4.f0) l0Var).f395722a.f172715j2) == null || (n17 = j0Var.n()) == null) {
            return null;
        }
        return (android.widget.ImageView) n17.findViewById(com.tencent.mm.R.id.jr6);
    }

    public boolean b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = this.f42871a;
        cl1.l0 l0Var = appBrandDesktopDragView.I;
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopDragView", "isInAreaAndFromCommonUsedWeAppRecyclerView jacob InAreaFalse");
            return false;
        }
        if (!((rh4.f0) l0Var).a()) {
            return false;
        }
        ((rh4.f0) appBrandDesktopDragView.I).getClass();
        return recyclerView.getId() == com.tencent.mm.R.id.r8w;
    }

    public boolean c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = this.f42871a;
        cl1.l0 l0Var = appBrandDesktopDragView.I;
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopDragView", "jacob InAreaFalse");
            return false;
        }
        if (!((rh4.f0) l0Var).a()) {
            return false;
        }
        ((rh4.f0) appBrandDesktopDragView.I).getClass();
        return recyclerView.getId() == com.tencent.mm.R.id.f487233nz1;
    }

    public int d() {
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView taskBarSectionMyWeAppRecyclerView;
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = ((rh4.f0) this.f42871a.I).f395722a;
        rh4.j0 j0Var = taskBarSectionWeAppRecyclerView.f172715j2;
        if (j0Var == null) {
            return -1;
        }
        if (j0Var.o()) {
            return taskBarSectionWeAppRecyclerView.f172715j2.k();
        }
        rh4.o oVar = (rh4.o) taskBarSectionWeAppRecyclerView.f172715j2.n();
        if (oVar == null || (taskBarSectionMyWeAppRecyclerView = (com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionMyWeAppRecyclerView) oVar.findViewById(com.tencent.mm.R.id.f487232nz0)) == null) {
            return -1;
        }
        return taskBarSectionMyWeAppRecyclerView.getDataList().size();
    }
}
