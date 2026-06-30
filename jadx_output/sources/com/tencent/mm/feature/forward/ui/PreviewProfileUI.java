package com.tencent.mm.feature.forward.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/forward/ui/PreviewProfileUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "q50/k", "feature-forward_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PreviewProfileUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.elw;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ul5.k bounceView;
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(this);
        if (a17 != null && (bounceView = a17.getBounceView()) != null) {
            bounceView.setEnd2StartBgColorByNavigationBar(getActionbarColor());
        }
        setNavigationbarColor(getActionbarColor());
        setBackBtn(new q50.l(this));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = getIntent().getStringExtra("Chat_User");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) h0Var.f310123d, true);
        rv1.e eVar = (rv1.e) i95.n0.c(rv1.e.class);
        java.lang.String d17 = n17.d1();
        ((c01.w1) eVar).getClass();
        setMMTitle(((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).wi(n17) + getContext().getString(com.tencent.mm.R.string.n79, java.lang.Integer.valueOf(c01.v1.o(d17))));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        rv1.e eVar2 = (rv1.e) i95.n0.c(rv1.e.class);
        java.lang.String str = (java.lang.String) h0Var.f310123d;
        ((c01.w1) eVar2).getClass();
        java.util.List<java.lang.String> m17 = c01.v1.m(str);
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0((java.lang.String) h0Var.f310123d);
        if (m17 == null) {
            return;
        }
        for (java.lang.String str2 : m17) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str3 = (java.lang.String) h0Var.f310123d;
            ((sg3.a) v0Var).getClass();
            arrayList.add(c01.a2.f(str2, str3));
        }
        android.widget.GridView gridView = (android.widget.GridView) findViewById(com.tencent.mm.R.id.bgk);
        gridView.setAdapter((android.widget.ListAdapter) new q50.k(this, m17, arrayList));
        gridView.setSelector(new android.graphics.drawable.ColorDrawable(getContext().getResources().getColor(com.tencent.mm.R.color.a9e)));
        gridView.setOnItemClickListener(new q50.m(m17, h0Var, z07, this));
    }
}
