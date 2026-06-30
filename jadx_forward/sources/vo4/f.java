package vo4;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f520158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 f520159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vo4.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 m1Var) {
        super(0);
        this.f520158d = iVar;
        this.f520159e = m1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        vo4.i iVar = this.f520158d;
        vo4.r rVar = iVar.f520167e;
        rVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 scriptModel = this.f520159e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scriptModel, "scriptModel");
        rVar.f520206b = scriptModel;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setEffectConfig ");
        sb6.append(rVar.hashCode());
        sb6.append(", previewPlay:");
        boolean z17 = rVar.f520205a;
        sb6.append(z17);
        sb6.append(", scale:[");
        sb6.append(iVar.f520173k);
        sb6.append(", ");
        sb6.append(iVar.f520174l);
        sb6.append("] : ");
        sb6.append(scriptModel.f257209d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", sb6.toString());
        rVar.c(true);
        java.util.ArrayList arrayList = rVar.f520209e;
        arrayList.clear();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p0 p0Var : scriptModel.f257207b) {
            boolean z19 = p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1;
            vo4.s sVar = rVar.f520210f;
            if (z19) {
                int i17 = sVar.f520218c;
                sVar.f520218c = i17 + 1;
                is0.c cVar = sVar.f520216a[i17 % 2];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptTexCache", "requestExternalTex: " + cVar);
                int i18 = cVar != null ? cVar.f375928e : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "prepare VideoMaterial:" + p0Var.f257243c + ", texture:" + i18);
                obj = z17 ? new vo4.x(i18, rVar.f520214j, rVar.f520215k, (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var, rVar.f520208d) : new vo4.l(i18, rVar.f520214j, rVar.f520215k, (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.p1) p0Var);
            } else if (p0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n0) {
                int i19 = sVar.f520219d;
                sVar.f520219d = i19 + 1;
                is0.c cVar2 = sVar.f520217b[i19 % 2];
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptTexCache", "requestNormalTex: " + cVar2);
                int i27 = cVar2 != null ? cVar2.f375928e : -1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "prepare ImageMaterial:" + p0Var.f257243c + ", texture:" + i27);
                obj = new vo4.j(i27, rVar.f520214j, rVar.f520215k, (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n0) p0Var);
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "init cacheMaterialPlayer put " + p0Var.f257243c);
            }
        }
        java.util.Iterator it = kz5.n0.K0(arrayList, 1).iterator();
        while (it.hasNext()) {
            ((vo4.b) it.next()).c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogScriptReader", "init prepare all material player cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        return jz5.f0.f384359a;
    }
}
