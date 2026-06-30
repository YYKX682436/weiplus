package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes3.dex */
public final class v2 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f233500d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f233501e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f233502f;

    public v2(long j17, java.lang.String text, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f233500d = j17;
        this.f233501e = text;
        this.f233502f = z17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v2 entry = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        return (int) (this.f233500d - entry.f233500d);
    }
}
