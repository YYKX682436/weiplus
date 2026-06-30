package gz1;

/* loaded from: classes13.dex */
public final class c implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, gz1.d.f359254n)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, gz1.d.f359255o)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FragmentEventMonitor", "chatting fragment onPause");
                    gz1.d.f359247d.p((p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj, false);
                    return;
                }
                return;
            }
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) obj;
            if (!componentCallbacksC1101xa17d4670.m7491x1edc854d() || componentCallbacksC1101xa17d4670.m7483xdf9b8f74()) {
                return;
            }
            gz1.d dVar = gz1.d.f359247d;
            if (gz1.d.f359257q == null) {
                gz1.d.f359257q = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_data_report_sdk_filter_chatting, false));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FragmentEventMonitor", "isFilterFirstChattingUI : " + gz1.d.f359257q);
            }
            java.lang.Boolean bool = gz1.d.f359257q;
            if ((bool != null ? bool.booleanValue() : false) && gz1.d.f359258r) {
                gz1.d.f359258r = false;
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = gz1.d.f359250g;
            if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()))) {
                concurrentHashMap.put(java.lang.Integer.valueOf(componentCallbacksC1101xa17d4670.m7479x8cdac1b()), new gz1.b(new java.lang.ref.WeakReference(obj), true));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Amoeba.FragmentEventMonitor", "chatting fragment onResume");
            dVar.s(componentCallbacksC1101xa17d4670);
        }
    }
}
