package az0;

/* loaded from: classes5.dex */
public final class mc implements com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f97255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f97257c;

    public mc(p3325xe03a0797.p3326xc267989b.q qVar, java.lang.String str, long j17) {
        this.f97255a = qVar;
        this.f97256b = str;
        this.f97257c = j17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4073xbc40c54.OnComplete
    /* renamed from: onComplete */
    public final void mo9354x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f97255a;
        if (!((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasFuncUtils", this.f97256b + " already resumed");
            return;
        }
        long j17 = this.f97257c;
        bz0.b bVar = bz0.b.f118257a;
        if (c4093x6b88526b != null) {
            bz0.b.b(bVar, this.f97256b, c4093x6b88526b, java.lang.System.currentTimeMillis() - j17, 0, 8, null);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new az0.p7(c4093x6b88526b))));
        } else {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(jz5.f0.f384359a, null);
            bz0.b.d(bVar, this.f97256b, java.lang.System.currentTimeMillis() - j17, 0, 4, null);
        }
    }
}
