package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class d0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 f222890a;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 activityC15944xcd1fadc4) {
        this.f222890a = activityC15944xcd1fadc4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w4
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15944xcd1fadc4 activityC15944xcd1fadc4 = this.f222890a;
        int firstVisiblePosition = activityC15944xcd1fadc4.f222218d.getFirstVisiblePosition();
        int lastVisiblePosition = activityC15944xcd1fadc4.f222218d.getLastVisiblePosition();
        if (i17 < firstVisiblePosition || i17 > lastVisiblePosition) {
            return;
        }
        activityC15944xcd1fadc4.f222219e.j(activityC15944xcd1fadc4.f222218d.getChildAt(i17 - firstVisiblePosition), i17);
    }
}
