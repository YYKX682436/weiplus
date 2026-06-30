package ef4;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ef4.h f333977d = new ef4.h();

    @Override // java.lang.Runnable
    public final void run() {
        if (ef4.i.f333981c) {
            return;
        }
        ef4.i.f333981c = true;
        if (ef4.i.f333980b != 0) {
            ef4.i.f333980b = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<java.lang.ref.WeakReference> list = ef4.i.f333979a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getMListeners$p(...)");
        synchronized (list) {
            for (java.lang.ref.WeakReference weakReference : list) {
                if (((ze4.e) weakReference.get()) == null) {
                    arrayList.add(weakReference);
                } else {
                    ze4.e eVar = (ze4.e) weakReference.get();
                    if (eVar != null) {
                        int i17 = ef4.i.f333980b;
                        com.p314xaae8f345.mm.ui.p2690x38b72420.C22291x3eba42e2 c22291x3eba42e2 = (com.p314xaae8f345.mm.ui.p2690x38b72420.C22291x3eba42e2) eVar;
                        if (c22291x3eba42e2.getVisibility() == 0 && c22291x3eba42e2.c() && c22291x3eba42e2.f287868e != i17) {
                            c22291x3eba42e2.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.n0(c22291x3eba42e2, i17));
                        }
                    }
                }
            }
        }
        ef4.i.f333979a.removeAll(arrayList);
        ef4.i.f333981c = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavourUserChecker", "checkStoryStatus:%s nowState:%s", java.lang.Integer.valueOf(ef4.i.f333980b), 0);
    }
}
