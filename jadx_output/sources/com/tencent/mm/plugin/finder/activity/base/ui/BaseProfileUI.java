package com.tencent.mm.plugin.finder.activity.base.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lcom/tencent/mm/protobuf/f;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lt92/b;", "Lt92/a;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class BaseProfileUI<T extends com.tencent.mm.protobuf.f> extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements t92.b, t92.a {

    /* renamed from: t, reason: collision with root package name */
    public final x92.f f101740t = new x92.f();

    public int N2() {
        return 0;
    }

    /* renamed from: o6, reason: from getter */
    public x92.f getF101755u() {
        return this.f101740t;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
    }
}
