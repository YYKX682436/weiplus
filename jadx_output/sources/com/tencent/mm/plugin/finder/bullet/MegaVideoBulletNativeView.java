package com.tencent.mm.plugin.finder.bullet;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104B#\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b3\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\b\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010.\u001a\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00068"}, d2 = {"Lcom/tencent/mm/plugin/finder/bullet/MegaVideoBulletNativeView;", "Lcom/tencent/mm/danmaku/render/NativeDanmakuView;", "Lbb2/a1;", "Landroid/view/View;", "getView", "", "g", "Z", "isReuse", "()Z", "setReuse", "(Z)V", "Lso2/u1;", "h", "Lso2/u1;", "getFeed", "()Lso2/u1;", "setFeed", "(Lso2/u1;)V", "feed", "Lkotlin/Function0;", "Ljz5/f0;", "n", "Lyz5/a;", "getOnAfterPlaySeekListener", "()Lyz5/a;", "setOnAfterPlaySeekListener", "(Lyz5/a;)V", "onAfterPlaySeekListener", "Lbb2/w1;", "o", "Lbb2/w1;", "getBulletManager", "()Lbb2/w1;", "bulletManager", "Lcom/tencent/mm/plugin/finder/bullet/FinderBulletFastFollowBtn;", "p", "Ljz5/g;", "getFastFollowBtn", "()Lcom/tencent/mm/plugin/finder/bullet/FinderBulletFastFollowBtn;", "fastFollowBtn", "Lbb2/y2;", "r", "Lbb2/y2;", "getPlayStatusListener", "()Lbb2/y2;", "playStatusListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MegaVideoBulletNativeView extends com.tencent.mm.danmaku.render.NativeDanmakuView implements bb2.a1 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f102801s = 0;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isReuse;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public so2.u1 feed;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f102804i;

    /* renamed from: m, reason: collision with root package name */
    public int f102805m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.a onAfterPlaySeekListener;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final bb2.w1 bulletManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final jz5.g fastFollowBtn;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Runnable f102809q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final bb2.y2 playStatusListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaVideoBulletNativeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.bulletManager = new bb2.w1(this);
        this.fastFollowBtn = jz5.h.b(new bb2.x1(this));
        this.playStatusListener = new bb2.f2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn getFastFollowBtn() {
        return (com.tencent.mm.plugin.finder.bullet.FinderBulletFastFollowBtn) this.fastFollowBtn.getValue();
    }

    @Override // bb2.a1
    public void a(boolean z17) {
        if (getBulletManager().f19042g || this.feed == null) {
            return;
        }
        getBulletManager().h(getFeed(), z17, this.f102804i);
    }

    @Override // bb2.a1
    public void c() {
        g();
        if (getFeed().h2(getBulletManager().f19046k)) {
            getBulletManager().t();
            pm0.v.V(200L, new bb2.g2(this));
        }
    }

    @Override // bb2.a1
    public void d(so2.u1 feed, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(feed, "feed");
        setFeed(feed);
        this.f102804i = linkedList;
    }

    public final void g() {
        java.lang.Runnable runnable = this.f102809q;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f102809q = null;
    }

    @Override // bb2.a1
    public bb2.w1 getBulletManager() {
        return this.bulletManager;
    }

    public final so2.u1 getFeed() {
        so2.u1 u1Var = this.feed;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.o.o("feed");
        throw null;
    }

    public yz5.a getOnAfterPlaySeekListener() {
        return this.onAfterPlaySeekListener;
    }

    @Override // bb2.a1
    public bb2.y2 getPlayStatusListener() {
        return this.playStatusListener;
    }

    @Override // bb2.a1
    public android.view.View getView() {
        return this;
    }

    public final boolean h() {
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) t70Var.N0().r()).booleanValue()) {
            cq.k1.a();
            if (((java.lang.Boolean) t70Var.P().r()).booleanValue() && getBulletManager().f19051p != null) {
                cq.k1.a();
                return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127857o6).getValue()).r()).booleanValue();
            }
        }
        return false;
    }

    public final java.util.Map i(r45.f43 f43Var, java.lang.Long l17) {
        jz5.l lVar = new jz5.l("feed_id", pm0.v.u(getFeed().getItemId()));
        jz5.l lVar2 = new jz5.l("playpercent", java.lang.Integer.valueOf(a06.d.b(getBulletManager().f() * 100)));
        jz5.l lVar3 = new jz5.l("bs_follow_content", f43Var.getString(1));
        getBulletManager().getClass();
        return kz5.c1.k(lVar, lVar2, lVar3, new jz5.l("bs_line_num", java.lang.Integer.valueOf(xp.d.f().f455861r)), new jz5.l("bs_follow_button_id", pm0.v.u(f43Var.getLong(0))), new jz5.l("press_time_ms", l17), new jz5.l("virtual_bs_num", java.lang.Integer.valueOf(this.f102805m)));
    }

    public final void j() {
        getFastFollowBtn().e();
        this.f102805m = 0;
        g();
    }

    public final void k(java.lang.String str, boolean z17) {
        this.f102805m++;
        r45.oo ooVar = new r45.oo();
        ooVar.set(2, str);
        ooVar.set(3, java.lang.Long.valueOf(getBulletManager().f19039d));
        ooVar.set(12, 0);
        ooVar.set(1, 0L);
        ooVar.set(6, 1);
        wp.a f57 = getBulletManager().d().f5(-2147483645, new bb2.o(ooVar));
        f57.f448335f = getBulletManager().f19039d;
        f57.f448348s = true;
        f57.A = getBulletManager().f19048m;
        bb2.c cVar = f57 instanceof bb2.c ? (bb2.c) f57 : null;
        if (cVar != null) {
            cVar.K = z17;
        }
        if (getBulletManager().f19048m) {
            f57.a();
        }
        getBulletManager().d().f438852d.v0(f57, false);
    }

    public final void l(r45.f43 info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (getFastFollowBtn().getParent() == null) {
            addView(getFastFollowBtn());
            dy1.a.c(getFastFollowBtn());
            hc2.v0.e(getFastFollowBtn(), "bs_follow_button", 160, 0, false, false, null, new bb2.i2(this, info), 60, null);
        }
        java.lang.String string = info.getString(1);
        if (string != null) {
            getFastFollowBtn().setOnSingleClick(new bb2.j2(this, string, info));
            getFastFollowBtn().setOnContinueClick(new bb2.k2(this, string));
            getFastFollowBtn().setOnLongPressEnd(new bb2.l2(this, string, info));
            getFastFollowBtn().setOnAutoHide(new bb2.m2(this));
            getFastFollowBtn().setTipsText(string);
            getFastFollowBtn().h();
        }
    }

    @Override // bb2.a1
    public void onDetach() {
        if (h() && getFastFollowBtn().getParent() != null) {
            getFastFollowBtn().e();
            removeView(getFastFollowBtn());
        }
        g();
        getBulletManager().i();
    }

    @Override // com.tencent.mm.danmaku.render.NativeDanmakuView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.isReuse) {
            return;
        }
        onDetach();
    }

    @Override // com.tencent.mm.danmaku.render.NativeDanmakuView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (!h() || getFastFollowBtn().getVisibility() == 8) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getFastFollowBtn().getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        int measuredWidth = getFastFollowBtn().getMeasuredWidth();
        int measuredHeight = getFastFollowBtn().getMeasuredHeight();
        int i28 = ((i19 - i17) - measuredWidth) - layoutParams2.rightMargin;
        int i29 = layoutParams2.topMargin;
        getFastFollowBtn().layout(i28, i29, measuredWidth + i28, measuredHeight + i29);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        boolean z17 = false;
        if (event.getAction() == 0 && getBulletManager().d().y5(new android.graphics.Point((int) event.getX(), ((int) event.getY()) + ((int) getY())), 0)) {
            z17 = true;
        }
        if (z17) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setFeed(so2.u1 u1Var) {
        kotlin.jvm.internal.o.g(u1Var, "<set-?>");
        this.feed = u1Var;
    }

    @Override // bb2.a1
    public void setOnAfterPlaySeekListener(yz5.a aVar) {
        this.onAfterPlaySeekListener = aVar;
    }

    @Override // bb2.a1
    public void setReuse(boolean z17) {
        this.isReuse = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaVideoBulletNativeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.bulletManager = new bb2.w1(this);
        this.fastFollowBtn = jz5.h.b(new bb2.x1(this));
        this.playStatusListener = new bb2.f2(this);
    }
}
