package yz3;

@j95.b
/* loaded from: classes12.dex */
public final class w extends i95.w implements ry3.j {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f550081d = jz5.h.b(yz3.t.f550078d);

    public sy3.c Ai(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return new kz3.l(context, i17);
    }

    public int Bi() {
        return ((java.lang.Number) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240396u).mo141623x754a37bb()).intValue();
    }

    public boolean Di(int i17, java.util.List list) {
        if (list != null && bz3.h.f118310d) {
            if (i17 == 1 && gx5.f.f358994d) {
                return true;
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.f240282a;
            boolean z17 = list.size() > 0 && ((java.lang.Float) list.get(0)).floatValue() > 0.0f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanServiceImpl", "needShowOCRMenu hasText: " + z17);
            if (z17) {
                return true;
            }
        }
        return false;
    }

    public long Ni(ry3.p pVar, ry3.r rVar) {
        if (pVar == null) {
            return 0L;
        }
        pVar.f483061b = 1;
        if (pVar.f483060a == 0) {
            pVar.f483060a = java.lang.System.currentTimeMillis();
        }
        ((iz3.s) ((jz5.n) this.f550081d).mo141623x754a37bb()).d(pVar.f483060a, pVar, new yz3.v(rVar));
        return pVar.f483060a;
    }

    public void wi(long j17) {
        iz3.k a17;
        iz3.s sVar = (iz3.s) ((jz5.n) this.f550081d).mo141623x754a37bb();
        sVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageSceneUploader", "cancel");
        sVar.f377632e.remove(java.lang.Long.valueOf(j17));
        iz3.j jVar = (iz3.j) sVar.f377631d.remove(java.lang.Long.valueOf(j17));
        if (jVar != null) {
            gm0.j1.d().c(jVar.f377618b);
            ry3.p pVar = jVar.f377617a;
            if (pVar == null || (a17 = sVar.a(pVar)) == null) {
                return;
            }
            a17.b(j17);
        }
    }
}
