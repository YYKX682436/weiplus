package pg3;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vs2 f435740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg3.q f435741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.vs2 vs2Var, pg3.q qVar) {
        super(1);
        this.f435740d = vs2Var;
        this.f435741e = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.f0 f0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LongVideo-Trace, optimize prefetch end, success:");
        sb6.append(booleanValue);
        sb6.append(",redDotCtrlInfo:[business_type:");
        r45.vs2 vs2Var = this.f435740d;
        sb6.append(vs2Var != null ? java.lang.Integer.valueOf(vs2Var.f470038z) : null);
        sb6.append(", uuid:");
        r45.vs2 vs2Var2 = this.f435740d;
        sb6.append(vs2Var2 != null ? vs2Var2.f470036x : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LongVideoFeedsPrefetchService", sb6.toString());
        vn2.a1 a1Var = this.f435741e.f435751f;
        if (a1Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TopStoryMegaVideoPreload", "LongVideo-Trace, optimize onPreloadEnd listener size=" + a1Var.a().size());
            java.util.LinkedList<java.lang.ref.WeakReference> a17 = a1Var.a();
            synchronized (a17) {
                for (java.lang.ref.WeakReference weakReference : a17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.h hVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.h) weakReference.get();
                    if (hVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.y) hVar;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14438x701c8eca.b(yVar.f202566a, yVar.f202567b);
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.TopStoryMegaVideoPreload", "onPreloadEnd but listener " + weakReference + " is null!");
                    }
                }
                a17.clear();
            }
        }
        this.f435741e.f435751f = null;
        return jz5.f0.f384359a;
    }
}
