package rl2;

/* loaded from: classes10.dex */
public class l extends be2.i {

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f478736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(l75.k0 k0Var) {
        super(k0Var, ce2.l.Q, "FinderLiveNotifyExposureInfo", dm.r4.f321141w);
        l75.e0 e0Var = ce2.l.Q;
        this.f478736e = k0Var;
    }

    public ce2.l D0(java.lang.String str) {
        android.database.Cursor B = this.f478736e.B("select *, rowid from FinderLiveNotifyExposureInfo where revokeId = '" + str + "'", null);
        ce2.l lVar = new ce2.l();
        lVar.f68167xe8897e6 = str;
        if (B != null) {
            if (B.moveToFirst()) {
                lVar.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        return lVar;
    }

    public java.util.ArrayList J0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ae2.in inVar = ae2.in.f85221a;
        long intValue = ((java.lang.Integer) ((lb2.j) ((jz5.n) ae2.in.f85247c5).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[getLast48HourItem] duration = " + intValue);
        android.database.Cursor B = this.f478736e.B("select *, rowid from FinderLiveNotifyExposureInfo where insertTime > " + (((long) c01.id.e()) - intValue), null);
        while (B.moveToNext()) {
            ce2.l lVar = new ce2.l();
            lVar.mo9015xbf5d97fd(B);
            arrayList.add(lVar);
        }
        B.close();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            sb6.append(((ce2.l) arrayList.get(i17)).f68169x11c19d58);
            sb6.append(",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[getLast48HourItem] result = " + ((java.lang.Object) sb6));
        return arrayList;
    }

    public void L0(long j17, int i17) {
        ce2.l z07 = z0(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "updateLiveStatus ,msgId = " + j17 + ", liveStatus = " + i17);
        if (z07.f72763xa3c65b86 != -1) {
            z07.f68164xed074063 = i17;
            mo51732xbf274172(z07, false, new java.lang.String[0]);
        }
    }

    public boolean y0(long j17) {
        ce2.l z07 = z0(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveNotifyExposureInfoStorage", "[delByMsgId] msgId = " + j17 + ",tipsId = " + z07.f68169x11c19d58);
        long j18 = z07.f72763xa3c65b86;
        if (j18 != -1) {
            return mo60485xc9e4dcd4(j18, false);
        }
        return false;
    }

    public ce2.l z0(long j17) {
        android.database.Cursor B = this.f478736e.B("select *, rowid from FinderLiveNotifyExposureInfo where msgId = " + j17, null);
        ce2.l lVar = new ce2.l();
        lVar.f68165x297eb4f7 = j17;
        if (B != null) {
            if (B.moveToFirst()) {
                lVar.mo9015xbf5d97fd(B);
            }
            B.close();
        }
        return lVar;
    }
}
