package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class wb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f168749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f168750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc f168751f;

    public wb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.dc dcVar, java.lang.String str, java.util.Map map) {
        this.f168751f = dcVar;
        this.f168749d = str;
        this.f168750e = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f168751f.l(this.f168749d, this.f168750e);
    }
}
