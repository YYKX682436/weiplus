package jw2;

/* loaded from: classes9.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c f383848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c c15207xe9913b6c) {
        super(1);
        this.f383848d = c15207xe9913b6c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15207xe9913b6c c15207xe9913b6c = this.f383848d;
        c15207xe9913b6c.f212326f = intValue;
        yz5.l lVar = c15207xe9913b6c.f212329i;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(intValue));
        }
        c15207xe9913b6c.f212327g.m8146xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1654xc5476f33.p1655x373aa5.C15206x9fc9f265 c15206x9fc9f265 = c15207xe9913b6c.f212328h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c15206x9fc9f265, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$itemClickListener$1", "invoke", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        c15206x9fc9f265.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c15206x9fc9f265, "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$itemClickListener$1", "invoke", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        return jz5.f0.f384359a;
    }
}
