package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class tq extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public xj.m f243120d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f243121e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f243122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243122f = "";
    }

    public final void O6() {
        byte[] bytes = ("" + java.lang.System.currentTimeMillis()).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getMessageDigest(...)");
        this.f243122f = g17;
    }

    public final void P6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qq event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("crt_pic_sessionid", this.f243122f);
        event.a(hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event.f243021a, hashMap, 35480);
    }

    public final void Q6() {
        xj.m mVar;
        if (this.f243121e && (mVar = this.f243120d) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoAvatarUIC", "reportAdExposeEnd: aid=" + mVar.f536286a);
            i95.m c17 = i95.n0.c(xj.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xj.i.gg((xj.i) c17, mVar.f536286a, wj.w0.f528075e, null, 4, null);
            this.f243121e = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (!(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.C20836xa6d0acd2()) == 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoAvatarUIC", "prefetchAdInfo: RepairerConfig disabled, skip");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoAvatarUIC", "prefetchAdInfo: start async fetch");
            ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Vi(wj.t0.M, 0L, new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.lq(new java.lang.ref.WeakReference(this)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0138  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onNewIntent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2280xc944513d(android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq.mo2280xc944513d(android.content.Intent):void");
    }
}
