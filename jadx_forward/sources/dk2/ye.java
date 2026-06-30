package dk2;

/* loaded from: classes3.dex */
public final class ye extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f315924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f315925e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, yz5.a aVar) {
        super(1);
        this.f315924d = activityC0065xcd7aa112;
        this.f315925e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        int i17;
        java.util.List list = (java.util.List) obj;
        if (list != null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f315924d;
            mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
            if (c1Var != null && c1Var.Y4) {
                if (list.isEmpty() ^ true) {
                    db5.t7.m123883x26a183b(activityC0065xcd7aa112, activityC0065xcd7aa112.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fw6), 1).show();
                }
            }
            dk2.k6 k6Var = dk2.ef.f314923j;
            k6Var.getClass();
            boolean z17 = list.isEmpty() ^ true;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4((java.lang.String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                i17 = arrayList.size();
            } else {
                i17 = 0;
            }
            int size = z17 ? list.size() - i17 : 0;
            java.util.List<os5.n> externalLiveCallbacks = k6Var.f315216a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(externalLiveCallbacks, "externalLiveCallbacks");
            synchronized (externalLiveCallbacks) {
                for (os5.n nVar : externalLiveCallbacks) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveExternalHelper", "onShareToConversation result:" + z17 + " shareUserCount:" + i17 + " shareRoomCount:" + size);
                    ((h63.d1) nVar).e(z17, i17, size);
                }
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            dk2.ef efVar = dk2.ef.f314905a;
            yz5.a aVar = this.f315925e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", "share2Friend fail");
            aVar.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
