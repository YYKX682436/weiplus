package g16;

/* loaded from: classes15.dex */
public final class h0 implements g16.g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g16.h0 f349160a = new g16.h0();

    public g16.f0 a(java.lang.String representation) {
        w16.e eVar;
        g16.f0 d0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(representation, "representation");
        char charAt = representation.charAt(0);
        w16.e[] m173124xcee59d22 = w16.e.m173124xcee59d22();
        int length = m173124xcee59d22.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                eVar = null;
                break;
            }
            eVar = m173124xcee59d22[i17];
            if (eVar.h().charAt(0) == charAt) {
                break;
            }
            i17++;
        }
        if (eVar != null) {
            return new g16.e0(eVar);
        }
        if (charAt == 'V') {
            return new g16.e0(null);
        }
        if (charAt == '[') {
            java.lang.String substring = representation.substring(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            d0Var = new g16.c0(a(substring));
        } else {
            if (charAt == 'L') {
                r26.n0.E(representation, ';', false, 2, null);
            }
            java.lang.String substring2 = representation.substring(1, representation.length() - 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            d0Var = new g16.d0(substring2);
        }
        return d0Var;
    }

    public g16.d0 b(java.lang.String internalName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalName, "internalName");
        return new g16.d0(internalName);
    }

    public java.lang.String c(g16.f0 type) {
        java.lang.String h17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (type instanceof g16.c0) {
            return "[" + c(((g16.c0) type).f349132i);
        }
        if (type instanceof g16.e0) {
            w16.e eVar = ((g16.e0) type).f349149i;
            return (eVar == null || (h17 = eVar.h()) == null) ? p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a : h17;
        }
        if (!(type instanceof g16.d0)) {
            throw new jz5.j();
        }
        return "L" + ((g16.d0) type).f349136i + ';';
    }
}
