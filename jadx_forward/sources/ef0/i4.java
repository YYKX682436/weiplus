package ef0;

/* loaded from: classes2.dex */
public final class i4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f333768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(yz5.q qVar) {
        super(3);
        this.f333768d = qVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errorMsg = (java.lang.String) obj2;
        bw5.gq0 playItem = (bw5.gq0) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playItem, "playItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingUtilService", "fetchMusicPlayItem result, succeed:" + booleanValue + ", errorMsg:" + errorMsg + ", playItem.url:" + playItem.m12014xb5887639());
        java.lang.String m12014xb5887639 = playItem.m12014xb5887639();
        boolean z17 = false;
        if (m12014xb5887639 != null) {
            if (m12014xb5887639.length() > 0) {
                z17 = true;
            }
        }
        yz5.q qVar = this.f333768d;
        if (z17) {
            qVar.mo147xb9724478(java.lang.Boolean.TRUE, errorMsg, playItem);
        } else {
            qVar.mo147xb9724478(java.lang.Boolean.FALSE, "cpp fetch play item fail", null);
        }
        return jz5.f0.f384359a;
    }
}
