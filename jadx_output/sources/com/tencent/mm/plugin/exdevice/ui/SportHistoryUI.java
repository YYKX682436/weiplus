package com.tencent.mm.plugin.exdevice.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/exdevice/ui/SportHistoryUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/plugin/exdevice/ui/f7", "com/tencent/mm/plugin/exdevice/ui/n7", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SportHistoryUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f99388d;

    /* renamed from: e, reason: collision with root package name */
    public p32.m f99389e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f99390f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f99391g = "";

    public static final java.util.LinkedList U6(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI, r45.ab0 ab0Var) {
        boolean z17;
        sportHistoryUI.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList sportrecord = ab0Var.f369882f;
        kotlin.jvm.internal.o.f(sportrecord, "sportrecord");
        java.util.Iterator it = sportrecord.iterator();
        java.util.LinkedList linkedList2 = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        java.util.LinkedList linkedList3 = null;
        boolean z18 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.ed6 ed6Var = (r45.ed6) it.next();
            int i17 = ed6Var.f373335o;
            if (i17 == 0) {
                if (str == null || !kotlin.jvm.internal.o.b(str, ed6Var.f373327d)) {
                    if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                        if (linkedList2 != null) {
                            linkedList.add(linkedList2);
                        }
                        linkedList2 = new java.util.LinkedList();
                    }
                    if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
                        kotlin.jvm.internal.o.d(linkedList3);
                        linkedList.add(linkedList3);
                    }
                    linkedList3 = new java.util.LinkedList();
                    str = ed6Var.f373327d;
                }
                if (linkedList3 != null) {
                    linkedList3.add(ed6Var);
                }
                if (kotlin.jvm.internal.o.b(ed6Var.f373327d, "21f9d636b41b25be")) {
                    z18 = true;
                }
            } else if (i17 == 1) {
                if (str2 == null || !kotlin.jvm.internal.o.b(str2, ed6Var.f373328e)) {
                    if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
                        if (linkedList3 != null) {
                            linkedList.add(linkedList3);
                        }
                        linkedList3 = new java.util.LinkedList();
                    }
                    if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
                        kotlin.jvm.internal.o.d(linkedList2);
                        linkedList.add(linkedList2);
                    }
                    linkedList2 = new java.util.LinkedList();
                    str2 = ed6Var.f373328e;
                }
                if (linkedList2 != null) {
                    linkedList2.add(ed6Var);
                }
            }
        }
        if (linkedList2 != null && (linkedList2.isEmpty() ^ true)) {
            kotlin.jvm.internal.o.d(linkedList2);
            linkedList.add(linkedList2);
        }
        if (linkedList3 != null && (linkedList3.isEmpty() ^ true)) {
            kotlin.jvm.internal.o.d(linkedList3);
            linkedList.add(linkedList3);
        }
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        if (!z18) {
            java.util.LinkedList linkedList5 = ab0Var.f369886m;
            if (linkedList5 != null && !linkedList5.isEmpty()) {
                z17 = false;
            }
            if (!z17) {
                r45.ed6 ed6Var2 = new r45.ed6();
                ed6Var2.f373327d = "21f9d636b41b25be";
                ed6Var2.f373335o = 0;
                ed6Var2.f373330g = null;
                linkedList4.add(ed6Var2);
                linkedList.add(linkedList4);
            }
        }
        return linkedList;
    }

    public static final void V6(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI sportHistoryUI, android.widget.TextView textView, float f17) {
        androidx.appcompat.app.AppCompatActivity context = sportHistoryUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cvd;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f491155c56);
        setBackBtn(new com.tencent.mm.plugin.exdevice.ui.o7(this));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.lqa);
        this.f99388d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f99388d;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.exdevice.ui.SportHistoryUI$buildItemConverts$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new com.tencent.mm.plugin.exdevice.ui.n7(com.tencent.mm.plugin.exdevice.ui.SportHistoryUI.this);
                }
            }, this.f99390f, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f99388d;
        if (wxRecyclerView3 != null) {
            wxRecyclerView3.N(new com.tencent.mm.plugin.exdevice.ui.p7(this));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView4 = this.f99388d;
        if (wxRecyclerView4 != null) {
            ym5.a1.g(wxRecyclerView4, new com.tencent.mm.plugin.exdevice.ui.q7(this));
        }
        gm0.j1.d().a(4835, this);
        r45.lo3 lo3Var = new r45.lo3();
        java.lang.String stringExtra = getIntent().getStringExtra(dm.i4.COL_USERNAME);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f99391g = stringExtra;
        lo3Var.f379674d = stringExtra;
        this.f99389e = new p32.m(lo3Var);
        gm0.j1.d().g(this.f99389e);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        p32.m mVar = this.f99389e;
        if (mVar != null) {
            gm0.j1.d().d(mVar);
        }
        gm0.j1.d().q(4835, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        androidx.recyclerview.widget.f2 adapter;
        r45.mo3 mo3Var;
        java.util.LinkedList linkedList;
        if (i17 == 0 && i18 == 0) {
            p32.m mVar = this.f99389e;
            if (mVar != null && (mo3Var = mVar.f351504f) != null && (linkedList = mo3Var.f380711d) != null) {
                int i19 = 0;
                for (java.lang.Object obj : linkedList) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.ab0 ab0Var = (r45.ab0) obj;
                    java.util.ArrayList arrayList = this.f99390f;
                    kotlin.jvm.internal.o.d(ab0Var);
                    arrayList.add(new com.tencent.mm.plugin.exdevice.ui.f7(this, i19, ab0Var));
                    i19 = i27;
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f99388d;
            if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ilt);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f99389e = null;
    }
}
