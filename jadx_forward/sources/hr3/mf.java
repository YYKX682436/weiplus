package hr3;

/* loaded from: classes5.dex */
public final class mf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f365342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365343f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(hr3.pf pfVar, android.graphics.Bitmap bitmap, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365341d = pfVar;
        this.f365342e = bitmap;
        this.f365343f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr3.mf(this.f365341d, this.f365342e, this.f365343f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hr3.mf mfVar = (hr3.mf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        mfVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        hr3.pf pfVar = this.f365341d;
        pfVar.S6().m79047x8534ade3().setImageBitmap(this.f365342e);
        android.widget.ImageView m79047x8534ade3 = pfVar.S6().m79047x8534ade3();
        java.lang.String str = this.f365343f;
        m79047x8534ade3.setOnClickListener(new hr3.lf(pfVar, str));
        pfVar.S6().m79050x6e4974fa(false);
        pfVar.f365431q = str;
        android.widget.Button button = (android.widget.Button) ((jz5.n) pfVar.f365425h).mo141623x754a37bb();
        if (button != null) {
            button.setEnabled(true);
        }
        return jz5.f0.f384359a;
    }
}
