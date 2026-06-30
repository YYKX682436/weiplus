package kv4;

/* loaded from: classes12.dex */
public final class t implements jv4.j {

    /* renamed from: a, reason: collision with root package name */
    public final rv4.p f394261a;

    /* renamed from: b, reason: collision with root package name */
    public final kv4.m f394262b;

    public t(rv4.p data, kv4.m delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f394261a = data;
        this.f394262b = delegate;
        data.n(rv4.r.f482084d, 0, new kv4.s(this));
    }

    @Override // jv4.j
    public int a() {
        if (this.f394261a.h()) {
            return ((java.util.ArrayList) mo141453x749b8e0a()).size();
        }
        return 0;
    }

    @Override // jv4.j
    /* renamed from: getItems */
    public java.util.List mo141453x749b8e0a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv4.p pVar = this.f394261a;
        if (!pVar.h()) {
            return arrayList;
        }
        kv4.m mVar = this.f394262b;
        arrayList.add(new kv4.f0(pVar, mVar));
        int i17 = 0;
        for (java.lang.Object obj : kz5.n0.N(pVar.f482061c, 2)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            arrayList.add(new kv4.b0(i17, mVar, (java.util.List) obj, pVar));
            i17 = i18;
        }
        return arrayList;
    }
}
