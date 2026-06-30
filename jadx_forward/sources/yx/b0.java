package yx;

/* loaded from: classes3.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f548538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f548539e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xx.y yVar, android.content.Context context) {
        super(1);
        this.f548538d = yVar;
        this.f548539e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.setOnClickListener(new yx.a0(this.f548539e));
        xx.y yVar = this.f548538d;
        if (yVar != null) {
            yVar.j(it);
        }
        return jz5.f0.f384359a;
    }
}
