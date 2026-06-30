package g4;

/* loaded from: classes5.dex */
public final class f3 {

    /* renamed from: e, reason: collision with root package name */
    public static final g4.f3 f349824e = new g4.f3(g4.i1.f349900f);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f349825a;

    /* renamed from: b, reason: collision with root package name */
    public int f349826b;

    /* renamed from: c, reason: collision with root package name */
    public int f349827c;

    /* renamed from: d, reason: collision with root package name */
    public int f349828d;

    public f3(g4.i1 insertEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insertEvent, "insertEvent");
        java.util.List list = insertEvent.f349903b;
        this.f349825a = kz5.n0.V0(list);
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((g4.x4) it.next()).f350153b.size();
        }
        this.f349826b = i17;
        this.f349827c = insertEvent.f349904c;
        this.f349828d = insertEvent.f349905d;
    }

    public final g4.z4 a(int i17) {
        java.util.List list;
        java.util.ArrayList arrayList;
        int i18 = i17 - this.f349827c;
        int i19 = 0;
        while (true) {
            list = this.f349825a;
            arrayList = (java.util.ArrayList) list;
            if (i18 < ((g4.x4) arrayList.get(i19)).f350153b.size() || i19 >= kz5.c0.h(list)) {
                break;
            }
            i18 -= ((g4.x4) ((java.util.ArrayList) list).get(i19)).f350153b.size();
            i19++;
        }
        g4.x4 x4Var = (g4.x4) arrayList.get(i19);
        int i27 = i17 - this.f349827c;
        int d17 = ((d() - i17) - this.f349828d) - 1;
        java.lang.Integer j07 = kz5.z.j0(((g4.x4) kz5.n0.X(list)).f350152a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j07);
        int intValue = j07.intValue();
        java.lang.Integer h07 = kz5.z.h0(((g4.x4) kz5.n0.i0(list)).f350152a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h07);
        int intValue2 = h07.intValue();
        int i28 = x4Var.f350154c;
        java.util.List list2 = x4Var.f350155d;
        if (list2 != null && kz5.c0.g(list2).m(i18)) {
            i18 = ((java.lang.Number) list2.get(i18)).intValue();
        }
        return new g4.z4(i28, i18, i27, d17, intValue, intValue2);
    }

    public final int b(e06.k kVar) {
        boolean z17;
        java.util.Iterator it = ((java.util.ArrayList) this.f349825a).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            g4.x4 x4Var = (g4.x4) it.next();
            int[] iArr = x4Var.f350152a;
            int length = iArr.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z17 = false;
                    break;
                }
                if (kVar.m(iArr[i18])) {
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (z17) {
                i17 += x4Var.f350153b.size();
                it.remove();
            }
        }
        return i17;
    }

    public java.lang.Object c(int i17) {
        java.util.List list = this.f349825a;
        int size = ((java.util.ArrayList) list).size();
        int i18 = 0;
        while (i18 < size) {
            int size2 = ((g4.x4) ((java.util.ArrayList) list).get(i18)).f350153b.size();
            if (size2 > i17) {
                break;
            }
            i17 -= size2;
            i18++;
        }
        return ((g4.x4) ((java.util.ArrayList) list).get(i18)).f350153b.get(i17);
    }

    public int d() {
        return this.f349827c + this.f349826b + this.f349828d;
    }

    /* renamed from: toString */
    public java.lang.String m130837x9616526c() {
        int i17 = this.f349826b;
        java.util.ArrayList arrayList = new java.util.ArrayList(i17);
        for (int i18 = 0; i18 < i17; i18++) {
            arrayList.add(c(i18));
        }
        return "[(" + this.f349827c + " placeholders), " + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + this.f349828d + " placeholders)]";
    }
}
