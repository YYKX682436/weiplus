package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class a2 implements m02.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f96978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f96979b;

    public a2(com.tencent.mm.pointers.PBool pBool, vz.z1 z1Var) {
        this.f96978a = pBool;
        this.f96979b = z1Var;
    }

    @Override // m02.q
    public void a() {
        if (this.f96978a.value) {
            return;
        }
        this.f96979b.a("cancel", null);
    }
}
