package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ei implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f285415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f285416b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f285417c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f285418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285420f;

    public ei(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.util.Map map, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.ref.WeakReference weakReference, rd5.d dVar, java.lang.String str) {
        this.f285420f = c21908xb66fd105;
        this.f285415a = map;
        this.f285416b = f9Var;
        this.f285417c = weakReference;
        this.f285418d = dVar;
        this.f285419e = str;
    }

    @Override // e31.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "getSubscribeStatus onError");
    }

    @Override // e31.i
    public void b(java.lang.String str, e31.j jVar) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f285420f;
        if (str.equals(c21908xb66fd105.H)) {
            java.lang.ref.WeakReference weakReference = c21908xb66fd105.f284705l1;
            if (weakReference.get() != null) {
                boolean z17 = jVar.f328608a;
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
                java.lang.ref.WeakReference weakReference2 = this.f285417c;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq xqVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq) weakReference2.get();
                java.util.Map map = this.f285415a;
                if (xqVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "tplHolder ref is not alive");
                } else {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar = xqVar.f287541d;
                    if (jVar.f328608a && jVar.f328609b) {
                        c21908xb66fd105.v1(asVar, 8, map);
                        asVar.T.setText(c21908xb66fd105.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hd_));
                    } else {
                        c21908xb66fd105.v1(asVar, 0, map);
                        asVar.T.setText(c21908xb66fd105.f284708s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hda));
                    }
                    asVar.S.setTag(com.p314xaae8f345.mm.R.id.k7s, this.f285416b);
                }
                if (weakReference2.get() != null) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.r0(c21908xb66fd105, (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq) weakReference2.get(), map, this.f285418d, this.f285419e);
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
