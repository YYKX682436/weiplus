package com.tencent.mm.modelstat;

/* loaded from: classes11.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f71593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f71594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f71595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f71596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelstat.t f71597h;

    public w(com.tencent.mm.modelstat.t tVar, int i17, int i18, java.lang.String str, int i19, java.lang.String str2, boolean z17) {
        this.f71597h = tVar;
        this.f71593d = i17;
        this.f71594e = i18;
        this.f71595f = i19;
        this.f71596g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71597h.getClass();
        if (gm0.j1.b().m()) {
            int i17 = this.f71593d;
            int i18 = this.f71594e;
            int i19 = this.f71595f;
            boolean z17 = this.f71596g;
            if (i17 == 4) {
                if (z17) {
                    com.tencent.mm.modelstat.b0.b(i19, 0L, i18);
                    return;
                } else {
                    com.tencent.mm.modelstat.b0.a(i19, 0L, i18);
                    return;
                }
            }
            if (i17 != 5) {
                if (i17 != 8) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.c3.a("dns_failed_report");
            } else if (z17) {
                com.tencent.mm.modelstat.b0.b(0L, i19, i18);
            } else {
                com.tencent.mm.modelstat.b0.a(0L, i19, i18);
            }
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|report";
    }
}
