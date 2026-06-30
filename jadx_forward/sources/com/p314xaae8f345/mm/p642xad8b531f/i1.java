package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p642xad8b531f.i1 f144931d = new com.p314xaae8f345.mm.p642xad8b531f.i1();

    public i1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p642xad8b531f.b1 pending = (com.p314xaae8f345.mm.p642xad8b531f.b1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pending, "pending");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exe pending ");
        sb6.append(pending.f144841a);
        sb6.append(" withKernel: syncNum=");
        android.content.Intent intent = pending.f144842b;
        sb6.append(intent.getLongExtra("notfiy_sync_num", 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.NotifyReceiver", sb6.toString());
        com.p314xaae8f345.mm.p642xad8b531f.x1.f145125a.c(intent);
        return java.lang.Boolean.TRUE;
    }
}
