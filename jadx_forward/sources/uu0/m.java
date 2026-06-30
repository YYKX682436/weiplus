package uu0;

/* loaded from: classes5.dex */
public class m implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uu0.o f512786a;

    public m(uu0.o oVar) {
        this.f512786a = oVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Record.MJAudioRecorder", "state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        uu0.n nVar = this.f512786a.f512794h;
        if (nVar != null) {
            uu0.d dVar = (uu0.d) nVar;
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onRecError state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            dVar.f512762a.f(1);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        uu0.o oVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.MJAudioRecorder", "onRecPcmDataReady()");
        uu0.o oVar2 = this.f512786a;
        uu0.a aVar = oVar2.f512795i;
        if (aVar != null) {
            qu0.b bVar = (qu0.b) aVar;
            if (bArr != null) {
                qu0.i iVar = bVar.f448253a;
                wu0.a aVar2 = iVar.f448270h;
                int i18 = iVar.a().f512777b;
                int i19 = iVar.a().f512778c;
                aVar2.getClass();
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p886x58d9bd6.p887x5235105e.C10932x97174782 c10932x97174782 = aVar2.f531182a;
                if (c10932x97174782 != null) {
                    c10932x97174782.m47027x5d047889(bArr, i17, i18, i19);
                }
            }
        }
        uu0.n nVar = oVar2.f512794h;
        if (nVar != null) {
            uu0.c cVar = ((uu0.d) nVar).f512762a;
            tu0.g gVar = cVar.f512747i;
            if (gVar != null) {
                gVar.h(bArr, i17, cVar.f512748j);
            }
            tu0.f fVar = cVar.f512744f;
            if (fVar == null || (oVar = cVar.f512739a) == null) {
                return;
            }
            tl.w wVar = oVar.f512787a;
            cVar.f512749k += wVar != null ? wVar.f501688h : oVar.f512792f;
            try {
                tu0.h hVar = (tu0.h) fVar;
                hVar.a(bArr, i17, cVar.f512748j);
                int length = bArr.length;
                try {
                    java.io.OutputStream outputStream = hVar.f503617f;
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, length);
                    }
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Record.MJAudioRecordMgr", e17, "onRecPcmDataReady", new java.lang.Object[0]);
            }
        }
    }
}
