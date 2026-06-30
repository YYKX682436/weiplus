package wr3;

/* loaded from: classes11.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str) {
        super(1);
        this.f530340d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f530340d, "user click topic arrow");
        if (booleanValue) {
            tr3.b bVar = new tr3.b();
            bVar.f502963a = 2002;
            bVar.f502964b = true;
            tr3.a.f502959a.a(bVar);
        }
        return jz5.f0.f384359a;
    }
}
