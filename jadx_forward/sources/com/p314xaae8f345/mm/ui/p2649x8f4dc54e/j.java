package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b f279583d;

    public j(com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b) {
        this.f279583d = activityC21598xfb43db0b;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28 = com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b.f279552x;
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.ActivityC21598xfb43db0b activityC21598xfb43db0b = this.f279583d;
        activityC21598xfb43db0b.getClass();
        if (gm0.j1.a()) {
            java.lang.System.currentTimeMillis();
            java.lang.String str = "";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            android.database.Cursor s17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).s(1, null, activityC21598xfb43db0b.f279558i, -1);
            if (s17 != null) {
                int columnIndex = s17.getColumnIndex("unReadCount");
                int columnIndex2 = s17.getColumnIndex("conversationTime");
                int columnIndex3 = s17.getColumnIndex("flag");
                i17 = s17.getCount();
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
                j17 = 0;
                i18 = 0;
                i19 = 0;
                i27 = 0;
                while (s17.moveToNext()) {
                    java.lang.String str2 = str;
                    l4Var.z1(s17.getLong(columnIndex3));
                    int i29 = s17.getInt(columnIndex);
                    if (i29 > 0) {
                        j17 = s17.getLong(columnIndex2);
                        i18++;
                        i19 += i29;
                    } else {
                        i29 = 0;
                    }
                    sb6.append(s17.isFirst() ? str2 : ".");
                    sb6.append(i29);
                    if (((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).J(l4Var)) {
                        i27++;
                    }
                    str = str2;
                }
                s17.close();
            } else {
                j17 = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i27 = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13771, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17 / 1000), java.lang.Integer.valueOf(i27), sb6.toString());
            java.lang.System.currentTimeMillis();
        }
        if (activityC21598xfb43db0b.f279562p != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13932, java.lang.Integer.valueOf(((int) (java.lang.System.currentTimeMillis() - activityC21598xfb43db0b.f279562p)) / 1000), 2, java.lang.Long.valueOf(activityC21598xfb43db0b.f279565s), 0, java.lang.Integer.valueOf(activityC21598xfb43db0b.f279560n));
        }
        if (activityC21598xfb43db0b.f279555f == null) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.util.Map.Entry entry : activityC21598xfb43db0b.f279555f.f279585J.entrySet()) {
            com.p314xaae8f345.mm.ui.p2649x8f4dc54e.m mVar = (com.p314xaae8f345.mm.ui.p2649x8f4dc54e.m) entry.getValue();
            r45.jp5 jp5Var = new r45.jp5();
            jp5Var.f459542d = (java.lang.String) entry.getKey();
            jp5Var.f459543e = mVar.f459543e;
            jp5Var.f459544f = mVar.f459544f;
            jp5Var.f459548m = mVar.f459548m;
            jp5Var.f459546h = mVar.f279591p > 0;
            jp5Var.f459549n = mVar.f459549n;
            jp5Var.f459545g = mVar.f459545g;
            jp5Var.f459547i = mVar.f459547i;
            linkedList.add(jp5Var);
        }
        gm0.j1.n().f354821b.g(new r01.n3(linkedList));
        linkedList.size();
    }
}
