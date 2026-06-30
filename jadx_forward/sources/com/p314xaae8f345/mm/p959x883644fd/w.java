package com.p314xaae8f345.mm.p959x883644fd;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f153126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f153127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f153129g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p959x883644fd.t f153130h;

    public w(com.p314xaae8f345.mm.p959x883644fd.t tVar, int i17, int i18, java.lang.String str, int i19, java.lang.String str2, boolean z17) {
        this.f153130h = tVar;
        this.f153126d = i17;
        this.f153127e = i18;
        this.f153128f = i19;
        this.f153129g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f153130h.getClass();
        if (gm0.j1.b().m()) {
            int i17 = this.f153126d;
            int i18 = this.f153127e;
            int i19 = this.f153128f;
            boolean z17 = this.f153129g;
            if (i17 == 4) {
                if (z17) {
                    com.p314xaae8f345.mm.p959x883644fd.b0.b(i19, 0L, i18);
                    return;
                } else {
                    com.p314xaae8f345.mm.p959x883644fd.b0.a(i19, 0L, i18);
                    return;
                }
            }
            if (i17 != 5) {
                if (i17 != 8) {
                    return;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("dns_failed_report");
            } else if (z17) {
                com.p314xaae8f345.mm.p959x883644fd.b0.b(0L, i19, i18);
            } else {
                com.p314xaae8f345.mm.p959x883644fd.b0.a(0L, i19, i18);
            }
        }
    }

    /* renamed from: toString */
    public java.lang.String m48200x9616526c() {
        return super.toString() + "|report";
    }
}
