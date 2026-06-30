package nu0;

/* loaded from: classes5.dex */
public final class u3 implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f421643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f421645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f421646d;

    public u3(yz5.a aVar, nu0.b4 b4Var, int i17, int i18) {
        this.f421643a = aVar;
        this.f421644b = b4Var;
        this.f421645c = i17;
        this.f421646d = i18;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h
    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            yz5.a aVar = this.f421643a;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        this.f421644b.D7(this.f421645c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageComp.MainComposingUIC", "[switchScene] position:" + this.f421646d + " err:" + str);
    }
}
