package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes13.dex */
public class i5 extends android.telephony.PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.l5 f274271a;

    public i5(com.p314xaae8f345.mm.sdk.p2603x2137b148.l5 l5Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.g5 g5Var) {
        this.f274271a = l5Var;
    }

    @Override // android.telephony.PhoneStateListener
    public void onCallStateChanged(int i17, java.lang.String str) {
        java.util.ArrayList arrayList;
        synchronized (this.f274271a.f274370d) {
            arrayList = new java.util.ArrayList(this.f274271a.f274370d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneStatusWatcher", "onCallStateChanged state: %d", java.lang.Integer.valueOf(i17));
        if (arrayList.size() > 0) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.h5) it.next()).a(i17);
            }
        }
        for (fs.q qVar : ((fs.c) fs.g.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.j5.class)).all()) {
            if (fs.g.d(fs.g.f347619c, qVar)) {
                ((ll3.n0) ((com.p314xaae8f345.mm.sdk.p2603x2137b148.j5) ((fs.n) qVar.get()))).b(i17);
            }
        }
        super.onCallStateChanged(i17, str);
    }
}
