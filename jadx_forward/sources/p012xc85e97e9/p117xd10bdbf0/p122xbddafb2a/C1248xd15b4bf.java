package p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a;

@qz5.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/k;", "Landroidx/window/layout/WindowLayoutInfo;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 */
/* loaded from: classes14.dex */
public final class C1248xd15b4bf extends qz5.l implements yz5.p {

    /* renamed from: $activity */
    final /* synthetic */ android.app.Activity f3931x76eb8f33;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;

    /* renamed from: label */
    int f3932x61f7ef4;

    /* renamed from: this$0 */
    final /* synthetic */ p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1246x1ddc49ba f3933xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248xd15b4bf(p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1246x1ddc49ba c1246x1ddc49ba, android.app.Activity activity, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1248xd15b4bf> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f3933xcbdd23aa = c1246x1ddc49ba;
        this.f3931x76eb8f33 = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeSuspend$lambda-0 */
    public static final void m8631x6f0b9baa(u26.w wVar, p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(info, "info");
        wVar.e(info);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1248xd15b4bf c1248xd15b4bf = new p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1248xd15b4bf(this.f3933xcbdd23aa, this.f3931x76eb8f33, interfaceC29045xdcb5ca57);
        c1248xd15b4bf.L$0 = obj;
        return c1248xd15b4bf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x00ad, TRY_LEAVE, TryCatch #1 {all -> 0x00ad, blocks: (B:11:0x006a, B:16:0x007e, B:18:0x0086), top: B:10:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Type inference failed for: r1v10, types: [u26.y] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009e -> B:10:0x006a). Please report as a decompilation issue!!! */
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
            int r1 = r9.f3932x61f7ef4
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            java.lang.Object r1 = r9.L$2
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.L$1
            m3.a r4 = (m3.a) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.k r5 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L39
            r10 = r5
            r5 = r1
            goto L69
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            java.lang.Object r1 = r9.L$2
            u26.y r1 = (u26.y) r1
            java.lang.Object r4 = r9.L$1
            m3.a r4 = (m3.a) r4
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.flow.k r5 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Throwable -> L39
            r6 = r5
            r5 = r1
            r1 = r9
            goto L7e
        L39:
            r10 = move-exception
            goto Laf
        L3c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.flow.k r10 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r10
            u26.u r1 = u26.u.DROP_OLDEST
            r4 = 4
            r5 = 10
            r6 = 0
            u26.w r1 = u26.z.a(r5, r1, r6, r4, r6)
            androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$a r4 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$a
            r4.<init>()
            androidx.window.layout.WindowInfoTrackerImpl r5 = r9.f3933xcbdd23aa
            androidx.window.layout.WindowBackend r5 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1246x1ddc49ba.m8630xa0e6e15a(r5)
            android.app.Activity r6 = r9.f3931x76eb8f33
            j4.e$$a r7 = new j4.e$$a
            r7.<init>()
            r5.mo8540x5ea79122(r6, r7, r4)
            u26.k r1 = (u26.k) r1     // Catch: java.lang.Throwable -> L39
            u26.a r5 = new u26.a     // Catch: java.lang.Throwable -> L39
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L39
        L69:
            r1 = r9
        L6a:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> Lad
            r1.L$1 = r4     // Catch: java.lang.Throwable -> Lad
            r1.L$2 = r5     // Catch: java.lang.Throwable -> Lad
            r1.f3932x61f7ef4 = r3     // Catch: java.lang.Throwable -> Lad
            u26.a r5 = (u26.a) r5     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r6 = r5.a(r1)     // Catch: java.lang.Throwable -> Lad
            if (r6 != r0) goto L7b
            return r0
        L7b:
            r8 = r6
            r6 = r10
            r10 = r8
        L7e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lad
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lad
            if (r10 == 0) goto La1
            r10 = r5
            u26.a r10 = (u26.a) r10     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r5 = r10.b()     // Catch: java.lang.Throwable -> Lad
            androidx.window.layout.WindowLayoutInfo r5 = (p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1249xd38bff28) r5     // Catch: java.lang.Throwable -> Lad
            r1.L$0 = r6     // Catch: java.lang.Throwable -> Lad
            r1.L$1 = r4     // Catch: java.lang.Throwable -> Lad
            r1.L$2 = r10     // Catch: java.lang.Throwable -> Lad
            r1.f3932x61f7ef4 = r2     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r5 = r6.mo771x2f8fd3(r5, r1)     // Catch: java.lang.Throwable -> Lad
            if (r5 != r0) goto L9e
            return r0
        L9e:
            r5 = r10
            r10 = r6
            goto L6a
        La1:
            androidx.window.layout.WindowInfoTrackerImpl r10 = r1.f3933xcbdd23aa
            androidx.window.layout.WindowBackend r10 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1246x1ddc49ba.m8630xa0e6e15a(r10)
            r10.mo8541x6de6303b(r4)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        Lad:
            r10 = move-exception
            goto Lb0
        Laf:
            r1 = r9
        Lb0:
            androidx.window.layout.WindowInfoTrackerImpl r0 = r1.f3933xcbdd23aa
            androidx.window.layout.WindowBackend r0 = p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1246x1ddc49ba.m8630xa0e6e15a(r0)
            r0.mo8541x6de6303b(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1248xd15b4bf.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
        return ((p012xc85e97e9.p117xd10bdbf0.p122xbddafb2a.C1248xd15b4bf) mo148xaf65a0fc(kVar, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}
