package df2;

/* loaded from: classes3.dex */
public final class sh extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.vh f312873b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh(df2.vh vhVar, java.lang.Class cls) {
        super(cls);
        this.f312873b = vhVar;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312873b.f313135m, "startPollingBannerData onPollingFail ret:" + i17 + ",errMsg:" + errMsg);
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.lang.Object obj;
        r45.dc2 result = (r45.dc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.vh vhVar = this.f312873b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vhVar.f313135m, "startPollingBannerData onPollingSuccess");
        je2.n nVar = (je2.n) vhVar.m56788xbba4bfc0(je2.n.class);
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862> m75941xfb821914 = result.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getJump_infos(...)");
        nVar.getClass();
        boolean isEmpty = m75941xfb821914.isEmpty();
        java.lang.String str = nVar.f380778f;
        java.util.LinkedList linkedList = null;
        if (!isEmpty) {
            for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 : m75941xfb821914) {
                r45.wq1 O6 = nVar.O6(c19786x6a1e2862.m76489xefafd82());
                if (O6 != null) {
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                    }
                    java.lang.String m75945x2fec8307 = O6.m75945x2fec8307(0);
                    if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "convertJumpInfoListToGameDataList err,ext info id is null!");
                        obj = jz5.f0.f384359a;
                    } else {
                        java.lang.String m75945x2fec83072 = O6.m75945x2fec8307(0);
                        if (m75945x2fec83072 == null) {
                            m75945x2fec83072 = "";
                        }
                        obj = java.lang.Boolean.valueOf(linkedList.add(new je2.j(m75945x2fec83072, O6, c19786x6a1e2862)));
                    }
                    if (obj == null) {
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "convertJumpInfoListToGameDataList err,convert extInfo fail!");
            }
        }
        if (linkedList != null) {
            java.util.Iterator it = nVar.Q6().iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                je2.j jVar = (je2.j) it.next();
                java.util.Iterator it6 = linkedList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((je2.j) it6.next()).f380770a, jVar.f380770a)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (!(i17 != -1)) {
                    it.remove();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "delete game data banner:" + jVar);
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                pm0.v.X(new je2.l(nVar, (je2.j) it7.next()));
            }
        }
    }
}
