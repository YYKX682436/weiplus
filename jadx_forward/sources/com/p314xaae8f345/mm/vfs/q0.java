package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class q0 extends com.p314xaae8f345.mm.vfs.o8 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.q2 f294665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.C22745x9ff2020b f294666g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.vfs.C22745x9ff2020b c22745x9ff2020b, com.p314xaae8f345.mm.vfs.q2 fs6) {
        super(fs6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        this.f294666g = c22745x9ff2020b;
        this.f294665f = fs6;
    }

    @Override // com.p314xaae8f345.mm.vfs.o8, com.p314xaae8f345.mm.vfs.a
    public boolean I(java.lang.String fromPath, com.p314xaae8f345.mm.vfs.q2 toFS, java.lang.String toPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromPath, "fromPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toFS, "toFS");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toPath, "toPath");
        java.lang.String lowerCase = fromPath.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (r26.i0.y(lowerCase, "android/data/com.tencent.mm/", false)) {
            return super.I(fromPath, toFS, toPath);
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError("File move rejected: " + fromPath + " [" + this.f294665f + "] -> " + toPath + " [" + toFS + ']');
        if (z65.c.a()) {
            throw assertionError;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.SystemDirectoryBlocker", assertionError, "File move rejected", new java.lang.Object[0]);
        return false;
    }

    @Override // com.p314xaae8f345.mm.vfs.o8, com.p314xaae8f345.mm.vfs.q2
    public boolean d(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.lang.String lowerCase = path.toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        if (r26.i0.y(lowerCase, "android/data/com.tencent.mm/", false)) {
            return super.d(path);
        }
        java.lang.AssertionError assertionError = new java.lang.AssertionError("File delete rejected: " + path + " [" + this.f294665f + ']');
        if (z65.c.a()) {
            throw assertionError;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("VFS.SystemDirectoryBlocker", assertionError, "File delete rejected", new java.lang.Object[0]);
        return false;
    }

    @Override // com.p314xaae8f345.mm.vfs.q2
    public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
        return this.f294666g;
    }
}
