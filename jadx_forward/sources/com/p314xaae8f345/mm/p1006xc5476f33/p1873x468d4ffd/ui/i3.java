package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230879d;

    public i3(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230879d = activityC16554x70dcab5d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230879d;
        int i17 = activityC16554x70dcab5d.f230764g;
        if (i17 == 3) {
            activityC16554x70dcab5d.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "[gotoPhotoEditUI]");
            if (activityC16554x70dcab5d.f230768m == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightCaptureUI", "mediaRecorder == NULL");
            } else {
                java.lang.String stringExtra = activityC16554x70dcab5d.getIntent().getStringExtra("GalleryUI_FromUser");
                java.lang.String stringExtra2 = activityC16554x70dcab5d.getIntent().getStringExtra("GalleryUI_ToUser");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("GalleryUI_FromUser", stringExtra);
                intent.putExtra("GalleryUI_ToUser", stringExtra2);
                int i18 = activityC16554x70dcab5d.V.f230358o;
                if (i18 == 1) {
                    intent.putExtra("from_scene", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a0.f33775x366c91de);
                } else if (i18 == 2) {
                    intent.putExtra("from_scene", 289);
                }
                intent.putExtra("raw_photo_path", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16554x70dcab5d.H1) ? activityC16554x70dcab5d.f230768m.q() : activityC16554x70dcab5d.H1);
                intent.putExtra("after_photo_edit", activityC16554x70dcab5d.I1);
                intent.setClassName(activityC16554x70dcab5d, "com.tencent.mm.ui.MMNewPhotoEditUI");
                activityC16554x70dcab5d.startActivityForResult(intent, 4369);
            }
        } else if (i17 == 4) {
            activityC16554x70dcab5d.getClass();
            if (com.p314xaae8f345.mm.ui.bl.f(activityC16554x70dcab5d)) {
                activityC16554x70dcab5d.m78583x85ccfe01(0);
            }
            activityC16554x70dcab5d.I = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16556x73b8f72) activityC16554x70dcab5d.findViewById(com.p314xaae8f345.mm.R.id.p09);
            if (com.p314xaae8f345.mm.ui.bl.f(activityC16554x70dcab5d)) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC16554x70dcab5d.I.getLayoutParams();
                marginLayoutParams.bottomMargin = java.lang.Math.max(com.p314xaae8f345.mm.ui.bl.c(activityC16554x70dcab5d), com.p314xaae8f345.mm.ui.bl.g(activityC16554x70dcab5d));
                activityC16554x70dcab5d.I.setLayoutParams(marginLayoutParams);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.a2();
            activityC16554x70dcab5d.K = a2Var;
            a2Var.f230821x = 2;
            a2Var.f230817t = true;
            a2Var.d(activityC16554x70dcab5d, activityC16554x70dcab5d.V.f230358o, activityC16554x70dcab5d.f230768m.mo127744x5000ed37(), activityC16554x70dcab5d.I, activityC16554x70dcab5d.H, activityC16554x70dcab5d.f230778u, activityC16554x70dcab5d.f230765h, false);
            activityC16554x70dcab5d.K.f230813p = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z2(activityC16554x70dcab5d);
            activityC16554x70dcab5d.f230771p.setVisibility(8);
            activityC16554x70dcab5d.f230774q.setVisibility(8);
            activityC16554x70dcab5d.f230781x.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/ui/SightCaptureUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
