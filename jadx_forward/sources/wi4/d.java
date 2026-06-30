package wi4;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f527808d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f527809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f527810f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.widget.EditText editText, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f527810f = editText;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        wi4.d dVar = new wi4.d(this.f527810f, interfaceC29045xdcb5ca57);
        dVar.f527809e = obj;
        return dVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wi4.d) mo148xaf65a0fc((u26.r0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f527808d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            u26.r0 r0Var = (u26.r0) this.f527809e;
            wi4.c cVar = new wi4.c(r0Var);
            android.widget.EditText editText = this.f527810f;
            editText.addTextChangedListener(cVar);
            wi4.b bVar = new wi4.b(editText, cVar);
            this.f527808d = 1;
            if (u26.p0.a(r0Var, bVar, this) == aVar) {
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
