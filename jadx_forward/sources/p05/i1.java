package p05;

/* loaded from: classes5.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f432081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f432082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(int i17, int i18) {
        super(1);
        this.f432081d = i17;
        this.f432082e = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.w87 w87Var = (r45.w87) obj;
        return java.lang.Boolean.valueOf(w87Var.f470504d == this.f432081d && w87Var.f470505e == this.f432082e);
    }
}
