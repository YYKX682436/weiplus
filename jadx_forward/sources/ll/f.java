package ll;

/* loaded from: classes13.dex */
public class f extends ll.d {
    @Override // ll.p
    public void b() {
        kl.k kVar = this.f400617e;
        if (kVar != null) {
            kVar.mo143607x41012807();
            this.f400617e = null;
        }
    }

    @Override // ll.d
    public void l() {
        hl.d f17 = f();
        f17.h();
        this.f400617e = new kl.f(f17, 44100, 2, 2, this.f400618f);
        if (com.p314xaae8f345.mm.p630x58d9bd6.mix.jni.C5141x59f24b9c.m43235xb06291ee(44100, 2, 2, this.f400618f, new ll.e(this)) != 0) {
            int i17 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "decode fail", null);
            return;
        }
        this.f400617e.b();
        f17.a();
        if (i()) {
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "flushCache", null);
            this.f400617e.b();
        } else if (!h()) {
            int i19 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "writeCacheAndPlay", null);
            A(f17);
        } else {
            int i27 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioDecoderFFmpeg", "flushCache and readCacheAndPlay", null);
            this.f400617e.b();
            u();
        }
    }
}
