package com.p314xaae8f345.p457x3304c6.p479x4179489f;

/* loaded from: classes5.dex */
public class q extends com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4144xc797d553 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p479x4179489f.l f130052a;

    public q(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422, com.p314xaae8f345.p457x3304c6.p479x4179489f.l lVar) {
        super(c4143xe6876422);
        this.f130052a = lVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.AbstractC4144xc797d553
    /* renamed from: onInvoke */
    public void mo34065x48671b37(com.p314xaae8f345.p457x3304c6.p479x4179489f.C4143xe6876422 c4143xe6876422, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc.OnExportCompleteWithDetailsArgs onExportCompleteWithDetailsArgs = (com.p314xaae8f345.p457x3304c6.p479x4179489f.C4145xd4dfbdcc.OnExportCompleteWithDetailsArgs) obj;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.l lVar = this.f130052a;
        if (lVar == null || onExportCompleteWithDetailsArgs == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4150x1d312f34 c4150x1d312f34 = onExportCompleteWithDetailsArgs.f16126x26b4d765;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = onExportCompleteWithDetailsArgs.f16125x5c4d208;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", "startExporting: onComplete, resultDetail:" + c4150x1d312f34 + ", error:" + c4093x6b88526b);
        ((p3325xe03a0797.p3326xc267989b.r) ((gx0.k8) lVar).f358152a).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(c4150x1d312f34, c4093x6b88526b)));
    }
}
