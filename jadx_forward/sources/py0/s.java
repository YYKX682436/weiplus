package py0;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f440544d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ py0.y f440546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440547g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(py0.y yVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440546f = yVar;
        this.f440547g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        py0.s sVar = new py0.s(this.f440546f, this.f440547g, interfaceC29045xdcb5ca57);
        sVar.f440545e = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((py0.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f440544d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 2
            r4 = 1
            py0.y r5 = r12.f440546f
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r12.f440545e
            kotlinx.coroutines.y0 r0 = (p3325xe03a0797.p3326xc267989b.y0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L88
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f440545e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L5f
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f440545e
            r1 = r13
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            android.app.Activity r13 = r5.m80379x76847179()
            java.lang.String r6 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r6)
            pf5.z r6 = pf5.z.f435481a
            boolean r7 = r13 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r7 == 0) goto La8
            androidx.appcompat.app.AppCompatActivity r13 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r13
            pf5.v r13 = r6.a(r13)
            java.lang.Class<dz0.l> r6 = dz0.l.class
            pf5.c r13 = r13.c(r6)
            r6 = r13
            dz0.l r6 = (dz0.l) r6
            java.lang.String r7 = r12.f440547g
            r8 = 0
            r10 = 2
            r11 = 0
            r12.f440545e = r1
            r12.f440544d = r4
            r9 = r12
            java.lang.Object r13 = dz0.l.n4(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L5f
            return r0
        L5f:
            kotlinx.coroutines.flow.j r13 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j) r13
            r4 = 0
            if (r13 == 0) goto L89
            py0.p r6 = new py0.p
            r6.<init>(r5, r4)
            kotlinx.coroutines.flow.g0 r7 = new kotlinx.coroutines.flow.g0
            r7.<init>(r13, r6)
            py0.q r13 = new py0.q
            r13.<init>(r5, r4)
            kotlinx.coroutines.flow.l0 r4 = new kotlinx.coroutines.flow.l0
            r4.<init>(r7, r13)
            py0.r r13 = new py0.r
            r13.<init>(r5)
            r12.f440545e = r1
            r12.f440544d = r3
            java.lang.Object r13 = r4.a(r13, r12)
            if (r13 != r0) goto L88
            return r0
        L88:
            r4 = r2
        L89:
            if (r4 != 0) goto La7
            java.lang.String r13 = "MaasBaseUILogicUIC"
            java.lang.String r0 = "recreateWithMusicID return null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r13, r0)
            py0.f0 r13 = r5.P6()
            r13.dismiss()
            android.app.Activity r13 = r5.m80379x76847179()
            r0 = 2131757756(0x7f100abc, float:1.9146457E38)
            java.lang.String r0 = r5.m158362x2fec8307(r0)
            db5.t7.g(r13, r0)
        La7:
            return r2
        La8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: py0.s.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
