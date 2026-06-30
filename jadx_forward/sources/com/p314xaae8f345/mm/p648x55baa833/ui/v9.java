package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public final class v9 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 f146136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f146137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f146138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f146139g;

    public v9(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0, boolean z17, boolean z18, boolean z19) {
        this.f146136d = activityC10359x5d5d51f0;
        this.f146137e = z17;
        this.f146138f = z18;
        this.f146139g = z19;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        mo.b v07;
        mo.b v08;
        int i17 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0.f145403q;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10359x5d5d51f0 activityC10359x5d5d51f0 = this.f146136d;
        activityC10359x5d5d51f0.getClass();
        java.lang.String r17 = c01.z1.r();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 V6 = activityC10359x5d5d51f0.V6();
        java.lang.String str2 = null;
        java.lang.Integer valueOf = (V6 == null || (v08 = V6.v0(r17)) == null) ? null : java.lang.Integer.valueOf(v08.f411782f);
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 V62 = activityC10359x5d5d51f0.V6();
        if (V62 != null) {
            mo.a F0 = V62.F0();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = F0.f411772d.iterator();
            while (it.hasNext()) {
                mo.b bVar = (mo.b) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r17, bVar.f411780d)) {
                    int i18 = this.f146137e ? bVar.f411782f & (-1048577) : bVar.f411782f | 1048576;
                    bVar.f411782f = i18;
                    int i19 = this.f146138f ? i18 & (-2097153) : i18 | 2097152;
                    bVar.f411782f = i19;
                    bVar.f411782f = this.f146139g ? i19 & (-4194305) : i19 | 4194304;
                }
                linkedList.add(bVar);
            }
            F0.f411772d = linkedList;
            V62.Z0(activityC10359x5d5d51f0.X6(), F0, false);
            c01.v1.M(V62);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String X6 = activityC10359x5d5d51f0.X6();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (X6 == null) {
            X6 = "";
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(X6);
        java.lang.Integer valueOf2 = (z07 == null || (v07 = z07.v0(r17)) == null) ? null : java.lang.Integer.valueOf(v07.f411782f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ChatroomMuteRefine setNeedNotify roomFlag old: 0x");
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            r26.a.a(16);
            str = java.lang.Integer.toString(intValue, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", new: 0x");
        if (valueOf2 != null) {
            int intValue2 = valueOf2.intValue();
            r26.a.a(16);
            str2 = java.lang.Integer.toString(intValue2, 16);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
        }
        sb6.append(str2);
        sb6.append(", roomName:");
        sb6.append(activityC10359x5d5d51f0.X6());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", sb6.toString());
    }
}
