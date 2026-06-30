package com.tencent.mm.plugin.combine;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/combine/CombineVisibilityFragment;", "Lcom/tencent/mm/ui/vas/VASCommonFragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class CombineVisibilityFragment extends com.tencent.mm.ui.vas.VASCommonFragment {
    public boolean S1;

    @Override // com.tencent.mm.ui.vas.VASCommonFragment, com.tencent.mm.ui.vas.fragment.VASBaseFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]onCreateView fixStatusBar:");
        sb6.append(this.S1);
        sb6.append(" ActClz=");
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f211121p;
        sb6.append(vASActivity != null ? vASActivity.getClass().getSimpleName() : null);
        com.tencent.mars.xlog.Log.i(this.f211120o, sb6.toString());
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (onCreateView == null) {
            return onCreateView;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(onCreateView.getContext());
        frameLayout.addView(onCreateView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }
}
