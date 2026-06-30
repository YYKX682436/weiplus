package com.tencent.mm.plugin.finder.activity.topic.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/fragment/FinderActivityTabParentFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "Ljava/util/Observer;", "<init>", "()V", "sa2/a", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderActivityTabParentFragment extends com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment implements java.util.Observer {
    public final java.util.HashMap A;
    public final jz5.g B;
    public com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment C;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.activity.uic.i1 f101804w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f101805x;

    /* renamed from: y, reason: collision with root package name */
    public ra2.a f101806y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f101807z = "MicroMsg.Finder.FinderActivityTabParentFragment" + hashCode();

    public FinderActivityTabParentFragment() {
        jz5.h.b(new sa2.b(this));
        this.A = new java.util.HashMap();
        this.B = jz5.h.b(new sa2.c(this));
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, va2.j.class});
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        com.tencent.mm.ui.component.UIComponentFragment uIComponentFragment;
        ra2.a aVar = this.f101806y;
        sa2.a aVar2 = (sa2.a) this.A.get(java.lang.Integer.valueOf(aVar != null ? aVar.f393483a : 0));
        if (aVar2 != null && (uIComponentFragment = aVar2.f405296c) != null) {
            uIComponentFragment.o0();
        }
        java.util.Objects.toString(aVar2);
        super.o0();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAttach(context);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ra2.a aVar = this.f101806y;
        if (aVar != null) {
            aVar.addObserver(this);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ra2.a aVar = this.f101806y;
        if (aVar != null) {
            aVar.deleteObserver(this);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        z0();
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        super.p0();
    }

    @Override // java.util.Observer
    public void update(java.util.Observable observable, java.lang.Object obj) {
        z0();
    }

    public final void z0() {
        android.widget.FrameLayout frameLayout;
        ra2.a aVar = this.f101806y;
        java.util.LinkedList linkedList = this.f101805x;
        com.tencent.mm.plugin.finder.activity.uic.i1 i1Var = this.f101804w;
        java.lang.String str = this.f101807z;
        if (aVar == null || linkedList == null || i1Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(aVar == null);
            objArr[1] = java.lang.Boolean.valueOf(linkedList == null);
            objArr[2] = java.lang.Boolean.valueOf(i1Var == null);
            com.tencent.mars.xlog.Log.e(str, "tryUpdateInnerView innerTabCommonInfo == null:%s tags == null:%s mediaTabInfo == null：%s", objArr);
            return;
        }
        int i17 = aVar.f393483a;
        com.tencent.mars.xlog.Log.i(str, "tryUpdateInnerView curSelectPosition:" + i17);
        android.content.Context context = getContext();
        if (context == null || (frameLayout = (android.widget.FrameLayout) ((jz5.n) this.B).getValue()) == null) {
            return;
        }
        java.util.HashMap hashMap = this.A;
        if (hashMap.get(java.lang.Integer.valueOf(i17)) == null) {
            int generateViewId = android.view.View.generateViewId();
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
            frameLayout2.setId(generateViewId);
            frameLayout.addView(frameLayout2);
            frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment finderActivityFragment = new com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment();
            r45.bo6 bo6Var = (r45.bo6) linkedList.get(i17);
            finderActivityFragment.f129265p = bo6Var.getInteger(1) - 1;
            finderActivityFragment.f129266q = bo6Var.getString(0);
            finderActivityFragment.f101753u = bo6Var.getLong(2);
            java.lang.String string = bo6Var.getString(0);
            if (string == null) {
                string = "";
            }
            finderActivityFragment.f101754v = string;
            finderActivityFragment.f101752t = i1Var.f101892b;
            if (this.C == null) {
                this.C = finderActivityFragment;
            }
            androidx.fragment.app.i2 beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.h(generateViewId, finderActivityFragment, null, 1);
            beginTransaction.g();
            sa2.a aVar2 = new sa2.a(i17, frameLayout2, finderActivityFragment);
            hashMap.put(java.lang.Integer.valueOf(i17), aVar2);
            aVar2.toString();
            finderActivityFragment.o0();
        }
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.o.f(key, "<get-key>(...)");
            int intValue = ((java.lang.Number) key).intValue();
            android.widget.FrameLayout frameLayout3 = ((sa2.a) entry.getValue()).f405295b;
            int i18 = 8;
            if (intValue == i17) {
                if (frameLayout3.getVisibility() == 8) {
                    java.util.Objects.toString(entry.getValue());
                    ((sa2.a) entry.getValue()).f405296c.o0();
                }
                i18 = 0;
            } else if (frameLayout3.getVisibility() == 0) {
                java.util.Objects.toString(entry.getValue());
                ((sa2.a) entry.getValue()).f405296c.p0();
            }
            frameLayout3.setVisibility(i18);
        }
    }
}
