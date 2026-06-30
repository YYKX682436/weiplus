package sn1;

/* loaded from: classes9.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f491600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f491601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f491604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, java.util.function.Consumer consumer, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f491601e = linkedList;
        this.f491602f = str;
        this.f491603g = str2;
        this.f491604h = consumer;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sn1.p(this.f491601e, this.f491602f, this.f491603g, this.f491604h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sn1.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f491600d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            sn1.z zVar = sn1.z.f491649a;
            this.f491600d = 1;
            bw5.n2 n2Var = new bw5.n2();
            java.util.LinkedList linkedList = this.f491601e;
            n2Var.f111990d = linkedList.size();
            boolean[] zArr = n2Var.f111999p;
            zArr[2] = true;
            n2Var.f111991e = linkedList;
            zArr[3] = true;
            n2Var.f111992f = wo.w0.m();
            zArr[4] = true;
            n2Var.f111993g = gm0.j1.b().k();
            zArr[5] = true;
            n2Var.f111994h = 2;
            zArr[6] = true;
            n2Var.f111995i = 0L;
            zArr[7] = true;
            n2Var.f111996m = this.f491602f;
            zArr[8] = true;
            n2Var.f111997n = this.f491603g;
            zArr[9] = true;
            byte[] bArr = kn1.f.f391135h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBackupAuthKey(...)");
            obj = zVar.c(n2Var, bArr, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        sn1.o oVar = new sn1.o(this.f491604h, (sn1.j) obj, null);
        this.f491600d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, oVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
