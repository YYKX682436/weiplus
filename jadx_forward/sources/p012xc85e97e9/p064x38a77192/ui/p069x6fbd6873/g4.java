package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class g4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 f92100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h4 f92101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s3.b f92102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 abstractC1058x6d8e7db5, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.h4 h4Var, s3.b bVar) {
        super(0);
        this.f92100d = abstractC1058x6d8e7db5;
        this.f92101e = h4Var;
        this.f92102f = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.AbstractC1058x6d8e7db5 abstractC1058x6d8e7db5 = this.f92100d;
        abstractC1058x6d8e7db5.removeOnAttachStateChangeListener(this.f92101e);
        s3.b listener = this.f92102f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        s3.a.b(abstractC1058x6d8e7db5).f483913a.remove(listener);
        return jz5.f0.f384359a;
    }
}
