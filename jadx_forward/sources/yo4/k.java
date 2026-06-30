package yo4;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yo4.p f545775d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yo4.p pVar) {
        super(3);
        this.f545775d = pVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a changedInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        long longValue2 = ((java.lang.Number) obj3).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedInfo, "changedInfo");
        yo4.p pVar = this.f545775d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = pVar.f545820r;
        java.lang.String a17 = c16997xb0aa383a != null ? c16997xb0aa383a.a() : null;
        java.lang.String a18 = changedInfo.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onMusicClipChange] changedMusicId=");
        sb6.append(changedInfo.f237244e);
        sb6.append(" currentMusicId=");
        sb6.append(c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.f237244e) : null);
        sb6.append(" sameKey=");
        sb6.append(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, a18));
        sb6.append(" start=");
        sb6.append(longValue);
        sb6.append(" duration=");
        sb6.append(longValue2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", sb6.toString());
        if (a17 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, a18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "[onMusicClipChange] not currently playing this music, skip trim");
        } else {
            changedInfo.G = java.lang.Long.valueOf(longValue);
            changedInfo.H = java.lang.Long.valueOf(longValue2);
            c16997xb0aa383a.G = java.lang.Long.valueOf(longValue);
            c16997xb0aa383a.H = java.lang.Long.valueOf(longValue2);
            long j17 = longValue2 + longValue;
            iu3.i iVar = pVar.f545818p;
            kk4.v vVar = iVar.f376541c;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setPlayRange [");
            sb7.append(longValue);
            sb7.append(", ");
            sb7.append(j17);
            sb7.append("] playerNonNull=");
            sb7.append(vVar != null);
            sb7.append(" isPlaying=");
            sb7.append(vVar != null ? java.lang.Boolean.valueOf(vVar.s()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f376540b, sb7.toString());
            if (vVar != null) {
                vVar.A(true);
            }
            if (vVar != null) {
                vVar.H(longValue, j17);
            }
            if (vVar != null) {
                vVar.z((int) longValue, true, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
