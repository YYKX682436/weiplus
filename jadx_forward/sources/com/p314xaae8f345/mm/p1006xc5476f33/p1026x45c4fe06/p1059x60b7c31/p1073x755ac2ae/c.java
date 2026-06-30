package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae;

/* loaded from: classes7.dex */
public class c implements ob1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e f161584a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.e eVar) {
        this.f161584a = eVar;
    }

    @Override // ob1.k
    public void a(java.lang.String str, boolean z17) {
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f161584a.f161593h).iterator();
        while (it.hasNext()) {
            ((ob1.k) it.next()).a(str, z17);
        }
    }
}
