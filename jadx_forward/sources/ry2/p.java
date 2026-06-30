package ry2;

/* loaded from: classes10.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.t f482977d;

    public p(ry2.t tVar) {
        this.f482977d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ry2.t tVar = this.f482977d;
        android.content.Context context = tVar.f482907d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1603x3498a0.C14609xb4d6eef6.class)).d7();
        android.widget.ImageView imageView = tVar.f483020q;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbIv");
            throw null;
        }
        hc2.p0.d(imageView, "video_cover", "view_clk", null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
