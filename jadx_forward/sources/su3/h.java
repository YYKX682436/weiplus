package su3;

/* loaded from: classes5.dex */
public final class h extends su3.f {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f494314d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f494315e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d f494316f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17038xe06d1714 f494317g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f494318h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ su3.m f494319i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(su3.m mVar, android.view.View itemView) {
        super(mVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f494319i = mVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.noh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f494314d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.noi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f494315e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nos);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f494316f = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f569219pg2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f494317g = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17038xe06d1714) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.p314xaae8f345.mm.R.id.nog);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f494318h = (android.widget.ImageView) findViewById5;
    }

    @Override // su3.f
    public void i(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        android.view.View view = this.f3639x46306858;
        android.content.Context context = view.getContext();
        su3.m mVar = this.f494319i;
        view.setBackground(i65.a.i(context, mVar.f494329g));
        android.view.ViewGroup.LayoutParams layoutParams = this.f3639x46306858.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i65.a.B(this.f3639x46306858.getContext()) - i65.a.b(this.f3639x46306858.getContext(), 80);
        }
        this.f3639x46306858.setEnabled(true);
        boolean z17 = i17 == mVar.f494327e;
        this.f3639x46306858.setSelected(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendMusicAdapter", "LogStory: " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17038xe06d1714 c17038xe06d1714 = this.f494317g;
        c17038xe06d1714.setVisibility(0);
        android.content.res.ColorStateList e17 = i65.a.e(this.f3639x46306858.getContext(), mVar.f494332m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getColorStateList(...)");
        c17038xe06d1714.m68148x52d2f021(e17);
        c17038xe06d1714.m68157x76500a7f(z17);
        android.graphics.drawable.Drawable i18 = i65.a.i(this.f3639x46306858.getContext(), mVar.f494330h);
        android.content.res.ColorStateList e18 = i65.a.e(this.f3639x46306858.getContext(), mVar.f494331i);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f494315e;
        c22699x3dcdb352.setImageDrawable(i18);
        c22699x3dcdb352.m82040x7541828(e18.getColorForState(c22699x3dcdb352.getDrawableState(), 0));
        c22699x3dcdb352.setVisibility(0);
        android.content.res.ColorStateList e19 = i65.a.e(this.f3639x46306858.getContext(), mVar.f494333n);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d c17048x9295f61d = this.f494316f;
        c17048x9295f61d.setTextColor(e19);
        java.util.ArrayList arrayList = info.f237246g;
        if (arrayList == null || arrayList.isEmpty()) {
            if (info.f237247h.isEmpty()) {
                str = info.f237256t;
            } else {
                str = info.f237256t + " - " + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(info.f237247h, ",");
            }
            c17048x9295f61d.setText(str);
            c17048x9295f61d.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
            c17048x9295f61d.setMarqueeRepeatLimit(-1);
            c17048x9295f61d.d(false, -1);
        } else {
            c17048x9295f61d.b(info.f237246g, null);
            c17048x9295f61d.setEllipsize(null);
            c17048x9295f61d.d(z17, -1);
        }
        c17048x9295f61d.setVisibility(0);
        android.view.View view2 = this.f494314d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$RecommendMusicViewHolder", "update", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$RecommendMusicViewHolder", "update", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z18 = info.f237258v.length() > 0;
        android.widget.ImageView imageView = this.f494318h;
        if (!z18) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            n11.a.b().g(info.f237258v, imageView);
        }
    }
}
