package uj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f509801a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f509802b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f509803c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f509804d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f509805e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f509806f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f509807g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f509808h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f509809i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f509810j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f509811k;

    public g(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f509801a = context;
        this.f509811k = new uj3.f(this);
    }

    public final void a(android.widget.RelativeLayout rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f509810j = rootView;
        android.view.View inflate = android.view.LayoutInflater.from(this.f509801a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570964ci4, rootView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) inflate;
        this.f509809i = relativeLayout;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) relativeLayout.findViewById(com.p314xaae8f345.mm.R.id.mbf);
        this.f509802b = c22699x3dcdb352;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(rootView.getContext(), com.p314xaae8f345.mm.R.raw.f79651x41395ece, -1));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f509802b;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(-1);
        }
        android.widget.RelativeLayout relativeLayout2 = this.f509809i;
        this.f509803c = relativeLayout2 != null ? relativeLayout2.findViewById(com.p314xaae8f345.mm.R.id.mbg) : null;
        android.widget.RelativeLayout relativeLayout3 = this.f509809i;
        android.view.View findViewById = relativeLayout3 != null ? relativeLayout3.findViewById(com.p314xaae8f345.mm.R.id.jwq) : null;
        this.f509805e = findViewById;
        if (findViewById != null) {
            findViewById.setBackground(com.p314xaae8f345.mm.ui.uk.e(rootView.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.aqf, rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g)));
        }
        android.view.View view = this.f509805e;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "getNavLayout", "(Landroid/widget/RelativeLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "getNavLayout", "(Landroid/widget/RelativeLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.RelativeLayout relativeLayout4 = this.f509809i;
        this.f509806f = relativeLayout4 != null ? (android.widget.TextView) relativeLayout4.findViewById(com.p314xaae8f345.mm.R.id.mbh) : null;
        android.widget.RelativeLayout relativeLayout5 = this.f509809i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = relativeLayout5 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) relativeLayout5.findViewById(com.p314xaae8f345.mm.R.id.jwy) : null;
        this.f509807g = c22699x3dcdb3523;
        if (c22699x3dcdb3523 == null) {
            return;
        }
        c22699x3dcdb3523.setVisibility(8);
    }

    public final void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f509804d;
        if (n3Var != null) {
            n3Var.mo50300x3fa464aa(this.f509811k);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.f509804d;
        if (n3Var2 != null) {
            n3Var2.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = this.f509804d;
        if (n3Var3 != null) {
            n3Var3.m77787xbe88f509();
        }
        android.view.View view = this.f509803c;
        if (view != null) {
            view.clearAnimation();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f509802b;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.clearAnimation();
        }
        c(0);
        this.f509808h = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f509802b;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(8);
        }
        android.view.View view2 = this.f509803c;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "reachAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "reachAnimationEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f509806f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenAvatarNavAnimatorUI", "showScreenIconAvatar " + i17);
        android.view.View view = this.f509810j;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f509807g;
        android.content.Context context = this.f509801a;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79651x41395ece, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f509807g;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f509807g;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.setVisibility(i17);
        }
        android.view.View view2 = this.f509805e;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f509802b;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setVisibility(8);
        }
        android.view.View view3 = this.f509803c;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenAvatarNavAnimatorUI", "showScreenIconAvatar", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.f509806f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
