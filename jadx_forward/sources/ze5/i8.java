package ze5;

/* loaded from: classes5.dex */
public final class i8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b f553536a;

    public i8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b) {
        this.f553536a = c22094xdaed490b;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "sendCallbackButtonClick, errType=" + fVar.f152148a + ", errCode=" + fVar.f152149b + ", errMsg=" + fVar.f152150c);
        if (!fVar.b()) {
            df5.l lVar = this.f553536a.f286185p;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactOptionsView");
                throw null;
            }
            lVar.d();
        }
        return jz5.f0.f384359a;
    }
}
