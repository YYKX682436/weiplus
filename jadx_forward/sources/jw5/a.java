package jw5;

/* loaded from: classes13.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iw5.n f383876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iw5.n nVar) {
        super(1);
        this.f383876d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        iw5.m mVar = (iw5.m) this.f383876d;
        mVar.getClass();
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.wechat.zrpc.ext_channel.IAidlZChannelInitCallback");
            obtain.writeInt(booleanValue ? 1 : 0);
            mVar.f376807d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }
}
