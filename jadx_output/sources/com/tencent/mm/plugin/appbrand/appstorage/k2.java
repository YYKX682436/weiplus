package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public class k2 implements com.tencent.mm.vfs.t6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager f76248a;

    public k2(com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager luggageLocalFileObjectManager) {
        this.f76248a = luggageLocalFileObjectManager;
    }

    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return this.f76248a.h(r6Var, true);
    }
}
