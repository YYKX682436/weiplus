package hk;

/* loaded from: classes8.dex */
public final class o implements vg3.z4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk.p f363218a;

    public o(hk.p pVar) {
        this.f363218a = pVar;
    }

    @Override // vg3.z4
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363218a.f363219h, "flushNotifyAllMsg");
    }

    @Override // vg3.z4
    public void b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.j4 j4Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363218a.f363219h, "[notifyNewMsg] msg=" + f9Var + " addMsg=" + j4Var);
        mm.w.e("newMsgMagic");
    }
}
