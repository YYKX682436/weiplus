package a0;

/* loaded from: classes16.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ boolean C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(boolean z17) {
        super(0);
        this.C = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mm2.m6 m6Var = (mm2.m6) dk2.ef.f314905a.i(mm2.m6.class);
        if (m6Var != null) {
            m6Var.f410781p = this.C;
        } else {
            boolean z17 = this.C;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSingSongSlice", "stashPendingIsNewVersionSongList: value=" + z17);
            mm2.m6.f410772z6 = java.lang.Boolean.valueOf(z17);
        }
        return jz5.f0.f384359a;
    }
}
