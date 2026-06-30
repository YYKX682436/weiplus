package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* loaded from: classes7.dex */
public class x0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f173619e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f173620f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f173621g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12801xf64f5416 f173622h;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12801xf64f5416 c12801xf64f5416, boolean z17) {
        this.f173622h = c12801xf64f5416;
        this.f173621g = true;
        this.f173621g = z17;
    }

    @Override // wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.AppBrandTask.AppBrandTaskContainer";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12801xf64f5416 c12801xf64f5416;
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4> arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "run UpdateAppBrandTaskDataTask");
        synchronized (this.f173622h.f173426p) {
            c12801xf64f5416 = this.f173622h;
            c12801xf64f5416.f173427q = true;
        }
        int m53629xbe9e5d78 = c12801xf64f5416.m53629xbe9e5d78();
        c12801xf64f5416.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "query");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("count", m53629xbe9e5d78);
        bundle.putInt("versionType", Integer.MAX_VALUE);
        android.os.Parcel parcel = (android.os.Parcel) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12801xf64f5416.a.class);
        if (parcel == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(m53629xbe9e5d78);
            parcel.readTypedList(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4.f33506x681a0c0c);
        }
        ((java.util.ArrayList) this.f173619e).clear();
        ((java.util.ArrayList) this.f173620f).clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "[UpdateAppBrandTaskDataTask] getRecentShowCount: %d", java.lang.Integer.valueOf(this.f173622h.m53630xfa587dc1()));
        if (arrayList != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 mo52197x7520bed6 = this.f173622h.m53636x9e8ccd54() != null ? this.f173622h.m53636x9e8ccd54().mo52197x7520bed6() : null;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 : arrayList) {
                if (mo52197x7520bed6 == null || !c11714x918fd2e4.f157894d.equals(mo52197x7520bed6.f157894d) || c11714x918fd2e4.f157896f != mo52197x7520bed6.f157896f) {
                    if (((java.util.ArrayList) this.f173619e).size() < this.f173622h.m53630xfa587dc1()) {
                        ((java.util.ArrayList) this.f173619e).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0(c11714x918fd2e4, 1));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "recent info %s, %s, %s, %s, %s, %d", c11714x918fd2e4.f157894d, c11714x918fd2e4.f157898h, c11714x918fd2e4.f157900m, c11714x918fd2e4.f157901n, c11714x918fd2e4.f157895e, java.lang.Integer.valueOf(c11714x918fd2e4.f157896f));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandTaskContainer", "[UpdateAppBrandTaskDataTask] data size: %d, ", java.lang.Integer.valueOf(((java.util.ArrayList) this.f173619e).size()));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.w0(this));
    }
}
