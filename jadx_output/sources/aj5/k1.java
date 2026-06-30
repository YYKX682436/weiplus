package aj5;

/* loaded from: classes.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final aj5.k1 f5463d = new aj5.k1();

    public k1() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.storage.a3 z07;
        java.util.List A0;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.i iVar = (wi5.i) state.a(wi5.i.class);
        if (iVar != null) {
            com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
            java.lang.String str = iVar.f446293b;
            int size = (a17 == null || (z07 = a17.z0(str)) == null || (A0 = z07.A0()) == null) ? 0 : A0.size();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.putAll(state.F);
            int i17 = iVar.f446294c;
            linkedHashMap.put("group_index", java.lang.String.valueOf(i17));
            linkedHashMap.put("chat_username", str);
            if (kotlin.jvm.internal.o.b(linkedHashMap.get("appear_type"), "4")) {
                linkedHashMap.put("group_index", java.lang.Integer.valueOf(i17 + 1));
            } else {
                linkedHashMap.put("group_index", java.lang.Integer.valueOf(i17));
            }
            linkedHashMap.put("group_member_num", java.lang.Integer.valueOf(size));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, linkedHashMap, 35568);
        }
        return jz5.f0.f302826a;
    }
}
