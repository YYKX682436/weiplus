package androidx.window.rxjava2.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\b"}, d2 = {"Landroidx/window/layout/WindowInfoTracker;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Lfz5/b;", "Landroidx/window/layout/WindowLayoutInfo;", "windowLayoutInfoObservable", "Lfz5/a;", "windowLayoutInfoFlowable", "window-rxjava2_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public final class WindowInfoTrackerRx {
    public static final fz5.a windowLayoutInfoFlowable(androidx.window.layout.WindowInfoTracker windowInfoTracker, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(windowInfoTracker, "<this>");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlinx.coroutines.flow.j windowLayoutInfo = windowInfoTracker.windowLayoutInfo(activity);
        oz5.m mVar = oz5.m.f350329d;
        int i17 = x26.c.f451568a;
        h56.a bVar = new x26.b(windowLayoutInfo, kotlinx.coroutines.q1.f310569b.plus(mVar));
        int i18 = fz5.a.f267332a;
        return bVar instanceof fz5.a ? (fz5.a) bVar : new gz5.a(bVar);
    }

    public static final fz5.b windowLayoutInfoObservable(androidx.window.layout.WindowInfoTracker windowInfoTracker, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(windowInfoTracker, "<this>");
        kotlin.jvm.internal.o.g(activity, "activity");
        final kotlinx.coroutines.flow.j windowLayoutInfo = windowInfoTracker.windowLayoutInfo(activity);
        final oz5.m mVar = oz5.m.f350329d;
        return new hz5.a(new fz5.c(mVar, windowLayoutInfo) { // from class: y26.a$$a
        });
    }
}
