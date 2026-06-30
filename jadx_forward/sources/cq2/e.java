package cq2;

/* loaded from: classes2.dex */
public final class e {
    public final void a(r45.qt2 contextObj, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        int m75939xb282bd08 = contextObj.m75939xb282bd08(5);
        java.lang.String m75945x2fec8307 = contextObj.m75945x2fec8307(1);
        r45.kv0 a17 = db2.t4.f309704a.a(6479);
        a17.set(1, java.lang.Integer.valueOf(m75939xb282bd08));
        r45.g40 g40Var = new r45.g40();
        g40Var.set(0, m75945x2fec8307);
        a17.set(4, g40Var);
        java.lang.String str = (4 & 2097151) != 0 ? "" : null;
        java.lang.String nonceId = (2097151 & 64) != 0 ? "" : null;
        java.util.LinkedList readList = (2097151 & 32768) != 0 ? new java.util.LinkedList() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(readList, "readList");
        java.lang.String str2 = str != null ? str : "";
        int i17 = vd2.a2.f517171i;
        db2.q5 q5Var = new db2.q5(0L, nonceId, str2, null, m75939xb282bd08, 0.0f, 0.0f, a17, null, contextObj, null, readList, 0, vd2.a2.f517174l, null, 4);
        q5Var.O(0);
        q5Var.f309668q = 0;
        gm0.j1.d().g(q5Var);
        gm0.j1.d().a(6479, new cq2.c(callback));
    }
}
