package a0;

/* loaded from: classes16.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ boolean C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(boolean z17) {
        super(0);
        this.C = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mm2.m6 m6Var = (mm2.m6) dk2.ef.f233372a.i(mm2.m6.class);
        if (m6Var != null) {
            m6Var.f329248p = this.C;
        } else {
            boolean z17 = this.C;
            com.tencent.mars.xlog.Log.i("LiveSingSongSlice", "stashPendingIsNewVersionSongList: value=" + z17);
            mm2.m6.f329239z6 = java.lang.Boolean.valueOf(z17);
        }
        return jz5.f0.f302826a;
    }
}
