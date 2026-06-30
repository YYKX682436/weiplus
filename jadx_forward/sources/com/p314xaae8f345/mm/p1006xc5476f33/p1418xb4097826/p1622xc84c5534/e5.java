package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class e5 {
    public e5(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.vd6 a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5 record, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        r45.vd6 vd6Var = new r45.vd6();
        java.util.BitSet bitSet = new java.util.BitSet(64);
        vd6Var.set(0, java.lang.Long.valueOf(record.f206556a));
        vd6Var.set(28, null);
        java.lang.String str3 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = record.f206558c;
        if (c14994x9b99c079 == null || (str = c14994x9b99c079.m59276x6c285d75()) == null) {
            str = "";
        }
        vd6Var.set(4, str);
        vd6Var.set(1, new r45.oi());
        vd6Var.set(2, new r45.yw6());
        vd6Var.set(3, new r45.q25());
        if (c14994x9b99c079 != null && (str2 = c14994x9b99c079.f66949xdec927b) != null) {
            str3 = str2;
        }
        vd6Var.set(5, str3);
        float f17 = ((float) (record.f206564i - record.f206557b)) / 1000.0f;
        if (f17 < 0.5f) {
            bitSet.set(21, true);
        } else if (f17 < 1.0f) {
            bitSet.set(22, true);
        } else if (f17 < 2.0f) {
            bitSet.set(23, true);
        } else if (f17 < 3.0f) {
            bitSet.set(24, true);
        } else if (f17 < 5.0f) {
            bitSet.set(25, true);
        } else if (f17 < 10.0f) {
            bitSet.set(26, true);
        } else if (f17 < 20.0f) {
            bitSet.set(27, true);
        } else if (f17 < 30.0f) {
            bitSet.set(28, true);
        } else if (f17 < 40.0f) {
            bitSet.set(29, true);
        } else if (f17 < 50.0f) {
            bitSet.set(30, true);
        } else {
            bitSet.set(31, true);
        }
        long j17 = bitSet.toLongArray()[0];
        r45.oi oiVar = (r45.oi) vd6Var.m75936x14adae67(1);
        if (oiVar != null) {
            oiVar.set(0, java.lang.Long.valueOf(j17));
        }
        r45.yw6 yw6Var = (r45.yw6) vd6Var.m75936x14adae67(2);
        if (yw6Var != null) {
            yw6Var.set(1, java.lang.Integer.valueOf((int) f17));
        }
        r45.q25 q25Var = (r45.q25) vd6Var.m75936x14adae67(3);
        if (q25Var != null) {
            q25Var.set(2, java.lang.Integer.valueOf((int) f17));
        }
        r45.q25 q25Var2 = (r45.q25) vd6Var.m75936x14adae67(3);
        if (q25Var2 != null) {
            q25Var2.set(13, java.lang.Integer.valueOf(record.f206561f));
        }
        r45.q25 q25Var3 = (r45.q25) vd6Var.m75936x14adae67(3);
        if (q25Var3 != null) {
            q25Var3.set(12, java.lang.Integer.valueOf(!z17 ? 1 : 0));
        }
        if (c14994x9b99c079 != null) {
            r45.q25 q25Var4 = (r45.q25) vd6Var.m75936x14adae67(3);
            if (q25Var4 != null) {
                q25Var4.set(9, java.lang.Integer.valueOf(c14994x9b99c079.m59255xbd8ebd19() != 0 ? 1 : 0));
            }
            r45.q25 q25Var5 = (r45.q25) vd6Var.m75936x14adae67(3);
            if (q25Var5 != null) {
                ya2.g gVar = ya2.h.f542017a;
                java.lang.String m59299x6bf53a6c = c14994x9b99c079.m59299x6bf53a6c();
                r45.xk m59211x37f6d02b = c14994x9b99c079.m59211x37f6d02b();
                q25Var5.set(8, java.lang.Integer.valueOf(ya2.g.h(gVar, m59299x6bf53a6c, m59211x37f6d02b != null ? m59211x37f6d02b.m75945x2fec8307(0) : null, false, false, 12, null) ? 1 : 0));
            }
            r45.q25 q25Var6 = (r45.q25) vd6Var.m75936x14adae67(3);
            if (q25Var6 != null) {
                q25Var6.set(11, java.lang.Integer.valueOf(c14994x9b99c079.m59236xfdaf34f1() == 1 ? 1 : 0));
            }
        }
        return vd6Var;
    }
}
