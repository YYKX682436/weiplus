package w82;

/* loaded from: classes12.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f525426a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f525427b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageButton f525428c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageButton f525429d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageButton f525430e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f525431f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f525432g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f525433h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f525434i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f525435j;

    /* renamed from: k, reason: collision with root package name */
    public w82.j f525436k;

    public void a(android.view.View view) {
        this.f525426a = false;
        this.f525427b = view;
    }

    public void b(boolean z17) {
        if (this.f525426a) {
            this.f525428c.setEnabled(z17);
            this.f525429d.setEnabled(z17);
            this.f525431f.setEnabled(z17);
            android.widget.ImageButton imageButton = this.f525430e;
            if (imageButton != null) {
                imageButton.setEnabled(z17);
                this.f525430e.setAlpha(z17 ? 1.0f : 0.3f);
            }
        }
    }

    public void c() {
        if (this.f525426a && this.f525427b.getVisibility() != 8) {
            android.view.View view = this.f525427b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f525427b;
            view2.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view2.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd));
        }
    }

    public void d(boolean z17, boolean z18, boolean z19, boolean z27) {
        if (!this.f525426a) {
            android.view.View view = this.f525427b;
            if (view == null) {
                return;
            }
            if (view instanceof android.view.ViewStub) {
                this.f525427b = ((android.view.ViewStub) view).inflate();
            }
            this.f525432g = this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.dvz);
            this.f525433h = this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.f565857dw0);
            this.f525434i = this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.f565858dw1);
            this.f525435j = this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.f565859dw2);
            android.widget.ImageButton imageButton = (android.widget.ImageButton) this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.du8);
            this.f525428c = imageButton;
            imageButton.setEnabled(false);
            android.widget.ImageButton imageButton2 = this.f525428c;
            imageButton2.setContentDescription(imageButton2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574939k20));
            this.f525428c.setOnClickListener(new w82.f(this));
            if (z17) {
                android.view.View view2 = this.f525432g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f525428c.setVisibility(8);
            }
            android.widget.ImageButton imageButton3 = (android.widget.ImageButton) this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.f565850du5);
            this.f525429d = imageButton3;
            imageButton3.setEnabled(false);
            android.widget.ImageButton imageButton4 = this.f525429d;
            imageButton4.setContentDescription(imageButton4.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.btj));
            this.f525429d.setOnClickListener(new w82.g(this));
            if (z18) {
                android.view.View view3 = this.f525433h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f525429d.setVisibility(8);
            }
            android.widget.ImageButton imageButton5 = (android.widget.ImageButton) this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.du6);
            this.f525431f = imageButton5;
            imageButton5.setEnabled(false);
            android.widget.ImageButton imageButton6 = this.f525431f;
            imageButton6.setContentDescription(imageButton6.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.boe));
            this.f525431f.setOnClickListener(new w82.h(this));
            if (z19) {
                android.view.View view4 = this.f525434i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f525431f.setVisibility(8);
            }
            android.widget.ImageButton imageButton7 = (android.widget.ImageButton) this.f525427b.findViewById(com.p314xaae8f345.mm.R.id.t_5);
            this.f525430e = imageButton7;
            imageButton7.setEnabled(false);
            this.f525430e.setAlpha(0.3f);
            android.widget.ImageButton imageButton8 = this.f525430e;
            imageButton8.setContentDescription(imageButton8.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nx8));
            this.f525430e.setOnClickListener(new w82.i(this));
            if (z27) {
                android.view.View view5 = this.f525435j;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f525430e.setVisibility(8);
            }
            this.f525426a = true;
        }
        if (this.f525427b.getVisibility() != 0) {
            android.view.View view6 = this.f525427b;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fav/ui/widget/FavEditFooter", "show", "(ZZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = this.f525427b;
            view7.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view7.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
        }
    }
}
