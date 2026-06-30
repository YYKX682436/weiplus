package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010!R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/CommentsContainer;", "Landroid/widget/RelativeLayout;", "", "i", "Z", "isPause", "()Z", "setPause", "(Z)V", "Lkotlin/Function0;", "Ljz5/f0;", "m", "Lyz5/a;", "getItemClickListener", "()Lyz5/a;", "setItemClickListener", "(Lyz5/a;)V", "itemClickListener", "n", "getOnLoop", "setOnLoop", "onLoop", "o", "isUnread", "setUnread", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.CommentsContainer */
/* loaded from: classes4.dex */
public final class C18475x542840cd extends android.widget.RelativeLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f253425r = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f253426d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f253427e;

    /* renamed from: f, reason: collision with root package name */
    public int f253428f;

    /* renamed from: g, reason: collision with root package name */
    public long f253429g;

    /* renamed from: h, reason: collision with root package name */
    public long f253430h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isPause;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.a itemClickListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.a onLoop;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean isUnread;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f253435p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f253436q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18475x542840cd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f253426d = "MicroMsg.CommentsContainer";
        this.f253427e = new java.util.ArrayList();
        this.f253428f = -1;
        new java.util.Random();
        this.isPause = true;
        this.f253435p = new rf4.k(this);
        this.f253436q = new rf4.l(this);
    }

    public static void d(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd, java.util.List storyComments, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        c18475x542840cd.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storyComments, "storyComments");
        c18475x542840cd.isUnread = z17;
        java.util.ArrayList arrayList = c18475x542840cd.f253427e;
        arrayList.clear();
        arrayList.addAll(storyComments);
        c18475x542840cd.f253428f = -1;
        c18475x542840cd.f253430h = 4000L;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f253426d, "LogStory: pause " + this);
        this.isPause = true;
        removeCallbacks(this.f253435p);
        removeCallbacks(this.f253436q);
        removeAllViews();
        this.f253428f = -1;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f253426d, "LogStory: restart " + this);
        c();
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f253426d, "LogStory: resume " + this);
        this.isPause = false;
        if (this.f253428f != 0) {
            java.lang.Runnable runnable = this.f253435p;
            removeCallbacks(runnable);
            removeCallbacks(this.f253436q);
            removeAllViews();
            this.f253428f = -1;
            postDelayed(runnable, 300L);
        }
    }

    public final yz5.a getItemClickListener() {
        return this.itemClickListener;
    }

    public final yz5.a getOnLoop() {
        return this.onLoop;
    }

    /* renamed from: setItemClickListener */
    public final void m71403x9bb105c7(yz5.a aVar) {
        this.itemClickListener = aVar;
    }

    /* renamed from: setOnLoop */
    public final void m71404x1be89825(yz5.a aVar) {
        this.onLoop = aVar;
    }

    /* renamed from: setPause */
    public final void m71405x5383e6b4(boolean z17) {
        this.isPause = z17;
    }

    /* renamed from: setUnread */
    public final void m71406x2636cab1(boolean z17) {
        this.isUnread = z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18475x542840cd(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
