package as3;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f95029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f95030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 f95031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.Integer num, java.lang.Integer num2, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141) {
        super(0);
        this.f95029d = num;
        this.f95030e = num2;
        this.f95031f = c16911xd5774141;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Integer num = this.f95029d;
        if (num != null) {
            if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f95030e, num) && num.intValue() > 0)) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141 = this.f95031f;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c16911xd5774141.f236166g;
                if (c22699x3dcdb352 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
                    throw null;
                }
                android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                android.content.Context context = c16911xd5774141.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                layoutParams2.leftMargin = (intValue / 4) + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context, 11);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c16911xd5774141.f236166g;
                if (c22699x3dcdb3522 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
                    throw null;
                }
                c22699x3dcdb3522.setLayoutParams(layoutParams2);
            }
        }
        return jz5.f0.f384359a;
    }
}
