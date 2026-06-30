package com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627;

/* renamed from: com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciB */
/* loaded from: classes15.dex */
class C27328x58b0be1 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o0 f298460a;

    public C27328x58b0be1(java.lang.Object obj) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o0 o0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o0) obj;
        this.f298460a = o0Var;
        ((vz3.p) o0Var).f523227a = this;
    }

    /* renamed from: ZIDL_AX */
    private native void m113000x1964d17f(long j17, long j18);

    /* renamed from: ZIDL_BX */
    private native void m113001x1964d19e(long j17, long j18);

    /* renamed from: ZIDL_CX */
    private native void m113002x1964d1bd(long j17, long j18);

    public void Q1(long j17) {
        m113000x1964d17f(this.f60633xf042a733, j17);
    }

    /* renamed from: ZIDL_AV */
    public void m113003x1964d17d(long j17, long j18, java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2, java.nio.ByteBuffer byteBuffer3, byte[] bArr, byte[] bArr2) {
        java.util.ArrayList arrayList;
        tz3.c cVar;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 c17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 c18;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.z0 c19;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j jVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.j.f298597q, bArr);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k) com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27697xe85700b9.m119634x75f0b955(com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.k.f298611p, bArr2);
        vz3.p pVar = (vz3.p) this.f298460a;
        pVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGoodsFrameResultAsync sessionId: ");
        sb6.append(j18);
        sb6.append(", status: ");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o oVar = com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o.GOODS_STATUS_NOT_HANDLED;
        sb6.append(kVar != null ? kVar.f298620o[4] ? kVar.f298615g : oVar : null);
        sb6.append(", bufferKey: ");
        sb6.append(kVar != null ? java.lang.Long.valueOf(kVar.f298614f) : null);
        sb6.append(", productSize: ");
        sb6.append((kVar == null || (c19 = kVar.c()) == null || (linkedList2 = c19.f298735d) == null) ? null : java.lang.Integer.valueOf(linkedList2.size()));
        sb6.append(", trackIdList: ");
        sb6.append((kVar == null || (c18 = kVar.c()) == null || (linkedList = c18.f298735d) == null) ? null : kz5.n0.g0(linkedList, ",", null, null, 0, null, vz3.o.f523226d, 30, null));
        sb6.append(", serverDetectStatus: ");
        sb6.append((kVar == null || (c17 = kVar.c()) == null) ? null : java.lang.Integer.valueOf(c17.f298737f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", sb6.toString());
        if (jVar == null || kVar == null) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n0 n0Var = pVar.f523227a;
            if (n0Var != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.C27328x58b0be1) n0Var).Q1(j17);
                return;
            }
            return;
        }
        vz3.q qVar = pVar.f523228b;
        if (j18 != qVar.f523236h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync sessionId not match: (" + j18 + ", " + qVar.f523236h + ')');
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n0 n0Var2 = pVar.f523227a;
            if (n0Var2 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.C27328x58b0be1) n0Var2).Q1(j17);
                return;
            }
            return;
        }
        qVar.f523229a += java.lang.System.currentTimeMillis() - jVar.f298600f;
        boolean z17 = true;
        qVar.f523230b++;
        boolean[] zArr = kVar.f298620o;
        if (zArr[4]) {
            oVar = kVar.f298615g;
        }
        if (oVar != com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.o.GOODS_STATUS_SUCCESS) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n0 n0Var3 = pVar.f523227a;
            if (n0Var3 != null) {
                ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.C27328x58b0be1) n0Var3).Q1(j17);
                return;
            }
            return;
        }
        sz3.c1 c1Var = new sz3.c1();
        c1Var.f495520n = true;
        c1Var.f495507a = 3;
        c1Var.f495508b = java.lang.System.currentTimeMillis();
        c1Var.b(jVar.f298602h, jVar.f298603i, jVar.f298604m);
        sz3.b1 b1Var = new sz3.b1(byteBuffer2);
        b1Var.f495502d = (zArr[6] ? kVar.f298617i : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m()).f298633d;
        b1Var.f495503e = (zArr[6] ? kVar.f298617i : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m()).f298634e;
        c1Var.f495521o = b1Var;
        sz3.b1 b1Var2 = new sz3.b1(byteBuffer3);
        b1Var2.f495502d = (zArr[7] ? kVar.f298618m : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m()).f298633d;
        b1Var2.f495503e = (zArr[7] ? kVar.f298618m : new com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.m()).f298634e;
        c1Var.f495522p = b1Var2;
        c1Var.f495518l = kVar.c().f298737f;
        int i17 = kVar.c().f298736e;
        java.util.ArrayList arrayList2 = c1Var.f495514h;
        if (i17 == 2) {
            c1Var.f495509c = 1001;
            c1Var.f495510d = 1;
            c1Var.f495518l = 0;
            java.util.LinkedList linkedList3 = kVar.c().f298735d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList3, "getProducts(...)");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y0 y0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y0) kz5.n0.Z(linkedList3);
            boolean z18 = y0Var != null ? y0Var.f298725p : false;
            if (y0Var != null) {
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by local, show trackId: " + y0Var.f298721i);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60();
                c17282x335f2f60.m68607x2eaf75(y0Var);
                sz3.a1 a1Var = new sz3.a1(c17282x335f2f60);
                sz3.b1 b1Var3 = new sz3.b1(et5.h.f(byteBuffer));
                b1Var3.f495501c = 4;
                b1Var3.f495502d = jVar.f298602h;
                b1Var3.f495503e = jVar.f298603i;
                vz3.a aVar = qVar.f523231c;
                b1Var3.f495504f = aVar != null ? aVar.f523201d : 0;
                a1Var.f495493b = b1Var3;
                sz3.y0 y0Var2 = a1Var.f495496e;
                y0Var2.f495699g = kVar.b().f298626e;
                y0Var2.f495700h = kVar.b().f298627f;
                y0Var2.f495693a = jVar.f298600f;
                arrayList2.add(a1Var);
            }
        } else if (i17 == 4 && c1Var.f495518l == 1) {
            c1Var.f495509c = 1002;
            c1Var.f495510d = 3;
            c1Var.f495516j = !com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240381f;
            byte[] f17 = et5.h.f(byteBuffer);
            c1Var.f495511e = f17;
            if (c1Var.f495516j) {
                c1Var.f495517k = sz3.d1.f495539d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by server, to upload");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by server, isDetecting and ignore");
                z17 = false;
            }
            sz3.a1 a1Var2 = new sz3.a1(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60());
            sz3.b1 b1Var4 = new sz3.b1(f17);
            b1Var4.f495501c = 4;
            b1Var4.f495502d = jVar.f298602h;
            b1Var4.f495503e = jVar.f298603i;
            vz3.a aVar2 = qVar.f523231c;
            b1Var4.f495504f = aVar2 != null ? aVar2.f523201d : 0;
            a1Var2.f495493b = b1Var4;
            a1Var2.f495496e.f495699g = kVar.b().f298626e;
            arrayList2.add(a1Var2);
        } else if (c1Var.f495518l == 2) {
            c1Var.f495509c = 1002;
            c1Var.f495510d = 3;
            java.util.LinkedList linkedList4 = kVar.c().f298735d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList4, "getProducts(...)");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y0 y0Var3 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.y0) kz5.n0.Z(linkedList4);
            if (y0Var3 != null) {
                if (y0Var3.f298725p) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AffScanGoodsQueue", "onGoodsFrameResultAsync by server, to add trackId: " + y0Var3.f298721i);
                }
                sz3.a1 a1Var3 = qVar.f523237i;
                if (a1Var3 != null) {
                    a1Var3.f495496e.f495699g = kVar.b().f298626e;
                    sz3.x0 x0Var = qVar.f523238j;
                    c1Var.f495519m = x0Var;
                    if (x0Var != null && (arrayList = x0Var.f495684e) != null) {
                        java.util.Iterator it = arrayList.iterator();
                        int i18 = 0;
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            ((sz3.w0) next).f495671i = y0Var3.f298721i;
                            i18 = i19;
                        }
                    }
                    a1Var3.f495492a.m68607x2eaf75(y0Var3);
                    a1Var3.f495494c = a1Var3.f495495d;
                    arrayList2.add(a1Var3);
                }
            }
        } else {
            z17 = false;
        }
        if (z17 && (cVar = qVar.f523235g) != null) {
            cVar.b(c1Var);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n0 n0Var4 = pVar.f523227a;
        if (n0Var4 != null) {
            ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.C27328x58b0be1) n0Var4).Q1(j17);
        }
    }

    /* renamed from: ZIDL_BV */
    public void m113004x1964d19c(long j17) {
        vz3.p pVar = (vz3.p) this.f298460a;
        pVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AffScanGoodsQueue", "onFFEInitFailedAsync");
        pm0.v.X(new vz3.n(pVar.f523228b, pVar, j17));
    }

    /* renamed from: ZIDL_CV */
    public void m113005x1964d1bb(long j17, long j18, long j19) {
        this.f298460a.getClass();
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3151x66089627.n0
    public void z0(long j17) {
        m113001x1964d19e(this.f60633xf042a733, j17);
    }
}
