package g72;

/* loaded from: classes.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350768d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4) {
        this.f350768d = activityC13520x8c9585b4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4 = this.f350768d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "check_alive_type is %s", java.lang.Integer.valueOf(activityC13520x8c9585b4.f181598w));
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.a(activityC13520x8c9585b4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectConfirmUI", "no camera permission. request permission");
            yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i18 = activityC13520x8c9585b4.f181598w;
        if (i18 == 0 || i18 == 2) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            java.lang.String string = activityC13520x8c9585b4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c6h);
            sb0.f fVar = (sb0.f) jVar;
            fVar.getClass();
            boolean d17 = j35.u.d(activityC13520x8c9585b4, "android.permission.RECORD_AUDIO", true);
            if (d17) {
                i17 = 1;
            } else {
                i17 = 1;
                j35.u.k(activityC13520x8c9585b4, 80, new sb0.e(fVar, activityC13520x8c9585b4), new java.lang.String[]{"android.permission.RECORD_AUDIO"}, "", "", string, null);
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(d17);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceUtils", "summerper checkPermission checkAudio[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), activityC13520x8c9585b4);
            if (!d17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectConfirmUI", "no audio permission. request permission");
                yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        } else {
            i17 = 1;
        }
        android.os.Bundle extras = activityC13520x8c9585b4.getIntent().getExtras();
        if (extras != null) {
            extras.putInt("check_alive_type", activityC13520x8c9585b4.f181598w);
            extras.putString("appId", activityC13520x8c9585b4.f181593r);
            extras.putString("feedbackUrl", activityC13520x8c9585b4.f181590o);
            extras.putString("business_tips", activityC13520x8c9585b4.f181599x);
            extras.putString("business_tips_color", activityC13520x8c9585b4.f181600y);
            extras.putFloat("mLight_threshold", activityC13520x8c9585b4.f181592q);
            extras.putLong("confirm_page_timestamp", activityC13520x8c9585b4.I);
            float f17 = activityC13520x8c9585b4.H;
            double d18 = f17;
            if (d18 >= 0.2d && d18 <= 0.9d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6.f218789q = f17 / 2.0f;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "carson check_alive_type_response is " + activityC13520x8c9585b4.f181598w);
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547.X6(activityC13520x8c9585b4, extras, i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectConfirmUI", "extras is null when start FaceDetectPrepareUI");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
