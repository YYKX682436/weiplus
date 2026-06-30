package lh1;

/* loaded from: classes15.dex */
public class a implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lh1.c f400183a;

    public a(lh1.c cVar) {
        this.f400183a = cVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AppBrandRecorder", "state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        lh1.b bVar = this.f400183a.f400189f;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.r rVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.r) bVar;
            rVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecordMgr", "onRecError state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            rVar.f167367a.h(1);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.a0 a0Var;
        kh1.e eVar;
        lh1.c cVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AppBrandRecorder", "onRecPcmDataReady()");
        lh1.b bVar = this.f400183a.f400189f;
        if (bVar == null || (eVar = (a0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.r) bVar).f167367a).f167317f) == null || (cVar = a0Var.f167312a) == null) {
            return;
        }
        tl.w wVar = cVar.f400184a;
        a0Var.f167320i += wVar != null ? wVar.f501688h : 20;
        try {
            if (eVar.d(a0Var.f167319h, bArr, i17)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.AudioRecordMgr", "encode pcm fail!");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.AudioRecordMgr", e17, "onRecPcmDataReady", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c = a0Var.f167315d;
            if (c12420xb1146e9c != null && "mp3".equalsIgnoreCase(c12420xb1146e9c.f167372h)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(19);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.p1158x2bd2a2de.C12420xb1146e9c c12420xb1146e9c2 = a0Var.f167315d;
            if (c12420xb1146e9c2 == null || !"aac".equalsIgnoreCase(c12420xb1146e9c2.f167372h)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.o0.a(23);
        }
    }
}
