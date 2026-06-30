package y02;

/* loaded from: classes9.dex */
public final class r1 {
    public r1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final y02.p1 a(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        y02.s1 s1Var = new y02.s1();
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            y02.f0 f0Var = (y02.f0) entry.getValue();
            arrayList.add(str);
            arrayList2.add(f0Var);
        }
        s1Var.f540161d = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        s1Var.f540163f = (y02.f0[]) arrayList2.toArray(new y02.f0[0]);
        return s1Var;
    }

    public final y02.p1 b(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        y02.s1 s1Var = new y02.s1();
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            arrayList.add(str);
            arrayList2.add(str2);
        }
        s1Var.f540161d = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        s1Var.f540162e = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        return s1Var;
    }
}
