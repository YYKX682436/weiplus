package v11;

/* loaded from: classes11.dex */
public final class j extends v11.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f513947a;

    /* renamed from: b, reason: collision with root package name */
    public final v11.s f513948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.util.List blocks, v11.s sVar) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blocks, "blocks");
        this.f513947a = blocks;
        this.f513948b = sVar;
    }

    /* renamed from: equals */
    public boolean m170905xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.j)) {
            return false;
        }
        v11.j jVar = (v11.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513947a, jVar.f513947a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513948b, jVar.f513948b);
    }

    /* renamed from: hashCode */
    public int m170906x8cdac1b() {
        int hashCode = this.f513947a.hashCode() * 31;
        v11.s sVar = this.f513948b;
        return hashCode + (sVar == null ? 0 : sVar.m170946x8cdac1b());
    }

    /* renamed from: toString */
    public java.lang.String m170907x9616526c() {
        return "BlockquoteBlock(blocks=" + this.f513947a + ", sourceRange=" + this.f513948b + ')';
    }
}
