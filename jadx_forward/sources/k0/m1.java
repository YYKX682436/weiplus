package k0;

/* loaded from: classes14.dex */
public abstract class m1 {
    public static final float a(a2.k1 k1Var, int i17, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k1Var, "<this>");
        boolean z19 = k1Var.a(((!z17 || z18) && (z17 || !z18)) ? java.lang.Math.max(i17 + (-1), 0) : i17) == k1Var.m(i17);
        a2.g gVar = k1Var.f82299b;
        gVar.c(i17);
        int length = gVar.f82247a.f82281a.length();
        java.util.List list = gVar.f82254h;
        a2.m mVar = (a2.m) ((java.util.ArrayList) list).get(i17 == length ? kz5.c0.h(list) : a2.k.a(list, i17));
        return ((i2.c) mVar.f82306a).c(mVar.b(i17), z19);
    }
}
