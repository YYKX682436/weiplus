package vd2;

/* loaded from: classes3.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f517533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f517535f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6 f517536g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f517537h;

    public x3(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5502x94939ae6 c5502x94939ae6, long j17) {
        this.f517533d = arrayList;
        this.f517534e = c14167x40aca97c;
        this.f517535f = f0Var;
        this.f517536g = c5502x94939ae6;
        this.f517537h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f517533d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e b17 = ((km2.t) it.next()).b();
            if (b17 != null && b17.f150082s == this.f517537h) {
                break;
            } else {
                i17++;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517534e;
        if (i17 >= 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                km2.m mVar = ((km2.t) it6.next()).f390755d;
                if (mVar != null) {
                    arrayList2.add(mVar);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c.j(c14167x40aca97c, i17, new java.util.ArrayList(arrayList2));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "FinderLiveUninterestedEvent: newCurIndex=" + i17 + ", curIndex=" + this.f517535f.f391649d);
        if (this.f517536g.f135834g.f88204b) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c14167x40aca97c.f193017f;
            db5.t7.i(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573338ea5), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
    }
}
