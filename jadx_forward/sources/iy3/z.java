package iy3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/z;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/plugin/rtos/model/RtosQuickReplyList;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class z implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1 c17251x5d26c8a1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17251x5d26c8a1) obj;
        my3.c0 a17 = my3.c0.f414317k.a();
        java.util.ArrayList arrayList = c17251x5d26c8a1 != null ? c17251x5d26c8a1.f240117d : null;
        if (a17.f414322d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncQuickReply ");
            sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", sb6.toString());
            if (arrayList != null) {
                int size = arrayList.size();
                java.lang.String[] strArr = new java.lang.String[size];
                for (int i17 = 0; i17 < size; i17++) {
                    java.lang.Object obj2 = arrayList.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    strArr[i17] = ((com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.p2036x633fb29.C17250x7f5e0d63) obj2).f240116e;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchService", "replies " + java.lang.Integer.valueOf(size));
                com.p314xaae8f345.p3133xd0ce8b26.p3170x3593a6.C27663xee5e94d4 c27663xee5e94d4 = a17.f414320b;
                if (c27663xee5e94d4 != null) {
                    c27663xee5e94d4.m119286xa46a6b4a(strArr);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Rtos.RtosWatchService", "syncQuickReply but not init");
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
