package gc0;

/* loaded from: classes5.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f351800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351801e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.content.Context context, java.lang.String str) {
        super(0);
        this.f351800d = context;
        this.f351801e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context n17 = com.p314xaae8f345.mm.app.w.INSTANCE.n();
        int hashCode = n17 != null ? n17.hashCode() : 0;
        if (hashCode != gc0.y0.f351902e) {
            android.content.Context context = this.f351800d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.n("不再显示");
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(this.f351801e);
            textView.setTextIsSelectable(true);
            textView.setGravity(8388611);
            u1Var.d(textView);
            u1Var.a(true);
            u1Var.b(gc0.r0.f351793a);
            u1Var.q(false);
        }
        gc0.y0.f351902e = hashCode;
        return jz5.f0.f384359a;
    }
}
