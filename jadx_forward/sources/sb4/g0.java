package sb4;

/* loaded from: classes4.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a f487033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb4.h0 f487034e;

    public g0(sb4.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a activityC18144x3e20023a) {
        this.f487034e = h0Var;
        this.f487033d = activityC18144x3e20023a;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = "run";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a activityC18144x3e20023a = this.f487033d;
        if (activityC18144x3e20023a.f249175y) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
            return;
        }
        if (activityC18144x3e20023a.f249165o != null) {
            android.database.Cursor S1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().S1(activityC18144x3e20023a.f249165o, ca4.z0.s0(activityC18144x3e20023a.f249163m), ca4.z0.s0(activityC18144x3e20023a.f249164n));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (S1 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsWsFoldDetailAdapter", "cursor == null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                return;
            }
            if (!S1.moveToFirst()) {
                S1.close();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsWsFoldDetailAdapter", "cursor.moveToFirst == false");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                return;
            }
            if (activityC18144x3e20023a.f249175y) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                return;
            }
            do {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                    c17933xe8d1b226.mo9015xbf5d97fd(S1);
                    arrayList.add(c17933xe8d1b226);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str = str2;
                }
            } while (S1.moveToNext());
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) it.next();
                int i18 = size;
                java.util.Iterator it6 = it;
                str = str2;
                try {
                    arrayList2.add(ca4.z0.D0(c17933xe8d1b2262, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(c17933xe8d1b2262), this.f487033d, this.f487034e.a(), i17 < size, activityC18144x3e20023a.f249160g, activityC18144x3e20023a.f249167q, activityC18144x3e20023a.f249169s, activityC18144x3e20023a.f249170t, activityC18144x3e20023a.f249171u));
                    i17++;
                    size = i18;
                    it = it6;
                    str2 = str;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    S1.close();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
                    throw th;
                }
            }
            str = str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsWsFoldDetailAdapter", "loadData finish, snsInfoList.size:%s, structlist.size:%s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(arrayList2.size()));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Tj().mo50293x3498a0(new sb4.f0(this, arrayList2));
            S1.close();
            str2 = str;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.adapter.SnsWsFoldDetailAdapter$1");
    }
}
