package qs2;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f447829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f447830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.b6 f447831f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f447832g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f447833h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447834i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ qs2.q f447835m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f447836n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f447837o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(byte[] bArr, zy2.b6 b6Var, android.content.Intent intent, boolean z17, android.content.Context context, qs2.q qVar, long j17, long j18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f447830e = bArr;
        this.f447831f = b6Var;
        this.f447832g = intent;
        this.f447833h = z17;
        this.f447834i = context;
        this.f447835m = qVar;
        this.f447836n = j17;
        this.f447837o = j18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qs2.i(this.f447830e, this.f447831f, this.f447832g, this.f447833h, this.f447834i, this.f447835m, this.f447836n, this.f447837o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qs2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        java.lang.Object e17;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f447829d;
        zy2.b6 b6Var = this.f447831f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.h70().mo11468x92b714fd(this.f447830e);
            r45.h70 h70Var = mo11468x92b714fd instanceof r45.h70 ? (r45.h70) mo11468x92b714fd : null;
            if (h70Var == null || (linkedList = h70Var.f457430d) == null) {
                list = kz5.p0.f395529d;
            } else {
                list = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    list.add(((r45.ho6) it.next()).f457866d);
                }
            }
            ((c61.l7) b6Var).getClass();
            i95.m c17 = i95.n0.c(ci0.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            vt3.l lVar = vt3.l.f521538a;
            lVar.b(list, 8, true);
            this.f447829d = 1;
            ((c61.l7) b6Var).getClass();
            i95.m c18 = i95.n0.c(ci0.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            e17 = lVar.e(this);
            if (e17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            e17 = obj;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) e17;
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.rewind();
            byteBuffer.get(bArr);
            gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        } else {
            gVar = null;
        }
        ((c61.l7) b6Var).getClass();
        i95.m c19 = i95.n0.c(ci0.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
        vt3.l.f521538a.d();
        this.f447832g.putExtra("KEY_POST_ASSET_INFO", gVar != null ? gVar.g() : null);
        pm0.v.X(new qs2.h(this.f447833h, this.f447834i, this.f447832g, this.f447835m, this.f447836n, this.f447837o));
        return jz5.f0.f384359a;
    }
}
