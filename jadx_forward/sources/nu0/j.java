package nu0;

/* loaded from: classes5.dex */
public final class j implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f421507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.p f421508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421509c;

    public j(yz5.a aVar, nu0.p pVar, java.lang.String str) {
        this.f421507a = aVar;
        this.f421508b = pVar;
        this.f421509c = str;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h
    public final void a(java.lang.String str) {
        yz5.a aVar = this.f421507a;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        if (str == null || str.length() == 0) {
            return;
        }
        this.f421508b.q7().f7(this.f421509c);
    }
}
