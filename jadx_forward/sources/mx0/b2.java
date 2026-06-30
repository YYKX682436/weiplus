package mx0;

/* loaded from: classes5.dex */
public final /* synthetic */ class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.q {
    public b2(java.lang.Object obj) {
        super(3, obj, mx0.q2.class, "applyMusicOnClose", "applyMusicOnClose(Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;ZZ)V", 0);
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        yx0.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj;
        ((java.lang.Boolean) obj2).booleanValue();
        ((java.lang.Boolean) obj3).booleanValue();
        mx0.q2 q2Var = (mx0.q2) this.f72685xcfcbe9ef;
        q2Var.getClass();
        java.lang.String str = c16997xb0aa383a != null ? c16997xb0aa383a.f237256t : null;
        if (str == null) {
            mx0.x.l(q2Var, false, 1, null);
        } else {
            q2Var.c().setText(str);
            q2Var.c().requestFocus();
            q2Var.f(true);
        }
        if (c16997xb0aa383a != null) {
            if (!(c16997xb0aa383a.C.length() == 0)) {
                int i17 = c16997xb0aa383a.f237252p;
                if (i17 == 7) {
                    oVar = yx0.o.f549019d;
                } else {
                    oVar = i17 == 1 || i17 == 2 ? yx0.o.f549020e : yx0.o.f549021f;
                }
                yx0.o oVar2 = oVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicEntranceV2Plugin", "[selectMusic] " + c16997xb0aa383a.f237256t + " duration:" + c16997xb0aa383a.f237253q + " mirBegin:" + c16997xb0aa383a.E + " mirEnd:" + c16997xb0aa383a.F + " hasTrim=" + c16997xb0aa383a.g() + " effectiveStartMs=" + c16997xb0aa383a.c() + " effectiveDurationMs=" + c16997xb0aa383a.b());
                com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356 a17 = ou0.e.a(c16997xb0aa383a, true);
                java.lang.Float f17 = q2Var.d().f303886c.f338416f;
                yx0.b8 b8Var = q2Var.f413769g;
                mx0.m2 m2Var = f17 != null ? new mx0.m2(f17, q2Var) : null;
                java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
                b8Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchMusic >> " + a17.m33856x92013dca() + ' ' + oVar2);
                p3325xe03a0797.p3326xc267989b.l.d(b8Var.M, null, null, new yx0.g7(a17, b8Var, m2Var, c16997xb0aa383a, null, oVar2, null), 3, null);
            }
        } else {
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) q2Var.f413768f;
            p3325xe03a0797.p3326xc267989b.l.d(c10977x8e40eced.getScope(), null, null, new mx0.k4(c10977x8e40eced, null), 3, null);
            c10977x8e40eced.G0(false, false);
        }
        return jz5.f0.f384359a;
    }
}
