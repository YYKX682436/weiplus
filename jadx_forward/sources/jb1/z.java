package jb1;

/* loaded from: classes7.dex */
public final class z extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f380283d;

    public z(yz5.l lVar) {
        this.f380283d = lVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f380283d.mo146xb9724478(java.lang.Boolean.FALSE);
        cancel();
    }
}
