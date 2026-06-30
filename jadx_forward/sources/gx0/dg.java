package gx0;

/* loaded from: classes5.dex */
public final class dg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f357877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f357878e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f357879f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(android.widget.FrameLayout frameLayout, gx0.gg ggVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(0);
        this.f357877d = frameLayout;
        this.f357878e = ggVar;
        this.f357879f = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gx0.gg ggVar = this.f357878e;
        android.view.View view = ggVar.f358014q;
        android.widget.FrameLayout frameLayout = this.f357877d;
        int childCount = frameLayout.getChildCount();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, j65.q.a(ggVar.m80379x76847179()).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc));
        layoutParams.gravity = 80;
        frameLayout.addView(view, childCount, layoutParams);
        ggVar.f358014q.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP, new int[]{android.graphics.Color.argb(255, 17, 17, 17), android.graphics.Color.argb(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432, 17, 17, 17), android.graphics.Color.argb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cd.f33971x366c91de, 17, 17, 17), android.graphics.Color.argb(242, 17, 17, 17), android.graphics.Color.argb(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, 17, 17, 17), android.graphics.Color.argb(com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23, 17, 17, 17), android.graphics.Color.argb(207, 17, 17, 17), android.graphics.Color.argb(191, 17, 17, 17), android.graphics.Color.argb(ib1.t.f69911x366c91de, 17, 17, 17), android.graphics.Color.argb(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5, 17, 17, 17), android.graphics.Color.argb(131, 17, 17, 17), android.graphics.Color.argb(108, 17, 17, 17), android.graphics.Color.argb(83, 17, 17, 17), android.graphics.Color.argb(56, 17, 17, 17), android.graphics.Color.argb(29, 17, 17, 17), android.graphics.Color.argb(0, 17, 17, 17)}));
        ggVar.X6();
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f357879f.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
        return jz5.f0.f384359a;
    }
}
