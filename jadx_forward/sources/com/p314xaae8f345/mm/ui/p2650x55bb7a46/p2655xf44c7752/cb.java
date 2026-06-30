package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public final class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f282375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f282376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282378g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f282379h;

    public cb(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f282375d = h0Var;
        this.f282376e = i17;
        this.f282377f = i18;
        this.f282378g = str;
        this.f282379h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v vVar = (com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v) ((java.lang.ref.WeakReference) this.f282375d.f391656d).get();
        if (vVar != null) {
            vVar.a(this.f282376e, this.f282377f, this.f282378g, this.f282379h);
        }
    }
}
