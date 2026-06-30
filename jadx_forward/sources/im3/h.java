package im3;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im3.i f374226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f374227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ im3.j f374228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374229g;

    public h(im3.i iVar, android.widget.FrameLayout frameLayout, im3.j jVar, android.view.View view) {
        this.f374226d = iVar;
        this.f374227e = frameLayout;
        this.f374228f = jVar;
        this.f374229g = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk4.a a17 = ((qk4.f) this.f374226d.f374230e).a();
        android.widget.FrameLayout frameLayout = this.f374227e;
        frameLayout.removeAllViews();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView((android.view.View) a17, layoutParams);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f374228f.f374233f.f461898f;
        if (c19792x256d2725 != null) {
            java.lang.String mediaId = "video_" + c19792x256d2725.m76784x5db1b11();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(ll3.i1.f400715a.c(mediaId)).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
            if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                java.lang.String m76625xb5887639 = c19788xd7cfd73e.m76625xb5887639();
                dk4.a aVar = new dk4.a(mediaId, o17, m76625xb5887639 == null ? "" : m76625xb5887639, a06.d.b(c19788xd7cfd73e.m76632x755bd410()), a06.d.b(c19788xd7cfd73e.m76605x1c4fb41d()));
                aVar.f315997a = 2;
                aVar.f315998b = "xV2";
                java.lang.String m76628xfece4473 = c19788xd7cfd73e.m76628xfece4473();
                if (m76628xfece4473 == null) {
                    m76628xfece4473 = "";
                }
                aVar.f315999c = m76628xfece4473;
                aVar.f316000d = c19788xd7cfd73e.m76588x1e2296db();
                java.lang.String m76623xd93f812f = c19788xd7cfd73e.m76623xd93f812f();
                if (m76623xd93f812f == null) {
                    m76623xd93f812f = "";
                }
                aVar.f316004h = m76623xd93f812f;
                java.lang.String m76624x4c9b7dca = c19788xd7cfd73e.m76624x4c9b7dca();
                aVar.f316005i = m76624x4c9b7dca != null ? m76624x4c9b7dca : "";
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c19792x256d2725.m76802x2dd01666();
                aVar.f316003g = ((m76802x2dd016662 == null || (m76962x74cd162e2 = m76802x2dd016662.m76962x74cd162e()) == null || (c19788xd7cfd73e2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.X(m76962x74cd162e2)) == null) ? 0L : c19788xd7cfd73e2.m76629x36bbd779()) * 1000;
                aVar.f316001e = false;
                aVar.f316013q = c19792x256d2725;
                com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806) a17;
                c18698xd8450806.a();
                a17.mo72047xdb50e870(aVar);
                c18698xd8450806.b();
                kk4.v vVar = c18698xd8450806.player;
                if (vVar != null) {
                    vVar.f390118j = true;
                }
                if (vVar != null) {
                    vVar.O();
                }
                a17.mo72046x764cf626(true);
                a17.mo72048x764d819b(true);
            }
        }
        android.view.View view2 = this.f374229g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/mv/model/preview/MvPreviewFinderVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
