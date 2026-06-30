package com.tencent.mm.plugin.brandservice.ui.profile;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/profile/BizContactInfoDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroidx/lifecycle/x;", "Lyr1/n;", "Ljz5/f0;", "onFragmentViewCreate", "Landroid/content/Context;", "activityContext", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Context;Landroid/content/Intent;)V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class BizContactInfoDialogFragment extends androidx.fragment.app.DialogFragment implements androidx.lifecycle.x, yr1.n {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f94067s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f94068d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f94069e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f94070f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f94071g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f94072h;

    /* renamed from: i, reason: collision with root package name */
    public yr1.k f94073i;

    /* renamed from: m, reason: collision with root package name */
    public int f94074m;

    /* renamed from: n, reason: collision with root package name */
    public float f94075n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f94076o;

    /* renamed from: p, reason: collision with root package name */
    public int f94077p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f94078q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f94079r;

    public BizContactInfoDialogFragment(android.content.Context activityContext, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f94068d = activityContext;
        this.f94069e = intent;
        this.f94079r = new yr1.j(this);
    }

    @Override // androidx.fragment.app.DialogFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, android.R.style.Theme.Translucent);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.a47, (android.view.ViewGroup) null);
        android.app.Dialog dialog = getDialog();
        kotlin.jvm.internal.o.d(dialog);
        dialog.requestWindowFeature(1);
        android.app.Dialog dialog2 = getDialog();
        kotlin.jvm.internal.o.d(dialog2);
        android.view.Window window = dialog2.getWindow();
        kotlin.jvm.internal.o.d(window);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.setWindowAnimations(com.tencent.mm.R.style.f494147ff);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        if (this.f94078q) {
            attributes.dimAmount = 0.5f;
            attributes.flags |= 2;
        }
        window.setAttributes(attributes);
        window.setLayout(-1, -2);
        fq1.e.f265507a.g(window.getDecorView(), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
        window.setBackgroundDrawableResource(com.tencent.mm.R.color.a9e);
        window.getDecorView().setPadding(0, 0, 0, 0);
        window.getDecorView().setBackgroundResource(com.tencent.mm.R.color.a9e);
        kotlin.jvm.internal.o.d(inflate);
        this.f94070f = inflate;
        android.app.Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnShowListener(new yr1.b(this));
        }
        return inflate;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        android.view.View view = this.f94070f;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view.removeCallbacks(this.f94079r);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f94071g;
        if (vASCommonFragment != null) {
            vASCommonFragment.mo133getLifecycle().c(this);
        } else {
            kotlin.jvm.internal.o.o("profileFragment");
            throw null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialog) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        super.onDismiss(dialog);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).w8(this);
        float f17 = this.f94075n;
        if (f17 < 1.0f) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new yr1.c(this));
            ofFloat.start();
            return;
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f94076o;
        if (aVar != null) {
            aVar.a(1.0f);
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar2 = this.f94076o;
        if (aVar2 != null) {
            aVar2.c(false, false, 0);
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar3 = this.f94076o;
        if (aVar3 != null) {
            aVar3.b();
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
    public final void onFragmentViewCreate() {
        if (this.f94072h == null) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f94071g;
            if (vASCommonFragment == null) {
                kotlin.jvm.internal.o.o("profileFragment");
                throw null;
            }
            android.view.View view = vASCommonFragment.f211137i;
            com.google.android.material.appbar.AppBarLayout appBarLayout = view != null ? (com.google.android.material.appbar.AppBarLayout) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout") : null;
            this.f94072h = appBarLayout;
            if (appBarLayout != null) {
                appBarLayout.a(new yr1.d(this));
            }
        }
        if (this.f94073i == null) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f94071g;
            if (vASCommonFragment2 == null) {
                kotlin.jvm.internal.o.o("profileFragment");
                throw null;
            }
            android.view.View view2 = vASCommonFragment2.f211137i;
            android.view.View findViewWithTag = view2 != null ? view2.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarContainer") : null;
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment3 = this.f94071g;
            if (vASCommonFragment3 == null) {
                kotlin.jvm.internal.o.o("profileFragment");
                throw null;
            }
            android.view.View view3 = vASCommonFragment3.f211137i;
            android.view.View findViewWithTag2 = view3 != null ? view3.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarLine") : null;
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment4 = this.f94071g;
            if (vASCommonFragment4 == null) {
                kotlin.jvm.internal.o.o("profileFragment");
                throw null;
            }
            android.view.View view4 = vASCommonFragment4.f211137i;
            android.view.View findViewWithTag3 = view4 != null ? view4.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarArrow") : null;
            if (findViewWithTag == null || findViewWithTag2 == null || findViewWithTag3 == null) {
                return;
            }
            this.f94073i = new yr1.k(findViewWithTag, findViewWithTag2, findViewWithTag3);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        android.view.Window window;
        super.onPause();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(0);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.view.View view = this.f94070f;
        if (view != null) {
            view.postDelayed(this.f94079r, 200L);
        } else {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
        }
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.color.a9e);
        }
        int k17 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
        android.view.View view3 = this.f94070f;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        int i17 = this.f94077p;
        if (i17 <= 0) {
            i17 = (int) (k17 * 0.75d);
        }
        layoutParams.height = i17;
        android.view.View view4 = this.f94070f;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view4.setLayoutParams(layoutParams);
        android.view.View view5 = this.f94070f;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view5.setBackgroundResource(com.tencent.mm.R.color.BW_100);
        androidx.fragment.app.i2 beginTransaction = getChildFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", this.f94069e, false, 4, null);
        this.f94071g = b17;
        b17.q0(new yr1.f(this));
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f94071g;
        if (vASCommonFragment == null) {
            kotlin.jvm.internal.o.o("profileFragment");
            throw null;
        }
        vASCommonFragment.mo133getLifecycle().a(this);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f94071g;
        if (vASCommonFragment2 == null) {
            kotlin.jvm.internal.o.o("profileFragment");
            throw null;
        }
        beginTransaction.k(com.tencent.mm.R.id.akg, vASCommonFragment2, null);
        beginTransaction.e();
        android.app.Dialog dialog2 = getDialog();
        kotlin.jvm.internal.o.d(dialog2);
        android.view.Window window = dialog2.getWindow();
        android.view.View decorView = window != null ? window.getDecorView() : null;
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            yr1.m mVar = new yr1.m(this.f94068d, viewGroup, new yr1.g(this), new yr1.h(this));
            mVar.setOnDragToClose(new yr1.i(this));
            mVar.setBackgroundResource(com.tencent.mm.R.color.a9e);
            android.view.ViewGroup viewGroup2 = mVar.f464650d;
            android.view.View childAt = viewGroup2.getChildAt(0);
            mVar.f464653g = childAt;
            viewGroup2.removeView(childAt);
            mVar.addView(mVar.f464653g);
            viewGroup2.addView(mVar);
            fq1.e.f265507a.g(mVar.f464653g, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
            int k18 = i65.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
            mVar.f464656m = k18;
            mVar.f464655i = k18 * 0.3f;
        }
    }
}
