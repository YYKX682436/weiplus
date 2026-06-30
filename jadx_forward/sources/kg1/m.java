package kg1;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final kg1.g f389239a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f389240b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f389241c;

    public m(kg1.g gVar, java.lang.String str) {
        this.f389239a = gVar;
        this.f389241c = str;
    }

    public static kg1.m c(java.util.List list, java.lang.String str) {
        kg1.m mVar;
        kg1.m mVar2 = new kg1.m(new kg1.k(), "");
        mVar2.a(new kg1.m((kg1.g) list.get(0), ""));
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 1; i17 < list.size() - 1; i17++) {
            kg1.g gVar = (kg1.g) list.get(i17);
            int b17 = gVar.b();
            if (b17 <= 0) {
                int c17 = gVar.c();
                kg1.m mVar3 = new kg1.m(gVar, "");
                mVar2.a(mVar3);
                hashMap.put(java.lang.Integer.valueOf(c17), mVar3);
            } else {
                kg1.m mVar4 = (kg1.m) hashMap.get(java.lang.Integer.valueOf(b17));
                if (mVar4 != null && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.a()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.equals(gVar.a()))) {
                    kg1.g gVar2 = mVar4.f389239a;
                    if (d(gVar2)) {
                        if (mVar4.f389240b == null) {
                            mVar4.f389240b = new java.util.ArrayList();
                        }
                        java.lang.String str2 = gVar2.mo143394xfb85f7b0() == 3 ? "-" : ".";
                        java.lang.String str3 = mVar4.f389241c;
                        kg1.m mVar5 = new kg1.m(gVar, !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? java.lang.String.format("%s%s%d", str3, str2, java.lang.Integer.valueOf(((java.util.ArrayList) mVar4.f389240b).size() + 1)) : java.lang.String.format("%d", java.lang.Integer.valueOf(((java.util.ArrayList) mVar4.f389240b).size() + 1)));
                        ((java.util.ArrayList) mVar4.f389240b).add(mVar5);
                        mVar = mVar5;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StepNode", "addChild but not a node group");
                        mVar = null;
                    }
                    if (d(gVar)) {
                        hashMap.put(java.lang.Integer.valueOf(gVar.c()), mVar);
                    }
                }
            }
        }
        mVar2.a(new kg1.m((kg1.g) list.get(list.size() - 1), ""));
        return mVar2;
    }

    public static boolean d(kg1.g gVar) {
        return gVar.mo143394xfb85f7b0() == 3 || gVar.mo143394xfb85f7b0() == 2;
    }

    public static void e(kg1.m mVar, kg1.l lVar) {
        if (mVar == null || lVar == null) {
            return;
        }
        lVar.a(mVar);
        java.util.List list = mVar.f389240b;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            e((kg1.m) list.get(i17), lVar);
        }
    }

    public void a(kg1.m mVar) {
        if (!d(this.f389239a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StepNode", "addChild but not a node group");
            return;
        }
        if (this.f389240b == null) {
            this.f389240b = new java.util.ArrayList();
        }
        this.f389240b.add(mVar);
    }

    public kg1.a b() {
        kg1.g gVar = this.f389239a;
        if (gVar instanceof kg1.a) {
            return (kg1.a) gVar;
        }
        return null;
    }
}
