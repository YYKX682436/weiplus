package b92;

/* loaded from: classes3.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a f99957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar) {
        super(0);
        this.f99957d = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        boolean z17;
        r45.vs2 vs2Var;
        ll2.e eVar = ll2.e.f400666a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a result = this.f99957d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify path ");
        sb6.append(result.f186864e);
        sb6.append(", ctrInfo: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = result.f186862c;
        sb6.append(jbVar);
        sb6.append(" show = ");
        sb6.append(result.f186860a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", sb6.toString());
        eVar.g(result.f186864e).mo523x53d8522f(result);
        java.lang.String str2 = result.f186864e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "startlive.mode.audio") ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "startlive.mode.audio.ktv")) {
            java.lang.String str3 = result.f186864e;
            if (jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null || (str = vs2Var.f470033u) == null) {
                str = "";
            }
            if (jbVar != null) {
                z17 = true;
                for (java.lang.String str4 : jbVar.J0()) {
                    boolean h17 = ll2.e.f400666a.h(str4 == null ? "" : str4);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "checkClearCtrlInfoByGroupId groupId: " + str + " disposePath: " + str3 + " path: " + str4 + " hasReddot: " + h17);
                    if (h17) {
                        z17 = false;
                    }
                }
            } else {
                z17 = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveRedDotNotifier", "checkClearCtrlInfoByGroupId groupId: " + str + " isNeedClearGroup: " + z17);
            if (z17) {
                if (!(str.length() == 0)) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().g(str);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
