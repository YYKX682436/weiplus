package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class z1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 f292469d;

    public z1(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269) {
        this.f292469d = activityC22499xed564269;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageNewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22500x8bcca9d0 c22500x8bcca9d0 = this.f292469d.f291535h;
        if (c22500x8bcca9d0.f291545e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CropImageView", "rotate not done! cause: btmp is null!");
        } else {
            float[] fArr = {r0.getWidth() / 2, c22500x8bcca9d0.f291545e.getHeight() / 2};
            c22500x8bcca9d0.getImageMatrix().mapPoints(fArr);
            c22500x8bcca9d0.getImageMatrix().postRotate(90.0f, fArr[0], fArr[1]);
            c22500x8bcca9d0.setImageBitmap(c22500x8bcca9d0.f291545e);
            c22500x8bcca9d0.invalidate();
            c22500x8bcca9d0.f291563z++;
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/CropImageNewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
