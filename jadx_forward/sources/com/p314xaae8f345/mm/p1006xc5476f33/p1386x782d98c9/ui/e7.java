package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class e7 {

    /* renamed from: a, reason: collision with root package name */
    public final r32.d f180980a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180981b;

    /* renamed from: c, reason: collision with root package name */
    public int f180982c;

    public e7(int i17, int i18, java.lang.String str, java.lang.String str2, r32.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.c7 c7Var) {
        this.f180981b = i17;
        this.f180982c = i18;
        if (i17 != 0) {
            if (dVar != null) {
                this.f180980a = dVar;
                return;
            }
            r32.d dVar2 = new r32.d();
            dVar2.f67224xdec927b = str2;
            dVar2.f67217x84a2aa32 = str;
            dVar2.f67220xaedf8d95 = 0;
            dVar2.f67222x3a0346c9 = 0;
            dVar2.f67219xde6292c = "";
            dVar2.f67218x9113f2d3 = 0;
            dVar2.f67221x29cc1f0d = 0;
            this.f180980a = dVar2;
        }
    }

    /* renamed from: toString */
    public java.lang.String m55091x9616526c() {
        java.lang.String str;
        java.lang.String str2 = "{ view type: " + this.f180981b + " display flag: " + this.f180982c;
        r32.d dVar = this.f180980a;
        if (dVar != null) {
            str = str2 + dVar.m161431x9616526c();
        } else {
            str = str2 + " mExdeviceRankInfo is null";
        }
        return str + "}";
    }
}
