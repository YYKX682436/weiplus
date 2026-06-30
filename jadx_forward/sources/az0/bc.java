package az0;

/* loaded from: classes5.dex */
public final class bc implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f96902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f96904c;

    public bc(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str, long j17) {
        this.f96902a = qVar;
        this.f96903b = str;
        this.f96904c = j17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83.OnComplete
    /* renamed from: onComplete */
    public final void mo9331x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f96902a;
        if (!((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", this.f96903b + " already resumed");
            return;
        }
        long j17 = this.f96904c;
        bz0.b bVar = bz0.b.f118257a;
        if (c4093x6b88526b != null) {
            bz0.b.b(bVar, this.f96903b, c4093x6b88526b, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new az0.p7(c4093x6b88526b))));
        } else {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(jz5.f0.f384359a, null);
            bz0.b.d(bVar, this.f96903b, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
        }
    }
}
