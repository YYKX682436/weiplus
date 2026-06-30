package rf2;

/* loaded from: classes10.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f476451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f476453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476454g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f476455h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476456i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.View f476457m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(rf2.c2 c2Var, rf2.d2 d2Var, java.lang.String str, android.widget.TextView textView, java.lang.String str2, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476452e = c2Var;
        this.f476453f = d2Var;
        this.f476454g = str;
        this.f476455h = textView;
        this.f476456i = str2;
        this.f476457m = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.v1(this.f476452e, this.f476453f, this.f476454g, this.f476455h, this.f476456i, this.f476457m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rf2.v1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f476451d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            rf2.c2 c2Var = this.f476452e;
            rf2.d2 d2Var = this.f476453f;
            java.lang.String str = this.f476454g;
            android.widget.TextView textView = this.f476455h;
            java.lang.String str2 = this.f476456i;
            android.view.View view = this.f476457m;
            this.f476451d = 1;
            if (rf2.c2.a(c2Var, d2Var, str, textView, str2, view, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
