package lj3;

/* loaded from: classes14.dex */
public final class c extends ej3.b {

    /* renamed from: b, reason: collision with root package name */
    public final mj3.g f400508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f400509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mj3.g renderInfo, int i17) {
        super(false, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        this.f400508b = renderInfo;
        this.f400509c = i17;
    }

    /* renamed from: equals */
    public boolean m145871xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj3.c)) {
            return false;
        }
        lj3.c cVar = (lj3.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f400508b, cVar.f400508b) && this.f400509c == cVar.f400509c;
    }

    /* renamed from: hashCode */
    public int m145872x8cdac1b() {
        return (this.f400508b.m147389x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f400509c);
    }

    /* renamed from: toString */
    public java.lang.String m145873x9616526c() {
        return "VBRenderMTRTaskOutput(renderInfo=" + this.f400508b + ", texId=" + this.f400509c + ')';
    }
}
