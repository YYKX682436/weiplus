package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class x extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f99097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f99098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d0 f99099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.exdevice.model.d0 d0Var, int i17, java.lang.String str, long j17, boolean z17) {
        super(i17);
        this.f99099e = d0Var;
        this.f99096b = str;
        this.f99097c = j17;
        this.f99098d = z17;
    }

    @Override // u32.q
    public void a() {
        com.tencent.mm.plugin.exdevice.model.d0 d0Var = this.f99099e;
        d0Var.f98865a.f424356d = null;
        d0Var.c(this.f99096b, this.f99097c, this.f424350a, this.f99098d);
    }
}
