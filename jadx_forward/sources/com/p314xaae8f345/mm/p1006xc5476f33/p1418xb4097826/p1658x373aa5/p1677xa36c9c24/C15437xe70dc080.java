package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/tabcomp/FinderTabProvider;", "Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "fragments", "Lzx2/a0;", "tabContainer", "Lzx2/i;", "tabs", "Lzx2/z;", "tabViewAction", "Ljava/util/List;", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "Lzx2/a0;", "getTabContainer", "()Lzx2/a0;", "setTabContainer", "(Lzx2/a0;)V", "getTabs", "setTabs", "Lzx2/z;", "getTabViewAction", "()Lzx2/z;", "setTabViewAction", "(Lzx2/z;)V", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider */
/* loaded from: classes2.dex */
public class C15437xe70dc080 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57 {
    private java.util.List<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180> fragments;
    private zx2.a0 tabContainer;
    private zx2.z tabViewAction;
    private java.util.List<? extends zx2.i> tabs;

    public C15437xe70dc080() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1642xc9c775aa.ActivityC15138x5ce6c939.FinderSampleTabFragment finderSampleTabFragment = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1642xc9c775aa.ActivityC15138x5ce6c939.FinderSampleTabFragment();
        finderSampleTabFragment.f210796n = 101;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1642xc9c775aa.ActivityC15138x5ce6c939.FinderSampleTabFragment finderSampleTabFragment2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1642xc9c775aa.ActivityC15138x5ce6c939.FinderSampleTabFragment();
        finderSampleTabFragment2.f210796n = 102;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1642xc9c775aa.ActivityC15138x5ce6c939.FinderSampleTabFragment finderSampleTabFragment3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1642xc9c775aa.ActivityC15138x5ce6c939.FinderSampleTabFragment();
        finderSampleTabFragment3.f210796n = 103;
        this.fragments = kz5.c0.d(finderSampleTabFragment, finderSampleTabFragment2, finderSampleTabFragment3);
        this.tabContainer = new zx2.l();
        this.tabs = kz5.c0.d(new zx2.k("喜欢"), new zx2.k("点赞"), new zx2.k("提到"));
        this.tabViewAction = new zx2.y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: fragments */
    public java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180> mo60926x16b96823() {
        return this.fragments;
    }

    /* renamed from: getFragments */
    public final java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180> m63009x1626d96d() {
        return this.fragments;
    }

    public final zx2.a0 getTabContainer() {
        return this.tabContainer;
    }

    public final zx2.z getTabViewAction() {
        return this.tabViewAction;
    }

    /* renamed from: getTabs */
    public final java.util.List<zx2.i> m63012xfb859bf4() {
        return this.tabs;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: isDynamic */
    public /* bridge */ /* synthetic */ boolean mo55745x5c16a7b5() {
        return false;
    }

    /* renamed from: setFragments */
    public final void m63013x727a99e1(java.util.List<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180> list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        this.fragments = list;
    }

    /* renamed from: setTabContainer */
    public final void m63014x6172f1ee(zx2.a0 a0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a0Var, "<set-?>");
        this.tabContainer = a0Var;
    }

    /* renamed from: setTabViewAction */
    public final void m63015x359f5d6e(zx2.z zVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(zVar, "<set-?>");
        this.tabViewAction = zVar;
    }

    /* renamed from: setTabs */
    public final void m63016x76506300(java.util.List<? extends zx2.i> list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        this.tabs = list;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabContainer */
    public zx2.a0 mo60927xca37646c() {
        return this.tabContainer;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabViewAction */
    public zx2.z mo60928xe5693ab0() {
        return this.tabViewAction;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.InterfaceC15438xf4a73b57
    /* renamed from: tabs */
    public java.util.List<zx2.i> mo60929x36337e() {
        return this.tabs;
    }
}
