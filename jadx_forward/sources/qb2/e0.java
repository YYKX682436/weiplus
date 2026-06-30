package qb2;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f442729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.g0 f442730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qb2.t f442731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442732g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f442733h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z17, qb2.g0 g0Var, qb2.t tVar, java.lang.String str, android.view.View view) {
        super(0);
        this.f442729d = z17;
        this.f442730e = g0Var;
        this.f442731f = tVar;
        this.f442732g = str;
        this.f442733h = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_finder_disable_sendmsg_need_follow", this.f442729d);
        qb2.g0 g0Var = this.f442730e;
        wn.u uVar = g0Var.f442744a.f146271u;
        if (uVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("readyChattingUIC");
            throw null;
        }
        wn.t tVar = uVar.f528913d;
        if (tVar != null) {
            qb2.t tVar2 = this.f442731f;
            ((rb5.l) tVar).l(tVar2.f65866xbed8694c, this.f442732g, bundle, new qb2.d0(tVar2, this.f442733h, g0Var));
        }
        return jz5.f0.f384359a;
    }
}
