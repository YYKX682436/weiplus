package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes7.dex */
public final class g1 implements k91.f5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f157378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f157379b;

    public g1(java.util.List list, yz5.a aVar) {
        this.f157378a = list;
        this.f157379b = aVar;
    }

    @Override // k91.e5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1 k1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157392a;
        java.util.Iterator it = this.f157378a.iterator();
        while (it.hasNext()) {
            java.util.Set g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k1.f157394c.g((java.lang.String) it.next());
            if (g17 == null) {
                g17 = kz5.r0.f395535d;
            }
            java.util.Iterator it6 = g17.iterator();
            while (it6.hasNext()) {
                ((yz5.a) it6.next()).mo152xb9724478();
            }
        }
        this.f157379b.mo152xb9724478();
    }
}
