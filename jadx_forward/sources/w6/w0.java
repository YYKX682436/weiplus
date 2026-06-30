package w6;

/* loaded from: classes13.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final m3.e f524776a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f524777b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f524778c;

    public w0(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.util.List list, m3.e eVar) {
        this.f524776a = eVar;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Must not be empty.");
        }
        this.f524777b = list;
        this.f524778c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public w6.z0 a(u6.g gVar, t6.l lVar, int i17, int i18, w6.u uVar) {
        m3.e eVar = this.f524776a;
        java.lang.Object a17 = eVar.a();
        q7.n.b(a17);
        java.util.List list = (java.util.List) a17;
        try {
            java.util.List list2 = this.f524777b;
            int size = list2.size();
            w6.z0 z0Var = null;
            for (int i19 = 0; i19 < size; i19++) {
                try {
                    z0Var = ((w6.v) list2.get(i19)).a(gVar, i17, i18, lVar, uVar);
                } catch (w6.t0 e17) {
                    list.add(e17);
                }
                if (z0Var != null) {
                    break;
                }
            }
            if (z0Var != null) {
                return z0Var;
            }
            throw new w6.t0(this.f524778c, new java.util.ArrayList(list));
        } finally {
            eVar.b(list);
        }
    }

    /* renamed from: toString */
    public java.lang.String m173252x9616526c() {
        return "LoadPath{decodePaths=" + java.util.Arrays.toString(this.f524777b.toArray()) + '}';
    }
}
