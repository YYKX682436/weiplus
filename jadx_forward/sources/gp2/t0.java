package gp2;

/* loaded from: classes10.dex */
public final class t0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.v0 f355855d;

    public t0(gp2.v0 v0Var) {
        this.f355855d = v0Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        gp2.v0 v0Var = this.f355855d;
        if (v0Var.f355861d.size() < 2 && !v0Var.f355864g) {
            v0Var.f355861d.add(v0Var.O6());
            v0Var.f355865h++;
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLivePlayerViewRecycler", "[preInflateVideoView] completed! preInflateCount=" + v0Var.f355865h + " isReleased=" + v0Var.f355864g);
        return false;
    }
}
