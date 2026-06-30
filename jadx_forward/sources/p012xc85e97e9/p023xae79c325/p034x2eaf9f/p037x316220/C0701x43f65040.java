package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.DeferrableSurfaces */
/* loaded from: classes14.dex */
public final class C0701x43f65040 {
    private C0701x43f65040() {
    }

    /* renamed from: decrementAll */
    public static void m5414x72fa880e(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = list.iterator();
        while (it.hasNext()) {
            it.next().m5402xc13e57b();
        }
    }

    /* renamed from: incrementAll */
    public static void m5415xd57d0bb2(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        if (list.isEmpty()) {
            return;
        }
        int i17 = 0;
        do {
            try {
                list.get(i17).m5410x8d860857();
                i17++;
            } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException e17) {
                for (int i18 = i17 - 1; i18 >= 0; i18--) {
                    list.get(i18).m5402xc13e57b();
                }
                throw e17;
            }
        } while (i17 < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$surfaceListWithTimeout$1 */
    public static java.lang.Object m5417xca7c9a(final wa.a aVar, java.util.concurrent.Executor executor, final boolean z17, java.util.Collection collection, final t2.k kVar) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$b
            @Override // java.lang.Runnable
            public final void run() {
                wa.a.this.cancel(true);
            }
        };
        t2.t tVar = kVar.f496187c;
        if (tVar != null) {
            tVar.mo606x162a7075(runnable, executor);
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(aVar, new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.util.List<android.view.Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                if (th6 instanceof java.util.concurrent.TimeoutException) {
                    kVar.b(th6);
                } else {
                    kVar.a(java.util.Collections.emptyList());
                }
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.util.List<android.view.Surface> list) {
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

    /* renamed from: surfaceListWithTimeout */
    public static wa.a m5418x29262dd0(final java.util.Collection<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> collection, final boolean z17, long j17, final java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6025x3918f316(it.next().m5407xcf572877()));
        }
        final wa.a m6024xe7063736 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6024xe7063736(j17, scheduledExecutorService, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6029xf7c1832a(arrayList));
        return t2.p.a(new t2.m() { // from class: androidx.camera.core.impl.DeferrableSurfaces$$a
            @Override // t2.m
            /* renamed from: attachCompleter */
            public final java.lang.Object mo3008x586b6594(t2.k kVar) {
                java.lang.Object m5417xca7c9a;
                m5417xca7c9a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0701x43f65040.m5417xca7c9a(wa.a.this, executor, z17, collection, kVar);
                return m5417xca7c9a;
            }
        });
    }

    /* renamed from: tryIncrementAll */
    public static boolean m5419xe766610d(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293> list) {
        try {
            m5415xd57d0bb2(list);
            return true;
        } catch (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0697x654a0293.SurfaceClosedException unused) {
            return false;
        }
    }
}
