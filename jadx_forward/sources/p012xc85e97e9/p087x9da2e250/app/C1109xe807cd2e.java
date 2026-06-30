package p012xc85e97e9.p087x9da2e250.app;

/* renamed from: androidx.fragment.app.ListFragment */
/* loaded from: classes8.dex */
public class C1109xe807cd2e extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f92773d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f92774e = new p012xc85e97e9.p087x9da2e250.app.d3(this);

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f92775f = new p012xc85e97e9.p087x9da2e250.app.e3(this);

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListAdapter f92776g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f92777h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f92778i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f92779m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f92780n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f92781o;

    public final void j0() {
        if (this.f92777h != null) {
            return;
        }
        android.view.View m7474xfb86a31b = m7474xfb86a31b();
        if (m7474xfb86a31b == null) {
            throw new java.lang.IllegalStateException("Content view not yet created");
        }
        if (m7474xfb86a31b instanceof android.widget.ListView) {
            this.f92777h = (android.widget.ListView) m7474xfb86a31b;
        } else {
            android.widget.TextView textView = (android.widget.TextView) m7474xfb86a31b.findViewById(16711681);
            if (textView == null) {
                this.f92778i = m7474xfb86a31b.findViewById(android.R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f92779m = m7474xfb86a31b.findViewById(16711682);
            this.f92780n = m7474xfb86a31b.findViewById(16711683);
            android.view.View findViewById = m7474xfb86a31b.findViewById(android.R.id.list);
            if (!(findViewById instanceof android.widget.ListView)) {
                if (findViewById != null) {
                    throw new java.lang.RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new java.lang.RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            android.widget.ListView listView = (android.widget.ListView) findViewById;
            this.f92777h = listView;
            android.view.View view = this.f92778i;
            if (view != null) {
                listView.setEmptyView(view);
            }
        }
        this.f92781o = true;
        this.f92777h.setOnItemClickListener(this.f92775f);
        android.widget.ListAdapter listAdapter = this.f92776g;
        if (listAdapter != null) {
            this.f92776g = listAdapter;
            android.widget.ListView listView2 = this.f92777h;
            if (listView2 != null) {
                listView2.setAdapter(listAdapter);
                if (!this.f92781o) {
                    l0(true, m7554x159e75aa().getWindowToken() != null);
                }
            }
        } else if (this.f92779m != null) {
            l0(false, false);
        }
        this.f92773d.post(this.f92774e);
    }

    public final void l0(boolean z17, boolean z18) {
        j0();
        android.view.View view = this.f92779m;
        if (view == null) {
            throw new java.lang.IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f92781o == z17) {
            return;
        }
        this.f92781o = z17;
        if (z17) {
            if (z18) {
                view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(mo7438x76847179(), android.R.anim.fade_out));
                this.f92780n.startAnimation(android.view.animation.AnimationUtils.loadAnimation(mo7438x76847179(), android.R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f92780n.clearAnimation();
            }
            android.view.View view2 = this.f92779m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f92780n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (z18) {
            view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(mo7438x76847179(), android.R.anim.fade_in));
            this.f92780n.startAnimation(android.view.animation.AnimationUtils.loadAnimation(mo7438x76847179(), android.R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f92780n.clearAnimation();
        }
        android.view.View view4 = this.f92779m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f92780n;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view5, arrayList4.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view5, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.Context m7550xf0c4608a = m7550xf0c4608a();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(m7550xf0c4608a);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(m7550xf0c4608a);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new android.widget.ProgressBar(m7550xf0c4608a, null, android.R.attr.progressBarStyleLarge), new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(m7550xf0c4608a);
        frameLayout2.setId(16711683);
        android.widget.TextView textView = new android.widget.TextView(m7550xf0c4608a);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ListView listView = new android.widget.ListView(m7550xf0c4608a);
        listView.setId(android.R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        this.f92773d.removeCallbacks(this.f92774e);
        this.f92777h = null;
        this.f92781o = false;
        this.f92780n = null;
        this.f92779m = null;
        this.f92778i = null;
        super.mo7399xa6664a60();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        super.mo7518x594b1124(view, bundle);
        j0();
    }
}
