package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes9.dex */
public class gb implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff f289242d;

    public gb(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff) {
        this.f289242d = activityC22384x2b6f00ff;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff = this.f289242d;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = activityC22384x2b6f00ff.f288958f.getItem(i17 - activityC22384x2b6f00ff.f288956d.getHeaderViewsCount());
        if (item == null) {
            return true;
        }
        java.lang.String h17 = item.h1();
        rl5.r rVar = new rl5.r(activityC22384x2b6f00ff);
        rVar.f478884u = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.db(this);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22384x2b6f00ff activityC22384x2b6f00ff2 = this.f289242d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.fb fbVar = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.fb(this, h17, item);
        int[] iArr = activityC22384x2b6f00ff2.f288959g;
        rVar.g(view, i17, j17, activityC22384x2b6f00ff2, fbVar, iArr[0], iArr[1]);
        return true;
    }
}
