package pv3;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv3.m f440139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f440140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440141f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pv3.m mVar, android.view.View view, in5.s0 s0Var) {
        super(1);
        this.f440139d = mVar;
        this.f440140e = view;
        this.f440141f = s0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        pv3.m mVar = this.f440139d;
        if (intValue == 0) {
            mVar.a(this.f440140e);
        } else {
            mVar.c(this.f440141f);
        }
        return jz5.f0.f384359a;
    }
}
