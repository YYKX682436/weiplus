package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f223197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f223198f;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a, java.lang.String str, boolean z17, int i17) {
        this.f223196d = str;
        this.f223197e = z17;
        this.f223198f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.o1 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        Di.getClass();
        Di.m145253xb158737d("GameRawMessage", "update GameRawMessage set isGreet=" + this.f223197e + " , relationType = " + this.f223198f + " where quickResponseContentId = \"" + this.f223196d + "\"");
    }
}
