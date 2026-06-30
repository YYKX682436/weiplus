package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes10.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 f281493d;

    public t3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 u3Var) {
        this.f281493d = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u3 u3Var = this.f281493d;
        int m17 = u3Var.f280113d.m();
        int j17 = u3Var.f280113d.j() - m17;
        int o17 = u3Var.f280113d.o() - m17;
        if (j17 < 0 || j17 > o17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingFinderLiveNotifyComponent", "tryRefresh error,index start:%d,end:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(o17));
            u3Var.f281582f = true;
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = u3Var.f280113d.f542250l;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = abstractC21611x7536149b instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) abstractC21611x7536149b : null;
        if (c21628xcedb13ea == null) {
            return;
        }
        sb5.z zVar = c21628xcedb13ea.f279801s;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
        int mo8143x7444f759 = kVar.mo8143x7444f759();
        if (j17 <= o17) {
            while (j17 < mo8143x7444f759) {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = kVar.mo75871xfb80e389(j17);
                if (mo75871xfb80e389 != null && mo75871xfb80e389.mo78013xfb85f7b0() == 1075839025) {
                    java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(mo75871xfb80e389.j(), "msg", null);
                    int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.live_widget.status"), 0);
                    java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
                    if (str == null) {
                        str = "";
                    }
                    boolean wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.t6) ((s40.b1) i95.n0.c(s40.b1.class))).wi(mo75871xfb80e389.m124847x74d37ac6(), 4);
                    if (wi6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingFinderLiveNotifyComponent", "can not add to refresh, tipsId = " + str + " ,status = " + D1 + "notRefresh = " + wi6);
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                        vd2.j2 j2Var = vd2.j2.f517305a;
                        vd2.j2.f517306b.remove(str);
                    } else {
                        linkedList.add(mo75871xfb80e389);
                    }
                }
                if (j17 == o17) {
                    break;
                } else {
                    j17++;
                }
            }
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        vd2.j2.f517305a.a(linkedList);
    }
}
