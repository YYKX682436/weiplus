package androidx.activity.result;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Random f9062a = new java.util.Random();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f9063b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f9064c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f9065d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f9066e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final transient java.util.Map f9067f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f9068g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Bundle f9069h = new android.os.Bundle();

    public final boolean a(int i17, int i18, android.content.Intent intent) {
        androidx.activity.result.b bVar;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) this.f9063b).get(java.lang.Integer.valueOf(i17));
        if (str == null) {
            return false;
        }
        androidx.activity.result.f fVar = (androidx.activity.result.f) ((java.util.HashMap) this.f9067f).get(str);
        if (fVar == null || (bVar = fVar.f9058a) == null || !this.f9066e.contains(str)) {
            ((java.util.HashMap) this.f9068g).remove(str);
            this.f9069h.putParcelable(str, new androidx.activity.result.ActivityResult(i18, intent));
            return true;
        }
        bVar.a(fVar.f9059b.c(i18, intent));
        this.f9066e.remove(str);
        return true;
    }

    public abstract void b(int i17, h.b bVar, java.lang.Object obj, z2.m mVar);

    public final void c(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f9066e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f9062a = (java.util.Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        android.os.Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        android.os.Bundle bundle3 = this.f9069h;
        bundle3.putAll(bundle2);
        for (int i17 = 0; i17 < stringArrayList.size(); i17++) {
            java.lang.String str = stringArrayList.get(i17);
            java.util.Map map = this.f9064c;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            boolean containsKey = hashMap.containsKey(str);
            java.util.Map map2 = this.f9063b;
            if (containsKey) {
                java.lang.Integer num = (java.lang.Integer) hashMap.remove(str);
                if (!bundle3.containsKey(str)) {
                    ((java.util.HashMap) map2).remove(num);
                }
            }
            int intValue = integerArrayList.get(i17).intValue();
            java.lang.String str2 = stringArrayList.get(i17);
            ((java.util.HashMap) map2).put(java.lang.Integer.valueOf(intValue), str2);
            ((java.util.HashMap) map).put(str2, java.lang.Integer.valueOf(intValue));
        }
    }

    public final androidx.activity.result.c d(final java.lang.String str, androidx.lifecycle.y yVar, final h.b bVar, final androidx.activity.result.b bVar2) {
        androidx.lifecycle.o mo133getLifecycle = yVar.mo133getLifecycle();
        if (mo133getLifecycle.b().a(androidx.lifecycle.n.STARTED)) {
            throw new java.lang.IllegalStateException("LifecycleOwner " + yVar + " is attempting to register while current state is " + mo133getLifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        f(str);
        java.util.Map map = this.f9065d;
        androidx.activity.result.g gVar = (androidx.activity.result.g) ((java.util.HashMap) map).get(str);
        if (gVar == null) {
            gVar = new androidx.activity.result.g(mo133getLifecycle);
        }
        androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.v
            public void onStateChanged(androidx.lifecycle.y yVar2, androidx.lifecycle.m mVar) {
                boolean equals = androidx.lifecycle.m.ON_START.equals(mVar);
                java.lang.String str2 = str;
                androidx.activity.result.h hVar = androidx.activity.result.h.this;
                if (!equals) {
                    if (androidx.lifecycle.m.ON_STOP.equals(mVar)) {
                        ((java.util.HashMap) hVar.f9067f).remove(str2);
                        return;
                    } else {
                        if (androidx.lifecycle.m.ON_DESTROY.equals(mVar)) {
                            hVar.g(str2);
                            return;
                        }
                        return;
                    }
                }
                java.util.Map map2 = hVar.f9067f;
                androidx.activity.result.b bVar3 = bVar2;
                h.b bVar4 = bVar;
                ((java.util.HashMap) map2).put(str2, new androidx.activity.result.f(bVar3, bVar4));
                if (((java.util.HashMap) hVar.f9068g).containsKey(str2)) {
                    java.lang.Object obj = ((java.util.HashMap) hVar.f9068g).get(str2);
                    ((java.util.HashMap) hVar.f9068g).remove(str2);
                    bVar3.a(obj);
                }
                androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) hVar.f9069h.getParcelable(str2);
                if (activityResult != null) {
                    hVar.f9069h.remove(str2);
                    bVar3.a(bVar4.c(activityResult.f9042d, activityResult.f9043e));
                }
            }
        };
        gVar.f9060a.a(vVar);
        gVar.f9061b.add(vVar);
        ((java.util.HashMap) map).put(str, gVar);
        return new androidx.activity.result.d(this, str, bVar);
    }

    public final androidx.activity.result.c e(java.lang.String str, h.b bVar, androidx.activity.result.b bVar2) {
        f(str);
        ((java.util.HashMap) this.f9067f).put(str, new androidx.activity.result.f(bVar2, bVar));
        java.util.Map map = this.f9068g;
        if (((java.util.HashMap) map).containsKey(str)) {
            java.lang.Object obj = ((java.util.HashMap) map).get(str);
            ((java.util.HashMap) map).remove(str);
            bVar2.a(obj);
        }
        android.os.Bundle bundle = this.f9069h;
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            bVar2.a(bVar.c(activityResult.f9042d, activityResult.f9043e));
        }
        return new androidx.activity.result.e(this, str, bVar);
    }

    public final void f(java.lang.String str) {
        java.util.Map map = this.f9064c;
        if (((java.lang.Integer) ((java.util.HashMap) map).get(str)) != null) {
            return;
        }
        int nextInt = this.f9062a.nextInt(2147418112);
        while (true) {
            int i17 = nextInt + 65536;
            java.util.Map map2 = this.f9063b;
            if (!((java.util.HashMap) map2).containsKey(java.lang.Integer.valueOf(i17))) {
                ((java.util.HashMap) map2).put(java.lang.Integer.valueOf(i17), str);
                ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(i17));
                return;
            }
            nextInt = this.f9062a.nextInt(2147418112);
        }
    }

    public final void g(java.lang.String str) {
        java.lang.Integer num;
        if (!this.f9066e.contains(str) && (num = (java.lang.Integer) ((java.util.HashMap) this.f9064c).remove(str)) != null) {
            ((java.util.HashMap) this.f9063b).remove(num);
        }
        ((java.util.HashMap) this.f9067f).remove(str);
        java.util.Map map = this.f9068g;
        if (((java.util.HashMap) map).containsKey(str)) {
            java.util.Objects.toString(((java.util.HashMap) map).get(str));
            ((java.util.HashMap) map).remove(str);
        }
        android.os.Bundle bundle = this.f9069h;
        if (bundle.containsKey(str)) {
            java.util.Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        java.util.Map map2 = this.f9065d;
        androidx.activity.result.g gVar = (androidx.activity.result.g) ((java.util.HashMap) map2).get(str);
        if (gVar != null) {
            java.util.ArrayList arrayList = gVar.f9061b;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f9060a.c((androidx.lifecycle.v) it.next());
            }
            arrayList.clear();
            ((java.util.HashMap) map2).remove(str);
        }
    }
}
