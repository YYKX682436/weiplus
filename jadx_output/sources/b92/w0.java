package b92;

/* loaded from: classes2.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f18541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(xg2.h hVar, kotlin.coroutines.Continuation continuation, android.content.Context context) {
        super(2, continuation);
        this.f18541d = hVar;
        this.f18542e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new b92.w0(this.f18541d, continuation, this.f18542e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        b92.w0 w0Var = (b92.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            kotlin.ResultKt.throwOnFailure(r9)
            xg2.h r9 = r8.f18541d
            xg2.i r9 = (xg2.i) r9
            java.lang.Object r9 = r9.f454393b
            r45.rs1 r9 = (r45.rs1) r9
            java.lang.String r0 = "requestWxGiftInfoAndJump"
            java.lang.String r1 = "getJumpInfo succ"
            com.tencent.mars.xlog.Log.i(r0, r1)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r0.<init>()
            r1 = 2
            com.tencent.mm.protobuf.f r9 = r9.getCustom(r1)
            r45.lv1 r9 = (r45.lv1) r9
            r1 = 0
            if (r9 == 0) goto L31
            r2 = 10
            com.tencent.mm.protobuf.g r9 = r9.getByteString(r2)
            if (r9 == 0) goto L31
            byte[] r9 = r9.g()
            goto L32
        L31:
            r9 = r1
        L32:
            if (r9 != 0) goto L36
        L34:
            r0 = r1
            goto L48
        L36:
            r0.parseFrom(r9)     // Catch: java.lang.Exception -> L3a
            goto L48
        L3a:
            r9 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r2 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r2, r0, r9)
            goto L34
        L48:
            if (r0 == 0) goto L7a
            java.lang.ref.WeakReference r9 = com.tencent.mm.app.w.k()
            java.lang.Object r9 = r9.get()
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 != 0) goto L58
            android.content.Context r9 = r8.f18542e
        L58:
            r2 = r9
            java.lang.Class<zy2.b6> r9 = zy2.b6.class
            i95.m r9 = i95.n0.c(r9)
            zy2.b6 r9 = (zy2.b6) r9
            r9.getClass()
            r4 = 0
            java.lang.String r9 = "context"
            kotlin.jvm.internal.o.g(r2, r9)
            xc2.y2 r1 = xc2.y2.f453343a
            xc2.p0 r3 = new xc2.p0
            r3.<init>(r0)
            r3.f453252n = r4
            r5 = 0
            r6 = 8
            r7 = 0
            xc2.y2.i(r1, r2, r3, r4, r5, r6, r7)
        L7a:
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b92.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
