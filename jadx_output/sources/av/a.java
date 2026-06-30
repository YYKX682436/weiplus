package av;

/* loaded from: classes9.dex */
public final class a extends ru.j {

    /* renamed from: o, reason: collision with root package name */
    public final av.b f14172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(av.b params) {
        super(params);
        kotlin.jvm.internal.o.g(params, "params");
        this.f14172o = params;
    }

    @Override // ru.j
    public void G(com.tencent.mm.storage.f9 msgInfo, l15.c commonMsg, java.lang.String thumbName) {
        java.lang.String L0;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(commonMsg, "commonMsg");
        kotlin.jvm.internal.o.g(thumbName, "thumbName");
        av.b bVar = this.f14172o;
        byte[] bArr = bVar.f412181c;
        int length = bArr != null ? bArr.length : 0;
        if (length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendUrlTask", id() + " save thumbData path: empty");
            return;
        }
        if (length > 65536) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            L0 = m11.b1.Di().V3(msgInfo, bVar.f412181c, false, android.graphics.Bitmap.CompressFormat.JPEG, false, thumbName);
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            L0 = m11.b1.Di().L0(msgInfo, bm5.f0.f22564i, bVar.f412181c, thumbName);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendUrlTask", id() + " save thumbData path: " + L0);
    }
}
