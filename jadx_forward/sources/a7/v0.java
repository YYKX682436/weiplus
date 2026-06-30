package a7;

/* loaded from: classes13.dex */
public class v0 implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f83405a;

    /* renamed from: b, reason: collision with root package name */
    public final m3.e f83406b;

    public v0(java.util.List list, m3.e eVar) {
        this.f83405a = list;
        this.f83406b = eVar;
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        java.util.Iterator it = this.f83405a.iterator();
        while (it.hasNext()) {
            if (((a7.p0) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        a7.o0 b17;
        java.util.List list = this.f83405a;
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        t6.h hVar = null;
        for (int i19 = 0; i19 < size; i19++) {
            a7.p0 p0Var = (a7.p0) list.get(i19);
            if (p0Var.a(obj) && (b17 = p0Var.b(obj, i17, i18, lVar)) != null) {
                arrayList.add(b17.f83381c);
                hVar = b17.f83379a;
            }
        }
        if (arrayList.isEmpty() || hVar == null) {
            return null;
        }
        return new a7.o0(hVar, new a7.u0(arrayList, this.f83406b));
    }

    /* renamed from: toString */
    public java.lang.String m763x9616526c() {
        return "MultiModelLoader{modelLoaders=" + java.util.Arrays.toString(this.f83405a.toArray()) + '}';
    }
}
