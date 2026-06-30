package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class c0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 f182067d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.AbstractActivityC13548xbf543800 abstractActivityC13548xbf543800) {
        this.f182067d = abstractActivityC13548xbf543800;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.FavoriteBaseUI#dataSetChangedJob";
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f182067d.A) {
            this.f182067d.l7();
            this.f182067d.d7().c();
            this.f182067d.n7();
        }
    }
}
