package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveAnchorSettingUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109331v = "FinderLiveAnchorSettingUI";

    public final void d7(r45.no1 no1Var) {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.moh);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        java.util.LinkedList<r45.mo1> list = no1Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getFunctions(...)");
        for (r45.mo1 mo1Var : list) {
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
            java.util.LinkedList list2 = mo1Var.getList(0);
            if (list2 != null) {
                int i17 = 0;
                for (java.lang.Object obj : list2) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.lo1 lo1Var = (r45.lo1) obj;
                    android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.awv, (android.view.ViewGroup) linearLayout2, false);
                    if (i17 == mo1Var.getList(0).size() - 1 && (findViewById = inflate.findViewById(com.tencent.mm.R.id.hps)) != null && (findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.d0v)) != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI", "buildSettingLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveCreatorService;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorSettingUI", "buildSettingLayout", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveCreatorService;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    inflate.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.q7(lo1Var, this));
                    ym5.a1.h(inflate, new com.tencent.mm.plugin.finder.feed.ui.r7(this, lo1Var));
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hjq);
                    if (textView != null) {
                        java.lang.String string = lo1Var.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        textView.setText(string);
                    }
                    linearLayout2.addView(inflate, new android.widget.LinearLayout.LayoutParams(-1, -2));
                    i17 = i18;
                }
            }
            if (linearLayout != null) {
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
                layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz));
                linearLayout.addView(linearLayout2, layoutParams);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e8h;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.e8h);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.s7(this));
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("service");
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (byteArrayExtra == null || stringExtra == null) {
            return;
        }
        try {
            setMMTitle(stringExtra);
            r45.no1 no1Var = new r45.no1();
            no1Var.fromProtobuf(byteArrayExtra);
            d7(no1Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(this.f109331v, "parse service error: " + e17.getMessage());
            finish();
        }
    }
}
