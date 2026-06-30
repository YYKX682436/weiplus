package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 f283741d;

    public f0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 h0Var) {
        this.f283741d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb Di;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        int i17 = 0;
        android.database.Cursor k17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).k1(this.f283741d.f283769e, 0, -1);
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
        if (k17 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.h0 h0Var = this.f283741d;
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (k17.moveToNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.mo9015xbf5d97fd(k17);
                    if (f9Var.m124847x74d37ac6() == h0Var.f283775n) {
                        break;
                    }
                }
                int i18 = 0;
                while (k17.moveToNext() && i18 < 50) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var2.mo9015xbf5d97fd(k17);
                    java.lang.String j18 = f9Var2.j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j18);
                    java.lang.String[] strArr = new java.lang.String[1];
                    strArr[i17] = ":";
                    java.util.List f07 = r26.n0.f0(j18, strArr, false, 0, 6, null);
                    if (f07.size() > 3 && (Di = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).Di((java.lang.String) f07.get(3))) != null && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(h0Var.f283773i, "") || h0Var.d(Di, h0Var.f283773i))) {
                        zb5.c cVar = new zb5.c();
                        cVar.f552841a = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) Di;
                        cVar.f552842b = f9Var2;
                        cVar.f552843c = i17;
                        j17 = currentTimeMillis3;
                        java.lang.String c17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().c(new java.util.Date(f9Var2.mo78012x3fdd41df()), h0Var.f283768d);
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, h0Var.f283774m)) {
                            zb5.c cVar2 = new zb5.c();
                            cVar2.f552843c = 1;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                            cVar2.f552844d = c17;
                            arrayList.add(cVar2);
                            h0Var.f283774m = c17;
                        }
                        arrayList.add(cVar);
                        i18++;
                        currentTimeMillis3 = j17;
                        i17 = 0;
                    }
                    j17 = currentTimeMillis3;
                    currentTimeMillis3 = j17;
                    i17 = 0;
                }
                long j19 = currentTimeMillis3;
                if (i18 != 0 && i18 < 50) {
                    zb5.c cVar3 = new zb5.c();
                    cVar3.f552843c = 2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListPresenter", "[loadMore] :: no more data found in DB");
                    arrayList.add(cVar3);
                }
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.e0(h0Var, arrayList));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiHistoryListPresenter", "[loadMore][perf][final] total cost:%dms, dbQuery:%dms, process+notifyUI:%dms, items:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(j19), java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - currentTimeMillis) - j19), java.lang.Integer.valueOf(i18));
                try {
                    h0Var.f283775n = k17.getLong(k17.getColumnIndex("msgId"));
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiHistoryListPresenter", "loadData cursor is null!!");
                }
                vz5.b.a(k17, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(k17, th6);
                    throw th7;
                }
            }
        }
    }
}
