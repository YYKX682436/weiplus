package nf;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static si1.n0 f418112g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.WeakHashMap f418113h = new java.util.WeakHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final nf.g f418114i = new nf.g(null);

    /* renamed from: d, reason: collision with root package name */
    public nf.i f418118d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f418119e;

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f418115a = new android.util.SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f418116b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f418117c = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Random f418120f = new java.util.Random();

    public g(android.app.Activity activity) {
        this.f418119e = activity;
    }

    public static nf.g a(android.content.Context context) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        iz5.a.c("must implements ILuggageActivityHelper", false);
        boolean z17 = context instanceof android.app.Activity;
        nf.g gVar = f418114i;
        if (!z17) {
            iz5.a.c(null, false);
            return gVar;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageActivityHelper", "FOR(%s) instance destroyed, return DUMMY", activity);
            return gVar;
        }
        java.util.WeakHashMap weakHashMap = f418113h;
        if (!weakHashMap.containsKey(activity)) {
            weakHashMap.put(activity, new nf.g(activity));
        }
        return (nf.g) weakHashMap.get(context);
    }

    public static void b(android.content.Context context) {
        nf.g gVar;
        if (!(context instanceof android.app.Activity) || (gVar = (nf.g) f418113h.remove(context)) == null) {
            return;
        }
        gVar.f418115a.clear();
        gVar.f418117c.clear();
        gVar.f418116b.clear();
    }

    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final java.lang.String str, final nf.n nVar) {
        android.app.Activity activity = this.f418119e;
        if (activity == null) {
            return false;
        }
        si1.n0 n0Var = f418112g;
        if (n0Var == null || lVar == null) {
            try {
                if (b3.l.m9698x3fed0563(activity, str) == 0) {
                    return true;
                }
                i(null, new java.lang.String[]{str}, nVar);
                return false;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageActivityHelper", "check mpermission exception:%s.", e17);
                return true;
            }
        }
        n0Var.getClass();
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j0) f418112g).b(activity, lVar, str)) {
            return true;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j0) f418112g).c(activity, lVar, str, new si1.m0() { // from class: nf.g$$a
            @Override // si1.m0
            public final void a(int i17) {
                nf.n.this.b(new java.lang.String[]{str}, new int[]{i17});
            }
        });
        return false;
    }

    public final void d(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, final int i17, final java.lang.String[] strArr, final int[] iArr, final nf.n nVar) {
        if (i17 != strArr.length) {
            if (f418112g == null) {
                return;
            }
            final java.lang.String str = strArr[i17];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageActivityHelper", "doReqPerm index:%d permission:%s", java.lang.Integer.valueOf(i17), str);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.j0) f418112g).c(this.f418119e, lVar, str, new si1.m0() { // from class: nf.g$$b
                @Override // si1.m0
                public final void a(int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = lVar;
                    java.lang.String[] strArr2 = strArr;
                    nf.n nVar2 = nVar;
                    nf.g gVar = nf.g.this;
                    gVar.getClass();
                    int[] iArr2 = iArr;
                    int i19 = i17;
                    iArr2[i19] = i18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageActivityHelper", "doReqPerm callback index:%d permission:%s grantResult:%d", java.lang.Integer.valueOf(i19), str, java.lang.Integer.valueOf(i18));
                    gVar.d(lVar2, i19 + 1, strArr2, iArr2, nVar2);
                }
            });
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 : iArr) {
            sb6.append(i18);
            sb6.append(",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.LuggageActivityHelper", "delegateBatchRequestPermissionToSeqLogic finally callback, grantResult:%s", sb6);
        nVar.b(strArr, iArr);
    }

    public void e() {
        android.app.Activity activity = this.f418119e;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        nf.i iVar = this.f418118d;
        if (iVar != null ? iVar.r6() : true) {
            activity.finish();
        }
    }

    public void f(nf.k kVar) {
        if (kVar == null) {
            return;
        }
        this.f418117c.add(new nf.h(this, kVar));
    }

    public void g(int i17, int i18, android.content.Intent intent) {
        java.util.Iterator it = this.f418117c.iterator();
        while (it.hasNext()) {
            if (((nf.k) it.next()).a(i17, i18, intent)) {
                return;
            }
        }
        android.util.SparseArray sparseArray = this.f418115a;
        nf.l lVar = (nf.l) sparseArray.get(i17);
        sparseArray.delete(i17);
        if (lVar != null) {
            ((nf.j) lVar).mo14598x57429edc(i18, intent);
        }
    }

    public void h(int i17, java.lang.String[] strArr, int[] iArr) {
        android.util.SparseArray sparseArray = this.f418116b;
        nf.l lVar = (nf.l) sparseArray.get(i17);
        sparseArray.delete(i17);
        if (lVar != null) {
            ((nf.n) lVar).b(strArr, iArr);
        }
    }

    public void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String[] strArr, nf.n nVar) {
        int nextInt;
        if (this.f418119e == null) {
            return;
        }
        if (f418112g != null && lVar != null) {
            d(lVar, 0, strArr, new int[strArr.length], nVar);
            return;
        }
        android.util.SparseArray sparseArray = this.f418116b;
        do {
            nextInt = (this.f418120f.nextInt(2147483646) + 1) & 65535;
        } while (sparseArray.get(nextInt) != null);
        sparseArray.put(nextInt, nVar);
        android.app.Activity activity = this.f418119e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(nextInt));
        arrayList.add(strArr);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/luggage/util/LuggageActivityHelper", "requestPermissions", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;[Ljava/lang/String;Lcom/tencent/luggage/util/LuggageActivityHelper$PermissionResultCallback;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
        activity.requestPermissions((java.lang.String[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(activity, "com/tencent/luggage/util/LuggageActivityHelper", "requestPermissions", "(Lcom/tencent/mm/plugin/appbrand/jsapi/AppBrandComponent;[Ljava/lang/String;Lcom/tencent/luggage/util/LuggageActivityHelper$PermissionResultCallback;)V", "Undefined", "requestPermissions", "([Ljava/lang/String;I)V");
    }

    public void j(android.content.Intent intent, nf.j jVar) {
        int nextInt;
        if (this.f418119e == null) {
            return;
        }
        android.util.SparseArray sparseArray = this.f418115a;
        do {
            nextInt = (this.f418120f.nextInt(2147483646) + 1) & 65535;
        } while (sparseArray.get(nextInt) != null);
        sparseArray.put(nextInt, jVar);
        android.app.Activity activity = this.f418119e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(nextInt));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/luggage/util/LuggageActivityHelper", "startActivityForResult", "(Landroid/content/Intent;Lcom/tencent/luggage/util/LuggageActivityHelper$ActivityResultCallback;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
