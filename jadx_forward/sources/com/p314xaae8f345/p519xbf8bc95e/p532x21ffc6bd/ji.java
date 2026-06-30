package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public final class ji extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl {

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ji.a f131527b;

    /* renamed from: q, reason: collision with root package name */
    private long f131528q;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    public ji() {
        super(null);
        this.f131528q = -1L;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl
    public final void a(float f17) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jl
    public final boolean c(long j17) {
        if (this.f131548j == 0) {
            this.f131548j = 1;
            long j18 = this.f131547i;
            if (j18 < 0) {
                this.f131546h = j17;
            } else {
                this.f131546h = j17 - j18;
                this.f131547i = -1L;
            }
        }
        if (this.f131527b == null) {
            return false;
        }
        this.f131528q = j17;
        return false;
    }

    private void a(com.tencent.mapsdk.internal.ji.a aVar) {
        this.f131527b = aVar;
    }
}
