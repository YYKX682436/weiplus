package tj;

/* loaded from: classes7.dex */
public final class b implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public static final tj.b f501206d = new tj.b();

    @Override // u81.f
    public final void D(java.lang.String str, u81.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "onRunningStateChanged appId:" + str + " state:" + bVar);
        int i17 = bVar == null ? -1 : tj.a.f501205a[bVar.ordinal()];
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableMgr", "pausePlayableService");
            uj.p pVar = uj.f.f509686b;
            if (pVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "pause");
                if (pVar.f509706h) {
                    return;
                }
                jc3.j0 j0Var = pVar.f509702d;
                if (j0Var != null) {
                    ((rc3.w0) j0Var).m162152x65825f6();
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                    throw null;
                }
            }
            return;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                return;
            }
            uj.f.f509685a.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableMgr", "resume");
        uj.p pVar2 = uj.f.f509686b;
        if (pVar2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.MagicPlayableService", "resume");
            jc3.j0 j0Var2 = pVar2.f509702d;
            if (j0Var2 != null) {
                ((rc3.w0) j0Var2).A();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("magicBrush");
                throw null;
            }
        }
    }
}
