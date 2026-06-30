package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f88240a;

    /* renamed from: b, reason: collision with root package name */
    public int f88241b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f88242c;

    /* renamed from: d, reason: collision with root package name */
    public int f88243d;

    public m1(int i17) {
    }

    public void a(int i17) {
        this.f88242c++;
        this.f88240a += i17;
        int i18 = this.f88241b;
        if (i17 > i18) {
            i18 = i17;
        }
        this.f88241b = i18;
        this.f88243d = i17;
    }
}
