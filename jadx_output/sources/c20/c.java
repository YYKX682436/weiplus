package c20;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t10.d f37980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t10.d dVar) {
        super(1);
        this.f37980d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String imgUrl;
        com.tencent.pigeon.live_multiplatform.SelectPendingProductResult result = (com.tencent.pigeon.live_multiplatform.SelectPendingProductResult) obj;
        t10.d dVar = this.f37980d;
        kotlin.jvm.internal.o.g(result, "result");
        if (result.getAction() == com.tencent.pigeon.live_multiplatform.SelectPendingProductAction.NONE) {
            rk0.c.c("ECS_O.NativeHandler.SelectPendingProduct", "do nothing", new java.lang.Object[0]);
        } else {
            java.util.List<com.tencent.pigeon.live_multiplatform.SelectPendingProductItem> selectedProductsData = result.getSelectedProductsData();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(selectedProductsData, 10));
            for (com.tencent.pigeon.live_multiplatform.SelectPendingProductItem selectPendingProductItem : selectedProductsData) {
                jz5.l[] lVarArr = new jz5.l[2];
                java.lang.String str2 = "";
                if (selectPendingProductItem == null || (str = selectPendingProductItem.getProductId()) == null) {
                    str = "";
                }
                lVarArr[0] = new jz5.l("productId", str);
                if (selectPendingProductItem != null && (imgUrl = selectPendingProductItem.getImgUrl()) != null) {
                    str2 = imgUrl;
                }
                lVarArr[1] = new jz5.l("imgUrl", str2);
                arrayList.add(kz5.c1.k(lVarArr));
            }
            try {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new org.json.JSONObject((java.util.Map) it.next()));
                }
                java.lang.String jSONArray = new org.json.JSONArray((java.util.Collection) arrayList2).toString();
                kotlin.jvm.internal.o.d(jSONArray);
                dVar.getClass();
                bw5.n8 a17 = dVar.a(bw5.o8.EcsOpenRespRet_Success);
                a17.f30541h = jSONArray;
                a17.f30544n[5] = true;
                dVar.b(a17);
            } catch (org.json.JSONException e17) {
                dVar.c("encode fail: " + e17.getLocalizedMessage());
            }
        }
        return jz5.f0.f302826a;
    }
}
