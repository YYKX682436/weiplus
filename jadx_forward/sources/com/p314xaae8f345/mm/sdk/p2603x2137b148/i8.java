package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes9.dex */
public class i8 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f274280a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f274281b;

    public i8(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = this.f274280a;
        if (arrayList == null) {
            this.f274280a = new java.util.ArrayList();
            this.f274281b = new java.util.ArrayList();
        } else {
            arrayList.clear();
            this.f274281b.clear();
        }
        a(null);
    }

    public void a(java.lang.String str) {
        this.f274280a.add(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        this.f274281b.add(str);
    }

    public void b() {
        ((java.lang.Long) this.f274280a.get(0)).longValue();
        for (int i17 = 1; i17 < this.f274280a.size(); i17++) {
            ((java.lang.Long) this.f274280a.get(i17)).longValue();
            ((java.lang.Long) this.f274280a.get(i17 - 1)).longValue();
        }
    }
}
