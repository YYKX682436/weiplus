package pv3;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 f440147a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f440148b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f440149c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f440150d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f440151e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f440147a = scene;
        this.f440148b = "MusicPickerFinderFeedPlayManager";
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f440149c = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f440151e = jz5.h.b(new pv3.h(this));
    }

    public final void a(android.view.View view) {
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "dismissLoading", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "dismissLoading", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(in5.s0 s0Var, boolean z17) {
        android.widget.ImageView imageView = s0Var != null ? (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.uio) : null;
        android.widget.FrameLayout frameLayout = s0Var != null ? (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.uiv) : null;
        if (z17) {
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (frameLayout != null) {
            frameLayout.setAlpha(0.0f);
        }
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [zy2.g5] */
    public final void c(in5.s0 s0Var) {
        java.lang.String str = this.f440148b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[stopPlay]");
        b(s0Var, false);
        android.widget.FrameLayout frameLayout = s0Var != null ? (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.uiv) : null;
        android.view.KeyEvent.Callback findViewWithTag = frameLayout != null ? frameLayout.findViewWithTag("music_picker_video_view_tag") : null;
        java.lang.Object obj = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : 0;
        boolean z17 = obj instanceof zy2.p7;
        java.lang.Object obj2 = z17 ? (zy2.p7) obj : null;
        if (obj2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15172xcfc1ad85) obj2).p0("errorToStop");
        }
        android.view.View view = obj instanceof android.view.View ? obj : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(parent, frameLayout) || parent == null) {
                pm0.v.O(str, new pv3.g(obj));
            }
        }
        zy2.p7 p7Var = z17 ? (zy2.p7) obj : null;
        if (p7Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15176x3a5a59de) p7Var).q0();
        }
        a(s0Var != null ? s0Var.p(com.p314xaae8f345.mm.R.id.rp8) : null);
    }
}
