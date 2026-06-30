package wl3;

/* loaded from: classes15.dex */
public class p implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final long f528610d;

    /* renamed from: e, reason: collision with root package name */
    public android.text.StaticLayout f528611e;

    /* renamed from: f, reason: collision with root package name */
    public float f528612f = Float.MIN_VALUE;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.p1912x373aa5.C16641x95e58cfe c16641x95e58cfe, long j17, java.lang.String str) {
        this.f528610d = j17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        wl3.p pVar = (wl3.p) obj;
        if (pVar == null) {
            return -1;
        }
        return (int) (this.f528610d - pVar.f528610d);
    }
}
