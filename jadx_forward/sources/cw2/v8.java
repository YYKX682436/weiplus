package cw2;

/* loaded from: classes2.dex */
public final class v8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f305605d;

    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f) {
        this.f305605d = c15196x85976f5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderVideoLayout$retryBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f305605d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c15196x85976f5f.m61471xe56ce956(), "retry video, position:" + c15196x85976f5f.getPlayAdapterPosition());
        cw2.h8 playInfo = c15196x85976f5f.getPlayInfo();
        boolean z17 = false;
        if (playInfo != null && playInfo.f305284g) {
            z17 = true;
        }
        if (z17) {
            c15196x85976f5f.Q = true;
            cw2.da videoView = c15196x85976f5f.getVideoView();
            if (videoView != null) {
                videoView.mo58801x360802();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f2 = this.f305605d;
            cw2.v9.n(c15196x85976f5f2, c15196x85976f5f2.getPlayAdapterPosition(), null, null, 6, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$retryBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
