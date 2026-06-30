package yt3;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f547219d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547220e;

    public u0(android.widget.ImageView view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547219d = view;
        this.f547220e = status;
        view.setVisibility(0);
        view.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79677xc84c9668, -1));
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f547220e, ju3.c0.H1, null, 2, null);
        nu3.i iVar = nu3.i.f421751a;
        iVar.b(10);
        nu3.i.c(iVar, "KEY_CLICK_CROP_COUNT_INT", 0, 2, null);
        android.widget.ImageView imageView = this.f547219d;
        imageView.announceForAccessibility(i65.a.r(imageView.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571499gv));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547219d.setVisibility(i17);
    }
}
