package as3;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 f95042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95043e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16911xd5774141 c16911xd5774141, java.lang.String str) {
        super(0);
        this.f95042d = c16911xd5774141;
        this.f95043e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView = this.f95042d.f236165f;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("moreTv");
            throw null;
        }
        java.lang.String str = this.f95043e;
        textView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        return jz5.f0.f384359a;
    }
}
