package us;

@j95.b
/* loaded from: classes4.dex */
public class a extends i95.w implements vs.e {
    public java.util.List Ai() {
        java.util.Set<java.util.Map.Entry> entrySet = ((java.util.HashMap) g81.e.Ai().wi().f276551d).entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : entrySet) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) entry.getValue())) {
                arrayList.add((java.lang.String) entry.getKey());
            }
        }
        return arrayList;
    }

    public void Bi(java.lang.String str, int i17, java.lang.String str2) {
        g81.e.Ai().wi().D0(str, i17, str2);
    }

    public void wi(java.util.List list) {
        com.p314xaae8f345.mm.p2621x8fb0427b.i wi6 = g81.e.Ai().wi();
        wi6.getClass();
        if (list == null || list.size() == 0) {
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = wi6.f276552e;
        long F = k0Var.F(valueOf);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            wi6.mo11260x413cb2b4((dm.o) it.next());
        }
        k0Var.w(java.lang.Long.valueOf(F));
    }
}
