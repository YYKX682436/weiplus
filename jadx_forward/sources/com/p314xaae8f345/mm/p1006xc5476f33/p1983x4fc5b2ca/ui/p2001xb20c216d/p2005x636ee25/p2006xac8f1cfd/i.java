package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j f237776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j jVar) {
        super(2);
        this.f237776d = jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j jVar = this.f237776d;
        jVar.f237797d = longValue;
        jVar.f237798e = longValue2;
        jVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicClipDialog", "onRangeChanged: startMs=" + jVar.f237797d + " durationMs=" + (jVar.f237798e - jVar.f237797d));
        yz5.p pVar = jVar.f237804k;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Long.valueOf(jVar.f237797d), java.lang.Long.valueOf(jVar.f237798e - jVar.f237797d));
        }
        return jz5.f0.f384359a;
    }
}
