package u4;

/* loaded from: classes13.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 f506011a = new p012xc85e97e9.p112x993b6d55.C1172x76e7e484();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f506012b = new java.lang.ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f506013c = new java.util.ArrayList();

    public static void a(android.view.ViewGroup viewGroup, p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        java.util.ArrayList arrayList = f506013c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.c(viewGroup)) {
            arrayList.add(viewGroup);
            if (abstractC1183x100d4975 == null) {
                abstractC1183x100d4975 = f506011a;
            }
            p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 mo8267x5a5dd5d = abstractC1183x100d4975.mo8267x5a5dd5d();
            d(viewGroup, mo8267x5a5dd5d);
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.f568928oj2, null);
            if (mo8267x5a5dd5d != null) {
                u4.f1 f1Var = new u4.f1(mo8267x5a5dd5d, viewGroup);
                viewGroup.addOnAttachStateChangeListener(f1Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(f1Var);
            }
        }
    }

    public static x.b b() {
        x.b bVar;
        java.lang.ThreadLocal threadLocal = f506012b;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (x.b) weakReference.get()) != null) {
            return bVar;
        }
        x.b bVar2 = new x.b();
        threadLocal.set(new java.lang.ref.WeakReference(bVar2));
        return bVar2;
    }

    public static void c(u4.j0 j0Var, p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        android.view.ViewGroup viewGroup = j0Var.f506034c;
        java.util.ArrayList arrayList = f506013c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        if (abstractC1183x100d4975 == null) {
            j0Var.a();
            return;
        }
        arrayList.add(viewGroup);
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 mo8267x5a5dd5d = abstractC1183x100d4975.mo8267x5a5dd5d();
        mo8267x5a5dd5d.P(viewGroup);
        u4.j0 j0Var2 = (u4.j0) viewGroup.getTag(com.p314xaae8f345.mm.R.id.f568928oj2);
        if (j0Var2 != null) {
            if (j0Var2.f506033b > 0) {
                mo8267x5a5dd5d.I(true);
            }
        }
        d(viewGroup, mo8267x5a5dd5d);
        j0Var.a();
        u4.f1 f1Var = new u4.f1(mo8267x5a5dd5d, viewGroup);
        viewGroup.addOnAttachStateChangeListener(f1Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(f1Var);
    }

    public static void d(android.view.ViewGroup viewGroup, p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975) {
        java.lang.Runnable runnable;
        java.util.ArrayList arrayList = (java.util.ArrayList) b().m174751x4aabfc28(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975) it.next()).C(viewGroup);
            }
        }
        if (abstractC1183x100d4975 != null) {
            abstractC1183x100d4975.k(viewGroup, true);
        }
        u4.j0 j0Var = (u4.j0) viewGroup.getTag(com.p314xaae8f345.mm.R.id.f568928oj2);
        if (j0Var == null || ((u4.j0) j0Var.f506034c.getTag(com.p314xaae8f345.mm.R.id.f568928oj2)) != j0Var || (runnable = j0Var.f506037f) == null) {
            return;
        }
        runnable.run();
    }
}
