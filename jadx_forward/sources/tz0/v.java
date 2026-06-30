package tz0;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.o f504786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(jz5.o oVar) {
        super(3);
        this.f504786d = oVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(str) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f384359a;
            }
        }
        java.lang.Object obj4 = n0.e1.f415025a;
        n0.y0 y0Var2 = (n0.y0) oVar;
        y0Var2.U(1934268815);
        java.lang.Object y17 = y0Var2.y();
        int i17 = n0.o.f415162a;
        if (y17 == n0.n.f415153a) {
            java.lang.Object obj5 = this.f504786d.f384374d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj5);
            y17 = sz0.i.a((android.graphics.drawable.Drawable) obj5);
            y0Var2.g0(y17);
        }
        y0Var2.o(false);
        a0.q1.a((h1.c) y17, str, null, null, null, 0.0f, null, y0Var2, ((intValue << 3) & 112) | 8, 124);
        return jz5.f0.f384359a;
    }
}
