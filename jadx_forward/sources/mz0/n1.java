package mz0;

/* loaded from: classes5.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414539d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(mz0.b2 b2Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414541f = b2Var;
        this.f414542g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        mz0.n1 n1Var = new mz0.n1(this.f414541f, this.f414542g, interfaceC29045xdcb5ca57);
        n1Var.f414540e = obj;
        return n1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.n1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f414539d
            jz5.f0 r2 = jz5.f0.f384359a
            java.lang.String r3 = r13.f414542g
            r4 = 2
            r5 = 1
            mz0.b2 r6 = r13.f414541f
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 != r4) goto L1a
            java.lang.Object r0 = r13.f414540e
            kotlinx.coroutines.y0 r0 = (p3325xe03a0797.p3326xc267989b.y0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L8a
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            java.lang.Object r1 = r13.f414540e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L61
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.lang.Object r14 = r13.f414540e
            r1 = r14
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            android.app.Activity r14 = r6.m80379x76847179()
            java.lang.String r7 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r7)
            pf5.z r7 = pf5.z.f435481a
            boolean r8 = r14 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r8 == 0) goto Lb6
            androidx.appcompat.app.AppCompatActivity r14 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r14
            pf5.v r14 = r7.a(r14)
            java.lang.Class<dz0.l> r7 = dz0.l.class
            pf5.c r14 = r14.c(r7)
            r7 = r14
            dz0.l r7 = (dz0.l) r7
            java.lang.String r8 = r13.f414542g
            r9 = 0
            r11 = 2
            r12 = 0
            r13.f414540e = r1
            r13.f414539d = r5
            r10 = r13
            java.lang.Object r14 = dz0.l.n4(r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L61
            return r0
        L61:
            kotlinx.coroutines.flow.j r14 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.j) r14
            r5 = 0
            if (r14 == 0) goto L8b
            mz0.k1 r7 = new mz0.k1
            r7.<init>(r6, r3, r5)
            kotlinx.coroutines.flow.g0 r8 = new kotlinx.coroutines.flow.g0
            r8.<init>(r14, r7)
            mz0.l1 r14 = new mz0.l1
            r14.<init>(r6, r5)
            kotlinx.coroutines.flow.l0 r5 = new kotlinx.coroutines.flow.l0
            r5.<init>(r8, r14)
            mz0.m1 r14 = new mz0.m1
            r14.<init>(r6)
            r13.f414540e = r1
            r13.f414539d = r4
            java.lang.Object r14 = r5.a(r14, r13)
            if (r14 != r0) goto L8a
            return r0
        L8a:
            r5 = r2
        L8b:
            if (r5 != 0) goto Lb5
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "recreateWithMusicID return null, musicId:"
            r14.<init>(r0)
            r14.append(r3)
            java.lang.String r14 = r14.toString()
            java.lang.String r0 = "MicroMsg.Template.TemplateControlUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r14)
            py0.f0 r14 = r6.f7()
            r14.dismiss()
            android.app.Activity r14 = r6.m80379x76847179()
            r0 = 2131757756(0x7f100abc, float:1.9146457E38)
            java.lang.String r0 = r6.m158362x2fec8307(r0)
            db5.t7.g(r14, r0)
        Lb5:
            return r2
        Lb6:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.n1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
