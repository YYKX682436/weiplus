package un0;

/* loaded from: classes13.dex */
public final class j extends android.media.projection.MediaProjection.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f510917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f510918e;

    public j(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f510914a = h0Var;
        this.f510915b = h0Var2;
        this.f510916c = h0Var3;
        this.f510917d = h0Var4;
        this.f510918e = c0Var;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onCapturedContentResize(int i17, int i18) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            super.onCapturedContentResize(i17, i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.mMediaProjection.registerCallback.onCapturedContentResize width=" + i17 + " height=" + i18);
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onCapturedContentVisibilityChanged(boolean z17) {
        java.util.List list;
        java.util.Iterator it;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            super.onCapturedContentVisibilityChanged(z17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#createRecorder.mMediaProjection.registerCallback.onCapturedContentVisibilityChanged isVisible=");
        sb6.append(z17);
        sb6.append(" notifyOnCapturedContentChanged=");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f510918e;
        sb6.append(c0Var.f391645d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", sb6.toString());
        if (c0Var.f391645d || !z17) {
            return;
        }
        un0.h hVar = (un0.h) this.f510914a.f391656d;
        if (hVar != null && (list = hVar.f510895k) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).mo152xb9724478();
            }
        }
        c0Var.f391645d = true;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        java.util.List list;
        java.util.Iterator it;
        super.onStop();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.mMediaProjection.registerCallback.onStop");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f510914a;
        un0.h hVar = (un0.h) h0Var.f391656d;
        if (hVar != null && (list = hVar.f510896l) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).mo152xb9724478();
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f510915b;
        android.hardware.display.VirtualDisplay virtualDisplay = (android.hardware.display.VirtualDisplay) h0Var2.f391656d;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        h0Var2.f391656d = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = this.f510916c;
        android.media.AudioRecord audioRecord = (android.media.AudioRecord) h0Var3.f391656d;
        if (audioRecord != null) {
            audioRecord.release();
        }
        h0Var3.f391656d = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4 = this.f510917d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) h0Var4.f391656d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        h0Var4.f391656d = null;
        h0Var.f391656d = null;
        un0.s.f510951b = null;
    }
}
