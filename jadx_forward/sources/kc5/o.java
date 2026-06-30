package kc5;

/* loaded from: classes3.dex */
public final class o implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f388103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f388104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc5.s f388105c;

    public o(yz5.a aVar, yz5.a aVar2, kc5.s sVar) {
        this.f388103a = aVar;
        this.f388104b = aVar2;
        this.f388105c = sVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.List list = (java.util.List) this.f388103a.mo152xb9724478();
        jz5.l lVar = (jz5.l) this.f388104b.mo152xb9724478();
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        int intValue = ((java.lang.Number) lVar.f384367e).intValue();
        kc5.s sVar = this.f388105c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        return kc5.s.Bi(sVar, str, list, null, booleanValue, intValue, 4, null);
    }
}
