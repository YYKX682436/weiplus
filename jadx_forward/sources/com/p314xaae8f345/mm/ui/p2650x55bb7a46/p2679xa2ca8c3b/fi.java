package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class fi implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f285506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285507c;

    public fi(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.util.Map map, java.lang.ref.WeakReference weakReference) {
        this.f285507c = c21908xb66fd105;
        this.f285505a = map;
        this.f285506b = weakReference;
    }

    @Override // e31.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "try2HandleOtherTypeBizMsgLogic onError");
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285507c;
        if (str.equals(c21908xb66fd105.H)) {
            java.util.Map map = this.f285505a;
            if (c21908xb66fd105.g1(map)) {
                java.lang.ref.WeakReference weakReference = c21908xb66fd105.f284705l1;
                if (weakReference.get() != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "try2HandleOtherTypeBizMsgLogic onUpdated templateId: %s, isSubscribed: %b, switchOpen: %b, isShowVoipSetting:%b", str, java.lang.Boolean.valueOf(jVar.f328608a), java.lang.Boolean.valueOf(jVar.f328609b), java.lang.Boolean.valueOf(jVar.f328618k));
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd1052 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105) weakReference.get();
                    e31.j jVar2 = new e31.j(jVar.f328608a, jVar.f328609b);
                    c21908xb66fd1052.G = jVar2;
                    jVar2.f328611d = jVar.f328611d;
                    jVar2.f328610c = jVar.f328610c;
                    jVar2.f328612e = jVar.f328612e;
                    jVar2.f328613f = jVar.f328613f;
                    jVar2.f328614g = jVar.f328614g;
                    jVar2.f328615h = jVar.f328615h;
                    jVar2.f328618k = jVar.f328618k;
                    java.lang.ref.WeakReference weakReference2 = this.f285506b;
                    if (weakReference2.get() != null) {
                        c21908xb66fd105.v1((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as) weakReference2.get(), (jVar.f328608a && jVar.f328609b) ? 8 : 0, map);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = c21908xb66fd1052.f284714x0;
                    if (k0Var != null && k0Var.i()) {
                        c21908xb66fd1052.f284714x0.v();
                    }
                    sb5.g0 g0Var = (sb5.g0) c21908xb66fd1052.f284708s.f542241c.a(sb5.g0.class);
                    ((java.util.HashMap) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.n7) g0Var).f281089o).put(c21908xb66fd105.H, java.lang.Boolean.valueOf((jVar.f328608a && jVar.f328609b) ? false : true));
                }
            }
        }
    }
}
