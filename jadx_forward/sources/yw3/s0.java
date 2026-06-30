package yw3;

/* loaded from: classes.dex */
public final class s0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public static final yw3.s0 f548405a = new yw3.s0();

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        byte[] byteArrayExtra;
        r45.ha5 ha5Var = new r45.ha5();
        if (intent != null && (byteArrayExtra = intent.getByteArrayExtra("KSelectUserList")) != null) {
            try {
                ha5Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerChooseChatroomMemberUI", "resultCode: " + i17 + " pojoContactList:" + ha5Var.mo12245xcc313de3());
    }
}
