package p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d;

/* loaded from: classes13.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Random f90595a = new java.util.Random();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f90596b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f90597c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f90598d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f90599e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final transient java.util.Map f90600f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f90601g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Bundle f90602h = new android.os.Bundle();

    public final boolean a(int i17, int i18, android.content.Intent intent) {
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) this.f90596b).get(java.lang.Integer.valueOf(i17));
        if (str == null) {
            return false;
        }
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.f fVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.f) ((java.util.HashMap) this.f90600f).get(str);
        if (fVar == null || (bVar = fVar.f90591a) == null || !this.f90599e.contains(str)) {
            ((java.util.HashMap) this.f90601g).remove(str);
            this.f90602h.putParcelable(str, new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c(i18, intent));
            return true;
        }
        bVar.a(fVar.f90592b.c(i18, intent));
        this.f90599e.remove(str);
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
        this.f90599e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f90595a = (java.util.Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        android.os.Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        android.os.Bundle bundle3 = this.f90602h;
        bundle3.putAll(bundle2);
        for (int i17 = 0; i17 < stringArrayList.size(); i17++) {
            java.lang.String str = stringArrayList.get(i17);
            java.util.Map map = this.f90597c;
            java.util.HashMap hashMap = (java.util.HashMap) map;
            boolean containsKey = hashMap.containsKey(str);
            java.util.Map map2 = this.f90596b;
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

    public final p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c d(final java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, final h.b bVar, final p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar2) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = yVar.mo273xed6858b4();
        if (mo273xed6858b4.b().a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
            throw new java.lang.IllegalStateException("LifecycleOwner " + yVar + " is attempting to register while current state is " + mo273xed6858b4.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        f(str);
        java.util.Map map = this.f90598d;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.g gVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.g) ((java.util.HashMap) map).get(str);
        if (gVar == null) {
            gVar = new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.g(mo273xed6858b4);
        }
        p012xc85e97e9.p093xedfae76a.v vVar = new p012xc85e97e9.p093xedfae76a.v() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar2, p012xc85e97e9.p093xedfae76a.m mVar) {
                boolean equals = p012xc85e97e9.p093xedfae76a.m.ON_START.equals(mVar);
                java.lang.String str2 = str;
                p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h hVar = p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.h.this;
                if (!equals) {
                    if (p012xc85e97e9.p093xedfae76a.m.ON_STOP.equals(mVar)) {
                        ((java.util.HashMap) hVar.f90600f).remove(str2);
                        return;
                    } else {
                        if (p012xc85e97e9.p093xedfae76a.m.ON_DESTROY.equals(mVar)) {
                            hVar.g(str2);
                            return;
                        }
                        return;
                    }
                }
                java.util.Map map2 = hVar.f90600f;
                p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar3 = bVar2;
                h.b bVar4 = bVar;
                ((java.util.HashMap) map2).put(str2, new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.f(bVar3, bVar4));
                if (((java.util.HashMap) hVar.f90601g).containsKey(str2)) {
                    java.lang.Object obj = ((java.util.HashMap) hVar.f90601g).get(str2);
                    ((java.util.HashMap) hVar.f90601g).remove(str2);
                    bVar3.a(obj);
                }
                p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c c0059x32c0ac2c = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c) hVar.f90602h.getParcelable(str2);
                if (c0059x32c0ac2c != null) {
                    hVar.f90602h.remove(str2);
                    bVar3.a(bVar4.c(c0059x32c0ac2c.f90575d, c0059x32c0ac2c.f90576e));
                }
            }
        };
        gVar.f90593a.a(vVar);
        gVar.f90594b.add(vVar);
        ((java.util.HashMap) map).put(str, gVar);
        return new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.d(this, str, bVar);
    }

    public final p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c e(java.lang.String str, h.b bVar, p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b bVar2) {
        f(str);
        ((java.util.HashMap) this.f90600f).put(str, new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.f(bVar2, bVar));
        java.util.Map map = this.f90601g;
        if (((java.util.HashMap) map).containsKey(str)) {
            java.lang.Object obj = ((java.util.HashMap) map).get(str);
            ((java.util.HashMap) map).remove(str);
            bVar2.a(obj);
        }
        android.os.Bundle bundle = this.f90602h;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c c0059x32c0ac2c = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c) bundle.getParcelable(str);
        if (c0059x32c0ac2c != null) {
            bundle.remove(str);
            bVar2.a(bVar.c(c0059x32c0ac2c.f90575d, c0059x32c0ac2c.f90576e));
        }
        return new p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.e(this, str, bVar);
    }

    public final void f(java.lang.String str) {
        java.util.Map map = this.f90597c;
        if (((java.lang.Integer) ((java.util.HashMap) map).get(str)) != null) {
            return;
        }
        int nextInt = this.f90595a.nextInt(2147418112);
        while (true) {
            int i17 = nextInt + 65536;
            java.util.Map map2 = this.f90596b;
            if (!((java.util.HashMap) map2).containsKey(java.lang.Integer.valueOf(i17))) {
                ((java.util.HashMap) map2).put(java.lang.Integer.valueOf(i17), str);
                ((java.util.HashMap) map).put(str, java.lang.Integer.valueOf(i17));
                return;
            }
            nextInt = this.f90595a.nextInt(2147418112);
        }
    }

    public final void g(java.lang.String str) {
        java.lang.Integer num;
        if (!this.f90599e.contains(str) && (num = (java.lang.Integer) ((java.util.HashMap) this.f90597c).remove(str)) != null) {
            ((java.util.HashMap) this.f90596b).remove(num);
        }
        ((java.util.HashMap) this.f90600f).remove(str);
        java.util.Map map = this.f90601g;
        if (((java.util.HashMap) map).containsKey(str)) {
            java.util.Objects.toString(((java.util.HashMap) map).get(str));
            ((java.util.HashMap) map).remove(str);
        }
        android.os.Bundle bundle = this.f90602h;
        if (bundle.containsKey(str)) {
            java.util.Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        java.util.Map map2 = this.f90598d;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.g gVar = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.g) ((java.util.HashMap) map2).get(str);
        if (gVar != null) {
            java.util.ArrayList arrayList = gVar.f90594b;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar.f90593a.c((p012xc85e97e9.p093xedfae76a.v) it.next());
            }
            arrayList.clear();
            ((java.util.HashMap) map2).remove(str);
        }
    }
}
