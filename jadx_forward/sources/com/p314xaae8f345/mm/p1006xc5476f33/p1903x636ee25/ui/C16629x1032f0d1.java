package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/FloatBallMusicViewNew;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "clickListener", "Ljz5/f0;", "setOnMusicCoverClickListener", "", "coverPath", "setCoverPath", "", "h", "Ljz5/g;", "getPadding20", "()I", "padding20", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/music/ui/d", "plugin-music_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicViewNew */
/* loaded from: classes4.dex */
public final class C16629x1032f0d1 extends android.widget.RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f232207i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f232208d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f232209e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f232210f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnClickListener f232211g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g padding20;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16629x1032f0d1(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getPadding20 */
    private final int m67226x943ef359() {
        return ((java.lang.Number) ((jz5.n) this.padding20).mo141623x754a37bb()).intValue();
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallMusicView", "loadMusicCover failed");
        android.widget.ImageView imageView = this.f232208d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = this.f232208d;
        if (imageView2 != null) {
            imageView2.setPadding(m67226x943ef359(), m67226x943ef359(), m67226x943ef359(), m67226x943ef359());
        }
        android.widget.ImageView imageView3 = this.f232208d;
        if (imageView3 != null) {
            imageView3.setImageResource(com.p314xaae8f345.mm.R.raw.f79556x38e972c2);
        }
    }

    /* renamed from: setCoverPath */
    public final void m67227xd1bfaa3a(java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f232210f, str)) {
            return;
        }
        this.f232210f = str == null ? "" : str;
        if (str == null || str.length() == 0) {
            a();
            return;
        }
        if (!r26.i0.y(str, "http", false) && !r26.i0.y(str, "https", false)) {
            java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(str, false);
            if (!com.p314xaae8f345.mm.vfs.w6.j(i17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallMusicView", "setCoverPath file not exist %s", i17);
                a();
                return;
            } else {
                str = "file://" + i17;
            }
        }
        l01.d0.f396294a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.f(this, str), str, com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.d.f232265d);
    }

    /* renamed from: setOnMusicCoverClickListener */
    public final void m67228xa37ba3c9(android.view.View.OnClickListener onClickListener) {
        this.f232211g = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16629x1032f0d1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f232210f = "";
        this.padding20 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.g(this));
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bo6, (android.view.ViewGroup) this, true);
        this.f232208d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jyg);
        this.f232209e = inflate.findViewById(com.p314xaae8f345.mm.R.id.jyh);
        android.widget.ImageView imageView = this.f232208d;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        android.view.View view = this.f232209e;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.e(this));
        }
        android.widget.ImageView imageView2 = this.f232208d;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImportantForAccessibility(2);
    }
}
