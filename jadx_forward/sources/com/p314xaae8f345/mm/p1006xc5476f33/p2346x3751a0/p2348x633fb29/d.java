package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class d extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e f257903d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar) {
        this.f257903d = eVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = this.f257903d;
        if (eVar.f257989s == 1 && eVar.f257971a) {
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = this.f257903d;
            int i17 = eVar2.f257994x;
            int i18 = eVar2.f257984n;
            if (i17 + i18 >= eVar2.f257975e || eVar2.P != 0 || eVar2.f257987q == null) {
                return;
            }
            eVar2.O = 1;
            if (eVar2.R) {
                java.util.Arrays.fill(eVar2.f257979i, 0, i18, (byte) 0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar3 = this.f257903d;
            int a17 = eVar3.f257987q.a(eVar3.f257980j, eVar3.f257984n);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar4 = this.f257903d;
            eVar4.O = 0;
            if (a17 < 0) {
                return;
            }
            synchronized (eVar4.f257970J) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar5 = this.f257903d;
                java.lang.System.arraycopy(eVar5.f257980j, 0, eVar5.f257977g, eVar5.f257994x, eVar5.f257984n);
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar6 = this.f257903d;
                eVar6.f257994x += eVar6.f257984n;
            }
        }
    }
}
