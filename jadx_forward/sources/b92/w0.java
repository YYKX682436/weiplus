package b92;

/* loaded from: classes2.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f100074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100075e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, android.content.Context context) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100074d = hVar;
        this.f100075e = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b92.w0(this.f100074d, interfaceC29045xdcb5ca57, this.f100075e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        b92.w0 w0Var = (b92.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            xg2.h r9 = r8.f100074d
            xg2.i r9 = (xg2.i) r9
            java.lang.Object r9 = r9.f535926b
            r45.rs1 r9 = (r45.rs1) r9
            java.lang.String r0 = "requestWxGiftInfoAndJump"
            java.lang.String r1 = "getJumpInfo succ"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r0.<init>()
            r1 = 2
            com.tencent.mm.protobuf.f r9 = r9.m75936x14adae67(r1)
            r45.lv1 r9 = (r45.lv1) r9
            r1 = 0
            if (r9 == 0) goto L31
            r2 = 10
            com.tencent.mm.protobuf.g r9 = r9.m75934xbce7f2f(r2)
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
            r0.mo11468x92b714fd(r9)     // Catch: java.lang.Exception -> L3a
            goto L48
        L3a:
            r9 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r2 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r2, r0, r9)
            goto L34
        L48:
            if (r0 == 0) goto L7a
            java.lang.ref.WeakReference r9 = com.p314xaae8f345.mm.app.w.k()
            java.lang.Object r9 = r9.get()
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 != 0) goto L58
            android.content.Context r9 = r8.f100075e
        L58:
            r2 = r9
            java.lang.Class<zy2.b6> r9 = zy2.b6.class
            i95.m r9 = i95.n0.c(r9)
            zy2.b6 r9 = (zy2.b6) r9
            r9.getClass()
            r4 = 0
            java.lang.String r9 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r9)
            xc2.y2 r1 = xc2.y2.f534876a
            xc2.p0 r3 = new xc2.p0
            r3.<init>(r0)
            r3.f534785n = r4
            r5 = 0
            r6 = 8
            r7 = 0
            xc2.y2.i(r1, r2, r3, r4, r5, r6, r7)
        L7a:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b92.w0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
