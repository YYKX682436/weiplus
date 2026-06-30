package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes10.dex */
public final class e3 implements t21.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f270821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c35.p f270822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f270823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f270824d;

    public e3(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, c35.p pVar, java.lang.String str, java.lang.Object obj) {
        this.f270821a = c0Var;
        this.f270822b = pVar;
        this.f270823c = str;
        this.f270824d = obj;
    }

    @Override // t21.f0
    public void a(boolean z17, int i17) {
        this.f270821a.f391645d = z17;
        this.f270822b.f119791b = i17;
        f65.y0.f341552a.e(this.f270823c);
        java.lang.Object obj = this.f270824d;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImportVideoTransfer", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
