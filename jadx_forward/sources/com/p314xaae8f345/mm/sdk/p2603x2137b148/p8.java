package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class p8 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.r8 {

    /* renamed from: a, reason: collision with root package name */
    public int f274465a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f274466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f274467c;

    public p8(java.lang.StringBuilder sb6, java.util.ArrayList arrayList) {
        this.f274466b = sb6;
        this.f274467c = arrayList;
    }

    public void a(java.lang.String str) {
        if (this.f274465a < 30) {
            java.lang.StringBuilder sb6 = this.f274466b;
            sb6.append(str);
            sb6.append('\n');
        } else {
            this.f274467c.add(str);
        }
        this.f274465a++;
    }
}
