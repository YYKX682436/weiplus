package bg2;

/* loaded from: classes2.dex */
public final class i5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f20161d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f20162e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f20163f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f20164g;

    /* renamed from: h, reason: collision with root package name */
    public int f20165h;

    /* renamed from: i, reason: collision with root package name */
    public int f20166i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f20167m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bg2.j5 f20168n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(android.view.View view, bg2.j5 j5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20167m = view;
        this.f20168n = j5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.i5(this.f20167m, this.f20168n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.i5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x015c, code lost:
    
        if (r10 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0325, code lost:
    
        if (r3 == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e7, code lost:
    
        if (r10 == null) goto L97;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0016. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x03a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x037c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x035c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0231  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.i5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
