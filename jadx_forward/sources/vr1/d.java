package vr1;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f521086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.w0 f521087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vr1.o oVar, in5.w0 w0Var) {
        super(0);
        this.f521086d = oVar;
        this.f521087e = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        vr1.o oVar = this.f521086d;
        xr1.e eVar = (xr1.e) kz5.n0.a0(oVar.P6().f233598o, this.f521087e.f374684d);
        android.widget.TextView textView = oVar.f521119h;
        if (textView != null) {
            textView.setText(eVar != null ? eVar.f537719f : null);
        }
        return jz5.f0.f384359a;
    }
}
