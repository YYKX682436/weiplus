package pk2;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.f f437066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View view, pk2.f fVar) {
        super(1);
        this.f437065d = view;
        this.f437066e = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.view.View findViewById = this.f437065d.findViewById(com.p314xaae8f345.mm.R.id.f567027u92);
        if (findViewById != null) {
            int i17 = booleanValue ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption$addItem$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorAiAssistantOption$addItem$1", "invoke", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        pk2.f fVar = this.f437066e;
        if (booleanValue) {
            df2.zb zbVar = (df2.zb) fVar.f445960a.e(df2.zb.class);
            if (zbVar != null) {
                zbVar.e7();
            }
        } else {
            df2.zb zbVar2 = (df2.zb) fVar.f445960a.e(df2.zb.class);
            if (zbVar2 != null) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(zbVar2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new df2.z9(zbVar2, null), 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
