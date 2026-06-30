package com.tencent.mm.plugin.appbrand.ui.collection;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionVerticalSortList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class AppBrandCollectionVerticalSortList extends com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f89649m = 0;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.sortlist.DragSortListView f89650h;

    /* renamed from: i, reason: collision with root package name */
    public xj1.x f89651i;

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488017ei;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void initView() {
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = (com.tencent.mm.ui.widget.sortlist.DragSortListView) this.f89369g.findViewById(android.R.id.list);
        this.f89650h = dragSortListView;
        if (dragSortListView != null) {
            dragSortListView.setDropListener(new xj1.p(this));
        }
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView2 = this.f89650h;
        if (dragSortListView2 != null) {
            dragSortListView2.setRemoveListener(new xj1.q(this));
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        android.os.Bundle arguments = getArguments();
        kotlin.jvm.internal.o.d(arguments);
        java.util.ArrayList parcelableArrayList = arguments.getParcelableArrayList("KEY_SORT_DATA_LIST");
        kotlin.jvm.internal.o.d(parcelableArrayList);
        xj1.x xVar = new xj1.x(activity, parcelableArrayList);
        this.f89651i = xVar;
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView3 = this.f89650h;
        kotlin.jvm.internal.o.d(dragSortListView3);
        xVar.f454822e = dragSortListView3;
        dragSortListView3.setAdapter((android.widget.ListAdapter) xVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490298r3), new xj1.s(this), null, com.tencent.mm.ui.fb.BLACK);
        }
        androidx.fragment.app.FragmentActivity activity2 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity2 = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
        if (mMActivity2 != null) {
            mMActivity2.setBackBtn(new xj1.t(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        }
    }
}
