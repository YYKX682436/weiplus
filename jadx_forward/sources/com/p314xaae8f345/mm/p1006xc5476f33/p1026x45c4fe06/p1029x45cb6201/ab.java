package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class ab implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public boolean f156971d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Iterator f156972e = null;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 f156973f;

    public ab(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6) {
        this.f156973f = c11667xc7e59dd6;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f156971d) {
            return true;
        }
        if (this.f156972e == null) {
            this.f156972e = this.f156973f.f156935g.iterator();
        }
        return this.f156972e.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f156971d) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e) this.f156972e.next();
        }
        this.f156971d = true;
        return this.f156973f;
    }
}
