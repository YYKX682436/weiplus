package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes13.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f240436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f240438f;

    public f2(int i17, java.lang.String str, boolean z17) {
        this.f240436d = i17;
        this.f240437e = str;
        this.f240438f = z17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2 h2Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240453a;
        java.lang.String str = this.f240437e;
        if ((str == null || str.length() == 0) == true) {
            return;
        }
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240457e;
        int i17 = this.f240436d;
        java.lang.String str2 = (java.lang.String) hashMap.get(java.lang.Integer.valueOf(i17));
        java.lang.String str3 = (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240456d.get(java.lang.Integer.valueOf(i17));
        if ((str2 == null || str2.length() == 0) == true) {
            return;
        }
        if (str3 == null || str3.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18731, str2, str3, java.lang.Integer.valueOf(this.f240438f ? 1 : 0), str);
    }
}
