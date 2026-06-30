package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166141a;

    public f4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var) {
        this.f166141a = q4Var;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var = f4Var.f166141a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k4) q4Var.f166599i).mo146xb9724478(c11666xa31a0b7f);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11666xa31a0b7f c11666xa31a0b7f2 = q4Var.f166607q;
        if (c11666xa31a0b7f2 == null && c11666xa31a0b7f.f156928e > 0) {
            q4Var.f166607q = c11666xa31a0b7f;
            q4Var.f166608r = currentTimeMillis;
            return;
        }
        if (q4Var.f166606p && c11666xa31a0b7f2 != null) {
            long j17 = c11666xa31a0b7f.f156928e - c11666xa31a0b7f2.f156928e;
            if (currentTimeMillis - q4Var.f166608r <= 0) {
                return;
            }
            q4Var.f166609s = a06.d.c((((float) j17) / ((float) r0)) * 1000);
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 0) {
                a06.d.b((((float) q4Var.f166609s) / 1024.0f) / 1024.0f);
            }
        }
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.f4 f4Var, m81.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.wa waVar, r45.me3 me3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 a6Var;
        m81.c cVar2 = m81.c.OK;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var = f4Var.f166141a;
        if (cVar2 != cVar) {
            yz5.p pVar = q4Var.f166598h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6[] m51683xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.m51683xcee59d22();
            int length = m51683xcee59d22.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    a6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166020e;
                    break;
                }
                a6Var = m51683xcee59d22[i17];
                if (a6Var.f166030d == cVar.f406234d) {
                    break;
                } else {
                    i17++;
                }
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j4) pVar).mo149xb9724478(a6Var, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CommonPkgFetcher", "onPkgUpdateResult, request:" + q4Var.f166592b + ", resp{is_patch:" + me3Var.f461936i + ", is_zstd:" + me3Var.f461937m + '}');
        yz5.l lVar = q4Var.f166597g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i4.f166189a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var = q4Var.f166592b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(waVar);
        java.lang.String filePath = waVar.f157566a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l4) lVar).mo146xb9724478(i4Var.a(o6Var, filePath, me3Var.f461933f, me3Var.f461935h, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.r6.f166637a));
    }
}
