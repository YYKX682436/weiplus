package lt2;

/* loaded from: classes10.dex */
public final class b implements c50.a1 {
    public void a(android.widget.FrameLayout videoContainer, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoContainer, "videoContainer");
        android.view.View childAt = videoContainer.getChildAt(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) childAt : null;
        if (c15188xd8bd4bd == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoPlayHelper", "playOrPause mediaId:" + c15188xd8bd4bd.mo56696x9040359a() + ", play:" + z17);
        if (z17) {
            c15188xd8bd4bd.mo56716x4121a19(true);
            zy2.g5.u(c15188xd8bd4bd, null, 1, null);
        } else {
            c15188xd8bd4bd.mo56716x4121a19(false);
            c15188xd8bd4bd.mo58788x65825f6();
        }
    }
}
