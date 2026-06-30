package com.tencent.mm.plugin.finder.bullet;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.B#\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b-\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\b\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u00062"}, d2 = {"Lcom/tencent/mm/plugin/finder/bullet/MegaVideoBulletView;", "Landroid/view/TextureView;", "Lbb2/a1;", "Landroid/view/View;", "getView", "", "d", "Z", "isReuse", "()Z", "setReuse", "(Z)V", "Lso2/u1;", "e", "Lso2/u1;", "getFeed", "()Lso2/u1;", "setFeed", "(Lso2/u1;)V", "feed", "Lkotlin/Function0;", "Ljz5/f0;", "g", "Lyz5/a;", "getOnAfterPlaySeekListener", "()Lyz5/a;", "setOnAfterPlaySeekListener", "(Lyz5/a;)V", "onAfterPlaySeekListener", "Lbb2/w1;", "h", "Lbb2/w1;", "getBulletManager", "()Lbb2/w1;", "bulletManager", "Lbb2/y2;", "i", "Lbb2/y2;", "getPlayStatusListener", "()Lbb2/y2;", "playStatusListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MegaVideoBulletView extends android.view.TextureView implements bb2.a1 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isReuse;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public so2.u1 feed;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f102813f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.a onAfterPlaySeekListener;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final bb2.w1 bulletManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final bb2.y2 playStatusListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MegaVideoBulletView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.bulletManager = new bb2.w1(this);
        this.playStatusListener = new bb2.s2(this);
    }

    @Override // bb2.a1
    public void a(boolean z17) {
        if (getBulletManager().f19042g || this.feed == null) {
            return;
        }
        getBulletManager().h(getFeed(), z17, this.f102813f);
    }

    @Override // bb2.a1
    public void c() {
        pm0.v.X(new bb2.u2(this));
    }

    @Override // bb2.a1
    public void d(so2.u1 feed, java.util.LinkedList linkedList) {
        kotlin.jvm.internal.o.g(feed, "feed");
        setFeed(feed);
        this.f102813f = linkedList;
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

    @Override // bb2.a1
    public void onDetach() {
        getBulletManager().i();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.isReuse) {
            return;
        }
        onDetach();
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
    public MegaVideoBulletView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.bulletManager = new bb2.w1(this);
        this.playStatusListener = new bb2.s2(this);
    }
}
