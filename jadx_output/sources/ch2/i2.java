package ch2;

/* loaded from: classes10.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f41374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole f41377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(ch2.o2 o2Var, r45.yx1 yx1Var, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41375e = o2Var;
        this.f41376f = yx1Var;
        this.f41377g = tXChorusRole;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ch2.i2 i2Var = new ch2.i2(this.f41375e, this.f41376f, this.f41377g, continuation);
        i2Var.f41374d = obj;
        return i2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.i2 i2Var = (ch2.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f41374d;
        gh2.f l76 = this.f41375e.l7();
        r45.yx1 yx1Var = this.f41376f;
        java.lang.String unique_id = yx1Var.f391459e;
        kotlin.jvm.internal.o.f(unique_id, "unique_id");
        java.lang.String song_mid = yx1Var.f391458d;
        kotlin.jvm.internal.o.f(song_mid, "song_mid");
        l76.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l76.f271870f;
        gh2.d dVar = new gh2.d(l76, unique_id, song_mid);
        gh2.c[] cVarArr = gh2.c.f271866d;
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct finderLiveKTVReportStruct = dVar.f271867a;
        boolean z17 = true;
        finderLiveKTVReportStruct.f57170t = 1;
        finderLiveKTVReportStruct.f57168r = ((om2.l) l76.business(om2.l.class)).P6();
        finderLiveKTVReportStruct.f57169s = ((om2.l) l76.business(om2.l.class)).O6();
        concurrentHashMap.put(unique_id, dVar);
        com.tencent.mars.xlog.Log.i("LiveKTVReportSlice", "bindReportData: " + unique_id + ", " + song_mid);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.finder.live.util.s2[] s2VarArr = com.tencent.mm.plugin.finder.live.util.s2.f115678d;
        jSONObject.put("LoadSo", 0);
        com.tencent.mm.plugin.finder.live.util.s2[] s2VarArr2 = com.tencent.mm.plugin.finder.live.util.s2.f115678d;
        jSONObject.put("GetPlayResource", 0);
        com.tencent.mm.plugin.finder.live.util.s2[] s2VarArr3 = com.tencent.mm.plugin.finder.live.util.s2.f115678d;
        jSONObject.put("ParsePlayResource", 0);
        com.tencent.mm.plugin.finder.live.util.s2[] s2VarArr4 = com.tencent.mm.plugin.finder.live.util.s2.f115678d;
        jSONObject.put("ConvertAccompanyResource", 0);
        com.tencent.mm.plugin.finder.live.util.s2[] s2VarArr5 = com.tencent.mm.plugin.finder.live.util.s2.f115678d;
        jSONObject.put("RequestSing", 0);
        h0Var.f310123d = jSONObject;
        ch2.h2 h2Var = new ch2.h2(h0Var);
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole = this.f41377g;
        if (!(tXChorusRole == null) && tXChorusRole != com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger) {
            z17 = false;
        }
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = kotlinx.coroutines.l.b(y0Var, null, null, new ch2.e2(this.f41376f, z17, this.f41375e, h0Var, kotlinx.coroutines.l.b(y0Var, null, null, new ch2.g2(h0Var2, z17, this.f41375e, this.f41376f, h0Var, null), 3, null), h2Var, this.f41377g, null), 3, null);
        return jz5.f0.f302826a;
    }
}
