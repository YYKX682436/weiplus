package je2;

/* loaded from: classes3.dex */
public abstract class u {
    public static final java.lang.String a(r45.oq1 oq1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oq1Var, "<this>");
        return "{product_id:" + oq1Var.f463975e + ", giftId:" + oq1Var.f463974d + '}';
    }

    public static final java.lang.String b(r45.pq1 pq1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pq1Var, "<this>");
        java.util.LinkedList<r45.oq1> gift = pq1Var.f464836e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gift, "gift");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(gift, 10));
        for (r45.oq1 oq1Var : gift) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oq1Var);
            arrayList.add(a(oq1Var));
        }
        return arrayList.toString();
    }
}
