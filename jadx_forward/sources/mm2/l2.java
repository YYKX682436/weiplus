package mm2;

/* loaded from: classes3.dex */
public final class l2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f410751f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveDoNotUseWillDeleteSlice", "clear plugin layout");
        this.f410751f = null;
    }
}
