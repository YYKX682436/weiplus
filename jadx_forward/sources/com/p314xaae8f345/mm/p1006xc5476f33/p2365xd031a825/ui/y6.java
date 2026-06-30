package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class y6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f262345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 f262346e;

    public y6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19117x82d08fb8 activityC19117x82d08fb8, java.util.List list) {
        int i17;
        this.f262346e = activityC19117x82d08fb8;
        this.f262345d = null;
        this.f262345d = new java.util.ArrayList();
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions promotions = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions) list.get(i18);
            if (promotions != null && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(promotions.f261309i) || (i17 = promotions.f261313p) == 2 || i17 == 1)) {
                this.f262345d.add((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions) list.get(i18));
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f262345d;
        if (list != null) {
            return ((java.util.ArrayList) list).size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05.Promotions) ((java.util.ArrayList) this.f262345d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0339  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y6.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
