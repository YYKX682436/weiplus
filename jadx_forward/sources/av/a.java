package av;

/* loaded from: classes9.dex */
public final class a extends ru.j {

    /* renamed from: o, reason: collision with root package name */
    public final av.b f95705o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(av.b params) {
        super(params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f95705o = params;
    }

    @Override // ru.j
    public void G(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, l15.c commonMsg, java.lang.String thumbName) {
        java.lang.String L0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commonMsg, "commonMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbName, "thumbName");
        av.b bVar = this.f95705o;
        byte[] bArr = bVar.f493714c;
        int length = bArr != null ? bArr.length : 0;
        if (length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendUrlTask", id() + " save thumbData path: empty");
            return;
        }
        if (length > 65536) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            L0 = m11.b1.Di().V3(msgInfo, bVar.f493714c, false, android.graphics.Bitmap.CompressFormat.JPEG, false, thumbName);
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            L0 = m11.b1.Di().L0(msgInfo, bm5.f0.f104097i, bVar.f493714c, thumbName);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendUrlTask", id() + " save thumbData path: " + L0);
    }
}
