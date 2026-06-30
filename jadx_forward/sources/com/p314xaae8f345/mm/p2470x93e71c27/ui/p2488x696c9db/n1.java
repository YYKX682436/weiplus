package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public final class n1 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s1 implements o13.x {

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f273313o;

    /* renamed from: p, reason: collision with root package name */
    public p13.c f273314p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f273315q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273316r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a2 adapter) {
        super(activityC19730xa7b9756f, adapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f273316r = activityC19730xa7b9756f;
        this.f273313o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f273315q = new java.util.ArrayList();
    }

    @Override // o13.x
    public void X2(p13.v ftsResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsResult, "ftsResult");
        int i17 = ftsResult.f432691c;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FileSelectorUI", "get msgId fail, errorCode:" + ftsResult.f432691c);
        } else if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileSelectorUI", "onFTSSearchEnd, size:" + ftsResult.f432693e.size());
            java.util.Iterator it = ftsResult.f432693e.iterator();
            while (it.hasNext()) {
                ((java.util.ArrayList) this.f273315q).add(java.lang.Long.valueOf(((p13.y) it.next()).f432719d));
            }
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n1.d():void");
    }
}
