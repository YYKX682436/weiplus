package kt1;

/* loaded from: classes4.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt1.h0 f393459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kt1.h0 h0Var) {
        super(0);
        this.f393459d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ho5 ho5Var = new r45.ho5();
        byte[] bArr = this.f393459d.f393476a;
        if (bArr != null) {
            try {
                ho5Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ReliableSync.SyncTask", th6, "parse ReliableSyncNotifyData err", new java.lang.Object[0]);
            }
        }
        return ho5Var;
    }
}
