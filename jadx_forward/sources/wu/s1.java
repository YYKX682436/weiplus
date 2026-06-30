package wu;

/* loaded from: classes9.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu.b f531155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f531156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(hu.b bVar, android.widget.FrameLayout frameLayout) {
        super(1);
        this.f531155d = bVar;
        this.f531156e = frameLayout;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String k17;
        s15.f n17;
        s15.f n18;
        java.lang.String m163591xfb821870;
        a11.c it = (a11.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = it.f82037a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailUrlItemConvert$onBindContainerView$2", "invoke", "(Lcom/tencent/mm/modelchatting/basiswidget/SourceViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hu.b bVar = this.f531155d;
        s15.h hVar = bVar.f366530e;
        int m75939xb282bd08 = hVar.m75939xb282bd08(hVar.f384955d + 2);
        te5.t tVar = te5.t.f500282a;
        s15.h hVar2 = bVar.f366530e;
        android.widget.FrameLayout frameLayout = this.f531156e;
        if (m75939xb282bd08 == 5) {
            i95.m c17 = i95.n0.c(ct.r2.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = frameLayout.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            z01.i iVar = new z01.i();
            java.lang.String m163587xfb821870 = hVar2.m163587xfb821870();
            java.lang.String str = null;
            if (!java.lang.Boolean.valueOf(!r26.n0.N(m163587xfb821870)).booleanValue()) {
                m163587xfb821870 = null;
            }
            if (m163587xfb821870 == null) {
                s15.h0 d07 = hVar2.d0();
                if (d07 != null && (m163591xfb821870 = d07.m163591xfb821870()) != null && java.lang.Boolean.valueOf(!r26.n0.N(m163591xfb821870)).booleanValue()) {
                    str = m163591xfb821870;
                }
                m163587xfb821870 = str == null ? hVar2.U() : str;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m163587xfb821870, "<set-?>");
            iVar.f550584a = m163587xfb821870;
            s15.h0 d08 = hVar2.d0();
            iVar.f550585b = (d08 == null || (n18 = d08.n()) == null) ? -1 : n18.j();
            s15.h0 d09 = hVar2.d0();
            if (d09 == null || (n17 = d09.n()) == null || (k17 = n17.l()) == null) {
                k17 = hVar2.k();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(k17, "<set-?>");
            iVar.f550586c = k17;
            tVar.m(context, it, iVar);
        }
        i95.m c18 = i95.n0.c(ct.r2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        android.content.Context context2 = frameLayout.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        z01.e eVar = new z01.e();
        java.lang.String m163586x74292566 = hVar2.m163586x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m163586x74292566, "<set-?>");
        eVar.f550528a = m163586x74292566;
        eVar.f550531d = i65.a.h(frameLayout.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
        tVar.l(context2, it, eVar);
        return jz5.f0.f384359a;
    }
}
