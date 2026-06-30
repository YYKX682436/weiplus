package hr0;

/* loaded from: classes12.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hr0.x f364873d = new hr0.x();

    public x() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        java.lang.Throwable th6 = new java.lang.Throwable();
        java.lang.String m120094x420d512e = com.p314xaae8f345.p3207xd1e0294a.p3208xcbe10e0a.C27811xabc31c8a.m120102x316510() ? com.p314xaae8f345.p3207xd1e0294a.p3208xcbe10e0a.C27811xabc31c8a.m120094x420d512e() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSetHiddenApiExemptions: ");
        java.lang.String arrays = java.util.Arrays.toString(strArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(",java=");
        sb6.append(android.util.Log.getStackTraceString(th6));
        sb6.append(", native=");
        sb6.append(m120094x420d512e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JniHookHandler", sb6.toString());
        if ((strArr != null && strArr.length == 1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr[0], "L") && mm.o.j(false, 1, null)) {
            ((ku5.t0) ku5.t0.f394148d).k(new hr0.w(th6, strArr, m120094x420d512e), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        }
        return java.lang.Integer.valueOf((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(strArr, new java.lang.String[]{"L"}) && mm.o.b()) ? 1 : 0);
    }
}
