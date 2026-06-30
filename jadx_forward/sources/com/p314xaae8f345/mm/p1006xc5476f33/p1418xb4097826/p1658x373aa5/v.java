package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w f214756a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w wVar) {
        this.f214756a = wVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w wVar = this.f214756a;
        if (wVar.f214808i) {
            java.lang.String mo10824xb5887064 = wVar.mo10824xb5887064();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkFeedValid] errType=");
            sb6.append(fVar.f152148a);
            sb6.append(" errCode=");
            sb6.append(fVar.f152149b);
            sb6.append(" requestId=");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject = wVar.f214805f;
            sb6.append(finderObject.m76784x5db1b11());
            sb6.append(" mResetBusiBufListener:");
            sb6.append(wVar.f214807h);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mo10824xb5887064, sb6.toString());
            if ((fVar.f152148a == 0 && fVar.f152149b == 0) || (i17 = fVar.f152149b) == -4012) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w.f214803o.put(java.lang.Long.valueOf(finderObject.m76784x5db1b11()), java.lang.Boolean.TRUE);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
                int e17 = c01.id.e();
                pj4.t tVar = wVar.f214806g;
                boolean z17 = e17 >= tVar.f436824g + finderObject.m76835x9191e3f7();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.mo10824xb5887064(), "[isReplaceFinderObject] result=" + z17 + " feedId=" + pm0.v.u(finderObject.m76784x5db1b11()) + " statusCreateTime=" + tVar.f436824g + " urlValidDuration=" + finderObject.m76835x9191e3f7() + " current=" + c01.id.e());
                if ((z17 || wVar.f214807h != null) && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.h51) fVar.f152151d).m75936x14adae67(2)) != null) {
                    finderObject.mo11468x92b714fd(c19792x256d2725.mo14344x5f01b1f6());
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.u(wVar));
                }
            } else if (i17 == -4011 || i17 == -4033 || i17 == -4036) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w.f214803o.put(java.lang.Long.valueOf(finderObject.m76784x5db1b11()), java.lang.Boolean.FALSE);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, fVar.f152150c);
            }
            wVar.n(wVar.o());
            wVar.f214808i = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.mo10824xb5887064(), "[checkFeedValid]: skip");
        }
        return jz5.f0.f384359a;
    }
}
