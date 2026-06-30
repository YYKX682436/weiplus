package yt3;

/* loaded from: classes5.dex */
public final class a0 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f546867f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f546868g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f546869h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f546870i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.view.ViewGroup parent, ju3.d0 status, yz5.l halfBottomDialogCreator, yz5.a isCaptureScene) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfBottomDialogCreator, "halfBottomDialogCreator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isCaptureScene, "isCaptureScene");
        this.f546867f = halfBottomDialogCreator;
        this.f546868g = isCaptureScene;
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.p314xaae8f345.mm.R.id.f565710rj4);
        this.f546869h = imageView;
        this.f546870i = p3325xe03a0797.p3326xc267989b.z0.b();
        if (imageView != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(parent.getContext(), com.p314xaae8f345.mm.R.raw.f79814x41d49f65, -1));
        }
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditJumpMorePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2) this.f546867f.mo146xb9724478(this.f546870i)).C();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditJumpMorePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.widget.ImageView imageView = this.f546869h;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i17);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        android.widget.ImageView imageView = this.f546869h;
        if (imageView != null) {
            yt3.c1.f546910s.a(imageView, configProvider.F, ((java.lang.Boolean) this.f546868g.mo152xb9724478()).booleanValue());
        }
        if (imageView != null) {
            dy1.a.j(imageView, "video_edit_basic_miaojian_jump_pagefrom", 5);
        }
    }
}
