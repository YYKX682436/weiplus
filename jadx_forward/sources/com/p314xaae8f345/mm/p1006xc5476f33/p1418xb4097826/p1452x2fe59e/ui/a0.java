package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e f191173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e activityC13932x386ad3e) {
        super(0);
        this.f191173d = activityC13932x386ad3e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.xw2 xw2Var;
        r45.z91 z91Var;
        r45.xw2 xw2Var2;
        r45.z91 z91Var2;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13932x386ad3e activityC13932x386ad3e = this.f191173d;
        int m76 = activityC13932x386ad3e.m7();
        if (m76 != 10 && m76 != 11) {
            if (m76 != 14 || !activityC13932x386ad3e.getIntent().hasExtra("STREAM_CARD_BUFFER")) {
                return null;
            }
            r45.z91 z91Var3 = new r45.z91();
            z91Var3.set(9, 14);
            z91Var3.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(activityC13932x386ad3e.getIntent().getByteArrayExtra("STREAM_CARD_BUFFER")));
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l(3, z91Var3);
        }
        if (activityC13932x386ad3e.getIntent().hasExtra("STREAM_CARD")) {
            r45.ww2 o76 = activityC13932x386ad3e.o7();
            if (o76 == null || (xw2Var2 = (r45.xw2) o76.m75936x14adae67(23)) == null || (z91Var2 = (r45.z91) xw2Var2.m75936x14adae67(2)) == null) {
                return null;
            }
            r45.ww2 o77 = activityC13932x386ad3e.o7();
            z91Var2.set(2, o77 != null ? o77.m75934xbce7f2f(6) : null);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l(1, z91Var2);
        }
        if (!activityC13932x386ad3e.getIntent().hasExtra("STREAM_TXT_CARD")) {
            return null;
        }
        r45.rx2 rx2Var = new r45.rx2();
        rx2Var.mo11468x92b714fd(activityC13932x386ad3e.getIntent().getByteArrayExtra("STREAM_TXT_CARD"));
        java.util.LinkedList m75941xfb821914 = rx2Var.m75941xfb821914(4);
        if (m75941xfb821914 == null || (xw2Var = (r45.xw2) m75941xfb821914.get(((java.lang.Number) ((jz5.n) activityC13932x386ad3e.D).mo141623x754a37bb()).intValue())) == null || (z91Var = (r45.z91) xw2Var.m75936x14adae67(2)) == null) {
            return null;
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.l(2, z91Var);
    }
}
