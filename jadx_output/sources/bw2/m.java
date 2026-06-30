package bw2;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, int i18) {
        super(1);
        this.f24866d = i17;
        this.f24867e = i18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map map;
        java.util.Map map2;
        androidx.recyclerview.widget.k3 holder = (androidx.recyclerview.widget.k3) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.lang.Object tag = itemView.getTag(com.tencent.mm.R.id.vmu);
        if (kotlin.jvm.internal.m0.h(tag)) {
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
            map = kotlin.jvm.internal.m0.c(tag);
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            itemView.setTag(com.tencent.mm.R.id.vmu, linkedHashMap);
            map = linkedHashMap;
        }
        int i17 = this.f24866d;
        java.lang.Object obj2 = map.get(java.lang.Integer.valueOf(i17));
        bw2.t tVar = obj2 instanceof bw2.t ? (bw2.t) obj2 : null;
        if (tVar == null) {
            android.view.View itemView2 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            tVar = new bw2.t(this.f24867e, i17, itemView2);
            android.view.View itemView3 = holder.itemView;
            kotlin.jvm.internal.o.f(itemView3, "itemView");
            java.lang.Object tag2 = itemView3.getTag(com.tencent.mm.R.id.vmu);
            if (kotlin.jvm.internal.m0.h(tag2)) {
                kotlin.jvm.internal.o.e(tag2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
                map2 = kotlin.jvm.internal.m0.c(tag2);
            } else {
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                itemView3.setTag(com.tencent.mm.R.id.vmu, linkedHashMap2);
                map2 = linkedHashMap2;
            }
            map2.put(java.lang.Integer.valueOf(i17), tVar);
        }
        return tVar;
    }
}
