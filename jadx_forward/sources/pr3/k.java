package pr3;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16865xbd41bc48 f439511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16865xbd41bc48 c16865xbd41bc48) {
        super(1);
        this.f439511d = c16865xbd41bc48;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context ctx = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        android.view.View inflate = android.view.LayoutInflater.from(ctx).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.elx, (android.view.ViewGroup) this.f439511d.f235317o, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMRoundCornerImageView");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) inflate;
    }
}
