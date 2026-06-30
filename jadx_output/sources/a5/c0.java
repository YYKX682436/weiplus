package a5;

/* loaded from: classes13.dex */
public final class c0 extends a5.s0 {
    public c0(java.lang.Class cls) {
        super(cls);
        this.f1430c.f297767d = androidx.work.OverwritingInputMerger.class.getName();
    }

    @Override // a5.s0
    public a5.t0 b() {
        if (this.f1428a && this.f1430c.f297773j.f1387c) {
            throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        return new a5.d0(this);
    }

    @Override // a5.s0
    public a5.s0 c() {
        return this;
    }
}
