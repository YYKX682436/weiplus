package com.p314xaae8f345.mm.p872xbfc2bd01;

/* loaded from: classes4.dex */
public class t implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f150511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f150512e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f150513f;

    public t(int i17, int i18) {
        this.f150511d = i17;
        this.f150512e = i18;
        this.f150513f = java.lang.String.format("SightBitmapSize: [%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.p314xaae8f345.mm.p872xbfc2bd01.t)) {
            return 0;
        }
        com.p314xaae8f345.mm.p872xbfc2bd01.t tVar = (com.p314xaae8f345.mm.p872xbfc2bd01.t) obj;
        int i17 = this.f150512e;
        int i18 = this.f150511d;
        int i19 = tVar.f150512e;
        int i27 = tVar.f150511d;
        if (i18 == i27 && i17 == i19) {
            return 0;
        }
        return i18 * i17 > i27 * i19 ? 1 : -1;
    }

    /* renamed from: toString */
    public java.lang.String m46891x9616526c() {
        return this.f150513f;
    }
}
