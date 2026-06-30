package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public final class pb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac f157258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar) {
        super(0);
        this.f157258d = acVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac acVar = this.f157258d;
        java.util.Set<java.util.Map.Entry> entrySet = acVar.f156979e.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8) entry.getValue()).close();
        }
        acVar.f156979e.clear();
        acVar.f156980f.clear();
        return jz5.f0.f384359a;
    }
}
