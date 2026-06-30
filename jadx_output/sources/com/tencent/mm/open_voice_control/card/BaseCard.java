package com.tencent.mm.open_voice_control.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/BaseCard;", "Lcom/tencent/mm/ui/MMFragment;", "r/b", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseCard extends com.tencent.mm.ui.MMFragment {
    public static final r.b T1 = new r.b(null);
    public boolean S1;

    /* renamed from: d, reason: collision with root package name */
    public final int f72225d;

    public BaseCard(int i17) {
        this.f72225d = i17;
    }

    public static final void a(androidx.fragment.app.FragmentActivity fragmentActivity, boolean z17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVC.BaseCard", "dismiss activity");
            if (fragmentActivity != null) {
                try {
                    fragmentActivity.finish();
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OVC.BaseCard", th6, "dismiss: finish activity failed", new java.lang.Object[0]);
                    return;
                }
            }
            if (fragmentActivity != null) {
                fragmentActivity.overridePendingTransition(0, com.tencent.mm.R.anim.f477722j);
            }
        }
    }

    public static final boolean b(androidx.fragment.app.FragmentManager fragmentManager, com.tencent.mm.open_voice_control.card.BaseCard baseCard) {
        try {
            if (fragmentManager.getFragments().size() == 1) {
                return kotlin.jvm.internal.o.b(fragmentManager.getFragments().get(0), baseCard);
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OVC.BaseCard", th6, "dismiss: check last fragment failed", new java.lang.Object[0]);
            return false;
        }
    }

    public final void dismiss() {
        android.view.Window window;
        android.view.View decorView;
        if (this.S1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVC.BaseCard", "dismiss: already requested");
            return;
        }
        if (!isAdded() || isDetached() || isRemoving()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVC.BaseCard", "dismiss: fragment not valid, isAdded=" + isAdded() + ", isDetached=" + isDetached() + ", isRemoving=" + isRemoving());
            return;
        }
        this.S1 = true;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        kotlin.jvm.internal.o.f(parentFragmentManager, "getParentFragmentManager(...)");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        try {
            c0Var.f310112d = b(parentFragmentManager, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.OVC.BaseCard", "dismiss lastFragment=" + c0Var.f310112d);
            androidx.fragment.app.i2 beginTransaction = parentFragmentManager.beginTransaction();
            beginTransaction.j(this);
            beginTransaction.g();
            a(activity, c0Var.f310112d);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OVC.BaseCard", e17, "dismiss: commitNow failed, fallback to async commit", new java.lang.Object[0]);
            r.c cVar = new r.c(this, c0Var, parentFragmentManager, activity);
            android.view.View view = getView();
            if (view != null && view.post(cVar)) {
                return;
            }
            if ((activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || !decorView.post(cVar)) ? false : true) {
                return;
            }
            cVar.run();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OVC.BaseCard", th6, "dismiss failed", new java.lang.Object[0]);
            a(activity, b(parentFragmentManager, this));
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId, reason: from getter */
    public int getF72225d() {
        return this.f72225d;
    }

    public abstract void l0();

    @Override // com.tencent.mm.ui.MMFragment
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        setBounceEnabled(false);
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        T1.a(view);
        l0();
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
