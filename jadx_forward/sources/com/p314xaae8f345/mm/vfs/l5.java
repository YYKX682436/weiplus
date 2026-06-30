package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public abstract class l5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f294600d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f294601e;

    public l5(java.lang.String str, java.lang.String str2) {
        this.f294600d = str.replace('/', (char) 0);
        this.f294601e = str2;
    }

    /* renamed from: toString */
    public java.lang.String m82428x9616526c() {
        return this.f294600d.replace((char) 0, '/') + " -> " + this.f294601e;
    }
}
