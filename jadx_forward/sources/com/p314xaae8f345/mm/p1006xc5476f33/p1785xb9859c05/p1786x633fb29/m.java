package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes14.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f224014b;

    /* renamed from: a, reason: collision with root package name */
    public int f224015a = -1;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f224014b = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(12);
        hashMap.put(1, arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(12);
        arrayList2.add(8);
        hashMap.put(2, arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        arrayList3.add(5);
        arrayList3.add(8);
        arrayList3.add(12);
        hashMap.put(3, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(5);
        arrayList4.add(8);
        arrayList4.add(12);
        hashMap.put(4, arrayList4);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(9);
        arrayList5.add(10);
        arrayList5.add(11);
        hashMap.put(5, arrayList5);
    }

    public static java.lang.String e(int i17) {
        switch (i17) {
            case -1:
                return "RESET_STATE";
            case 0:
            case 6:
            case 7:
            default:
                return i17 + "";
            case 1:
                return "START_INVITE";
            case 2:
                return "INVITE_FAILED";
            case 3:
                return "INVITE_SUCCESS";
            case 4:
                return "RING_ING";
            case 5:
                return "USER_ACCEPT";
            case 8:
                return "USER_CANCEL";
            case 9:
                return "USER_SELF_SHUTDOWN";
            case 10:
                return "OTHER_SIDE_USER_SHUTDOWN";
            case 11:
                return "USER_SELF_SHUTDOWN_BY_ERR";
            case 12:
                return "CANCEL_BY_ERR";
        }
    }

    public java.lang.String a() {
        return e(this.f224015a);
    }

    public boolean b() {
        int i17 = this.f224015a;
        return i17 == 4 || i17 == 5;
    }

    public boolean c() {
        return this.f224015a == 5;
    }

    public boolean d() {
        int i17 = this.f224015a;
        return i17 == 1 || i17 == 3 || i17 == 4 || i17 == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(int r5) {
        /*
            r4 = this;
            int r0 = r4.f224015a
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L9
        L7:
            r0 = r3
            goto L2f
        L9:
            java.util.Map r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.m.f224014b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.HashMap r1 = (java.util.HashMap) r1
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L2e
            int r0 = r4.f224015a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2e
            goto L7
        L2e:
            r0 = r2
        L2f:
            java.lang.String r1 = "MicroMsg.IPCallStateIndicator"
            if (r0 == 0) goto L49
            int r0 = r4.f224015a
            java.lang.String r0 = e(r0)
            java.lang.String r2 = e(r5)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "updateState, origin: %s, new: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            r4.f224015a = r5
            return r3
        L49:
            com.tencent.mm.plugin.ipcall.model.m r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj()
            java.lang.String r0 = r0.a()
            java.lang.String r5 = e(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}
            java.lang.String r0 = "transform state error, origin state: %s, new state: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.m.f(int):boolean");
    }
}
