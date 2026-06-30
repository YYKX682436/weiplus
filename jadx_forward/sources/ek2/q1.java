package ek2;

/* loaded from: classes3.dex */
public final class q1 {
    public q1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.hx0 a(java.util.ArrayList commentDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentDataList, "commentDataList");
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 5);
        r45.pi2 pi2Var = new r45.pi2();
        r45.o92 o92Var = new r45.o92();
        java.util.Iterator it = commentDataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                pi2Var.set(0, o92Var);
                hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(pi2Var.mo14344x5f01b1f6()));
                return hx0Var;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (str.length() > 0) {
                o92Var.m75941xfb821914(0).add(str);
            }
        }
    }

    public final r45.hx0 b(java.lang.String appid, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModBasicInfo", "makeCmdItemForGameRank appid:" + appid + ", turnOn:" + z17);
        r45.p02 p02Var = new r45.p02();
        p02Var.set(0, appid);
        p02Var.set(1, java.lang.Integer.valueOf(z17 ? 1 : 2));
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 2);
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(p02Var.mo14344x5f01b1f6()));
        return hx0Var;
    }

    public final r45.hx0 c(java.lang.String desc, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 3);
        r45.a12 a12Var = new r45.a12();
        a12Var.set(0, desc);
        a12Var.set(1, str);
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(a12Var.mo14344x5f01b1f6()));
        return hx0Var;
    }

    public final r45.hx0 d(r45.lw1 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModBasicInfo", "makeCmdItemForModifyLiveCoverImage");
        r45.y02 y02Var = new r45.y02();
        y02Var.m75941xfb821914(0).add(info);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 15);
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(y02Var.mo14344x5f01b1f6()));
        return hx0Var;
    }

    public final r45.hx0 e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModBasicInfo", "makeCmdItemForVisitorHonorRank isEnable:" + z17);
        r45.q02 q02Var = new r45.q02();
        q02Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 13);
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(q02Var.mo14344x5f01b1f6()));
        return hx0Var;
    }

    public final r45.hx0 f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLiveModBasicInfo", "make visible public isTestLive: " + z17);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 23);
        r45.v02 v02Var = new r45.v02();
        v02Var.set(0, 1);
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(v02Var.mo14344x5f01b1f6()));
        return hx0Var;
    }
}
