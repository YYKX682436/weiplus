package bt;

@j95.b
/* loaded from: classes5.dex */
public class a extends i95.w implements com.tencent.mm.app.o2 {
    public void Ai() {
        int i17 = com.tencent.mm.app.w7.f53902o + 1;
        com.tencent.mm.app.w7.f53902o = i17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "stopCheckAccountExpire: count:%s stack:%s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
    }

    public void wi() {
        int i17 = com.tencent.mm.app.w7.f53902o - 1;
        com.tencent.mm.app.w7.f53902o = i17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", "startCheckAccountExpire: count:%s stack:%s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
    }
}
