package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderRingtoneSearchUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class FinderRingtoneSearchUI extends com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ch6;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        ed0.c1 c1Var = (ed0.c1) i95.n0.c(ed0.c1.class);
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        c1Var.getClass();
        return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.ringtone.uic.z1.class, com.tencent.mm.plugin.ringtone.uic.v.class, com.tencent.mm.plugin.finder.viewmodel.component.nc0.class, com.tencent.mm.plugin.ringtone.uic.d2.class, com.tencent.mm.plugin.ringtone.uic.g.class, com.tencent.mm.plugin.ringtone.uic.c3.class}));
    }

    @Override // com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("ringtone_caller", 1) == 1) {
            setMMTitle(com.tencent.mm.R.string.f492838i30);
        } else {
            java.lang.String stringExtra = getIntent().getStringExtra("exclusvie_name");
            if (stringExtra != null) {
                if (c01.e2.l(stringExtra).I == 2) {
                    setMMTitle(com.tencent.mm.R.string.f492840i32);
                } else {
                    setMMTitle(com.tencent.mm.R.string.f492839i31);
                }
            }
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.y(((com.tencent.mm.plugin.finder.viewmodel.component.nc0) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.nc0.class)).R6());
    }
}
