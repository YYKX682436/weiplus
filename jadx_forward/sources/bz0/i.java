package bz0;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f118281a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f118282b;

    public i(java.lang.String tmplId, java.util.List exposeMusic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmplId, "tmplId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposeMusic, "exposeMusic");
        this.f118281a = tmplId;
        this.f118282b = exposeMusic;
    }

    /* renamed from: equals */
    public boolean m13611xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz0.i)) {
            return false;
        }
        bz0.i iVar = (bz0.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118281a, iVar.f118281a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f118282b, iVar.f118282b);
    }

    /* renamed from: hashCode */
    public int m13612x8cdac1b() {
        return (this.f118281a.hashCode() * 31) + this.f118282b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m13613x9616526c() {
        return "TemplateMusicExpose(tmplId=" + this.f118281a + ", exposeMusic=" + this.f118282b + ')';
    }
}
