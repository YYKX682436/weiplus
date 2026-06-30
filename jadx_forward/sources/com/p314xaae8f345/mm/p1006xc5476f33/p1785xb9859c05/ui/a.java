package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f224274a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f224275b;

    /* renamed from: c, reason: collision with root package name */
    public int f224276c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f224277d;

    public a(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f224274a = str;
        this.f224275b = str2;
        this.f224276c = i17;
        this.f224277d = str3;
    }

    public int a() {
        if (this.f224276c == 0) {
            return 0;
        }
        java.lang.String[] strArr = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16132x1cb7ea88.f224099r;
        for (int i17 = 0; i17 < 26; i17++) {
            if (strArr[i17].equals(java.lang.String.valueOf((char) this.f224276c))) {
                return this.f224276c;
            }
        }
        return "#".charAt(0);
    }
}
