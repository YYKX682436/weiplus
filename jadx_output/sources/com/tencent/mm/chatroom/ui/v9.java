package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public final class v9 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI f64603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f64604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f64605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f64606g;

    public v9(com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI, boolean z17, boolean z18, boolean z19) {
        this.f64603d = roomStillNotifyMessageManagerUI;
        this.f64604e = z17;
        this.f64605f = z18;
        this.f64606g = z19;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        mo.b v07;
        mo.b v08;
        int i17 = com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI.f63870q;
        com.tencent.mm.chatroom.ui.RoomStillNotifyMessageManagerUI roomStillNotifyMessageManagerUI = this.f64603d;
        roomStillNotifyMessageManagerUI.getClass();
        java.lang.String r17 = c01.z1.r();
        com.tencent.mm.storage.a3 V6 = roomStillNotifyMessageManagerUI.V6();
        java.lang.String str2 = null;
        java.lang.Integer valueOf = (V6 == null || (v08 = V6.v0(r17)) == null) ? null : java.lang.Integer.valueOf(v08.f330249f);
        com.tencent.mm.storage.a3 V62 = roomStillNotifyMessageManagerUI.V6();
        if (V62 != null) {
            mo.a F0 = V62.F0();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = F0.f330239d.iterator();
            while (it.hasNext()) {
                mo.b bVar = (mo.b) it.next();
                if (kotlin.jvm.internal.o.b(r17, bVar.f330247d)) {
                    int i18 = this.f64604e ? bVar.f330249f & (-1048577) : bVar.f330249f | 1048576;
                    bVar.f330249f = i18;
                    int i19 = this.f64605f ? i18 & (-2097153) : i18 | 2097152;
                    bVar.f330249f = i19;
                    bVar.f330249f = this.f64606g ? i19 & (-4194305) : i19 | 4194304;
                }
                linkedList.add(bVar);
            }
            F0.f330239d = linkedList;
            V62.Z0(roomStillNotifyMessageManagerUI.X6(), F0, false);
            c01.v1.M(V62);
        }
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String X6 = roomStillNotifyMessageManagerUI.X6();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (X6 == null) {
            X6 = "";
        }
        com.tencent.mm.storage.a3 z07 = a17.z0(X6);
        java.lang.Integer valueOf2 = (z07 == null || (v07 = z07.v0(r17)) == null) ? null : java.lang.Integer.valueOf(v07.f330249f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ChatroomMuteRefine setNeedNotify roomFlag old: 0x");
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            r26.a.a(16);
            str = java.lang.Integer.toString(intValue, 16);
            kotlin.jvm.internal.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", new: 0x");
        if (valueOf2 != null) {
            int intValue2 = valueOf2.intValue();
            r26.a.a(16);
            str2 = java.lang.Integer.toString(intValue2, 16);
            kotlin.jvm.internal.o.f(str2, "toString(...)");
        }
        sb6.append(str2);
        sb6.append(", roomName:");
        sb6.append(roomStillNotifyMessageManagerUI.X6());
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomStillNotifyMessageManagerUI", sb6.toString());
    }
}
