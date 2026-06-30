package i53;

/* loaded from: classes8.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 f370188d;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 activityC15909x288b5949) {
        this.f370188d = activityC15909x288b5949;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GamePublishGalleryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15909x288b5949 activityC15909x288b5949 = this.f370188d;
        activityC15909x288b5949.f221589e.setSelected(true);
        activityC15909x288b5949.f221588d.setSelected(false);
        activityC15909x288b5949.U6(1, false);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
