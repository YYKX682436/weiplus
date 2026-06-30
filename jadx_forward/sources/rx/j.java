package rx;

@j95.b
/* loaded from: classes9.dex */
public final class j extends i95.w implements sx.c0 {
    public dn.m Ai(com.p314xaae8f345.mm.p947xba6de98f.d1 taskInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        com.p314xaae8f345.mm.p947xba6de98f.b1 bj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.bj();
        if (bj6 == null) {
            return null;
        }
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(taskInfo.f152440c, taskInfo.f152441d, taskInfo.f152445h) || taskInfo.f152446i <= 0 || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(taskInfo.f152439b, taskInfo.f152438a) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(taskInfo.f152450m, taskInfo.f152448k))) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnMediaFSC", "add task illegal, task mediaId:" + taskInfo.f152441d);
            return null;
        }
        dn.m mVar = new dn.m();
        java.lang.String str = taskInfo.f152441d;
        mVar.f69601xaca5bdda = str;
        mVar.f323318d = "task_RecordMsgCDNService";
        mVar.f323319e = false;
        mVar.f69609xd84b8349 = 2;
        mVar.f69606xccdbf540 = false;
        mVar.f69620xeb1a61d6 = taskInfo.f152443f;
        mVar.f69575xf11df5f5 = taskInfo.f152438a;
        mVar.f69591xf9dbbe9c = taskInfo.f152439b;
        java.lang.String T6 = bj6.T6(str);
        if (T6 == null) {
            T6 = "";
        }
        mVar.f69595x6d25b0d9 = T6;
        mVar.f69592xf1ebe47b = taskInfo.f152446i;
        mVar.f69593x419c9c3d = taskInfo.f152451n;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(taskInfo.f152450m)) {
            mVar.f69592xf1ebe47b = 19;
            mVar.f69582x4e093552 = taskInfo.f152449l;
            mVar.f69575xf11df5f5 = taskInfo.f152448k;
            mVar.f323344z = taskInfo.f152450m;
            mVar.f69591xf9dbbe9c = "";
        }
        if (!bj6.V6().contains(mVar.f69601xaca5bdda)) {
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) bj6.f152421h).mo141623x754a37bb(), null, new com.p314xaae8f345.mm.p947xba6de98f.z0(bj6, mVar, taskInfo, ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Di(new kq.a(mVar, com.p314xaae8f345.mm.p947xba6de98f.n3.class)), null), 1, null);
        }
        return mVar;
    }

    public void Bi(com.p314xaae8f345.mm.p947xba6de98f.c1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p947xba6de98f.b1 bj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.bj();
        if (bj6 != null) {
            synchronized (bj6.U6()) {
                bj6.U6().remove(listener);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnMediaFSC", "remove listener " + listener + ", now listener count:" + bj6.U6().size());
        }
    }

    public void wi(com.p314xaae8f345.mm.p947xba6de98f.c1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.mm.p947xba6de98f.b1 bj6 = com.p314xaae8f345.mm.p947xba6de98f.s1.bj();
        if (bj6 != null) {
            java.util.Iterator it = bj6.U6().iterator();
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((com.p314xaae8f345.mm.p947xba6de98f.c1) it.next(), listener)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnMediaFSC", "try add listener " + listener + ", but already add this listener, now listener count:" + bj6.U6().size());
                    return;
                }
            }
            synchronized (bj6.U6()) {
                bj6.U6().add(listener);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnMediaFSC", "add listener " + listener + ", now listener count:" + bj6.U6().size());
        }
    }
}
