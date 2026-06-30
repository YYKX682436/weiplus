package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class e5 implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f294442d;

    public e5(com.p314xaae8f345.mm.vfs.g5 g5Var, boolean z17) {
        this.f294442d = z17;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (this.f294442d && ".ref".equals(str)) {
            return null;
        }
        return str.charAt(str.length() + (-1)) != 8982 ? str : str.substring(0, str.length() - 1);
    }
}
