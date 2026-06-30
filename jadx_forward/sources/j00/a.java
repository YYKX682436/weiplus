package j00;

/* loaded from: classes9.dex */
public final class a implements com.p314xaae8f345.mm.p2621x8fb0427b.i8 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (i17 == 5 && (obj instanceof java.lang.String)) {
            if (((java.lang.CharSequence) obj).length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftConversationObserver", "onNotifyChange, obj is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftConversationObserver", "onNotifyChange, delete, obj:" + obj);
            ((j00.k1) ((c00.e3) i95.n0.c(c00.e3.class))).Vi((java.lang.String) obj);
        }
    }
}
