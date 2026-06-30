package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes.dex */
public final class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f148419a;

    public r3(yz5.q qVar) {
        this.f148419a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.nw1 m76794xd0557130;
        r45.nw1 m76794xd05571302;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFinderLivePreviewUrl errCode:");
        sb6.append(fVar.f152149b);
        sb6.append(" errType:");
        sb6.append(fVar.f152148a);
        sb6.append(" url:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
        java.lang.String str = null;
        sb6.append((c19792x256d2725 == null || (m76794xd05571302 = c19792x256d2725.m76794xd0557130()) == null) ? null : m76794xd05571302.m75945x2fec8307(3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        int i17 = fVar.f152148a;
        yz5.q qVar = this.f148419a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2);
            if (c19792x256d27252 != null && (m76794xd0557130 = c19792x256d27252.m76794xd0557130()) != null) {
                str = m76794xd0557130.m75945x2fec8307(3);
            }
            qVar.mo147xb9724478(str, fVar.f152150c, java.lang.Integer.valueOf(fVar.f152149b));
        } else {
            qVar.mo147xb9724478("", fVar.f152150c, -1);
        }
        return jz5.f0.f384359a;
    }
}
