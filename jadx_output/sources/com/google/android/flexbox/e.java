package com.google.android.flexbox;

/* loaded from: classes15.dex */
public class e implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public int f44250d;

    /* renamed from: e, reason: collision with root package name */
    public int f44251e;

    public e(com.google.android.flexbox.c cVar) {
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.google.android.flexbox.e eVar = (com.google.android.flexbox.e) obj;
        int i17 = this.f44251e;
        int i18 = eVar.f44251e;
        return i17 != i18 ? i17 - i18 : this.f44250d - eVar.f44250d;
    }

    public java.lang.String toString() {
        return "Order{order=" + this.f44251e + ", index=" + this.f44250d + '}';
    }
}
