package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b f165514d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.b bVar) {
        this.f165514d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList;
        synchronized (this.f165514d.f165507o) {
            arrayList = new java.util.ArrayList(this.f165514d.f165508p);
            this.f165514d.f165508p.clear();
            this.f165514d.f165508p = null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d0) it.next()).a();
        }
    }
}
