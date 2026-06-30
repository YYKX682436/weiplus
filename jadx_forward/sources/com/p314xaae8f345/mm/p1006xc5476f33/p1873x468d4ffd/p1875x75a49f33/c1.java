package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes5.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 f230530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f230531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f230532f;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224, long j17, android.graphics.Bitmap bitmap) {
        this.f230530d = c16540x42192224;
        this.f230531e = j17;
        this.f230532f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        int indexOf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224 = this.f230530d;
        java.util.Iterator it = c16540x42192224.f230459y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p0 p0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p0) obj;
            if ((p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.u0) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.u0) p0Var).f230624b == this.f230531e) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p0 p0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.p0) obj;
        if (p0Var2 == null || (indexOf = c16540x42192224.f230459y.indexOf(p0Var2)) < 0) {
            return;
        }
        p0Var2.f230604a = this.f230532f;
        c16540x42192224.B.m8147xed6e4d18(indexOf);
    }
}
