package com.tencent.mm.plugin.clean.ui.fileindexui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "cw1/s1", "cw1/t1", "app_release"}, k = 1, mv = {1, 9, 0})
@gm0.a2
/* loaded from: classes7.dex */
public final class CleanCacheSubListUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f95684d;

    /* renamed from: e, reason: collision with root package name */
    public cw1.s1 f95685e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f95686f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95687g;

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        boolean z17;
        java.util.ArrayList arrayList;
        if (this.f95687g) {
            cw1.s1 s1Var = this.f95685e;
            if (s1Var == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            boolean[] zArr = s1Var.f223303e;
            int length = zArr.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    z17 = true;
                    break;
                } else {
                    if (!zArr[i17]) {
                        z17 = false;
                        break;
                    }
                    i17++;
                }
            }
            cw1.s1 s1Var2 = this.f95685e;
            if (s1Var2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            int i18 = 0;
            long j17 = 0;
            for (java.lang.Object obj : s1Var2.f223302d) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var = (com.tencent.mm.plugin.appbrand.appstorage.m0) obj;
                if (s1Var2.f223303e[i18]) {
                    j17 += m0Var.f76268d;
                }
                i18 = i19;
            }
            if (z17) {
                arrayList = null;
            } else {
                cw1.s1 s1Var3 = this.f95685e;
                if (s1Var3 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                arrayList = new java.util.ArrayList();
                int i27 = 0;
                for (java.lang.Object obj2 : s1Var3.f223302d) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var2 = (com.tencent.mm.plugin.appbrand.appstorage.m0) obj2;
                    if (s1Var3.f223303e[i27]) {
                        arrayList.add(m0Var2.f76265a);
                    }
                    i27 = i28;
                }
            }
            cw1.s1 s1Var4 = this.f95685e;
            if (s1Var4 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            int i29 = 0;
            long j18 = 0;
            for (java.lang.Object obj3 : s1Var4.f223302d) {
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var3 = (com.tencent.mm.plugin.appbrand.appstorage.m0) obj3;
                if (s1Var4.f223303e[i29]) {
                    if (m0Var3.f76265a.length() > 0) {
                        j18 += m0Var3.f76268d;
                    }
                }
                i29 = i37;
            }
            setResult(-1, new android.content.Intent().putExtra("checked", z17).putExtra("checkedSize", j17).putExtra("appIds", arrayList != null ? (java.lang.String[]) arrayList.toArray(new java.lang.String[0]) : null).putExtra("appSize", j18));
            java.lang.Long[] lArr = new java.lang.Long[2];
            lArr[0] = java.lang.Long.valueOf(j17);
            lArr[1] = java.lang.Long.valueOf(arrayList != null ? arrayList.size() : 0L);
            mt1.b0.s(33, 0L, lArr);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e2m;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.n8e);
        setBackBtn(new cw1.x1(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.i3p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f95684d = (androidx.recyclerview.widget.RecyclerView) findViewById;
        cw1.s1 s1Var = new cw1.s1(this);
        this.f95685e = s1Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f95684d;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        recyclerView.setAdapter(s1Var);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.iml);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f95686f = findViewById2;
        android.content.Intent intent = getIntent();
        long longExtra = intent.getLongExtra("size", 0L);
        boolean booleanExtra = intent.getBooleanExtra("checked", true);
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("appIds");
        java.util.Set D0 = stringArrayExtra != null ? kz5.z.D0(stringArrayExtra) : kz5.r0.f314002d;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f95684d;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("listView");
            throw null;
        }
        recyclerView2.setVisibility(8);
        android.view.View view = this.f95686f;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI", "loadAppBrandList", "(JZLjava/util/Set;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheSubListUI", "loadAppBrandList", "(JZLjava/util/Set;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string = getString(com.tencent.mm.R.string.b7m);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ((ku5.t0) ku5.t0.f312615d).a(new cw1.w1(longExtra, booleanExtra, D0, string, this));
    }
}
