package uw0;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f513147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, uw0.x xVar) {
        super(0);
        this.f513147d = context;
        this.f513148e = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.LayoutInflater b17 = com.p314xaae8f345.mm.ui.id.b(this.f513147d);
        uw0.x xVar = this.f513148e;
        android.view.View inflate = b17.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dve, (android.view.ViewGroup) xVar, false);
        inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, xVar.f513156z1));
        return inflate;
    }
}
