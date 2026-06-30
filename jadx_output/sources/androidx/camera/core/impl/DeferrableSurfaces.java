package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static void decrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        if (list.isEmpty()) {
            return;
        }
        int i17 = 0;
        do {
            try {
                list.get(i17).incrementUseCount();
                i17++;
            } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException e17) {
                for (int i18 = i17 - 1; i18 >= 0; i18--) {
                    list.get(i18).decrementUseCount();
                }
                throw e17;
            }
        } while (i17 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object lambda$surfaceListWithTimeout$1(final wa.a aVar, java.util.concurrent.Executor executor, final boolean z17, java.util.Collection collection, final t2.k kVar) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$b
            @Override // java.lang.Runnable
            public final void run() {
                wa.a.this.cancel(true);
            }
        };
        t2.t tVar = kVar.f414654c;
        if (tVar != null) {
            tVar.addListener(runnable, executor);
        }
        androidx.camera.core.impl.utils.futures.Futures.addCallback(aVar, new androidx.camera.core.impl.utils.futures.FutureCallback<java.util.List<android.view.Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th6) {
                if (th6 instanceof java.util.concurrent.TimeoutException) {
                    kVar.b(th6);
                } else {
                    kVar.a(java.util.Collections.emptyList());
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(java.util.List<android.view.Surface> list) {
                list.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList(list);
                if (z17) {
                    arrayList.removeAll(java.util.Collections.singleton(null));
                }
                kVar.a(arrayList);
            }
        }, executor);
        return "surfaceList[" + collection + "]";
    }

    public static wa.a surfaceListWithTimeout(final java.util.Collection<androidx.camera.core.impl.DeferrableSurface> collection, final boolean z17, long j17, final java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final wa.a makeTimeoutFuture = androidx.camera.core.impl.utils.futures.Futures.makeTimeoutFuture(j17, scheduledExecutorService, androidx.camera.core.impl.utils.futures.Futures.successfulAsList(arrayList));
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$a
            @Override // t2.m
            public final java.lang.Object attachCompleter(t2.k kVar) {
                java.lang.Object lambda$surfaceListWithTimeout$1;
                lambda$surfaceListWithTimeout$1 = androidx.camera.core.impl.DeferrableSurfaces.lambda$surfaceListWithTimeout$1(wa.a.this, executor, z17, collection, kVar);
                return lambda$surfaceListWithTimeout$1;
            }
        });
    }

    public static boolean tryIncrementAll(java.util.List<androidx.camera.core.impl.DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (androidx.camera.core.impl.DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
