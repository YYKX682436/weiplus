package gv3;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f357643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gv3.d f357644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.l lVar, gv3.d dVar) {
        super(1);
        this.f357643d = lVar;
        this.f357644e = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17088xd9d6732f m68368xeb7470af;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f357643d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 d17 = this.f357644e.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e c17067x215f5d9e = d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2008xb118f8f1.C17067x215f5d9e) d17 : null;
            if (c17067x215f5d9e != null && (m68368xeb7470af = c17067x215f5d9e.m68368xeb7470af()) != null && !m68368xeb7470af.f237940p) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m68368xeb7470af.f237939o, "onActivate: ");
                m68368xeb7470af.f237940p = true;
                ev3.d dVar = m68368xeb7470af.f237913d;
                if (dVar != null) {
                    dVar.c(5, m68368xeb7470af);
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = m68368xeb7470af.f237915f;
                if (c22849x81a93d25 != null) {
                    c22849x81a93d25.mo7960x6cab2c8d(m68368xeb7470af.f237914e);
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = m68368xeb7470af.f237915f;
                if (c22849x81a93d252 != null) {
                    c22849x81a93d252.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.s(m68368xeb7470af));
                }
                m68368xeb7470af.z0();
            }
        }
        return jz5.f0.f384359a;
    }
}
