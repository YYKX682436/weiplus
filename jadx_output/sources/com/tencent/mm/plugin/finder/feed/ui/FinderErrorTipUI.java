package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderErrorTipUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public class FinderErrorTipUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f109227d = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.p1(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f109228e = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.n1(this));

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.agk;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getColor(com.tencent.mm.R.color.f479160rk));
        setNavigationbarColor(getColor(com.tencent.mm.R.color.f479160rk));
        getWindow().getDecorView().setSystemUiVisibility(1280);
        vj5.o.e(getWindow());
        setMMTitle("");
        hideActionbarLine();
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.o1(this));
        jz5.g gVar = this.f109228e;
        java.lang.String str = (java.lang.String) ((jz5.n) gVar).getValue();
        boolean z17 = str == null || r26.n0.N(str);
        jz5.g gVar2 = this.f109227d;
        if (z17) {
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText(com.tencent.mm.R.string.cv_);
        } else {
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText((java.lang.String) ((jz5.n) gVar).getValue());
        }
    }
}
