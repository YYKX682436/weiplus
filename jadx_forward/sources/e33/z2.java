package e33;

/* loaded from: classes10.dex */
public class z2 implements t23.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 f329095d;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14) {
        this.f329095d = c15655x4db85b14;
    }

    @Override // t23.k1
    public void F6(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : "res is null.";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFolderMgrView", "onGetPrivateAlbum, %s.", objArr);
        t23.x1 k17 = t23.p0.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.C15655x4db85b14 c15655x4db85b14 = this.f329095d;
        k17.f496826b.remove(c15655x4db85b14.f220100o);
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedList2 = c15655x4db85b14.f220101p;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) it.next();
            if (c15630x7d8d0183 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15636x5edd5fff) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15636x5edd5fff c15636x5edd5fff = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15636x5edd5fff) c15630x7d8d0183;
                t23.g2 g2Var = c15636x5edd5fff.f219982p.f496686h;
                if (g2Var == null ? false : g2Var.f496690d) {
                    c15655x4db85b14.f220102q = c15636x5edd5fff;
                } else {
                    linkedList2.add(c15636x5edd5fff);
                }
            }
        }
        java.lang.Object[] objArr2 = new java.lang.Object[2];
        objArr2[0] = java.lang.Integer.valueOf(linkedList2.size());
        objArr2[1] = java.lang.Boolean.valueOf(c15655x4db85b14.f220102q != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFolderMgrView", "filter res: %s. had favoriteAlbum: %s", objArr2);
        if (c15655x4db85b14.isInLayout()) {
            return;
        }
        if (c15655x4db85b14.f220102q != null || linkedList2.size() > 0) {
            t23.p0.n().c(new e33.c3(c15655x4db85b14));
        }
    }
}
