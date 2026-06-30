package bb0;

/* loaded from: classes4.dex */
public class h0 implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        l41.q2 q2Var = (l41.q2) ((j41.b0) i95.n0.c(j41.b0.class));
        q2Var.getClass();
        if (m1Var.mo808xfb85f7b0() == 453 && i17 == 0 && i18 == 0) {
            l41.z zVar = (l41.z) m1Var;
            java.util.HashMap hashMap = q2Var.f397439d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(zVar.f397506f);
            java.lang.String str2 = zVar.f397507g;
            sb6.append(str2);
            int i19 = zVar.f397509i;
            sb6.append(i19);
            l41.p2 p2Var = (l41.p2) hashMap.get(sb6.toString());
            if (p2Var != null) {
                java.util.LinkedList linkedList = p2Var.f397431b;
                linkedList.clear();
                java.util.LinkedList linkedList2 = p2Var.f397430a;
                boolean isEmpty = linkedList2.isEmpty();
                java.lang.String str3 = zVar.f397506f;
                if (!isEmpty) {
                    while (linkedList.size() < 10 && !linkedList2.isEmpty()) {
                        linkedList.add((java.lang.String) linkedList2.removeFirst());
                    }
                    gm0.j1.n().f354821b.g(new l41.z(str3, str2, linkedList, i19));
                    return;
                }
                hashMap.remove(str3 + str2 + i19);
            }
        }
    }
}
