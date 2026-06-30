package oy4;

/* loaded from: classes13.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.Buffer f431622a;

    /* renamed from: b, reason: collision with root package name */
    public final int f431623b;

    /* renamed from: c, reason: collision with root package name */
    public final int f431624c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f431625d;

    public z(java.nio.Buffer buffer, int i17, int i18, android.graphics.RectF rectF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buffer, "buffer");
        this.f431622a = buffer;
        this.f431623b = i17;
        this.f431624c = i18;
        this.f431625d = rectF;
    }

    /* renamed from: equals */
    public boolean m157463xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4.z)) {
            return false;
        }
        oy4.z zVar = (oy4.z) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431622a, zVar.f431622a) && this.f431623b == zVar.f431623b && this.f431624c == zVar.f431624c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431625d, zVar.f431625d);
    }

    /* renamed from: hashCode */
    public int m157464x8cdac1b() {
        int hashCode = ((((this.f431622a.hashCode() * 31) + java.lang.Integer.hashCode(this.f431623b)) * 31) + java.lang.Integer.hashCode(this.f431624c)) * 31;
        android.graphics.RectF rectF = this.f431625d;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m157465x9616526c() {
        return "ImageBufferDataWrapper(buffer=" + this.f431622a + ", width=" + this.f431623b + ", height=" + this.f431624c + ", codeRect=" + this.f431625d + ')';
    }
}
