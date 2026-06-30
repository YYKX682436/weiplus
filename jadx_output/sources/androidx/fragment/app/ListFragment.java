package androidx.fragment.app;

/* loaded from: classes8.dex */
public class ListFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f11240d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f11241e = new androidx.fragment.app.d3(this);

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.AdapterView.OnItemClickListener f11242f = new androidx.fragment.app.e3(this);

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListAdapter f11243g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f11244h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f11245i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f11246m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f11247n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11248o;

    public final void j0() {
        if (this.f11244h != null) {
            return;
        }
        android.view.View view = getView();
        if (view == null) {
            throw new java.lang.IllegalStateException("Content view not yet created");
        }
        if (view instanceof android.widget.ListView) {
            this.f11244h = (android.widget.ListView) view;
        } else {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(16711681);
            if (textView == null) {
                this.f11245i = view.findViewById(android.R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f11246m = view.findViewById(16711682);
            this.f11247n = view.findViewById(16711683);
            android.view.View findViewById = view.findViewById(android.R.id.list);
            if (!(findViewById instanceof android.widget.ListView)) {
                if (findViewById != null) {
                    throw new java.lang.RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new java.lang.RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            android.widget.ListView listView = (android.widget.ListView) findViewById;
            this.f11244h = listView;
            android.view.View view2 = this.f11245i;
            if (view2 != null) {
                listView.setEmptyView(view2);
            }
        }
        this.f11248o = true;
        this.f11244h.setOnItemClickListener(this.f11242f);
        android.widget.ListAdapter listAdapter = this.f11243g;
        if (listAdapter != null) {
            this.f11243g = listAdapter;
            android.widget.ListView listView2 = this.f11244h;
            if (listView2 != null) {
                listView2.setAdapter(listAdapter);
                if (!this.f11248o) {
                    l0(true, requireView().getWindowToken() != null);
                }
            }
        } else if (this.f11246m != null) {
            l0(false, false);
        }
        this.f11240d.post(this.f11241e);
    }

    public final void l0(boolean z17, boolean z18) {
        j0();
        android.view.View view = this.f11246m;
        if (view == null) {
            throw new java.lang.IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f11248o == z17) {
            return;
        }
        this.f11248o = z17;
        if (z17) {
            if (z18) {
                view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
                this.f11247n.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
            } else {
                view.clearAnimation();
                this.f11247n.clearAnimation();
            }
            android.view.View view2 = this.f11246m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f11247n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (z18) {
            view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
            this.f11247n.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f11247n.clearAnimation();
        }
        android.view.View view4 = this.f11246m;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f11247n;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view5, arrayList4.toArray(), "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view5, "androidx/fragment/app/ListFragment", "setListShown", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.Context requireContext = requireContext();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(requireContext);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(requireContext);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new android.widget.ProgressBar(requireContext, null, android.R.attr.progressBarStyleLarge), new android.widget.FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(requireContext);
        frameLayout2.setId(16711683);
        android.widget.TextView textView = new android.widget.TextView(requireContext);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ListView listView = new android.widget.ListView(requireContext);
        listView.setId(android.R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f11240d.removeCallbacks(this.f11241e);
        this.f11244h = null;
        this.f11248o = false;
        this.f11247n = null;
        this.f11246m = null;
        this.f11245i = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        j0();
    }
}
