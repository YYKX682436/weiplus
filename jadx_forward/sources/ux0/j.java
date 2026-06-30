package ux0;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux0.o f513348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f513349e;

    public j(ux0.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f513348d = oVar;
        this.f513349e = interfaceC29045xdcb5ca57;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m143895xf1229813;
        ux0.c cVar;
        is0.c cVar2;
        ux0.o oVar = this.f513348d;
        rs0.h hVar = oVar.f513361g;
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f513349e;
        if (hVar == null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        ux0.i iVar = oVar.f513364m;
        ux0.c cVar3 = iVar != null ? iVar.f513346b[iVar.f513347c] : null;
        if (cVar3 == null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        ux0.h hVar2 = oVar.f513366o;
        if (hVar2 == null) {
            hVar2 = new ux0.h(ux0.g.TEXTURE_2D, false);
            oVar.f513366o = hVar2;
        }
        is0.c cVar4 = new is0.c(true, 24L);
        is0.c cVar5 = cVar3.f513318a;
        cVar4.a(cVar5.f375933m, cVar5.f375934n, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, null, 9729, 33071);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            cVar = new ux0.c(cVar4, cVar3.f513319b);
            cVar2 = cVar.f513318a;
            cVar.f513319b = cVar3.f513319b;
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (!hVar2.c(cVar5.f375928e, cVar2.f375928e, cVar5.f375933m, cVar5.f375934n)) {
            cVar2.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureVideoFrameSender", "Failed to render texture");
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            return;
        }
        cVar.f513320c = android.opengl.GLES30.glFenceSync(37143, 0);
        android.opengl.GLES20.glFlush();
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(cVar));
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            cVar4.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TextureVideoFrameSender", "Failed to render: " + m143898xd4a2fc34);
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
        }
    }
}
