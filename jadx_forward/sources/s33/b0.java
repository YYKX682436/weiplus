package s33;

/* loaded from: classes9.dex */
public class b0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s33.d0 f484010d;

    public b0(s33.d0 d0Var) {
        this.f484010d = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ye I;
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if ((mo808xfb85f7b0 == 697) && (m1Var instanceof z12.b)) {
            z12.b bVar = (z12.b) m1Var;
            if (i17 == 0 && i18 == 0 && (I = ((z12.h) bVar).I()) != null) {
                java.util.LinkedList linkedList = I.f472541g;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    return;
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = ((r45.ri0) it.next()).f466419d;
                    s33.d0 d0Var = this.f484010d;
                    d0Var.getClass();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        java.util.List list = (java.util.List) ((java.util.HashMap) d0Var.f484017a).get(str2);
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
                            continue;
                        } else {
                            java.util.Iterator it6 = list.iterator();
                            if (it6.hasNext()) {
                                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
                                throw null;
                            }
                        }
                    }
                }
            }
        }
    }
}
