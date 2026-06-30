package gr;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final gr.o f356206c = new gr.o(null);

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 f356207a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f356208b = new java.util.LinkedList();

    public p(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 c21052x34cf13a3) {
        this.f356207a = c21052x34cf13a3;
    }

    public static final void a(r45.u45 u45Var) {
        java.util.LinkedList linkedList;
        r45.wj0 wj0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateGroupIpInfo: ip:");
        java.lang.String str = null;
        sb6.append((u45Var == null || (wj0Var = u45Var.f468558d) == null) ? null : wj0Var.f470752g);
        sb6.append(", group:[");
        if (u45Var != null && (linkedList = u45Var.f468559e) != null) {
            str = kz5.n0.g0(linkedList, null, null, null, 0, null, null, 63, null);
        }
        sb6.append(str);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiIPSetGroupInfo", sb6.toString());
        if (u45Var == null) {
            return;
        }
        z85.g gVar = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3.f275424v;
        r45.wj0 EmotionSetInfo = u45Var.f468558d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(EmotionSetInfo, "EmotionSetInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 a17 = gVar.a(EmotionSetInfo);
        java.lang.String str2 = a17.f68543x4b6e619a;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().f276712q.z0(a17);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = u45Var.f468559e;
        if (linkedList3 != null) {
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 f17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().f1((java.lang.String) it.next(), false);
                if (f17 != null) {
                    f17.f68380x29449433 = a17.f68543x4b6e619a;
                    linkedList2.add(f17);
                }
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b().P1(linkedList2);
    }
}
