package du3;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f325301d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f325302e;

    /* renamed from: f, reason: collision with root package name */
    public int f325303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ du3.b0 f325304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325305h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(du3.b0 b0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325304g = b0Var;
        this.f325305h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new du3.y(this.f325304g, this.f325305h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((du3.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long currentTimeMillis;
        java.util.ArrayList arrayList;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325303f;
        du3.b0 b0Var = this.f325304g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            currentTimeMillis = java.lang.System.currentTimeMillis();
            b0Var.f325073y.clear();
            ck0.f fVar = (ck0.f) i95.n0.c(ck0.f.class);
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(this.f325305h, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i18);
            java.util.ArrayList d17 = kz5.c0.d(i18);
            this.f325301d = currentTimeMillis;
            this.f325303f = 1;
            oy4.c cVar = (oy4.c) fVar;
            cVar.getClass();
            obj = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new oy4.b(d17, cVar, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j17 = this.f325301d;
                arrayList = (java.util.ArrayList) this.f325302e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "loadImageTagList cost:" + (java.lang.System.currentTimeMillis() - j17) + ",count:" + arrayList.size() + " value:" + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null));
                return jz5.f0.f384359a;
            }
            currentTimeMillis = this.f325301d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.util.ArrayList arrayList3 = (java.util.ArrayList) it.next();
            java.util.ArrayList arrayList4 = b0Var.f325073y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList3);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                arrayList5.add(((ck0.a) it6.next()).f123829a);
            }
            arrayList4.addAll(arrayList5);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        du3.x xVar = new du3.x(b0Var, null);
        this.f325302e = arrayList2;
        this.f325301d = currentTimeMillis;
        this.f325303f = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, xVar, this) == aVar) {
            return aVar;
        }
        arrayList = arrayList2;
        j17 = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoAiPlugin", "loadImageTagList cost:" + (java.lang.System.currentTimeMillis() - j17) + ",count:" + arrayList.size() + " value:" + kz5.n0.g0(arrayList, null, null, null, 0, null, null, 63, null));
        return jz5.f0.f384359a;
    }
}
