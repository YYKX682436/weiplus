package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.p1432x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/fragment/FinderActivityTabParentFragment;", "Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "Ljava/util/Observer;", "<init>", "()V", "sa2/a", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.activity.topic.fragment.FinderActivityTabParentFragment */
/* loaded from: classes2.dex */
public final class C13663x38cb4b1a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 implements java.util.Observer {
    public final java.util.HashMap A;
    public final jz5.g B;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 C;

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1 f183337w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.LinkedList f183338x;

    /* renamed from: y, reason: collision with root package name */
    public ra2.a f183339y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f183340z = "MicroMsg.Finder.FinderActivityTabParentFragment" + m7479x8cdac1b();

    public C13663x38cb4b1a() {
        jz5.h.b(new sa2.b(this));
        this.A = new java.util.HashMap();
        this.B = jz5.h.b(new sa2.c(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, va2.j.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639 abstractC22277x94c24639;
        ra2.a aVar = this.f183339y;
        sa2.a aVar2 = (sa2.a) this.A.get(java.lang.Integer.valueOf(aVar != null ? aVar.f475016a : 0));
        if (aVar2 != null && (abstractC22277x94c24639 = aVar2.f486829c) != null) {
            abstractC22277x94c24639.o0();
        }
        java.util.Objects.toString(aVar2);
        super.o0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onAttach */
    public void mo7397x3b13c504(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo7397x3b13c504(context);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        ra2.a aVar = this.f183339y;
        if (aVar != null) {
            aVar.addObserver(this);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        ra2.a aVar = this.f183339y;
        if (aVar != null) {
            aVar.deleteObserver(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        z0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        super.p0();
    }

    @Override // java.util.Observer
    public void update(java.util.Observable observable, java.lang.Object obj) {
        z0();
    }

    public final void z0() {
        android.widget.FrameLayout frameLayout;
        ra2.a aVar = this.f183339y;
        java.util.LinkedList linkedList = this.f183338x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.i1 i1Var = this.f183337w;
        java.lang.String str = this.f183340z;
        if (aVar == null || linkedList == null || i1Var == null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(aVar == null);
            objArr[1] = java.lang.Boolean.valueOf(linkedList == null);
            objArr[2] = java.lang.Boolean.valueOf(i1Var == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "tryUpdateInnerView innerTabCommonInfo == null:%s tags == null:%s mediaTabInfo == null：%s", objArr);
            return;
        }
        int i17 = aVar.f475016a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryUpdateInnerView curSelectPosition:" + i17);
        android.content.Context mo7438x76847179 = mo7438x76847179();
        if (mo7438x76847179 == null || (frameLayout = (android.widget.FrameLayout) ((jz5.n) this.B).mo141623x754a37bb()) == null) {
            return;
        }
        java.util.HashMap hashMap = this.A;
        if (hashMap.get(java.lang.Integer.valueOf(i17)) == null) {
            int generateViewId = android.view.View.generateViewId();
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(mo7438x76847179);
            frameLayout2.setId(generateViewId);
            frameLayout.addView(frameLayout2);
            frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5 c13646x818616e5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5();
            r45.bo6 bo6Var = (r45.bo6) linkedList.get(i17);
            c13646x818616e5.f210798p = bo6Var.m75939xb282bd08(1) - 1;
            c13646x818616e5.f210799q = bo6Var.m75945x2fec8307(0);
            c13646x818616e5.f183286u = bo6Var.m75942xfb822ef2(2);
            java.lang.String m75945x2fec8307 = bo6Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            c13646x818616e5.f183287v = m75945x2fec8307;
            c13646x818616e5.f183285t = i1Var.f183425b;
            if (this.C == null) {
                this.C = c13646x818616e5;
            }
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m7437x54c0aef7().m7630xb2c12e75();
            m7630xb2c12e75.h(generateViewId, c13646x818616e5, null, 1);
            m7630xb2c12e75.g();
            sa2.a aVar2 = new sa2.a(i17, frameLayout2, c13646x818616e5);
            hashMap.put(java.lang.Integer.valueOf(i17), aVar2);
            aVar2.m164174x9616526c();
            c13646x818616e5.o0();
        }
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object key = entry.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
            int intValue = ((java.lang.Number) key).intValue();
            android.widget.FrameLayout frameLayout3 = ((sa2.a) entry.getValue()).f486828b;
            int i18 = 8;
            if (intValue == i17) {
                if (frameLayout3.getVisibility() == 8) {
                    java.util.Objects.toString(entry.getValue());
                    ((sa2.a) entry.getValue()).f486829c.o0();
                }
                i18 = 0;
            } else if (frameLayout3.getVisibility() == 0) {
                java.util.Objects.toString(entry.getValue());
                ((sa2.a) entry.getValue()).f486829c.p0();
            }
            frameLayout3.setVisibility(i18);
        }
    }
}
