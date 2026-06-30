package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l85.n0 f144965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f144966e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(l85.n0 n0Var, java.util.List list) {
        super(1);
        this.f144965d = n0Var;
        this.f144966e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p642xad8b531f.l0 pending = (com.p314xaae8f345.mm.p642xad8b531f.l0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pending, "pending");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exe pending ");
        sb6.append(pending.f144943a);
        sb6.append(" startService: syncNum=");
        android.content.Intent intent = pending.f144945c;
        sb6.append(intent.getLongExtra("notfiy_sync_num", 0L));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushToMain.MMServiceHelperKt", sb6.toString());
        try {
            this.f144965d.mo145315x6e4047f3(intent);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.MMServiceHelperKt", "exe pending err: " + e17.getMessage());
            if (pending.f144946d) {
                intent.putExtra("notify_service_retry", intent.getIntExtra("notify_service_retry", 0) + 1);
                this.f144966e.add(pending);
                l85.l1.a(5L, 1L, false);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
