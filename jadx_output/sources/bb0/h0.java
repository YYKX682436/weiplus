package bb0;

/* loaded from: classes4.dex */
public class h0 implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        l41.q2 q2Var = (l41.q2) ((j41.b0) i95.n0.c(j41.b0.class));
        q2Var.getClass();
        if (m1Var.getType() == 453 && i17 == 0 && i18 == 0) {
            l41.z zVar = (l41.z) m1Var;
            java.util.HashMap hashMap = q2Var.f315906d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(zVar.f315973f);
            java.lang.String str2 = zVar.f315974g;
            sb6.append(str2);
            int i19 = zVar.f315976i;
            sb6.append(i19);
            l41.p2 p2Var = (l41.p2) hashMap.get(sb6.toString());
            if (p2Var != null) {
                java.util.LinkedList linkedList = p2Var.f315898b;
                linkedList.clear();
                java.util.LinkedList linkedList2 = p2Var.f315897a;
                boolean isEmpty = linkedList2.isEmpty();
                java.lang.String str3 = zVar.f315973f;
                if (!isEmpty) {
                    while (linkedList.size() < 10 && !linkedList2.isEmpty()) {
                        linkedList.add((java.lang.String) linkedList2.removeFirst());
                    }
                    gm0.j1.n().f273288b.g(new l41.z(str3, str2, linkedList, i19));
                    return;
                }
                hashMap.remove(str3 + str2 + i19);
            }
        }
    }
}
