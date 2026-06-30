package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class j2 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b f95927a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f95928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 f95929c;

    public j2(com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var, com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b bVar, boolean z17) {
        this.f95929c = p0Var;
        this.f95927a = bVar;
        this.f95928b = z17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        this.f95929c.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.i2(this, i17, i18, oVar, str));
    }
}
