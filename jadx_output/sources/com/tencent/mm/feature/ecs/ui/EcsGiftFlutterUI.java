package com.tencent.mm.feature.ecs.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/ecs/ui/EcsGiftFlutterUI;", "Lcom/tencent/mm/plugin/flutter/ui/MMFlutterViewActivity;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsGiftFlutterUI extends com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        b30.i a17 = b30.i.f17563b.a(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsActivityHelper", "requestCode:" + i17 + " size:" + a17.a().size());
        java.util.Iterator it = a17.a().iterator();
        while (it.hasNext()) {
            b30.e eVar = (b30.e) it.next();
            if (eVar.a(i17, i18, intent)) {
                a17.a().remove(eVar);
            }
        }
        a17.a().size();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.l_);
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterUI", "EcsGiftFlutterUI, " + hashCode() + " on create");
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftFlutterUI", "EcsGiftFlutterUI, " + hashCode() + " destroy");
        b30.g gVar = b30.i.f17563b;
        ((java.util.WeakHashMap) ((jz5.n) b30.i.f17564c).getValue()).remove(this);
    }
}
