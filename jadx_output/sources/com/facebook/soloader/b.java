package com.facebook.soloader;

/* loaded from: classes13.dex */
public class b extends com.facebook.soloader.r {

    /* renamed from: h, reason: collision with root package name */
    public final java.io.File f44000h;

    /* renamed from: i, reason: collision with root package name */
    public final int f44001i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.facebook.soloader.c f44002m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.facebook.soloader.c cVar, com.facebook.soloader.s sVar) {
        super(cVar, sVar);
        this.f44002m = cVar;
        this.f44000h = new java.io.File(cVar.f44048c.getApplicationInfo().nativeLibraryDir);
        this.f44001i = cVar.f44003h;
    }
}
