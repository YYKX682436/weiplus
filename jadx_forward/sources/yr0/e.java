package yr0;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f546162a;

    /* renamed from: b, reason: collision with root package name */
    public yr0.f f546163b;

    public e(java.lang.Object obj, yr0.f status, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        status = (i17 & 2) != 0 ? yr0.f.f546164d : status;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f546162a = obj;
        this.f546163b = status;
    }

    /* renamed from: equals */
    public boolean m177540xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr0.e)) {
            return false;
        }
        yr0.e eVar = (yr0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546162a, eVar.f546162a) && this.f546163b == eVar.f546163b;
    }

    /* renamed from: hashCode */
    public int m177541x8cdac1b() {
        java.lang.Object obj = this.f546162a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f546163b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177542x9616526c() {
        return "CameraKitPreloadModel(preload=" + this.f546162a + ", status=" + this.f546163b + ')';
    }
}
