package p3380x6a61f93.p3386xf51b86f1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lurgen/ur_C563/URS_EE53;", "", "()V", "UR_00FB", "", "key", "", "defValue", "UR_48DE", "", "UR_EB40", "UR_F127", "plugin-ilink_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: urgen.ur_C563.URS_EE53 */
/* loaded from: classes5.dex */
public final class C30590x2803c87 {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3386xf51b86f1.C30590x2803c87 f77187x4fbc8495 = new p3380x6a61f93.p3386xf51b86f1.C30590x2803c87();

    private C30590x2803c87() {
    }

    /* renamed from: UR_00FB */
    public static final boolean m170097x21b0571e(java.lang.String key, boolean defValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(key, defValue ? 1 : 0) != 0;
    }

    /* renamed from: UR_48DE */
    public static final int m170098x21b24667(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key);
        if (d17 == null) {
            return 0;
        }
        try {
            jz5.x d18 = r26.q0.d(d17, 16);
            if (d18 != null) {
                return (int) d18.f384385d;
            }
            r26.h0.g(d17);
            throw null;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DynamicConfigJavaStatic", "failed to parse hexValue for key : ".concat(key));
            return 0;
        }
    }

    /* renamed from: UR_EB40 */
    public static final java.lang.String m170099x21ba243b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(key);
        return d17 == null ? "" : d17;
    }

    /* renamed from: UR_F127 */
    public static final int m170100x21ba5892(java.lang.String key, int defValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b(key, defValue);
    }
}
