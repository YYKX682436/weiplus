package jk4;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final nk4.s f381680a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f381681b;

    public c(nk4.s sVar, java.lang.Object obj) {
        this.f381680a = sVar;
        this.f381681b = obj;
    }

    /* renamed from: equals */
    public boolean m141069xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk4.c)) {
            return false;
        }
        jk4.c cVar = (jk4.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381680a, cVar.f381680a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381681b, cVar.f381681b);
    }

    /* renamed from: hashCode */
    public int m141070x8cdac1b() {
        nk4.s sVar = this.f381680a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        java.lang.Object obj = this.f381681b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m141071x9616526c() {
        return "FlutterThumbPlayerPluginParams(reporter=" + this.f381680a + ", requestFocusScene=" + this.f381681b + ')';
    }
}
