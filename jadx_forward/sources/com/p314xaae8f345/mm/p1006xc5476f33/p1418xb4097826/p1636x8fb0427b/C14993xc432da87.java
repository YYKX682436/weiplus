package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/storage/FinderConfigXLabData;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ConfigUpdatedEvent;", "<init>", "()V", "com/tencent/mm/plugin/finder/storage/m80", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigXLabData */
/* loaded from: classes5.dex */
public final class C14993xc432da87 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f207903d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f207904e;

    public C14993xc432da87() {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        this.f207903d = "FinderConfigXLabData";
        this.f207904e = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.n80.f208768d);
        mo48813x58998cd();
        this.f39173x3fe91575 = 320120113;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f207904e).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 c5281xaccc9f21) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.m80 m80Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5281xaccc9f21 event = c5281xaccc9f21;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.k3 k3Var = event.f135605g;
        java.lang.String str = k3Var.f88659a;
        if (!(str == null || str.length() == 0) && (m80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.m80) c().get(k3Var.f88659a)) != null) {
            java.lang.Object obj = m80Var.f208711b;
            boolean z17 = m80Var.f208712c;
            e42.b0 b0Var = m80Var.f208710a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f207903d, java.lang.Thread.currentThread().getName() + " config: " + b0Var + " has update to " + d(b0Var, obj, z17));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016e A[Catch: IllegalStateException -> 0x01a1, c -> 0x01dc, TryCatch #2 {c -> 0x01dc, IllegalStateException -> 0x01a1, blocks: (B:4:0x0020, B:6:0x0024, B:10:0x016e, B:11:0x0181, B:16:0x0040, B:18:0x0044, B:19:0x0060, B:21:0x0064, B:22:0x0080, B:24:0x0084, B:25:0x0099, B:27:0x009d, B:29:0x00b9, B:31:0x00bd, B:32:0x00d9, B:35:0x00e0, B:38:0x0101, B:39:0x00fd, B:40:0x0106, B:42:0x010a, B:43:0x0125, B:45:0x0129, B:46:0x013c, B:48:0x0140, B:51:0x0161, B:52:0x015d), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(e42.b0 r17, java.lang.Object r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14993xc432da87.d(e42.b0, java.lang.Object, boolean):java.lang.Object");
    }
}
