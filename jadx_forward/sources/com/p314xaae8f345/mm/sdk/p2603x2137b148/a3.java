package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public final class a3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.o {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f273985f;

    public a3() {
        super(60L, 0, 2, null);
        this.f273985f = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.sdk.p2603x2137b148.z2.f274662d);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public void b(long j17, java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.y2 slot = (com.p314xaae8f345.mm.sdk.p2603x2137b148.y2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slot, "slot");
        slot.f274629b.clear();
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public boolean c(java.lang.Object obj, java.lang.String key) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.y2 slot = (com.p314xaae8f345.mm.sdk.p2603x2137b148.y2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slot, "slot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return slot.f274629b.contains(key);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public java.lang.Object g(java.lang.String slotKey, long j17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.y2 y2Var;
        synchronized (this) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotKey, "slotKey");
            y2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.y2) ((java.util.concurrent.ConcurrentHashMap) this.f273985f.mo141623x754a37bb()).get(slotKey);
            if (y2Var == null) {
                y2Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.y2();
                ((java.util.concurrent.ConcurrentHashMap) this.f273985f.mo141623x754a37bb()).put(slotKey, y2Var);
            }
        }
        return y2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public void j(java.lang.String slotKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotKey, "slotKey");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.y2 y2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.y2) ((java.util.concurrent.ConcurrentHashMap) this.f273985f.mo141623x754a37bb()).get(slotKey);
        if (y2Var == null) {
            return;
        }
        y2Var.f274628a = j17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.o
    public boolean l(java.lang.String slotKey, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(slotKey, "slotKey");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.y2 y2Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.y2) ((java.util.concurrent.ConcurrentHashMap) this.f273985f.mo141623x754a37bb()).get(slotKey);
        return y2Var != null && y2Var.f274628a == j17;
    }

    public final void m(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.y2) i()).f274629b.add(key);
    }

    public final boolean n(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return d(key) != null;
    }
}
