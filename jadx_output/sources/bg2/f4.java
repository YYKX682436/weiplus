package bg2;

/* loaded from: classes2.dex */
public final class f4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rg6 f20078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f20079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.wk5 f20080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.pl5 f20081h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f20082i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(r45.rg6 rg6Var, bg2.h4 h4Var, r45.wk5 wk5Var, r45.pl5 pl5Var, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20078e = rg6Var;
        this.f20079f = h4Var;
        this.f20080g = wk5Var;
        this.f20081h = pl5Var;
        this.f20082i = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.f4(this.f20078e, this.f20079f, this.f20080g, this.f20081h, this.f20082i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.f4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0164  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.f4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
