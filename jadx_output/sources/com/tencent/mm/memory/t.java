package com.tencent.mm.memory;

/* loaded from: classes4.dex */
public class t implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f68978d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68979e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f68980f;

    public t(int i17, int i18) {
        this.f68978d = i17;
        this.f68979e = i18;
        this.f68980f = java.lang.String.format("SightBitmapSize: [%s, %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.mm.memory.t)) {
            return 0;
        }
        com.tencent.mm.memory.t tVar = (com.tencent.mm.memory.t) obj;
        int i17 = this.f68979e;
        int i18 = this.f68978d;
        int i19 = tVar.f68979e;
        int i27 = tVar.f68978d;
        if (i18 == i27 && i17 == i19) {
            return 0;
        }
        return i18 * i17 > i27 * i19 ? 1 : -1;
    }

    public java.lang.String toString() {
        return this.f68980f;
    }
}
