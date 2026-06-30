package ax2;

/* loaded from: classes10.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f15081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView f15082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f15082e = livePkCritDoingView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ax2.p0(this.f15082e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ax2.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0022 -> B:5:0x0025). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f15081d
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Le
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
            goto L25
        Le:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L16:
            kotlin.ResultKt.throwOnFailure(r6)
            r6 = r5
        L1a:
            r6.f15081d = r2
            r3 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r1 = kotlinx.coroutines.k1.b(r3, r6)
            if (r1 != r0) goto L25
            return r0
        L25:
            com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView r1 = r6.f15082e
            com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView.g(r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: ax2.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
