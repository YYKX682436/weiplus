package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class g4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d f222931a;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d) {
        this.f222931a = activityC15977x7ee4409d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.w4
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.ActivityC15977x7ee4409d activityC15977x7ee4409d = this.f222931a;
        int firstVisiblePosition = activityC15977x7ee4409d.f222432d.getFirstVisiblePosition() - activityC15977x7ee4409d.C;
        int lastVisiblePosition = activityC15977x7ee4409d.f222432d.getLastVisiblePosition() - activityC15977x7ee4409d.C;
        if (i17 < firstVisiblePosition || i17 > lastVisiblePosition) {
            return;
        }
        activityC15977x7ee4409d.f222433e.j(activityC15977x7ee4409d.f222432d.getChildAt(i17 - firstVisiblePosition), i17);
    }
}
