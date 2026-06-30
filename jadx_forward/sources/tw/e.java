package tw;

/* loaded from: classes9.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f503930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tw.i f503931e;

    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, tw.i iVar) {
        this.f503930d = activityC0065xcd7aa112;
        this.f503931e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f503930d.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = this.f503931e.f503935d;
        if (viewOnCreateContextMenuListenerC12986xffd38cd1 != null) {
            viewOnCreateContextMenuListenerC12986xffd38cd1.i();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortView");
            throw null;
        }
    }
}
