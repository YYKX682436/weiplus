package eb2;

/* loaded from: classes2.dex */
public final class q extends fp0.r {

    /* renamed from: i, reason: collision with root package name */
    public final u26.w f332374i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u26.w channel, yz5.l task) {
        super(task, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f332374i = channel;
    }

    @Override // fp0.r
    public void e() {
        this.f332374i.b(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.EnhanceStreamFetcher", "Task cancel");
    }
}
