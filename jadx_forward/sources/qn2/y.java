package qn2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qn2.z f446744e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f446745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(qn2.z zVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446744e = zVar;
        this.f446745f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(qn2.z r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof qn2.x
            if (r0 == 0) goto L13
            r0 = r7
            qn2.x r0 = (qn2.x) r0
            int r1 = r0.f446741f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f446741f = r1
            goto L18
        L13:
            qn2.x r0 = new qn2.x
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f446740e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f446741f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.f446739d
            qn2.z r6 = (qn2.z) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto La4
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            com.tencent.mm.view.MMPAGView r7 = r6.f446755r
            if (r7 != 0) goto L73
            com.tencent.mm.view.MMPAGView r7 = new com.tencent.mm.view.MMPAGView
            android.view.ViewGroup r2 = r6.f446856d
            android.content.Context r2 = r2.getContext()
            java.lang.String r4 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            r7.<init>(r2)
            r6.f446755r = r7
            ym5.l2 r7 = ym5.l2.f544957a
            ym5.j2[] r7 = ym5.j2.f544925d
            com.tencent.mm.view.MMPAGView r7 = r6.f446755r
            if (r7 == 0) goto L60
            ae2.in r2 = ae2.in.f85221a
            ym5.f6 r4 = ym5.f6.f544834a2
            boolean r2 = r2.a(r4)
            r7.o(r2)
        L60:
            qn2.r r7 = new qn2.r
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r6)
            r7.<init>(r6, r2)
            r6.f446757t = r7
            com.tencent.mm.view.MMPAGView r2 = r6.f446755r
            if (r2 == 0) goto L73
            r2.a(r7)
        L73:
            android.widget.FrameLayout r7 = r6.f446754q
            r2 = 0
            r4 = -1
            if (r7 == 0) goto L82
            com.tencent.mm.view.MMPAGView r5 = r6.f446755r
            int r7 = r7.indexOfChild(r5)
            if (r7 != r4) goto L82
            r2 = r3
        L82:
            if (r2 == 0) goto Lb5
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r4, r4)
            com.tencent.mm.view.MMPAGView r2 = r6.f446755r
            if (r2 != 0) goto L8e
            goto L91
        L8e:
            r2.setLayoutParams(r7)
        L91:
            com.tencent.mm.view.MMPAGView r7 = r6.f446755r
            if (r7 == 0) goto La4
            vl2.s r2 = vl2.s.f519401a
            vl2.h r4 = vl2.h.f519359o
            r0.f446739d = r6
            r0.f446741f = r3
            java.lang.Object r7 = r2.d(r4, r7, r0)
            if (r7 != r1) goto La4
            return r1
        La4:
            android.widget.FrameLayout r7 = r6.f446754q
            if (r7 == 0) goto Lad
            com.tencent.mm.view.MMPAGView r0 = r6.f446755r
            r7.addView(r0)
        Lad:
            android.widget.FrameLayout r6 = r6.f446754q
            if (r6 != 0) goto Lb2
            goto Lb5
        Lb2:
            r6.setClickable(r3)
        Lb5:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qn2.y.a(qn2.z, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qn2.y(this.f446744e, this.f446745f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn2.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f446743d;
        qn2.z zVar = this.f446744e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = zVar.f446755r;
            if ((c22789xd23e9a9b2 != null && c22789xd23e9a9b2.f()) && (c22789xd23e9a9b = zVar.f446755r) != null) {
                c22789xd23e9a9b.n();
            }
            this.f446743d = 1;
            if (a(zVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        zVar.K0(0);
        android.view.View view = zVar.f446758u;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$showLottering$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$showLottering$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        qn2.r rVar = zVar.f446757t;
        if (rVar != null) {
            yz5.a callback = this.f446745f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            rVar.f446676f = callback;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = zVar.f446755r;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.m82582x3ae760af(0.0d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = zVar.f446755r;
        if (c22789xd23e9a9b4 != null) {
            c22789xd23e9a9b4.d();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = zVar.f446755r;
        if (c22789xd23e9a9b5 != null) {
            c22789xd23e9a9b5.g();
        }
        return jz5.f0.f384359a;
    }
}
