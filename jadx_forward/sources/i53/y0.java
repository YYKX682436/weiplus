package i53;

/* loaded from: classes8.dex */
public class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de f370320d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de) {
        this.f370320d = c15908x78af54de;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameLocalGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.C15908x78af54de c15908x78af54de = this.f370320d;
        java.util.ArrayList arrayList2 = c15908x78af54de.f221579e.f370128e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            if (!abstractC15633xee433078.f219971p.equals("edit") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractC15633xee433078.f219965g)) {
                arrayList3.add(abstractC15633xee433078.f219963e);
            } else {
                arrayList3.add(abstractC15633xee433078.f219965g);
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList3)) {
            c15908x78af54de.getClass();
            i53.t.g(2);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_OutputPath_List", arrayList3);
        ((android.app.Activity) c15908x78af54de.getContext()).setResult(-1, intent);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("content", "1");
        hashMap.put("way", "2");
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 87, 8767, 4, 7, 87, nj0.a.c(hashMap));
        ((android.app.Activity) c15908x78af54de.getContext()).finish();
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
