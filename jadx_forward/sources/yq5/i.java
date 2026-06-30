package yq5;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f546130a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f546131b;

    public i(int i17, java.util.List tiles) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tiles, "tiles");
        this.f546130a = i17;
        this.f546131b = tiles;
    }

    /* renamed from: equals */
    public boolean m177523xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.i)) {
            return false;
        }
        yq5.i iVar = (yq5.i) obj;
        return this.f546130a == iVar.f546130a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546131b, iVar.f546131b);
    }

    /* renamed from: hashCode */
    public int m177524x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f546130a) * 31) + this.f546131b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m177525x9616526c() {
        return "SamplingTiles(sampleSize=" + this.f546130a + ", tiles=" + this.f546131b + ')';
    }
}
