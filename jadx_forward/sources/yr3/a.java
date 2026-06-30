package yr3;

/* loaded from: classes11.dex */
public abstract class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.i f546248d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.l5 f546249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View itemView, wr3.i outAdapter, r45.l5 baseInfo) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        this.f546248d = outAdapter;
        this.f546249e = baseInfo;
        m8206x3c5056b8(false);
    }

    public abstract void i(yr3.c cVar, int i17, wr3.n0 n0Var, boolean z17, int i18);
}
