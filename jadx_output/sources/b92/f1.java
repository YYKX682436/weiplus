package b92;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.a f18424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.extension.reddot.a aVar) {
        super(0);
        this.f18424d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        boolean z17;
        r45.vs2 vs2Var;
        ll2.e eVar = ll2.e.f319133a;
        com.tencent.mm.plugin.finder.extension.reddot.a result = this.f18424d;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify path ");
        sb6.append(result.f105331e);
        sb6.append(", ctrInfo: ");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = result.f105329c;
        sb6.append(jbVar);
        sb6.append(" show = ");
        sb6.append(result.f105327a);
        com.tencent.mars.xlog.Log.i("FinderLiveRedDotNotifier", sb6.toString());
        eVar.g(result.f105331e).setValue(result);
        java.lang.String str2 = result.f105331e;
        if (kotlin.jvm.internal.o.b(str2, "startlive.mode.audio") ? true : kotlin.jvm.internal.o.b(str2, "startlive.mode.audio.ktv")) {
            java.lang.String str3 = result.f105331e;
            if (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null || (str = vs2Var.f388500u) == null) {
                str = "";
            }
            if (jbVar != null) {
                z17 = true;
                for (java.lang.String str4 : jbVar.J0()) {
                    boolean h17 = ll2.e.f319133a.h(str4 == null ? "" : str4);
                    com.tencent.mars.xlog.Log.i("FinderLiveRedDotNotifier", "checkClearCtrlInfoByGroupId groupId: " + str + " disposePath: " + str3 + " path: " + str4 + " hasReddot: " + h17);
                    if (h17) {
                        z17 = false;
                    }
                }
            } else {
                z17 = true;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveRedDotNotifier", "checkClearCtrlInfoByGroupId groupId: " + str + " isNeedClearGroup: " + z17);
            if (z17) {
                if (!(str.length() == 0)) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().g(str);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
