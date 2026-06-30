package ab4;

/* loaded from: classes4.dex */
public class r0 extends ab4.d0 {
    public final java.util.LinkedList F = new java.util.LinkedList();
    public int G = 0;
    public boolean H = true;
    public boolean I = false;

    @Override // ab4.d0
    public java.util.List a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageGroupListInfo");
        java.util.ArrayList arrayList = new java.util.ArrayList(super.a());
        java.util.LinkedList linkedList = this.F;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.util.LinkedList linkedList2 = ((ab4.v) it.next()).F;
                if (linkedList2 != null) {
                    arrayList.addAll(linkedList2);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageGroupListInfo");
        return arrayList;
    }
}
