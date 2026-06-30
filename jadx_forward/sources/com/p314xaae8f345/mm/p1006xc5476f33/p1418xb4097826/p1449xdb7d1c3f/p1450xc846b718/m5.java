package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187238d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f187239e;

    public m5(java.lang.ref.WeakReference rHelper, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rHelper, "rHelper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f187238d = rHelper;
        this.f187239e = key;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o5 o5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o5) this.f187238d.get();
        jz5.f0 f0Var = null;
        if (o5Var != null) {
            o5Var.f187274c.mo147xb9724478(this.f187239e, o5Var.f187277f, o5Var.f187279h);
            o5Var.f187276e = "";
            o5Var.f187277f = "";
            o5Var.f187279h = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m5 m5Var = o5Var.f187278g;
            if (m5Var != null) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) o5Var.f187280i).mo141623x754a37bb()).mo50300x3fa464aa(m5Var);
            }
            o5Var.f187278g = null;
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RedDotFreqCtrlClickHelper", "ClickWatchTask run but Helper is null!");
        }
    }
}
