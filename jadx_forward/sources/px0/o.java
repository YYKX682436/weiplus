package px0;

/* loaded from: classes5.dex */
public final class o implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f440324a;

    public o(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f440324a = qVar;
    }

    public final void a(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3999xf61991b1 c3999xf61991b1, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveAsyncAIGCDraft onComplete error ");
        sb6.append(c4093x6b88526b != null ? java.lang.Integer.valueOf(c4093x6b88526b.m33746x130a215f()) : null);
        sb6.append(' ');
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        sb6.append(' ');
        p3325xe03a0797.p3326xc267989b.q qVar = this.f440324a;
        sb6.append(((p3325xe03a0797.p3326xc267989b.r) qVar).n());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialImportPreviewFragment", sb6.toString());
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            if (c3999xf61991b1 != null && c4093x6b88526b == null) {
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(c3999xf61991b1, "")));
                return;
            }
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("saveAsyncAIGCDraft onComplete error ");
            sb7.append(c4093x6b88526b != null ? java.lang.Integer.valueOf(c4093x6b88526b.m33746x130a215f()) : null);
            sb7.append(' ');
            sb7.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(null, sb7.toString())));
        }
    }
}
