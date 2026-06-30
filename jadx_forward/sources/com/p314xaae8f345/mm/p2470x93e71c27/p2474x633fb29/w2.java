package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29;

/* loaded from: classes5.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f271023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x2 f271024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f271025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x2 x2Var, java.lang.Object obj) {
        super(1);
        this.f271023d = c0Var;
        this.f271024e = x2Var;
        this.f271025f = obj;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        this.f271023d.f391645d = ((java.lang.Boolean) obj).booleanValue();
        this.f271024e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImportFavVideo", "transcodeVideo ret callback:" + this.f271023d.f391645d);
        java.lang.Object obj2 = this.f271025f;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.x2 x2Var = this.f271024e;
        synchronized (obj2) {
            try {
                obj2.notifyAll();
            } catch (java.lang.Exception e17) {
                x2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImportFavVideo", e17, "", new java.lang.Object[0]);
            }
        }
        return jz5.f0.f384359a;
    }
}
