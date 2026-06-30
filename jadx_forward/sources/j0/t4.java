package j0;

/* loaded from: classes14.dex */
public final class t4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.t4 f378104d = new j0.t4();

    public t4() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List restored = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restored, "restored");
        return new j0.u4(((java.lang.Boolean) restored.get(1)).booleanValue() ? b0.y1.Vertical : b0.y1.Horizontal, ((java.lang.Float) restored.get(0)).floatValue());
    }
}
