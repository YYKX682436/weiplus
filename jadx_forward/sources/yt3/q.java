package yt3;

/* loaded from: classes5.dex */
public final class q extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f547132f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f547133g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.widget.ImageView view, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547132f = view;
        view.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79869x62f9e003, -1));
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditBackToRecordPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f546865d, ju3.c0.C, null, 2, null);
        nu3.i iVar = nu3.i.f421751a;
        iVar.b(11);
        iVar.d(12);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditBackToRecordPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f547132f.setVisibility(i17);
    }

    public void z(int i17) {
        boolean z17 = this.f547133g;
        android.widget.ImageView imageView = this.f547132f;
        if (z17) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79636xc84bf7ff, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230)));
        } else {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(imageView.getContext(), com.p314xaae8f345.mm.R.raw.f79869x62f9e003, i17));
        }
    }
}
