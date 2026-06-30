package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 f288232d;

    public f1(com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434) {
        this.f288232d = c22293x1808c434;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = this.f288232d;
        if (!c22293x1808c434.f287888f) {
            java.lang.String[] strArr = c01.e2.f118665p;
            int i17 = 0;
            if (c22293x1808c434.f287891i == 1) {
                c22293x1808c434.f287889g = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).O(false, strArr, c01.z1.r(), "weixin", "helper_entry", "filehelper");
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
                java.lang.String[] strArr2 = {c01.z1.r(), "weixin", "helper_entry", "filehelper"};
                com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17;
                k4Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(username) from rcontact where type & 1 !=0 and type & 32 =0 and type & 8 =0 and verifyFlag & 8 = 0");
                l75.e0 e0Var = com.p314xaae8f345.mm.p670x38b72420.s.G2;
                sb6.append(c01.e2.c(dm.i4.f66875xa013b0d5, new java.lang.String[]{"@chatroom", "@im.chatroom"}, new java.lang.String[0]));
                if (strArr != null && strArr.length > 0) {
                    for (java.lang.String str : strArr) {
                        sb6.append(" and rcontact.username != '");
                        sb6.append(str);
                        sb6.append("'");
                    }
                }
                for (int i18 = 0; i18 < 4; i18++) {
                    java.lang.String str2 = strArr2[i18];
                    sb6.append(" and rcontact.username != '");
                    sb6.append(str2);
                    sb6.append("'");
                }
                android.database.Cursor f17 = k4Var.f276604d.f(sb6.toString(), null, 2);
                if (f17 != null && f17.moveToFirst()) {
                    i17 = f17.getInt(0);
                    f17.close();
                }
                c22293x1808c434.f287889g = i17;
            }
        }
        int i19 = c22293x1808c434.f287889g;
        c22293x1808c434.post(new com.p314xaae8f345.mm.ui.p2690x38b72420.e1(this));
    }
}
