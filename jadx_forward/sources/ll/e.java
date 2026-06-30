package ll;

/* loaded from: classes13.dex */
public class e implements com.p314xaae8f345.mm.p630x58d9bd6.mix.p631xb06291ee.InterfaceC5140x264f60fc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll.f f400633a;

    public e(ll.f fVar) {
        this.f400633a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p630x58d9bd6.mix.p631xb06291ee.InterfaceC5140x264f60fc
    /* renamed from: onDecodeData */
    public boolean mo43233x7f09adf7(byte[] bArr, int i17, boolean z17) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        int i18 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "onDecodeData length:%d", objArr);
        kl.k kVar = this.f400633a.f400617e;
        if (kVar == null) {
            return false;
        }
        kVar.a(bArr);
        return false;
    }
}
