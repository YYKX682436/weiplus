package a5;

/* loaded from: classes13.dex */
public final class c0 extends a5.s0 {
    public c0(java.lang.Class cls) {
        super(cls);
        this.f82963c.f379300d = p012xc85e97e9.p125x37c711.C1261x510e511c.class.getName();
    }

    @Override // a5.s0
    public a5.t0 b() {
        if (this.f82961a && this.f82963c.f379306j.f82920c) {
            throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new a5.d0(this);
    }

    @Override // a5.s0
    public a5.s0 c() {
        return this;
    }
}
