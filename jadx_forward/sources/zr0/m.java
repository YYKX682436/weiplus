package zr0;

/* loaded from: classes14.dex */
public final class m extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zr0.p f556687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is0.c f556688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zr0.p pVar, is0.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f556687d = pVar;
        this.f556688e = cVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zr0.m(this.f556687d, this.f556688e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        zr0.m mVar = (zr0.m) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        zr0.p pVar = this.f556687d;
        is0.c cVar = this.f556688e;
        pVar.f556705o = cVar;
        os0.a aVar2 = pVar.f556702i;
        if (aVar2 != null) {
            aVar2.w(cVar.f375933m, cVar.f375934n);
        }
        zr0.p pVar2 = this.f556687d;
        os0.a aVar3 = pVar2.f556702i;
        if (aVar3 != null) {
            aVar3.u(pVar2.f556698e.f537708a.f537706a, this.f556687d.f556698e.f537708a.f537707b);
        }
        os0.a aVar4 = this.f556687d.f556702i;
        if (aVar4 != null) {
            ((os0.e) aVar4).H = this.f556688e.f375928e;
        }
        if (aVar4 != null) {
            aVar4.o();
        }
        rs0.h hVar = this.f556687d.f556699f;
        if (hVar != null) {
            android.opengl.EGL14.eglSwapBuffers(hVar.f480825a, hVar.f480826b);
        }
        return jz5.f0.f384359a;
    }
}
