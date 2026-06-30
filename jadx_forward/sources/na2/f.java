package na2;

/* loaded from: classes2.dex */
public final class f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f417490d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f417491e;

    /* renamed from: f, reason: collision with root package name */
    public qs2.e f417492f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f417493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f417493g = jz5.h.b(new na2.e(activity, this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:13|(3:34|(1:36)(1:39)|(10:38|18|19|20|21|(1:23)(1:30)|24|(1:26)|27|28))|17|18|19|20|21|(0)(0)|24|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(qs2.e r17) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na2.f.O6(qs2.e):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long longExtra = m158359x1e885992().getLongExtra("from_object_id", 0L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onCreate: fromObjectId=" + longExtra);
        if (longExtra != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(longExtra);
            jz5.f0 f0Var = null;
            if (h17 != null) {
                this.f417490d = h17;
                qd2.g gVar = (qd2.g) ((jz5.n) this.f417493g).mo141623x754a37bb();
                if (gVar.f443261b == null) {
                    gVar.f443261b = h17;
                    gVar.d(null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onCreate: prepare audio track from bubble feedId=".concat(pm0.v.u(longExtra)));
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onCreate: fromObjectId=" + longExtra + " not in cache, fallback to recommend first feed later");
            }
        }
    }
}
