package com.tencent.mm.plugin.finder.activity.topic.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/fragment/FinderTopicTabParentFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "Ljava/util/Observer;", "<init>", "()V", "sa2/d", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderTopicTabParentFragment extends com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment implements java.util.Observer {
    public final java.util.HashMap A;
    public final jz5.g B;
    public com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment C;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.activity.uic.i1 f101808w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f101809x;

    /* renamed from: y, reason: collision with root package name */
    public ra2.a f101810y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f101811z = "MicroMsg.Finder.FinderTopicTabParentFragment" + hashCode();

    public FinderTopicTabParentFragment() {
        jz5.h.b(new sa2.e(this));
        this.A = new java.util.HashMap();
        this.B = jz5.h.b(new sa2.f(this));
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, va2.j.class});
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        com.tencent.mm.ui.component.UIComponentFragment uIComponentFragment;
        ra2.a aVar = this.f101810y;
        sa2.d dVar = (sa2.d) this.A.get(java.lang.Integer.valueOf(aVar != null ? aVar.f393483a : 0));
        if (dVar != null && (uIComponentFragment = dVar.f405301c) != null) {
            uIComponentFragment.o0();
        }
        java.util.Objects.toString(dVar);
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
        ra2.a aVar = this.f101810y;
        if (aVar != null) {
            aVar.addObserver(this);
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ra2.a aVar = this.f101810y;
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

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        return 22;
    }

    @Override // java.util.Observer
    public void update(java.util.Observable observable, java.lang.Object obj) {
        z0();
    }

    @Override // com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment
    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC y0(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(va2.n.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }

    public final void z0() {
        android.widget.FrameLayout frameLayout;
        ra2.a aVar = this.f101810y;
        java.util.LinkedList linkedList = this.f101809x;
        com.tencent.mm.plugin.finder.activity.uic.i1 i1Var = this.f101808w;
        java.lang.String str = this.f101811z;
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
            com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment finderTopicTabFragment = new com.tencent.mm.plugin.finder.activity.topic.fragment.FinderTopicTabFragment();
            r45.bo6 bo6Var = (r45.bo6) linkedList.get(i17);
            finderTopicTabFragment.f129265p = bo6Var.getInteger(1) - 1;
            finderTopicTabFragment.f129266q = bo6Var.getString(0);
            finderTopicTabFragment.f101753u = bo6Var.getLong(2);
            java.lang.String string = bo6Var.getString(0);
            if (string == null) {
                string = "";
            }
            finderTopicTabFragment.f101754v = string;
            finderTopicTabFragment.f101752t = i1Var.f101892b;
            if (this.C == null) {
                this.C = finderTopicTabFragment;
            }
            androidx.fragment.app.i2 beginTransaction = getChildFragmentManager().beginTransaction();
            beginTransaction.h(generateViewId, finderTopicTabFragment, null, 1);
            beginTransaction.g();
            sa2.d dVar = new sa2.d(i17, frameLayout2, finderTopicTabFragment);
            hashMap.put(java.lang.Integer.valueOf(i17), dVar);
            dVar.toString();
            finderTopicTabFragment.o0();
        }
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object key = entry.getKey();
            kotlin.jvm.internal.o.f(key, "<get-key>(...)");
            int intValue = ((java.lang.Number) key).intValue();
            android.widget.FrameLayout frameLayout3 = ((sa2.d) entry.getValue()).f405300b;
            int i18 = 8;
            if (intValue == i17) {
                if (frameLayout3.getVisibility() == 8) {
                    java.util.Objects.toString(entry.getValue());
                    ((sa2.d) entry.getValue()).f405301c.o0();
                }
                i18 = 0;
            } else if (frameLayout3.getVisibility() == 0) {
                java.util.Objects.toString(entry.getValue());
                ((sa2.d) entry.getValue()).f405301c.p0();
            }
            frameLayout3.setVisibility(i18);
        }
    }
}
