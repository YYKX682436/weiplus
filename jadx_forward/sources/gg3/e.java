package gg3;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f353269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f353270b;

    /* renamed from: c, reason: collision with root package name */
    public final float f353271c;

    public e(java.lang.String msg, int i17, float f17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        msg = (i18 & 1) != 0 ? "" : msg;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        f17 = (i18 & 4) != 0 ? 0.0f : f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f353269a = msg;
        this.f353270b = i17;
        this.f353271c = f17;
    }

    /* renamed from: equals */
    public boolean m131536xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg3.e)) {
            return false;
        }
        gg3.e eVar = (gg3.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f353269a, eVar.f353269a) && this.f353270b == eVar.f353270b && java.lang.Float.compare(this.f353271c, eVar.f353271c) == 0;
    }

    /* renamed from: hashCode */
    public int m131537x8cdac1b() {
        return (((this.f353269a.hashCode() * 31) + java.lang.Integer.hashCode(this.f353270b)) * 31) + java.lang.Float.hashCode(this.f353271c);
    }

    /* renamed from: toString */
    public java.lang.String m131538x9616526c() {
        return "VideoStateInfo(msg=" + this.f353269a + ", ret=" + this.f353270b + ", progress=" + this.f353271c + ')';
    }
}
