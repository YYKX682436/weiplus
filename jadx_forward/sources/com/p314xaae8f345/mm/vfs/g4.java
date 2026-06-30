package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class g4 implements pm5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.io.File f294484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.h4 f294485e;

    public g4(com.p314xaae8f345.mm.vfs.h4 h4Var, java.io.File file) {
        this.f294485e = h4Var;
        this.f294484d = file;
    }

    @Override // pm5.j
    public java.lang.Object d(java.lang.Object obj) {
        return this.f294485e.K(new java.io.File(this.f294484d, (java.lang.String) obj));
    }
}
