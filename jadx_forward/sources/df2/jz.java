package df2;

/* loaded from: classes3.dex */
public final class jz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f312053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.lz f312054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz(int i17, df2.lz lzVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312053e = i17;
        this.f312054f = lzVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.jz(this.f312053e, this.f312054f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.jz) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312052d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            int e17 = this.f312053e - c01.id.e();
            df2.lz lzVar = this.f312054f;
            if (e17 <= 0) {
                android.widget.TextView c76 = lzVar.c7();
                if (c76 != null) {
                    c76.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573108m85));
                }
                return jz5.f0.f384359a;
            }
            java.lang.String a17 = no0.l.a(no0.m.f420263a, e17, ":", e17 >= 3600, false, false, 24, null);
            android.widget.TextView c77 = lzVar.c7();
            if (c77 != null) {
                c77.setText(a17);
            }
            this.f312052d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(1000L, this) != aVar);
        return aVar;
    }
}
