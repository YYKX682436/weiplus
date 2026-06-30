package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes15.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f226108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f226110g;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w wVar, java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        this.f226107d = str;
        this.f226108e = i17;
        this.f226109f = str2;
        this.f226110g = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.f226046p).iterator();
        while (it.hasNext()) {
            ((q80.a0) it.next()).mo51023x884ffda7(this.f226107d, this.f226108e, this.f226109f, this.f226110g);
        }
    }
}
