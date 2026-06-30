package kh2;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh2.l f389533d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kh2.l lVar) {
        super(3);
        this.f389533d = lVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String tag = (java.lang.String) obj2;
        java.lang.String msg = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TMEScoreCore_" + tag + '_' + this.f389533d.hashCode(), "level: " + intValue + " msg:" + msg);
        return jz5.f0.f384359a;
    }
}
