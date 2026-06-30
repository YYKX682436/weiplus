package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

/* loaded from: classes7.dex */
public final class f extends com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h {

    /* renamed from: e, reason: collision with root package name */
    public final int f129145e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f129146f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f129147g = new java.util.concurrent.atomic.AtomicBoolean(false);

    public f(int i17, java.lang.String str) {
        this.f129145e = i17;
        this.f129146f = str;
    }

    @Override // com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h
    public void a(android.os.Parcelable parcelable) {
        b(new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a(this.f129145e, 1, parcelable, null, null, 24, null));
    }

    public final void b(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3937x1adcb01a c3937x1adcb01a) {
        java.lang.String str = this.f129146f;
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnWXAppResultEventSender", "sendMessage, processName empty, message:" + c3937x1adcb01a.f129134e);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.o(this.f129146f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OnWXAppResultEventSender", "sendMessage, process dead, message:" + c3937x1adcb01a.f129134e + ", processName:" + this.f129146f + ", instance:" + this.f129145e);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnWXAppResultEventSender", "sendMessage, " + c3937x1adcb01a.f129135f + ", instance:" + c3937x1adcb01a.f129133d + ", action:" + c3937x1adcb01a.f129134e);
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.e eVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.e(this, c3937x1adcb01a);
        boolean g17 = com.p314xaae8f345.mm.p794xb0fa9b5e.d0.g(this.f129146f);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper()) || g17) {
            eVar.mo152xb9724478();
        } else {
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.c(eVar));
        }
    }
}
