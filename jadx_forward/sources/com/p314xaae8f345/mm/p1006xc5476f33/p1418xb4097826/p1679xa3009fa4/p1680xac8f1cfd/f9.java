package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class f9 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f215907a;

    /* renamed from: b, reason: collision with root package name */
    public long f215908b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f215909c;

    /* renamed from: d, reason: collision with root package name */
    public long f215910d;

    /* renamed from: e, reason: collision with root package name */
    public long f215911e;

    public f9() {
        super(android.os.Looper.getMainLooper());
        this.f215907a = true;
        this.f215908b = -1L;
        this.f215910d = -1L;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (!this.f215907a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescPanelUIC", "skip carousel timer event when disable");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DescPanelUIC", "handlerMessage for timer after ");
        if (msg.what == 1) {
            java.lang.Object obj = msg.obj;
            java.lang.ref.WeakReference weakReference = obj instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) obj : null;
            java.lang.Object obj2 = weakReference != null ? weakReference.get() : null;
            in5.s0 s0Var = obj2 instanceof in5.s0 ? (in5.s0) obj2 : null;
            if (s0Var == null) {
                return;
            }
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
            if (c15447x4ebc90c2 != null) {
                c15447x4ebc90c2.f7(s0Var);
            }
        }
    }
}
