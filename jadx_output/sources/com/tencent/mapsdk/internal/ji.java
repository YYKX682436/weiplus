package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public final class ji extends com.tencent.mapsdk.internal.jl {

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ji.a f49994b;

    /* renamed from: q, reason: collision with root package name */
    private long f49995q;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    public ji() {
        super(null);
        this.f49995q = -1L;
    }

    @Override // com.tencent.mapsdk.internal.jl
    public final void a(float f17) {
    }

    @Override // com.tencent.mapsdk.internal.jl
    public final boolean c(long j17) {
        if (this.f50015j == 0) {
            this.f50015j = 1;
            long j18 = this.f50014i;
            if (j18 < 0) {
                this.f50013h = j17;
            } else {
                this.f50013h = j17 - j18;
                this.f50014i = -1L;
            }
        }
        if (this.f49994b == null) {
            return false;
        }
        this.f49995q = j17;
        return false;
    }

    private void a(com.tencent.mapsdk.internal.ji.a aVar) {
        this.f49994b = aVar;
    }
}
