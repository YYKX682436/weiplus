package gk4;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk4.r f354123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(gk4.r rVar) {
        super(1);
        this.f354123d = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        java.lang.Object obj2;
        um5.a0 a0Var;
        dk4.a aVar;
        android.graphics.Bitmap bitmap;
        java.lang.Object[] objArr;
        dk4.a aVar2;
        hk4.a it = (hk4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int a17 = gk4.r.a(this.f354123d, it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354123d.f354135g, "onPlayStarted, playerMediaIndex:" + a17 + ", playStatus:" + this.f354123d.f354144p);
        gk4.r rVar = this.f354123d;
        rVar.getClass();
        java.lang.String str = "setPlayerSurface type:" + it.d();
        java.lang.String str2 = rVar.f354135g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        hk4.b d17 = it.d();
        hk4.b bVar = hk4.b.f363466e;
        um5.i0 i0Var = rVar.f354136h;
        android.graphics.SurfaceTexture surfaceTexture = null;
        r9 = null;
        java.lang.String str3 = null;
        surfaceTexture = null;
        if (d17 == bVar) {
            hk4.n nVar = (hk4.n) it;
            gk4.s sVar = it.f363462h;
            if (sVar != null && (aVar2 = sVar.f354162h) != null) {
                str3 = aVar2.f316015s;
            }
            if (str3 != null && (bitmap = nVar.f363496r) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "set imagePlayer surface key:".concat(str3));
                i0Var.getClass();
                java.lang.String str4 = i0Var.f510700t;
                xm5.b.c(str4, "newBitmapInputTexture:".concat(str3), new java.lang.Object[0]);
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = i0Var.f510701u;
                if (!(concurrentLinkedDeque instanceof java.util.Collection) || !concurrentLinkedDeque.isEmpty()) {
                    java.util.Iterator it6 = concurrentLinkedDeque.iterator();
                    while (it6.hasNext()) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((um5.z) it6.next()).f510761a, str3)) {
                            objArr = true;
                            break;
                        }
                    }
                }
                objArr = false;
                if (objArr == true) {
                    xm5.b.c(str4, "newBitmapInputTexture, already contains same key", new java.lang.Object[0]);
                } else {
                    i0Var.f(new um5.d0(i0Var, bitmap, str3, nVar.f363497s));
                }
                it.f363463i = str3;
                it.f363464j = true;
                rVar.l();
            }
        } else {
            hk4.x xVar = (hk4.x) it;
            int i17 = xVar.f363522o;
            int i18 = xVar.f363523p;
            int i19 = xVar.f363524q;
            hk4.o oVar = new hk4.o(i17, i18, i19);
            gk4.s sVar2 = it.f363462h;
            java.lang.String str5 = (sVar2 == null || (aVar = sVar2.f354162h) == null) ? null : aVar.f316015s;
            if (str5 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "set videoPlayer surface key:" + str5 + ", video mediaInfo:" + oVar);
                gk4.k kVar = new gk4.k(rVar, xVar, it);
                i0Var.getClass();
                java.lang.String str6 = i0Var.f510700t;
                xm5.b.c(str6, "newVideoInputTexture:".concat(str5), new java.lang.Object[0]);
                java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque2 = i0Var.f510701u;
                if (!(concurrentLinkedDeque2 instanceof java.util.Collection) || !concurrentLinkedDeque2.isEmpty()) {
                    java.util.Iterator it7 = concurrentLinkedDeque2.iterator();
                    while (it7.hasNext()) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((um5.z) it7.next()).f510761a, str5)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    xm5.b.c(str6, "newVideoInputTexture, already contains same key", new java.lang.Object[0]);
                    java.util.Iterator it8 = concurrentLinkedDeque2.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it8.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((um5.z) obj2).f510761a, str5)) {
                            break;
                        }
                    }
                    um5.z zVar = (um5.z) obj2;
                    if (zVar != null && (a0Var = zVar.f510762b) != null) {
                        surfaceTexture = a0Var.f510666f;
                    }
                    kVar.mo146xb9724478(surfaceTexture);
                } else {
                    i0Var.f(new um5.g0(i0Var, i17, i18, i19, str5, kVar));
                }
                it.f363463i = str5;
            }
        }
        this.f354123d.d(a17 + 1);
        if (this.f354123d.f354144p == gk4.e.f354079h) {
            this.f354123d.f354144p = gk4.e.f354076e;
        }
        if (this.f354123d.f354144p == gk4.e.f354076e) {
            gk4.r rVar2 = this.f354123d;
            if (a17 >= 0) {
                java.util.ArrayList arrayList = rVar2.f354143o;
                if (a17 < arrayList.size()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar2.f354135g, "callNextMediaChange index:" + a17);
                    java.lang.Object obj3 = arrayList.get(a17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                    dk4.a aVar3 = (dk4.a) obj3;
                    pk4.u uVar = rVar2.f354130b;
                    if (uVar != null) {
                        uVar.a(a17, aVar3);
                    }
                }
            } else {
                rVar2.getClass();
            }
        }
        gk4.r rVar3 = this.f354123d;
        if (rVar3.f354131c) {
            rVar3.c();
        }
        return jz5.f0.f384359a;
    }
}
