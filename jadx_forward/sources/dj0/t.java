package dj0;

/* loaded from: classes14.dex */
public class t extends dj0.s {
    public t(dj0.x xVar, dj0.t tVar) {
        super(xVar, tVar);
    }

    @Override // dj0.w
    public dj0.x a() {
        return new dj0.x(this.f314408c.consumeDisplayCutout());
    }

    @Override // dj0.r, dj0.w
    /* renamed from: equals */
    public boolean mo124484xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj0.t)) {
            return false;
        }
        dj0.t tVar = (dj0.t) obj;
        return java.util.Objects.equals(this.f314408c, tVar.f314408c) && java.util.Objects.equals(this.f314412g, tVar.f314412g);
    }

    @Override // dj0.w
    /* renamed from: hashCode */
    public int mo124485x8cdac1b() {
        return this.f314408c.hashCode();
    }
}
