package lj3;

/* loaded from: classes14.dex */
public final class b extends ej3.a {

    /* renamed from: a, reason: collision with root package name */
    public final mj3.g f400505a;

    /* renamed from: b, reason: collision with root package name */
    public final is0.c f400506b;

    /* renamed from: c, reason: collision with root package name */
    public final is0.c f400507c;

    public b(mj3.g renderInfo, is0.c inputTexture, is0.c outputTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputTexture, "inputTexture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outputTexture, "outputTexture");
        this.f400505a = renderInfo;
        this.f400506b = inputTexture;
        this.f400507c = outputTexture;
    }

    /* renamed from: equals */
    public boolean m145868xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj3.b)) {
            return false;
        }
        lj3.b bVar = (lj3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400505a, bVar.f400505a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400506b, bVar.f400506b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400507c, bVar.f400507c);
    }

    /* renamed from: hashCode */
    public int m145869x8cdac1b() {
        return (((this.f400505a.m147389x8cdac1b() * 31) + this.f400506b.hashCode()) * 31) + this.f400507c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145870x9616526c() {
        return "VBRenderMTRTaskInput(renderInfo=" + this.f400505a + ", inputTexture=" + this.f400506b + ", outputTexture=" + this.f400507c + ')';
    }
}
