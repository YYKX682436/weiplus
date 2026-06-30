package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderWxProfileShowUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afu;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.un(this), com.tencent.mm.R.raw.icons_filled_close);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ec7);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.vn(this));
        java.lang.String stringExtra = getIntent().getStringExtra("SWITCH_TO_USERNAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("Contact_Finder_Buffer");
        com.tencent.mars.xlog.Log.i("FinderWxProfileShowUI", "username:" + stringExtra + ", contactBuffer:" + byteArrayExtra);
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.crb, stringExtra);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ec6)).setText(string);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484463ec5);
        if (byteArrayExtra != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.parseFrom(byteArrayExtra);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.e7n);
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(finderContact.getHeadUrl(), null, 2, null);
            kotlin.jvm.internal.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f329957h));
            java.lang.String nickname = finderContact.getNickname();
            java.lang.String str = nickname != null ? nickname : "";
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e7v);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, str));
            i17 = 0;
        } else {
            i17 = 4;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderWxProfileShowUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
