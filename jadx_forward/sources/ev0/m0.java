package ev0;

/* loaded from: classes5.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 f338392d;

    public m0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 c10935x45f3d5c8) {
        this.f338392d = c10935x45f3d5c8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel$createMainView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ai();
        Ai.put("view_id", "mjpublisher_touch_bgm_adjust_lyric");
        ((cy1.a) rVar).yj("mjpublisher_touch_bgm_adjust_lyric", null, Ai, 6, false);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 c10935x45f3d5c8 = this.f338392d;
        c10935x45f3d5c8.f150730h = !c10935x45f3d5c8.f150730h;
        yz5.l onLyricVisibleChangedListener = c10935x45f3d5c8.getOnLyricVisibleChangedListener();
        if (onLyricVisibleChangedListener != null) {
            onLyricVisibleChangedListener.mo146xb9724478(java.lang.Boolean.valueOf(c10935x45f3d5c8.f150730h));
        }
        if (c10935x45f3d5c8.f150730h) {
            android.widget.TextView textView = c10935x45f3d5c8.f150734o;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lyricTitle");
                throw null;
            }
            textView.setText(c10935x45f3d5c8.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.o8t));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c10935x45f3d5c8.f150735p;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lyricIcon");
                throw null;
            }
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d5o);
        } else {
            android.widget.TextView textView2 = c10935x45f3d5c8.f150734o;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lyricTitle");
                throw null;
            }
            textView2.setText(c10935x45f3d5c8.getContext().getText(com.p314xaae8f345.mm.R.C30867xcad56011.o8s));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c10935x45f3d5c8.f150735p;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lyricIcon");
                throw null;
            }
            c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d5n);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel$createMainView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
