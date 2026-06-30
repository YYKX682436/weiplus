package dk2;

/* loaded from: classes2.dex */
public abstract class ec {
    public static final dk2.hc a(dk2.fc fcVar, long j17, java.util.Map map) {
        dk2.gc gcVar;
        java.lang.String str;
        dk2.hc hcVar;
        r45.zk2 zk2Var = (r45.zk2) map.get(java.lang.Long.valueOf(j17));
        if (zk2Var == null) {
            throw new java.lang.IllegalArgumentException("Poll question not found. " + j17);
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        int m75939xb282bd08 = zk2Var.m75939xb282bd08(4);
        int i17 = 1;
        if (m75939xb282bd08 == 1) {
            gcVar = dk2.gc.f315057d;
        } else {
            if (m75939xb282bd08 != 4) {
                throw new java.lang.IllegalArgumentException("Unsupported question type. " + j17 + ", " + zk2Var.m75939xb282bd08(4));
            }
            gcVar = dk2.gc.f315058e;
        }
        java.lang.String m75945x2fec8307 = zk2Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            throw new java.lang.IllegalArgumentException("Empty poll question stem. " + j17);
        }
        java.util.LinkedList<r45.xk2> m75941xfb821914 = zk2Var.m75941xfb821914(2);
        if (m75941xfb821914 == null) {
            throw new java.lang.IllegalArgumentException("Empty poll question options. " + j17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        for (r45.xk2 xk2Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(xk2Var);
            java.lang.String m75945x2fec83072 = xk2Var.m75945x2fec8307(i17);
            if (m75945x2fec83072 == null) {
                throw new java.lang.IllegalArgumentException("Empty poll question option content. " + xk2Var.m75942xfb822ef2(0));
            }
            int m75939xb282bd082 = xk2Var.m75939xb282bd08(5);
            if (m75939xb282bd082 == i17) {
                str = m75945x2fec8307;
                hcVar = null;
            } else {
                if (m75939xb282bd082 != 2) {
                    throw new java.lang.IllegalArgumentException("Unsupported poll question option action. " + xk2Var.m75942xfb822ef2(0) + ", " + xk2Var.m75939xb282bd08(5));
                }
                str = m75945x2fec8307;
                hcVar = a(dk2.hc.f315111f, xk2Var.m75942xfb822ef2(6), map);
            }
            arrayList.add(new dk2.ic(java.lang.String.valueOf(xk2Var.m75942xfb822ef2(0)), m75945x2fec83072, hcVar));
            m75945x2fec8307 = str;
            i17 = 1;
        }
        return new dk2.hc(java.lang.String.valueOf(j17), uuid, gcVar, m75945x2fec8307, arrayList);
    }
}
