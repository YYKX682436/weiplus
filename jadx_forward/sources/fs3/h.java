package fs3;

/* loaded from: classes5.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f347837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d f347838e;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d, java.util.LinkedList linkedList) {
        this.f347838e = activityC16925x87b5f55d;
        this.f347837d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1969xba0ec162.ui.ActivityC16925x87b5f55d activityC16925x87b5f55d = this.f347838e;
        java.util.LinkedList linkedList = activityC16925x87b5f55d.f236306z;
        if (linkedList != null) {
            linkedList.clear();
        }
        java.util.HashMap hashMap = activityC16925x87b5f55d.f236305y;
        if (hashMap != null) {
            hashMap.clear();
        }
        java.util.LinkedList linkedList2 = this.f347837d;
        if (linkedList2 != null && linkedList2.size() > 0) {
            int size = linkedList2.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.yo0 yo0Var = (r45.yo0) linkedList2.get(i17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yo0Var.f472785e)) {
                    activityC16925x87b5f55d.f236305y.put(yo0Var.f472785e, yo0Var);
                }
            }
        }
        int size2 = activityC16925x87b5f55d.f236303x.size();
        for (int i18 = 0; i18 < size2; i18++) {
            r45.yo0 yo0Var2 = (r45.yo0) activityC16925x87b5f55d.f236303x.get(i18);
            if (activityC16925x87b5f55d.f236305y.containsKey(yo0Var2.f472785e)) {
                activityC16925x87b5f55d.f236305y.remove(yo0Var2.f472785e);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(yo0Var2.f472785e);
                sb6.append("");
            }
        }
        java.util.HashMap hashMap2 = activityC16925x87b5f55d.f236305y;
        if (hashMap2 != null && hashMap2.size() > 0) {
            java.util.Iterator it = activityC16925x87b5f55d.f236305y.entrySet().iterator();
            while (it.hasNext()) {
                r45.yo0 yo0Var3 = (r45.yo0) ((java.util.Map.Entry) it.next()).getValue();
                activityC16925x87b5f55d.f236306z.add(yo0Var3);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(yo0Var3.f472785e);
                sb7.append("");
            }
        }
        activityC16925x87b5f55d.f236303x.addAll(activityC16925x87b5f55d.f236306z);
        activityC16925x87b5f55d.P.mo50305x3d8a09a2(10001);
    }
}
