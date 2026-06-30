package cw2;

/* loaded from: classes10.dex */
public final class y3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b f305649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b) {
        super(1);
        this.f305649d = c15182x1607686b;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        r45.s7 it = (r45.s7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = this.f305649d;
        mn0.b0 txLivePlayer = c15182x1607686b.getTxLivePlayer();
        if (txLivePlayer != null) {
            android.content.Context context = c15182x1607686b.getContext();
            if (!java.lang.Boolean.valueOf(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112).booleanValue()) {
                context = null;
            }
            if (context == null) {
                context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
            }
            java.lang.String valueOf = java.lang.String.valueOf(c15182x1607686b.O(context));
            if (c15182x1607686b.f212152x0) {
                str = c15182x1607686b.U + "_isPrepare";
            } else {
                str = c15182x1607686b.U;
            }
            ((mn0.y) txLivePlayer).r(valueOf, str, it.m75939xb282bd08(0), it.m75939xb282bd08(1));
        }
        return jz5.f0.f384359a;
    }
}
