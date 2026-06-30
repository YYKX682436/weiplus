package com.tencent.mm.plugin.backup.roambackup.ui.pkg;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/RoamSelectContactUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoamSelectContactUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f92844e = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92845d;

    public RoamSelectContactUI() {
        jz5.h.b(new zo1.a3(this));
    }

    public final void U6() {
        finish();
        if (this.f92845d) {
            overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477855dd);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eq_;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f92845d) {
            U6();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        j75.f stateCenter = getStateCenter();
        if (stateCenter != null) {
            setMMTitle(((ap1.c2) stateCenter.getState()).f12624e);
            stateCenter.L2(this, new zo1.y2(this));
            stateCenter.B3(new ap1.d(ap1.e.f12639d, null));
        }
        setNavigationbarColor(getColor(com.tencent.mm.R.color.af_));
        boolean booleanExtra = getIntent().getBooleanExtra("contactListPushDownAnim", false);
        this.f92845d = booleanExtra;
        if (booleanExtra) {
            setBackBtnVisible(false);
            getController().x0(getString(com.tencent.mm.R.string.mvh), new java.lang.Runnable() { // from class: zo1.z2
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI.f92844e;
                    com.tencent.mm.plugin.backup.roambackup.ui.pkg.RoamSelectContactUI.this.U6();
                }
            });
        }
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(ap1.d2.class);
    }
}
