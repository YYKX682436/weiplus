package i53;

/* loaded from: classes.dex */
public class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 f370208d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 activityC15909x288b5949) {
        this.f370208d = activityC15909x288b5949;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GamePublishGalleryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8767, 0, 2, 87, nj0.a.c(new java.util.HashMap()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 activityC15909x288b5949 = this.f370208d;
        activityC15909x288b5949.setResult(0);
        activityC15909x288b5949.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
