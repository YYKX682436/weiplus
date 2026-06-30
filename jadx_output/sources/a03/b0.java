package a03;

/* loaded from: classes11.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f397g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f398h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f400m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f401n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f402o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(a03.h0 h0Var, java.lang.String str, java.util.Map map, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.content.Context context, java.lang.Class cls, android.os.Bundle bundle, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f395e = h0Var;
        this.f396f = str;
        this.f397g = map;
        this.f398h = finderObject;
        this.f399i = context;
        this.f400m = cls;
        this.f401n = bundle;
        this.f402o = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a03.b0(this.f395e, this.f396f, this.f397g, this.f398h, this.f399i, this.f400m, this.f401n, this.f402o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a03.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
