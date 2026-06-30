package bw2;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, int i18) {
        super(1);
        this.f106418d = i17;
        this.f106419e = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map linkedHashMap;
        java.util.Map map;
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.vmu);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(tag)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
            linkedHashMap = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(tag);
        } else {
            linkedHashMap = new java.util.LinkedHashMap();
            view.setTag(com.p314xaae8f345.mm.R.id.vmu, linkedHashMap);
        }
        int i17 = this.f106418d;
        java.lang.Object obj2 = linkedHashMap.get(java.lang.Integer.valueOf(i17));
        bw2.t tVar = obj2 instanceof bw2.t ? (bw2.t) obj2 : null;
        if (tVar == null) {
            tVar = new bw2.t(this.f106419e, i17, view);
            java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.vmu);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.m0.h(tag2)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Int, com.tencent.mm.plugin.finder.utils.ViewStubHelper<out android.view.View>>");
                map = p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(tag2);
            } else {
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                view.setTag(com.p314xaae8f345.mm.R.id.vmu, linkedHashMap2);
                map = linkedHashMap2;
            }
            map.put(java.lang.Integer.valueOf(i17), tVar);
        }
        return tVar;
    }
}
