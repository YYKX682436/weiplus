package z26;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab f551363d;

    public d(me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab) {
        this.f551363d = c29141x858f5ab;
    }

    @Override // java.lang.Runnable
    public void run() {
        me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab c29141x858f5ab = this.f551363d;
        c29141x858f5ab.B = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwipeBackLayout", "startFreezeResetAnim|timeout");
        me.p3333x31613f.p3334x38f758b.lib.C29141x858f5ab.b(c29141x858f5ab);
    }
}
