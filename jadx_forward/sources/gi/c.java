package gi;

/* loaded from: classes12.dex */
public final class c extends wh.s {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f353524a = jz5.h.a(jz5.i.f384362d, gi.b.f353520d);

    public static final boolean e(java.lang.String stack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        if (r26.i0.y(stack, "Java ", false) || r26.i0.y(stack, "Java\n", false)) {
            return true;
        }
        return wh.j0.f527341g.a(stack, 3);
    }

    public static final boolean f(java.lang.String stack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        if (r26.i0.y(stack, "Native ", false) || r26.i0.y(stack, "Native\n", false)) {
            return true;
        }
        return wh.j0.f527341g.b(stack, 3);
    }

    @Override // wh.s
    public java.lang.String a(int i17) {
        java.lang.String a17 = super.a(i17);
        if (!android.text.TextUtils.isEmpty(a17)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            return d("Java", a17);
        }
        if (com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a.e(false, 1, null)) {
            java.lang.String f17 = com.p314xaae8f345.p552xbf8d97c1.p561x30f523.p563xb541530b.C4651xcb23ec9a.f(i17, null, false, null, 14, null);
            if (!android.text.TextUtils.isEmpty(f17)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
                return d("Java", f17);
            }
        }
        if (!com.p314xaae8f345.p3207xd1e0294a.p3208xcbe10e0a.C27811xabc31c8a.m120102x316510()) {
            return "";
        }
        java.lang.String m120094x420d512e = i17 == android.os.Process.myTid() ? com.p314xaae8f345.p3207xd1e0294a.p3208xcbe10e0a.C27811xabc31c8a.m120094x420d512e() : com.p314xaae8f345.p3207xd1e0294a.p3208xcbe10e0a.C27811xabc31c8a.m120096x2f59a41f(i17);
        if (android.text.TextUtils.isEmpty(m120094x420d512e)) {
            return "";
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m120094x420d512e);
        return d("Native", m120094x420d512e);
    }

    @Override // wh.s
    public boolean c(java.lang.String str) {
        if (str == null) {
            return false;
        }
        if (r26.i0.y(str, "Java ", false) || r26.i0.y(str, "Java\n", false) || r26.i0.y(str, "Native ", false) || r26.i0.y(str, "Native\n", false)) {
            return true;
        }
        return super.c(str);
    }

    public final java.lang.String d(java.lang.String str, java.lang.String str2) {
        if (c(str2)) {
            return str + ' ' + str2;
        }
        return str + '\n' + str2;
    }
}
