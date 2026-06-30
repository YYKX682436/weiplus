package bw2;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, int i18) {
        super(1);
        this.f106399d = i17;
        this.f106400e = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map map;
        java.util.Map map2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        java.lang.Object tag = itemView.getTag(com.p314xaae8f345.mm.R.id.vmu);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(tag)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
            map = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(tag);
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            itemView.setTag(com.p314xaae8f345.mm.R.id.vmu, linkedHashMap);
            map = linkedHashMap;
        }
        int i17 = this.f106399d;
        java.lang.Object obj2 = map.get(java.lang.Integer.valueOf(i17));
        bw2.t tVar = obj2 instanceof bw2.t ? (bw2.t) obj2 : null;
        if (tVar == null) {
            android.view.View itemView2 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            tVar = new bw2.t(this.f106400e, i17, itemView2);
            android.view.View itemView3 = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView3, "itemView");
            java.lang.Object tag2 = itemView3.getTag(com.p314xaae8f345.mm.R.id.vmu);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(tag2)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
                map2 = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(tag2);
            } else {
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                itemView3.setTag(com.p314xaae8f345.mm.R.id.vmu, linkedHashMap2);
                map2 = linkedHashMap2;
            }
            map2.put(java.lang.Integer.valueOf(i17), tVar);
        }
        return tVar;
    }
}
