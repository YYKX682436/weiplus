package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class q8 implements com.tencent.mm.vfs.b7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f75918a;

    public q8(com.tencent.mm.plugin.appbrand.appcache.s8 s8Var, java.lang.String str) {
        this.f75918a = str;
    }

    @Override // com.tencent.mm.vfs.b7
    public boolean a(com.tencent.mm.vfs.r6 r6Var, java.lang.String str) {
        return str.endsWith("_" + this.f75918a);
    }
}
