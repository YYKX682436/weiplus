package i52;

/* loaded from: classes15.dex */
public final class g implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i52.h f370012a;

    public g(i52.h hVar) {
        this.f370012a = hVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f;
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onPageSelected");
                i52.h hVar = this.f370012a;
                if (!b17) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "onPageScrollStateChanged")) {
                        java.lang.Object obj2 = objArr[0];
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                        if (((java.lang.Integer) obj2).intValue() == 1) {
                            hVar.f370020h = true;
                            return;
                        } else {
                            hVar.getClass();
                            return;
                        }
                    }
                    return;
                }
                java.lang.Object obj3 = objArr[0];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) obj3).intValue();
                java.lang.ref.WeakReference weakReference = hVar.f370018f;
                if (weakReference == null || (activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) weakReference.get()) == null) {
                    return;
                }
                int i17 = hVar.f370016d;
                p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = activityC21401x6ce6f73f.mo7595x9cdc264();
                java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7595x9cdc264 == null ? null : mo7595x9cdc264.m7675x1626d96d();
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a17 = (m7675x1626d96d == null || m7675x1626d96d.isEmpty() || i17 < 0 || i17 >= m7675x1626d96d.size()) ? null : i52.l.a(i17, m7675x1626d96d, activityC21401x6ce6f73f);
                p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc2642 = activityC21401x6ce6f73f.mo7595x9cdc264();
                java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d2 = mo7595x9cdc2642 == null ? null : mo7595x9cdc2642.m7675x1626d96d();
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a18 = (m7675x1626d96d2 == null || m7675x1626d96d2.isEmpty() || intValue < 0 || intValue >= m7675x1626d96d2.size()) ? null : i52.l.a(intValue, m7675x1626d96d2, activityC21401x6ce6f73f);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fragment, onPageSelected: runOnEnter: lastPos=");
                sb6.append(hVar.f370016d);
                sb6.append(", curPos=");
                sb6.append(intValue);
                sb6.append(", activity=");
                sb6.append(activityC21401x6ce6f73f.getClass().getCanonicalName());
                sb6.append(", lastFrag=");
                sb6.append(a17 != null ? a17.getClass().getCanonicalName() : null);
                sb6.append(", curFrag=");
                sb6.append(a18 != null ? a18.getClass().getCanonicalName() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentLauncherUIMonitor", sb6.toString());
                if (hVar.f370020h) {
                    int i18 = hVar.f370016d;
                    java.lang.String str4 = i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? "-1" : "ff000004" : "ff000003" : "ff000002" : "ff000001";
                    r45.a07 a07Var = new r45.a07();
                    a07Var.f451134d = str4;
                    a07Var.f451142o = java.lang.System.currentTimeMillis();
                    a07Var.f451135e = str4;
                    a07Var.f451137g = a17 == null ? "null" : b52.b.g(a17.getClass().getName());
                    a07Var.f451141n = a17 != null ? a17.m7479x8cdac1b() : -1;
                    java.lang.String str5 = a07Var.f451137g;
                    a07Var.f451136f = str5;
                    a07Var.f451138h = str5;
                    k52.g gVar = k52.g.f385837r;
                    a07Var.f451139i = 10;
                    a07Var.f451148u = 0;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentLauncherUIMonitor", "FragmentMonitor, onSwipEvent: pos=" + hVar.f370016d + "\n, page.name=" + a07Var.f451137g + "\n, page.hashCode=" + a07Var.f451141n + "\n, EventId=" + gVar + "\n, resId=" + str4);
                    java.util.Map map = k52.l.f385843a;
                    k52.l.f385847e.a(null, a07Var);
                    hVar.f370020h = false;
                }
                hVar.f370016d = intValue;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                b52.d dVar = hVar.f370013a;
                if (a17 != null && dVar != null) {
                    ((i52.k) dVar).b(activityC21401x6ce6f73f, a17.getClass().getCanonicalName(), a17.m7479x8cdac1b(), currentTimeMillis, true);
                }
                if (a18 == null || dVar == null) {
                    return;
                }
                ((i52.k) dVar).c(activityC21401x6ce6f73f, a18, a18.getClass().getCanonicalName(), a18.m7479x8cdac1b(), currentTimeMillis, true);
            }
        }
    }
}
