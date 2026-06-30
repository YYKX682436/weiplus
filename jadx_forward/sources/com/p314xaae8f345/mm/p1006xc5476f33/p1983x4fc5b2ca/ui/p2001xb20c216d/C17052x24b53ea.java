package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003\u0004\u0014\u0015B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/StoryFakeVideoPlayView;", "Landroid/view/TextureView;", "", "getCurPos", "Lwu3/y1;", "h", "Lwu3/y1;", "getCallback", "()Lwu3/y1;", "setCallback", "(Lwu3/y1;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "wu3/z1", "wu3/c2", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.StoryFakeVideoPlayView */
/* loaded from: classes10.dex */
public final class C17052x24b53ea extends android.view.TextureView {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f237619o = 0;

    /* renamed from: d, reason: collision with root package name */
    public nt3.f f237620d;

    /* renamed from: e, reason: collision with root package name */
    public nt3.f0 f237621e;

    /* renamed from: f, reason: collision with root package name */
    public wu3.z1 f237622f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f237623g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public wu3.y1 callback;

    /* renamed from: i, reason: collision with root package name */
    public int f237625i;

    /* renamed from: m, reason: collision with root package name */
    public wu3.c2 f237626m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f237627n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17052x24b53ea(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237622f = wu3.z1.f531368d;
        this.f237621e = new nt3.f0();
        setSurfaceTextureListener(new wu3.d2(this));
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "stop");
        this.f237622f = wu3.z1.f531368d;
        wu3.c2 c2Var = this.f237626m;
        if (c2Var != null) {
            c2Var.f531255e = true;
        }
    }

    public final wu3.y1 getCallback() {
        return this.callback;
    }

    /* renamed from: getCurPos, reason: from getter */
    public final int getF237625i() {
        return this.f237625i;
    }

    /* renamed from: setCallback */
    public final void m68270x6c4ebec7(wu3.y1 y1Var) {
        this.callback = y1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17052x24b53ea(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f237622f = wu3.z1.f531368d;
        this.f237621e = new nt3.f0();
        setSurfaceTextureListener(new wu3.d2(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17052x24b53ea(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237622f = wu3.z1.f531368d;
        this.f237621e = new nt3.f0();
        setSurfaceTextureListener(new wu3.d2(this));
    }
}
