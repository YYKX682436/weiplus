package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f220601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f220602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 f220603f;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70, int i17, boolean z17) {
        this.f220603f = c15854x49003e70;
        this.f220601d = i17;
        this.f220602e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f220601d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = this.f220603f;
        c15854x49003e70.m64419x4b2a624f(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.q2 q2Var = c15854x49003e70.D;
        if (q2Var != null) {
            q2Var.c(this.f220602e);
        }
    }
}
