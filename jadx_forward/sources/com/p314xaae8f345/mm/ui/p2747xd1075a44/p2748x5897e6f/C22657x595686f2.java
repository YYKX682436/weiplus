package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2748x5897e6f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/ui/widget/album/AlbumContainer;", "Lcom/tencent/mm/ui/widget/album/AlbumContainerViewBase;", "Lbl5/a;", "albumFiller", "Lbl5/a;", "getAlbumFiller", "()Lbl5/a;", "setAlbumFiller", "(Lbl5/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.album.AlbumContainer */
/* loaded from: classes13.dex */
public class C22657x595686f2 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2748x5897e6f.C22659xe93ab428 {

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2748x5897e6f.C22658x2c1e6cb7 f293051n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22657x595686f2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2748x5897e6f.C22659xe93ab428
    public void c() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2748x5897e6f.C22658x2c1e6cb7 c22658x2c1e6cb7 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2748x5897e6f.C22658x2c1e6cb7(context, getAlbumWidth(), getGap());
        this.f293051n = c22658x2c1e6cb7;
        c22658x2c1e6cb7.setVisibility(0);
        addView(c22658x2c1e6cb7, new android.widget.FrameLayout.LayoutParams(-2, -2));
        java.util.ArrayList<android.view.View> m81531x7f4a1465 = m81531x7f4a1465();
        android.view.View view = this.f293051n;
        if (view != null) {
            m81531x7f4a1465.add(view);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("chattingAlbumView");
            throw null;
        }
    }

    /* renamed from: getAlbumFiller */
    public final bl5.a m81500x930a8f89() {
        return null;
    }

    /* renamed from: setAlbumFiller */
    public final void m81501x297002fd(bl5.a aVar) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22657x595686f2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
