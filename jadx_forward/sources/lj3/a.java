package lj3;

/* loaded from: classes14.dex */
public final class a implements ej3.c {

    /* renamed from: a, reason: collision with root package name */
    public lj3.d f400504a;

    @Override // ej3.c
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        lj3.d dVar = this.f400504a;
        if (dVar != null) {
            synchronized (dVar) {
                ar4.d dVar2 = dVar.f400510a;
                if (dVar2 != null) {
                    dVar2.a();
                }
                dVar.f400510a = null;
                android.opengl.GLES20.glDeleteProgram(dVar.f400511b);
                ar4.c cVar = ar4.c.f94934a;
                ar4.c.f94935b = null;
                ar4.c.f94936c = false;
            }
        }
        this.f400504a = null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        pz5.a aVar = pz5.a.f440719d;
        return f0Var;
    }

    @Override // ej3.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.lang.Object c(lj3.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (this.f400504a == null) {
            ar4.c.f94934a.b(rh0.b0.f477114e);
            lj3.d dVar = new lj3.d();
            this.f400504a = dVar;
            ar4.d dVar2 = dVar.f400510a;
            if (dVar2 != null && dVar2.f94943f) {
                dVar2.f94943f = false;
                p05.l4 l4Var = dVar2.f94942e;
                if (l4Var != null) {
                    l4Var.C(false);
                }
            }
        }
        mj3.g gVar = bVar.f400505a;
        is0.c cVar = bVar.f400506b;
        int i17 = gVar.f408583a;
        int i18 = gVar.f408584b;
        cVar.f375933m = i17;
        cVar.f375934n = i18;
        is0.c cVar2 = bVar.f400507c;
        cVar2.f375933m = i17;
        cVar2.f375934n = i18;
        lj3.d dVar3 = this.f400504a;
        if (dVar3 != null) {
            int i19 = gVar.f408585c;
            boolean z17 = gVar.f408586d;
            int i27 = cVar.f375928e;
            ar4.c cVar3 = ar4.c.f94934a;
            if (!ar4.c.f94936c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VirtualBackgroundFilter", "initRenderProc");
                ar4.c.f94936c = true;
                ar4.c.f94937d = new org.json.JSONArray();
            }
            if (i27 != -1) {
                if (dVar3.f400510a == null) {
                    dVar3.f400510a = new ar4.d();
                    ar4.d dVar4 = dVar3.f400510a;
                    if (dVar4 != null) {
                        dVar4.c(i27, cVar2, true);
                    }
                }
                ar4.d dVar5 = dVar3.f400510a;
                if (dVar5 != null && dVar5.f94943f) {
                    dVar5.f94943f = false;
                    p05.l4 l4Var2 = dVar5.f94942e;
                    if (l4Var2 != null) {
                        l4Var2.C(false);
                    }
                }
                ar4.d dVar6 = dVar3.f400510a;
                if (dVar6 != null) {
                    dVar6.d(i17, i18);
                    dVar6.f94938a = i27;
                    dVar6.f94939b = cVar2;
                    dVar6.b(i19, 0, z17);
                }
                android.opengl.GLES20.glFinish();
            }
        }
        return new lj3.c(bVar.f400505a, bVar.f400507c.f375928e);
    }
}
