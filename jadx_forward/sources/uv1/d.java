package uv1;

@j95.b
/* loaded from: classes12.dex */
public class d extends i95.w implements lo.k {
    /* JADX WARN: Multi-variable type inference failed */
    public void Ai(android.app.Activity activity, java.lang.String str, int i17, java.lang.String str2, lo.j jVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("scene_from", 11);
        intent.putExtra("Select_Conv_ui_title", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7h));
        intent.putExtra("KChooseMsgFileType", str);
        intent.putExtra("KChooseMsgFileCount", i17);
        intent.putExtra("KChooseMsgFileExtension", str2);
        intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559390df);
        intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        uv1.a aVar = new uv1.a(this, jVar);
        if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).m78545xde66c1f2(aVar);
        } else if (activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).m78750xc5512edd(new uv1.b(this, aVar));
        } else if (activity instanceof q80.z) {
            ((q80.z) activity).R1(new uv1.c(this, aVar));
        }
        j45.l.v(activity, ".ui.transmit.SelectConversationUI", intent, lo.a.f401475a);
    }

    public void wi(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, lo.j jVar, java.util.function.Consumer consumer) {
        if ("file".equals(str2)) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8.f177099q;
            android.content.Intent intent = new android.content.Intent(activityC21401x6ce6f73f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13096xe0b615b8.class);
            intent.putExtra("USERNAME", str);
            intent.putExtra("COUNT", i17);
            intent.putExtra("EXTENSION", str3);
            if (consumer != null) {
                consumer.accept(intent);
            }
            activityC21401x6ce6f73f.m78750xc5512edd(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.f(jVar));
            activityC21401x6ce6f73f.startActivityForResult(intent, lo.a.f401475a);
            return;
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a.f177125y;
        android.content.Intent intent2 = new android.content.Intent(activityC21401x6ce6f73f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a.class);
        intent2.putExtra("USERNAME", str);
        intent2.putExtra("TYPE", str2);
        intent2.putExtra("COUNT", i17);
        intent2.putExtra("EXTENSION", str3);
        if (consumer != null) {
            consumer.accept(intent2);
        }
        activityC21401x6ce6f73f.m78750xc5512edd(new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.q(jVar));
        activityC21401x6ce6f73f.startActivityForResult(intent2, lo.a.f401475a);
    }
}
