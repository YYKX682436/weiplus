package hj4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f363192a;

    public a(java.lang.String str) {
        this.f363192a = str;
    }

    /* renamed from: equals */
    public boolean m133591xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj4.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363192a, ((hj4.a) obj).f363192a);
    }

    /* renamed from: hashCode */
    public int m133592x8cdac1b() {
        java.lang.String str = this.f363192a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m133593x9616526c() {
        return "NewMsgInfo(sessionId=" + this.f363192a + ')';
    }
}
