package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae;

/* loaded from: classes11.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f225689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f225693h;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, long j17, int i17, java.lang.String str, java.lang.String str2) {
        this.f225693h = sVar;
        this.f225689d = j17;
        this.f225690e = i17;
        this.f225691f = str;
        this.f225692g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String format = java.lang.String.format("%d_%d", java.lang.Long.valueOf(this.f225689d), java.lang.Integer.valueOf(this.f225690e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f225693h;
        ((java.util.HashSet) sVar.f225697a).add(format);
        if (sVar.f225700d.mo9541xb6136779(this.f225689d, this.f225691f, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s.a(this.f225692g), this.f225690e)) {
            ((java.util.HashSet) sVar.f225697a).remove(format);
        } else if (((java.util.HashSet) sVar.f225697a).contains(format)) {
            ((java.util.HashSet) sVar.f225697a).remove(format);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65499xdd68ad86(sVar.f225699c, this.f225689d, this.f225690e, "json", "null");
        }
    }
}
