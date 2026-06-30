package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class y1 implements m02.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h02.a f97206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f97207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97208d;

    public y1(com.tencent.mm.pointers.PBool pBool, h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f97205a = pBool;
        this.f97206b = aVar;
        this.f97207c = z17;
        this.f97208d = z1Var;
    }

    @Override // m02.q
    public void a() {
        this.f97205a.value = true;
        com.tencent.mm.plugin.downloader.model.j1.g(this.f97206b, false, this.f97207c, false, this.f97208d);
    }
}
