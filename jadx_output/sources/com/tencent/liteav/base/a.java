package com.tencent.liteav.base;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final /* synthetic */ class a implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.tencent.liteav.base.a f46279a = new com.tencent.liteav.base.a();

    private a() {
    }

    public static java.util.concurrent.Callable a() {
        return f46279a;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String[] privateDataDirectorySuffixInternal;
        privateDataDirectorySuffixInternal = com.tencent.liteav.base.PathUtils.setPrivateDataDirectorySuffixInternal();
        return privateDataDirectorySuffixInternal;
    }
}
