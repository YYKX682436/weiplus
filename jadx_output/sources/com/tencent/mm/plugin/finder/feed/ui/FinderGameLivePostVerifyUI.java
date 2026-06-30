package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(39)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderGameLivePostVerifyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Lcom/tencent/mm/plugin/finder/live/viewmodel/b1;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderGameLivePostVerifyUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements com.tencent.mm.plugin.finder.live.viewmodel.b1 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f109283v = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.s4(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109284w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.x4(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109285x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.u4(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f109286y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.t4(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109287z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.w4(this));

    public FinderGameLivePostVerifyUI() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            intent.getIntExtra("LANDSCAPE_TYPE", 0);
        }
    }

    public final int d7() {
        android.content.Intent intent = getIntent();
        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("LANDSCAPE_TYPE", 0)) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return 0;
        }
        return (valueOf != null && valueOf.intValue() == 2) ? 8 : -1;
    }

    public void e7(boolean z17, r45.j01 j01Var, r45.lk2 lk2Var, boolean z18, int i17, long j17) {
        java.lang.Object obj;
        java.lang.String str;
        if (!z17) {
            finish();
            return;
        }
        if (!z18 || ((java.lang.Boolean) ((jz5.n) this.f109285x).getValue()).booleanValue()) {
            java.lang.String str2 = (java.lang.String) ((jz5.n) this.f109283v).getValue();
            ke2.y yVar = new ke2.y(str2 == null ? "" : str2, 0, false, null, false, null, 60, null);
            yVar.t(this, getResources().getString(com.tencent.mm.R.string.f9y), 500L);
            pq5.g l17 = yVar.l();
            l17.f(this);
            l17.K(new com.tencent.mm.plugin.finder.feed.ui.v4(this, i17, j17, j01Var));
            return;
        }
        if (j01Var != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = j01Var.R;
            if (linkedList2 != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    java.util.LinkedList list = ((r45.j32) it.next()).getList(0);
                    if (list != null) {
                        if (!(!list.isEmpty())) {
                            list = null;
                        }
                        if (list != null) {
                            linkedList.addAll(list);
                        }
                    }
                }
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if ((((r45.h32) obj).getInteger(6) & 1) == 1) {
                        break;
                    }
                }
            }
            r45.h32 h32Var = (r45.h32) obj;
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = j01Var.f377442i;
            kotlin.jvm.internal.o.d(finderObject);
            long id6 = finderObject.getId();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = j01Var.f377442i;
            if (finderObject2 == null || (str = finderObject2.getObjectNonceId()) == null) {
                str = "";
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = j01Var.f377442i;
            kotlin.jvm.internal.o.d(finderObject3);
            r45.nw1 liveInfo = finderObject3.getLiveInfo();
            kotlin.jvm.internal.o.d(liveInfo);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = j01Var.f377442i;
            c61.ub.Rf(ubVar, this, id6, str, liveInfo, null, h32Var, null, null, finderObject4 != null ? finderObject4.getSessionBuffer() : null, j01Var.f377446o, new android.content.Intent(), 208, null);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return d7();
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.live.viewmodel.l1.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        if (((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk()) {
            com.tencent.mars.xlog.Log.i("Finder.FinderGameLivePostVerifyUI", "onCreate: isVisitorLiving = true, finish!");
            db5.t7.makeText(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.cmy), 0).show();
            finish();
            return;
        }
        setRequestedOrientation(d7());
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(51);
        ((com.tencent.mm.plugin.finder.live.viewmodel.l1) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.l1.class)).f117209f = this;
        ((com.tencent.mm.plugin.finder.live.viewmodel.l1) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.live.viewmodel.l1.class)).f117210g = 14;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        b7(true);
        setTheme(com.tencent.mm.R.style.f494369l8);
    }
}
