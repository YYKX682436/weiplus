package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class h0 implements java.io.FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134969a;

    public h0(com.p314xaae8f345.mm.app.k0 k0Var, java.lang.String str) {
        this.f134969a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File file, java.lang.String str) {
        java.lang.String str2 = this.f134969a;
        if (!str.startsWith(str2)) {
            if (!str.startsWith("java_" + str2)) {
                if (!str.startsWith("NativeCrash_" + str2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
