package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class n1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f97089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f97090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f97091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f97092g;

    public n1(com.tencent.mm.pointers.PBool pBool, h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f97089d = pBool;
        this.f97090e = aVar;
        this.f97091f = z17;
        this.f97092g = z1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f97089d.value = true;
        com.tencent.mm.plugin.downloader.model.j1.g(this.f97090e, false, this.f97091f, false, this.f97092g);
    }
}
