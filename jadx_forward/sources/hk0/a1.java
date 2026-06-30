package hk0;

/* loaded from: classes3.dex */
public final class a1 extends hk0.n {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f363225b;

    /* renamed from: c, reason: collision with root package name */
    public hk0.p f363226c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f363227d;

    /* renamed from: e, reason: collision with root package name */
    public final int f363228e;

    /* renamed from: f, reason: collision with root package name */
    public final int f363229f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f363230g;

    /* renamed from: h, reason: collision with root package name */
    public xk0.f f363231h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f363232i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(hk0.l editType, hk0.p handleType, java.lang.String str, int i17, int i18, java.lang.String font, xk0.f fVar, java.lang.String str2) {
        super(editType, handleType, str2, fVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editType, "editType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleType, "handleType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(font, "font");
        this.f363225b = editType;
        this.f363226c = handleType;
        this.f363227d = str;
        this.f363228e = i17;
        this.f363229f = i18;
        this.f363230g = font;
        this.f363231h = fVar;
        this.f363232i = str2;
    }

    @Override // hk0.n
    public xk0.f a() {
        return this.f363231h;
    }

    @Override // hk0.n
    public hk0.p b() {
        return this.f363226c;
    }

    @Override // hk0.n
    public java.lang.String c() {
        return this.f363232i;
    }

    /* renamed from: equals */
    public boolean m133613xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.a1)) {
            return false;
        }
        hk0.a1 a1Var = (hk0.a1) obj;
        return this.f363225b == a1Var.f363225b && this.f363226c == a1Var.f363226c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363227d, a1Var.f363227d) && this.f363228e == a1Var.f363228e && this.f363229f == a1Var.f363229f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363230g, a1Var.f363230g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363231h, a1Var.f363231h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363232i, a1Var.f363232i);
    }

    /* renamed from: hashCode */
    public int m133614x8cdac1b() {
        int hashCode = ((this.f363225b.hashCode() * 31) + this.f363226c.hashCode()) * 31;
        java.lang.String str = this.f363227d;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f363228e)) * 31) + java.lang.Integer.hashCode(this.f363229f)) * 31) + this.f363230g.hashCode()) * 31;
        xk0.f fVar = this.f363231h;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        java.lang.String str2 = this.f363232i;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m133615x9616526c() {
        return "TextEditData(editType=" + this.f363225b + ", handleType=" + this.f363226c + ", text=" + this.f363227d + ", color=" + this.f363228e + ", bgColor=" + this.f363229f + ", font=" + this.f363230g + ", emojiItem=" + this.f363231h + ", lastEditId=" + this.f363232i + ')';
    }
}
