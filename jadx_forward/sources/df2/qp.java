package df2;

/* loaded from: classes3.dex */
public final class qp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.sp f312711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(df2.sp spVar) {
        super(2);
        this.f312711d = spVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312711d.f312886m, "[refreshGiftList] doGetGiftList isSucess:" + booleanValue + ", errcode = " + intValue);
        return jz5.f0.f384359a;
    }
}
