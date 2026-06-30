package ce3;

/* loaded from: classes7.dex */
public abstract class c extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f122322f;

    public c(java.lang.String authKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authKey, "authKey");
        this.f122322f = authKey;
    }

    @Override // lc3.b0
    public lc3.b0 r() {
        java.lang.Object newInstance = getClass().getConstructor(java.lang.String.class).newInstance(this.f122322f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        return (lc3.b0) newInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((r2.length() == 0) != false) goto L12;
     */
    @Override // lc3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(lc3.a0 r9) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce3.c.t(lc3.a0):void");
    }

    public abstract int u();
}
