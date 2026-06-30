package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f269367a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f269368b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f269369c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f269370d;

    public k(int i17, boolean z17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 2) != 0 ? false : z17;
        z18 = (i18 & 4) != 0 ? false : z18;
        this.f269367a = i17;
        this.f269368b = z17;
        this.f269369c = z18;
        this.f269370d = new java.util.LinkedList();
    }

    /* renamed from: toString */
    public java.lang.String m74926x9616526c() {
        return r26.b0.b("[worker #" + this.f269367a + "]\n                preload: " + this.f269368b + "\n                recycled: " + this.f269369c + "\n\n                " + kz5.n0.g0(this.f269370d, "\n\n", null, null, 0, null, null, 62, null) + "\n                ");
    }
}
