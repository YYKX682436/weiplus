package bw2;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, int i18) {
        super(1);
        this.f24885d = i17;
        this.f24886e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map linkedHashMap;
        java.util.Map map;
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.vmu);
        if (kotlin.jvm.internal.m0.h(tag)) {
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
            linkedHashMap = kotlin.jvm.internal.m0.c(tag);
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
            view.setTag(com.tencent.mm.R.id.vmu, linkedHashMap);
        }
        int i17 = this.f24885d;
        java.lang.Object obj2 = linkedHashMap.get(java.lang.Integer.valueOf(i17));
        bw2.t tVar = obj2 instanceof bw2.t ? (bw2.t) obj2 : null;
        if (tVar == null) {
            tVar = new bw2.t(this.f24886e, i17, view);
            java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.vmu);
            if (kotlin.jvm.internal.m0.h(tag2)) {
                kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
                map = kotlin.jvm.internal.m0.c(tag2);
            } else {
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                view.setTag(com.tencent.mm.R.id.vmu, linkedHashMap2);
                map = linkedHashMap2;
            }
            map.put(java.lang.Integer.valueOf(i17), tVar);
        }
        return tVar;
    }
}
