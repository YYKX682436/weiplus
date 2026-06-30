package yx3;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f549500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(yz5.l lVar) {
        super(3);
        this.f549500d = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtonePlayer", "onTPPlayError, errorCode:" + intValue + ", errorType:" + intValue2);
        this.f549500d.mo146xb9724478(new java.lang.IllegalStateException("MMCdnTPPlayer play error! code:" + intValue + ", type:" + intValue2));
        return jz5.f0.f384359a;
    }
}
