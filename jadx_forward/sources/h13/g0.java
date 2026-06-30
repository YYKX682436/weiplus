package h13;

/* loaded from: classes10.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h13.l0 f359661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i13.j f359662e;

    public g0(h13.l0 l0Var, i13.j jVar) {
        this.f359661d = l0Var;
        this.f359662e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h13.l0 l0Var = this.f359661d;
        l0Var.getClass();
        i13.j notifyInfo = this.f359662e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyInfo, "notifyInfo");
        i13.n a17 = i13.n.f368830c.a();
        a17.getClass();
        if (a17.f368833b.contains(notifyInfo.f66499xaeadb4bb)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotifyItemMgr", "add info failed, historyIdSet contains " + notifyInfo.f66499xaeadb4bb);
        } else if (notifyInfo.f66501x2253a77f == 0) {
            i13.m mVar = new i13.m(a17);
            java.lang.String field_ForcePushId = notifyInfo.f66499xaeadb4bb;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ForcePushId, "field_ForcePushId");
            if (r26.i0.n(field_ForcePushId, "@miniapp", false)) {
                ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Di(notifyInfo.f66503x11b86abb, new m13.c(notifyInfo, mVar));
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(notifyInfo.f66503x11b86abb, true);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transformMsgItem, forcePushId:");
                sb6.append(notifyInfo.f66499xaeadb4bb);
                sb6.append(" username:");
                sb6.append(notifyInfo.f66503x11b86abb);
                sb6.append(" nickname:");
                java.lang.String g27 = n17 != null ? n17.g2() : null;
                if (g27 == null) {
                    g27 = "";
                }
                sb6.append(g27);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ForceNotifyUtil", sb6.toString());
                java.lang.String str = notifyInfo.f66499xaeadb4bb;
                java.lang.String str2 = notifyInfo.f66503x11b86abb;
                java.lang.String g28 = n17 != null ? n17.g2() : null;
                java.lang.String str3 = g28 == null ? "" : g28;
                long j17 = notifyInfo.f66495x81959a6e;
                java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fev);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                mVar.mo146xb9724478(new i13.p(str, str2, str3, string, j17, null));
            }
        }
        if (l0Var.Ri()) {
            l0Var.hj(false);
        } else {
            l0Var.ij();
        }
    }
}
