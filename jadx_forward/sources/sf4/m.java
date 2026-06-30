package sf4;

/* loaded from: classes4.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.p f489061d;

    public m(sf4.p pVar) {
        this.f489061d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sf4.p pVar = this.f489061d;
        int b17 = i65.a.b(pVar.f489081a.getContext(), 112);
        android.view.View inflate = android.view.LayoutInflater.from(pVar.f489081a.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571080cx3, (android.view.ViewGroup) pVar.f489081a, false);
        pVar.f489087g = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.npp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.ImageView) findViewById).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(pVar.f489081a.getContext(), com.p314xaae8f345.mm.R.raw.f78866x6b36bc72, -1));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, b17);
        layoutParams.addRule(12, 1);
        pVar.f489081a.addView(inflate, layoutParams);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.animate().alpha(1.0f).start();
        pVar.f489082b.b1(0, b17, null);
        pVar.f489084d = true;
    }
}
