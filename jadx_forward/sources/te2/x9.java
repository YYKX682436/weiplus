package te2;

/* loaded from: classes8.dex */
public final class x9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.y9 f500066d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(te2.y9 y9Var) {
        super(1);
        this.f500066d = y9Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25;
        int intValue = ((java.lang.Number) obj).intValue();
        te2.lc lcVar = this.f500066d.f499686h;
        te2.fa faVar = lcVar instanceof te2.fa ? (te2.fa) lcVar : null;
        if (faVar != null && (c22849x81a93d25 = faVar.f499554t) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c22849x81a93d25, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongPresenter$setupAdapter$1$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
            c22849x81a93d25.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorMusicSingSongPresenter$setupAdapter$1$2", "invoke", "(I)V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
