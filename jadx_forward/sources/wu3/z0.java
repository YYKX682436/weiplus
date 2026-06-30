package wu3;

/* loaded from: classes10.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f531367d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282) {
        this.f531367d = c17042xf8121282;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String r17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f531367d;
        c17042xf8121282.f237536r.setActivated(!r0.isActivated());
        c17042xf8121282.m68221x29e6ee26(c17042xf8121282.f237536r.isActivated());
        c17042xf8121282.g();
        android.widget.ImageView imageView = c17042xf8121282.f237536r;
        if (c17042xf8121282.getHasBackground()) {
            r17 = i65.a.r(c17042xf8121282.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571486gi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        } else {
            r17 = i65.a.r(c17042xf8121282.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571489gl);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        }
        imageView.setContentDescription(r17);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorInputView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
