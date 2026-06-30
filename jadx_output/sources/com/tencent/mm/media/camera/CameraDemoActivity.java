package com.tencent.mm.media.camera;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/media/camera/CameraDemoActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "plugin-camera_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class CameraDemoActivity extends androidx.appcompat.app.AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public rr0.a f68855d;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ai3.d.f5107a = true;
        getWindow().setFormat(-3);
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.f487939c3, (android.view.ViewGroup) null, false);
        com.tencent.mm.media.camera.view.CameraKitView cameraKitView = (com.tencent.mm.media.camera.view.CameraKitView) x4.b.a(inflate, com.tencent.mm.R.id.b5a);
        if (cameraKitView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(com.tencent.mm.R.id.b5a)));
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
        this.f68855d = new rr0.a(constraintLayout, cameraKitView);
        setContentView(constraintLayout);
        rr0.a aVar = this.f68855d;
        if (aVar != null) {
            aVar.f399165b.l0(this);
        } else {
            kotlin.jvm.internal.o.o("activityMainBinding");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
