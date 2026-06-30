package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class us implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f217703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f217704e;

    public us(android.content.res.Configuration configuration, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar) {
        this.f217703d = configuration;
        this.f217704e = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.res.Configuration configuration = this.f217703d;
        int i17 = configuration.orientation;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = this.f217704e;
        if (i17 == 2) {
            ptVar.T6(configuration);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = ptVar.Q;
        if (c15196x85976f5f != null) {
            c15196x85976f5f.Y(null, true);
        }
        ptVar.Q = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.b7(this.f217704e, null, null, null, 7, null);
    }
}
