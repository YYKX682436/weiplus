package bg2;

/* loaded from: classes3.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f20632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f20634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f20635g;

    public x1(bg2.d2 d2Var, android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.qt2 qt2Var) {
        this.f20632d = d2Var;
        this.f20633e = context;
        this.f20634f = finderObject;
        this.f20635g = qt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.d2 d2Var = this.f20632d;
        d2Var.Z6(this.f20633e, this.f20634f, this.f20635g, true, d2Var.f20026y).l();
    }
}
