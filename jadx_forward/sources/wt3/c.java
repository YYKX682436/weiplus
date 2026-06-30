package wt3;

/* loaded from: classes5.dex */
public final class c implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wt3.e f530919a;

    public c(wt3.e eVar) {
        this.f530919a = eVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        wt3.e eVar = this.f530919a;
        eVar.f530938n = false;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsGetRecommendAudioTask", "LogStory: getRecommendMusic callback " + i17 + ' ' + i18 + ", " + fVar.f152150c);
        if (i17 != 0 || i18 != 0) {
            yz5.l lVar = eVar.f530937m;
            if (lVar == null) {
                return null;
            }
            lVar.mo146xb9724478(new java.util.LinkedList());
            return null;
        }
        r45.jh4 jh4Var = (r45.jh4) fVar.f152151d;
        eVar.f530927c = jh4Var.f459345d;
        java.util.LinkedList linkedList = jh4Var.f459346e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsGetRecommendAudioTask", "get audio list count:" + linkedList.size() + ", " + jh4Var);
        yz5.l lVar2 = eVar.f530937m;
        if (lVar2 == null) {
            return null;
        }
        lVar2.mo146xb9724478(linkedList);
        return null;
    }
}
