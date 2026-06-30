package w11;

/* loaded from: classes12.dex */
public class v0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.yh f523687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.z0 f523688e;

    public v0(w11.z0 z0Var, o45.yh yhVar) {
        this.f523688e = z0Var;
        this.f523687d = yhVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        this.f523688e.f523728t = true;
        w11.y0 y0Var = new w11.y0(this.f523687d);
        jx3.f.INSTANCE.mo68477x336bdfd8(99L, 230L, 1L, false);
        this.f523688e.mo804x5f9cdc6f(-1, 0, 0, "", y0Var, null);
        return false;
    }
}
