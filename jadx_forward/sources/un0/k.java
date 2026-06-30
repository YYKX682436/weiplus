package un0;

/* loaded from: classes13.dex */
public final class k extends android.hardware.display.VirtualDisplay.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f510919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510920b;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f510919a = c0Var;
        this.f510920b = h0Var;
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public void onPaused() {
        super.onPaused();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.VirtualDisplay.onPaused");
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public void onResumed() {
        java.util.List list;
        java.util.Iterator it;
        super.onResumed();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#createRecorder.VirtualDisplay.onResumed notifyOnCapturedContentChanged=");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f510919a;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", sb6.toString());
        if (c0Var.f391645d) {
            return;
        }
        un0.h hVar = (un0.h) this.f510920b.f391656d;
        if (hVar != null && (list = hVar.f510895k) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).mo152xb9724478();
            }
        }
        c0Var.f391645d = true;
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public void onStopped() {
        super.onStopped();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.VirtualDisplay.onStopped");
    }
}
