package as3;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView f13509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f13510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView bizProfileFollowMoreView, java.lang.String str) {
        super(0);
        this.f13509d = bizProfileFollowMoreView;
        this.f13510e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = this.f13509d.f154632f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("moreTv");
            throw null;
        }
        java.lang.String str = this.f13510e;
        textView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        return jz5.f0.f302826a;
    }
}
