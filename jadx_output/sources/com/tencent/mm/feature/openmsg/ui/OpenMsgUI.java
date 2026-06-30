package com.tencent.mm.feature.openmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/openmsg/ui/OpenMsgUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "feature-openmsg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OpenMsgUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: d, reason: collision with root package name */
    public androidx.core.widget.NestedScrollView f67321d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dyd;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean isContentAtTop() {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f67321d;
        return nestedScrollView != null && nestedScrollView.getScrollY() == 0;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f67321d = (androidx.core.widget.NestedScrollView) findViewById(com.tencent.mm.R.id.f486196un4);
        setMMTitle(getString(com.tencent.mm.R.string.obb));
        findViewById(com.tencent.mm.R.id.f486194un3).setOnClickListener(new ib0.g(this));
        setActionbarColor(getColor(com.tencent.mm.R.color.f478490b));
        setBackBtn(new ib0.h(this), com.tencent.mm.R.raw.actionbar_icon_close_black);
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.feature.openmsg.uic.q0.class);
        set.add(com.tencent.mm.feature.openmsg.uic.v.class);
        set.add(com.tencent.mm.feature.openmsg.uic.z.class);
        set.add(com.tencent.mm.feature.openmsg.uic.n0.class);
    }
}
