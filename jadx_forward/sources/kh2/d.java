package kh2;

/* loaded from: classes10.dex */
public final class d implements com.tme.p3259xc83515e4.p3262x153e1c29.InterfaceC28056xada7ee40 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f389528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kh2.l f389529b;

    public d(yz5.l lVar, kh2.l lVar2) {
        this.f389528a = lVar;
        this.f389529b = lVar2;
    }

    @Override // com.tme.p3259xc83515e4.p3262x153e1c29.InterfaceC28056xada7ee40
    /* renamed from: allGrove */
    public void mo122181x69dc6972(com.tme.p3259xc83515e4.p3262x153e1c29.C28066x6213ba45[] c28066x6213ba45Arr) {
        java.util.ArrayList arrayList;
        jh2.b bVar;
        if (c28066x6213ba45Arr != null) {
            arrayList = new java.util.ArrayList(c28066x6213ba45Arr.length);
            for (com.tme.p3259xc83515e4.p3262x153e1c29.C28066x6213ba45 c28066x6213ba45 : c28066x6213ba45Arr) {
                this.f389529b.getClass();
                if (c28066x6213ba45 == null) {
                    bVar = new jh2.b();
                } else {
                    jh2.b bVar2 = new jh2.b();
                    bVar2.f381336a = c28066x6213ba45.f65774x81158a4f;
                    bVar2.f381337b = c28066x6213ba45.f65771x89444d94;
                    bVar2.f381338c = c28066x6213ba45.f65772xa0336a48;
                    bVar2.f381339d = c28066x6213ba45.f65773xb7389127;
                    bVar = bVar2;
                }
                arrayList.add(bVar);
            }
        } else {
            arrayList = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(arrayList, "null cannot be cast to non-null type kotlin.collections.List<com.tencent.mm.plugin.finder.live.ktv.score.IKTVSongScoreCore.NoteItem>");
        yz5.l lVar = this.f389528a;
        if (lVar != null) {
            lVar.mo146xb9724478(arrayList);
        }
    }
}
