package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class e extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f f228387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.f fVar, long j17, long j18) {
        super(j17, j18);
        this.f228387a = fVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.i iVar = this.f228387a.f228422e.f227486i;
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719 c16356x97a60719 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16356x97a60719) iVar;
            if (c16356x97a60719.f227503w) {
                return;
            }
            c16356x97a60719.f227503w = true;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.k(c16356x97a60719));
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.C16355x97a04787 c16355x97a04787 = this.f228387a.f228422e;
        int i17 = c16355x97a04787.f227484g + 1;
        c16355x97a04787.f227484g = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c16355x97a04787, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyAutoScrollItem$1$1", "onTick", "(J)V", "Undefined", "smoothScrollToPosition", "(I)V");
        c16355x97a04787.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c16355x97a04787, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyAutoScrollItem$1$1", "onTick", "(J)V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
