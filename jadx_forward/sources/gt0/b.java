package gt0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Integer f356897a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f356898b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer f356899c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f356900d;

    public b(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        num = (i17 & 1) != 0 ? 0 : num;
        num2 = (i17 & 2) != 0 ? 0 : num2;
        num3 = (i17 & 4) != 0 ? 0 : num3;
        bool = (i17 & 8) != 0 ? null : bool;
        this.f356897a = num;
        this.f356898b = num2;
        this.f356899c = num3;
        this.f356900d = bool;
    }

    /* renamed from: equals */
    public boolean m132349xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt0.b)) {
            return false;
        }
        gt0.b bVar = (gt0.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356897a, bVar.f356897a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356898b, bVar.f356898b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356899c, bVar.f356899c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f356900d, bVar.f356900d);
    }

    /* renamed from: hashCode */
    public int m132350x8cdac1b() {
        java.lang.Integer num = this.f356897a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f356898b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f356899c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Boolean bool = this.f356900d;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m132351x9616526c() {
        return "FpsConfigItem(lowerFps=" + this.f356897a + ", upperFps=" + this.f356898b + ", curFps=" + this.f356899c + ", useFixMode=" + this.f356900d + ')';
    }
}
