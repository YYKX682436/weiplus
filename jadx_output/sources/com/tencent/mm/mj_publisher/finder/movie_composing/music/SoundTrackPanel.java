package com.tencent.mm.mj_publisher.finder.movie_composing.music;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001$R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR0\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001a¨\u0006%"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel;", "Landroid/widget/FrameLayout;", "", "e", "Ljz5/g;", "getExpandHeight", "()F", "expandHeight", "Luu3/u;", "f", "getMmDrawer", "()Luu3/u;", "mmDrawer", "Landroid/widget/ViewFlipper;", "g", "getViewFlipper", "()Landroid/widget/ViewFlipper;", "viewFlipper", "Lkotlin/Function1;", "", "Ljz5/f0;", "i", "Lyz5/l;", "getOnLyricVisibleChangedListener", "()Lyz5/l;", "setOnLyricVisibleChangedListener", "(Lyz5/l;)V", "onLyricVisibleChangedListener", "m", "getOnOSTVolumeChangedListener", "setOnOSTVolumeChangedListener", "onOSTVolumeChangedListener", "n", "getOnBgmVolumeChangedListener", "setOnBgmVolumeChangedListener", "onBgmVolumeChangedListener", "ev0/d0", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SoundTrackPanel extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f69192q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f69193d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g expandHeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mmDrawer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g viewFlipper;

    /* renamed from: h, reason: collision with root package name */
    public boolean f69197h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.l onLyricVisibleChangedListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.l onOSTVolumeChangedListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.l onBgmVolumeChangedListener;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f69201o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f69202p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoundTrackPanel(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final uu3.u a(com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel) {
        soundTrackPanel.getClass();
        ev0.j0 j0Var = new ev0.j0(soundTrackPanel);
        uu3.f fVar = new uu3.f();
        fVar.f431276a = soundTrackPanel.getExpandHeight();
        fVar.f431278c = new vu3.d(soundTrackPanel.getViewFlipper());
        fVar.a(j0Var);
        return fVar.b(soundTrackPanel);
    }

    public static final void b(com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel) {
        soundTrackPanel.getClass();
        ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.Map Ai = ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ai();
        Ai.put("view_id", "mjpublisher_touch_bgm_adjust_volume");
        ((cy1.a) rVar).yj("mjpublisher_touch_bgm_adjust_volume", null, Ai, 6, false);
        soundTrackPanel.getViewFlipper().getDisplayedChild();
        ev0.d0[] d0VarArr = ev0.d0.f256841d;
        soundTrackPanel.getViewFlipper().setInAnimation(android.view.animation.AnimationUtils.loadAnimation(soundTrackPanel.getContext(), com.tencent.mm.R.anim.f477950g2));
        soundTrackPanel.getViewFlipper().setOutAnimation(android.view.animation.AnimationUtils.loadAnimation(soundTrackPanel.getContext(), com.tencent.mm.R.anim.f477949g1));
        soundTrackPanel.getViewFlipper().setDisplayedChild(1);
    }

    public static final void c(com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel soundTrackPanel) {
        soundTrackPanel.getViewFlipper().getDisplayedChild();
        ev0.d0[] d0VarArr = ev0.d0.f256841d;
        soundTrackPanel.getViewFlipper().setInAnimation(android.view.animation.AnimationUtils.loadAnimation(soundTrackPanel.getContext(), com.tencent.mm.R.anim.f477948g0));
        soundTrackPanel.getViewFlipper().setOutAnimation(android.view.animation.AnimationUtils.loadAnimation(soundTrackPanel.getContext(), com.tencent.mm.R.anim.f477951g3));
        soundTrackPanel.getViewFlipper().setDisplayedChild(0);
    }

    private final float getExpandHeight() {
        return ((java.lang.Number) this.expandHeight.getValue()).floatValue();
    }

    private final uu3.u getMmDrawer() {
        return (uu3.u) this.mmDrawer.getValue();
    }

    private final android.widget.ViewFlipper getViewFlipper() {
        return (android.widget.ViewFlipper) this.viewFlipper.getValue();
    }

    public final boolean d() {
        if (getVisibility() != 0) {
            return false;
        }
        com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(getMmDrawer(), false, 1, null);
        return true;
    }

    public final yz5.l getOnBgmVolumeChangedListener() {
        return this.onBgmVolumeChangedListener;
    }

    public final yz5.l getOnLyricVisibleChangedListener() {
        return this.onLyricVisibleChangedListener;
    }

    public final yz5.l getOnOSTVolumeChangedListener() {
        return this.onOSTVolumeChangedListener;
    }

    public final void setOnBgmVolumeChangedListener(yz5.l lVar) {
        this.onBgmVolumeChangedListener = lVar;
    }

    public final void setOnLyricVisibleChangedListener(yz5.l lVar) {
        this.onLyricVisibleChangedListener = lVar;
    }

    public final void setOnOSTVolumeChangedListener(yz5.l lVar) {
        this.onOSTVolumeChangedListener = lVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SoundTrackPanel(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, false, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SoundTrackPanel(android.content.Context r2, android.util.AttributeSet r3, int r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r2, r6)
            r1.<init>(r2, r3, r4)
            r1.f69193d = r5
            jz5.i r3 = jz5.i.f302831f
            ev0.n0 r4 = new ev0.n0
            r4.<init>(r2)
            jz5.g r2 = jz5.h.a(r3, r4)
            r1.expandHeight = r2
            ev0.o0 r2 = new ev0.o0
            r2.<init>(r1)
            jz5.g r2 = jz5.h.a(r3, r2)
            r1.mmDrawer = r2
            ev0.p0 r2 = new ev0.p0
            r2.<init>(r1)
            jz5.g r2 = jz5.h.a(r3, r2)
            r1.viewFlipper = r2
            ev0.c0 r2 = new ev0.c0
            r2.<init>(r1)
            r1.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.movie_composing.music.SoundTrackPanel.<init>(android.content.Context, android.util.AttributeSet, int, boolean, int, kotlin.jvm.internal.i):void");
    }
}
