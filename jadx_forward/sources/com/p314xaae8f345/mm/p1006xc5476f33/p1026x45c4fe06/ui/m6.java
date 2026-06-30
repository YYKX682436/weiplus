package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class m6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 f171397d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e93) {
        super(0);
        this.f171397d = activityC12657x2ef82e93;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xg1.j jVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4;
        f06.v[] vVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93.A;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12657x2ef82e93 activityC12657x2ef82e93 = this.f171397d;
        if (activityC12657x2ef82e93.e7() != 4) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9(activityC12657x2ef82e93);
        }
        xg1.h hVar = xg1.h.f535903a;
        int i17 = activityC12657x2ef82e93.f170917n;
        synchronized (hVar) {
            jVar = (xg1.j) xg1.h.f535904b.get(i17);
        }
        if (jVar == null || (c11809xbc286be4 = jVar.f535910c) == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.la(activityC12657x2ef82e93);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.uc c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s5.c(activityC12657x2ef82e93, c11809xbc286be4);
        return c17 == null ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.f6(activityC12657x2ef82e93, c11809xbc286be4, activityC12657x2ef82e93.f170926w) : c17;
    }
}
