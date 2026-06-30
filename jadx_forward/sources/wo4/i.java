package wo4;

/* loaded from: classes8.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f529801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wo4.l lVar) {
        super(1);
        this.f529801d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDecoder", "onDecodeEnd");
        yz5.l lVar = this.f529801d.f529807c;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(longValue));
        }
        return jz5.f0.f384359a;
    }
}
