package ab4;

/* loaded from: classes4.dex */
public class r0 extends ab4.d0 {
    public final java.util.LinkedList F = new java.util.LinkedList();
    public int G = 0;
    public boolean H = true;
    public boolean I = false;

    @Override // ab4.d0
    public java.util.List a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageGroupListInfo");
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
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAllChildrenCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageGroupListInfo");
        return arrayList;
    }
}
