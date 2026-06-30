package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class w5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 f211509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f211510f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078, java.lang.String str) {
        super(0);
        this.f211508d = i17;
        this.f211509e = activityC15029x292078;
        this.f211510f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        if (this.f211508d == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078 = this.f211509e;
            java.util.Iterator it = activityC15029x292078.f210102w.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (r26.i0.q(((r45.q21) next).m75945x2fec8307(2), this.f211510f, false, 2, null)) {
                    obj = next;
                    break;
                }
            }
            r45.q21 q21Var = (r45.q21) obj;
            if (q21Var != null) {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.a6(activityC15029x292078, q21Var.m75945x2fec8307(2)));
            }
        }
        return jz5.f0.f384359a;
    }
}
