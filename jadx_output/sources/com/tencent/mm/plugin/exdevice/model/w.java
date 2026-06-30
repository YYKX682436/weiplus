package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class w extends u32.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99077b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f99078c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f99079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.d0 f99080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.exdevice.model.d0 d0Var, int i17, java.lang.String str, long j17, boolean z17) {
        super(i17);
        this.f99080e = d0Var;
        this.f99077b = str;
        this.f99078c = j17;
        this.f99079d = z17;
    }

    @Override // u32.q
    public void a() {
        com.tencent.mm.plugin.exdevice.model.d0 d0Var = this.f99080e;
        d0Var.f98865a.f424356d = null;
        d0Var.c(this.f99077b, this.f99078c, this.f424350a, this.f99079d);
    }
}
