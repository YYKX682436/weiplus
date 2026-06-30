package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f175851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f175853f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f175851d = h0Var;
        this.f175852e = str;
        this.f175853f = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.lang.String str = (java.lang.String) obj;
        java.util.concurrent.locks.ReentrantLock reentrantLock = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175906c;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f175851d;
        java.lang.String str2 = this.f175852e;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f175853f;
        reentrantLock.lock();
        if (str != null) {
            try {
                if (str.length() != 0) {
                    z17 = false;
                    if (!z17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "null") && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "undefined")) {
                        h0Var.f391656d = "_manifest_" + com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.j(str2) + '_' + str;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175907d.signalAll();
                    c0Var.f391645d = false;
                    reentrantLock.unlock();
                    return jz5.f0.f384359a;
                }
            } catch (java.lang.Throwable th6) {
                reentrantLock.unlock();
                throw th6;
            }
        }
        z17 = true;
        if (!z17) {
            h0Var.f391656d = "_manifest_" + com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.j(str2) + '_' + str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n3.f175907d.signalAll();
        c0Var.f391645d = false;
        reentrantLock.unlock();
        return jz5.f0.f384359a;
    }
}
