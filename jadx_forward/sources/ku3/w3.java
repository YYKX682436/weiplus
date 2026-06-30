package ku3;

/* loaded from: classes3.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f393978d;

    /* renamed from: e, reason: collision with root package name */
    public int f393979e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f393980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f393981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(ku3.y3 y3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393981g = y3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ku3.w3 w3Var = new ku3.w3(this.f393981g, interfaceC29045xdcb5ca57);
        w3Var.f393980f = obj;
        return w3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ku3.w3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0073 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f393979e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r1 = r9.f393978d
            kotlin.jvm.internal.f0 r1 = (p3321xbce91901.jvm.p3324x21ffc6bd.f0) r1
            java.lang.Object r4 = r9.f393980f
            kotlinx.coroutines.y0 r4 = (p3325xe03a0797.p3326xc267989b.y0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r4
            r4 = r9
            goto L76
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            java.lang.Object r1 = r9.f393978d
            kotlin.jvm.internal.f0 r1 = (p3321xbce91901.jvm.p3324x21ffc6bd.f0) r1
            java.lang.Object r4 = r9.f393980f
            kotlinx.coroutines.y0 r4 = (p3325xe03a0797.p3326xc267989b.y0) r4
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r4
            r4 = r9
            goto L5d
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f393980f
            kotlinx.coroutines.y0 r10 = (p3325xe03a0797.p3326xc267989b.y0) r10
            kotlin.jvm.internal.f0 r1 = new kotlin.jvm.internal.f0
            r1.<init>()
            ku3.y3 r4 = r9.f393981g
            int r4 = r4.B
            int r4 = r4 - r3
            r1.f391649d = r4
            r4 = r9
        L44:
            boolean r5 = p3325xe03a0797.p3326xc267989b.z0.h(r10)
            if (r5 == 0) goto L7d
            int r5 = r1.f391649d
            if (r5 < 0) goto L7d
            r4.f393980f = r10
            r4.f393978d = r1
            r4.f393979e = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.k1.b(r5, r4)
            if (r5 != r0) goto L5d
            return r0
        L5d:
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r5 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            ku3.v3 r6 = new ku3.v3
            ku3.y3 r7 = r4.f393981g
            r8 = 0
            r6.<init>(r7, r1, r8)
            r4.f393980f = r10
            r4.f393978d = r1
            r4.f393979e = r2
            java.lang.Object r5 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r4)
            if (r5 != r0) goto L76
            return r0
        L76:
            int r5 = r1.f391649d
            int r5 = r5 + (-1)
            r1.f391649d = r5
            goto L44
        L7d:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ku3.w3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
