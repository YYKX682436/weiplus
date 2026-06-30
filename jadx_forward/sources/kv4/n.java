package kv4;

/* loaded from: classes12.dex */
public final class n implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.e f394249a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f394250b;

    public n(mv4.e data, kv4.m delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f394249a = data;
        this.f394250b = delegate;
    }

    @Override // jv4.j
    public int a() {
        mv4.e eVar = this.f394249a;
        if (!((rv4.h) eVar).j()) {
            return 0;
        }
        if (((rv4.h) eVar).f482015k) {
            return 2;
        }
        return (((rv4.h) eVar).f482017m ? ((java.util.ArrayList) mo141453x749b8e0a()).size() : java.lang.Math.min(((java.util.ArrayList) mo141453x749b8e0a()).size(), ((rv4.h) eVar).f482013i / 2)) + 1;
    }

    @Override // jv4.j
    /* renamed from: getItems */
    public java.util.List mo141453x749b8e0a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        mv4.e eVar = this.f394249a;
        boolean j17 = ((rv4.h) eVar).j();
        kv4.m mVar = this.f394250b;
        if (j17) {
            arrayList.add(new lv4.m(mVar, eVar));
        }
        if (((rv4.h) eVar).f482015k) {
            arrayList.add(new lv4.c());
            return arrayList;
        }
        int i17 = 0;
        for (java.lang.Object obj : kz5.n0.N(((rv4.h) eVar).f482011g, 2)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new kv4.r(i17, eVar, (java.util.List) obj, mVar));
            i17 = i18;
        }
        return arrayList;
    }
}
