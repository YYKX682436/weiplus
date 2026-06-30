package cr0;

/* loaded from: classes12.dex */
public final class w6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final cr0.w6 f303339d = new cr0.w6();

    public w6() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Number number = (java.lang.Number) it.f384374d;
        sb6.append(number.intValue());
        sb6.append(':');
        wh.t1 e17 = wh.u1.e(android.os.Process.myPid(), number.intValue());
        sb6.append(e17 != null ? e17.f527406a : null);
        return sb6.toString();
    }
}
