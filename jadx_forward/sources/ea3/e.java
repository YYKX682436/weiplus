package ea3;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.n f332142d;

    public e(ea3.n nVar) {
        this.f332142d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566921hj1);
        if (!(tag instanceof java.lang.Integer)) {
            yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = ((java.lang.Integer) tag).intValue();
        ea3.n nVar = this.f332142d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z17 = nVar.z(intValue);
        if (z17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z17.f219963e)) {
            nVar.J(intValue, z17, view);
            yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppAlbumAdapter", "[onClick] null == item!");
            nVar.m8147xed6e4d18(intValue);
            yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
