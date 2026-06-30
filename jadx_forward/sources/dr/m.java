package dr;

/* loaded from: classes12.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.p f323927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dr.p pVar) {
        super(2);
        this.f323927d = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323927d.f323933a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb;
        if (c21053xdbf1e5f4.f68690x2a070e41 == 0 || c21053xdbf1e5f4.f68664xfd0bc00c == 0) {
            c21053xdbf1e5f4.f68690x2a070e41 = intValue;
            c21053xdbf1e5f4.f68664xfd0bc00c = intValue2;
        }
        return jz5.f0.f384359a;
    }
}
