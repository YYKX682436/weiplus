package m34;

/* loaded from: classes3.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m34.j f404886e;

    public h(m34.j jVar, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f404886e = jVar;
        this.f404885d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        m34.j jVar = this.f404886e;
        ((android.widget.ImageView) jVar.f404888d.findViewById(com.p314xaae8f345.mm.R.id.f569099p12)).setVisibility(0);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(jVar.f404888d.getContext(), intent, new com.p314xaae8f345.mm.vfs.r6(this.f404885d), "video/*", false);
        try {
            android.content.Context context = jVar.f404888d.getContext();
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, jVar.f404888d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572130zj));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoPopupHelper", "startActivity fail, activity not found");
            db5.e1.i(jVar.f404888d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.h_1, com.p314xaae8f345.mm.R.C30867xcad56011.h_2);
        }
    }
}
