package qf4;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae f444244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae c18469x2e558eae) {
        super(1);
        this.f444244d = c18469x2e558eae;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        nf4.h storyHistoryInfo = (nf4.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyHistoryInfo, "storyHistoryInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae c18469x2e558eae = this.f444244d;
        qf4.f fVar = c18469x2e558eae.f253404g;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStoryAlbumAdapter");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = fVar.f444228h;
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.Iterator it = ((qf4.h) arrayList2.get(i17)).f444235b.iterator();
            while (it.hasNext()) {
                arrayList.add(((nf4.h) it.next()).f69196x225a93d3);
            }
        }
        qf4.f fVar2 = c18469x2e558eae.f253404g;
        if (fVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStoryAlbumAdapter");
            throw null;
        }
        nf4.j storyInfo = storyHistoryInfo.f418387p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyInfo, "storyInfo");
        java.util.ArrayList arrayList3 = fVar2.f444228h;
        int size2 = arrayList3.size();
        int i18 = 0;
        loop2: for (int i19 = 0; i19 < size2; i19++) {
            java.util.Iterator it6 = ((qf4.h) arrayList3.get(i19)).f444235b.iterator();
            while (it6.hasNext()) {
                if (((int) ((nf4.h) it6.next()).f418387p.f72763xa3c65b86) == ((int) storyInfo.f72763xa3c65b86)) {
                    break loop2;
                }
                i18++;
            }
        }
        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2239x5897e6f.C18469x2e558eae.f253400m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryAlbumUI", "onClickItem position=" + i18 + ", localId=" + ((int) storyHistoryInfo.f418387p.f72763xa3c65b86) + ", storyId=" + storyHistoryInfo.f418387p.f69410x443468b + ", date=" + storyHistoryInfo.f69196x225a93d3 + ", count=" + storyHistoryInfo.f69195x28f0318a);
        android.content.Intent intent = new android.content.Intent(c18469x2e558eae.mo7430x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93.class);
        intent.putExtra(dm.i4.f66875xa013b0d5, c18469x2e558eae.f253406i);
        intent.putExtra("user_date_list", arrayList);
        intent.putExtra("v_position", i18);
        c18469x2e558eae.m7587x5dc77fb5(intent, 1);
        mf4.d.f407696d.f142452e = 2L;
        return jz5.f0.f384359a;
    }
}
