package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 f178156e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1, int i17) {
        this.f178156e = abstractActivityC13156x6363e8e1;
        this.f178155d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f178155d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "huahuastart: onNotifyItemChanged,position is %d", java.lang.Integer.valueOf(i17));
        this.f178156e.f178031e.m8147xed6e4d18(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorActivityUI", "huahuaend: onNotifyItemChanged,position is %d", java.lang.Integer.valueOf(i17));
    }
}
