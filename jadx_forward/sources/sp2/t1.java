package sp2;

/* loaded from: classes2.dex */
public final class t1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(sp2.o2 o2Var) {
        super(2);
        this.f492750d = o2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = this.f492750d.f492656b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        sp2.x3 x3Var = (sp2.x3) pf5.z.f435481a.b(fragment).a(sp2.x3.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "startRequestCgi");
        x3Var.V6(intValue, intValue2);
        x3Var.W6(intValue, intValue2);
        return jz5.f0.f384359a;
    }
}
