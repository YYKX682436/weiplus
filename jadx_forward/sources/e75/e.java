package e75;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 f331506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1, java.util.List list) {
        super(0);
        this.f331506d = c20988xba34acb1;
        this.f331507e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1 = this.f331506d;
        if (c20988xba34acb1.b()) {
            java.util.Iterator it = this.f331507e.iterator();
            while (it.hasNext()) {
                c20988xba34acb1.f273939e.mo2231x7bb163d5(it.next());
            }
        }
        return jz5.f0.f384359a;
    }
}
