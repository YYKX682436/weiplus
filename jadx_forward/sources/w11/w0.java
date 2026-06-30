package w11;

/* loaded from: classes12.dex */
public class w0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.y0 f523692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.z0 f523693e;

    public w0(w11.z0 z0Var, w11.y0 y0Var) {
        this.f523693e = z0Var;
        this.f523692d = y0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        this.f523693e.f523728t = true;
        jx3.f.INSTANCE.mo68477x336bdfd8(99L, 231L, 1L, false);
        this.f523693e.mo804x5f9cdc6f(-1, 0, 0, "", this.f523692d, null);
        return false;
    }
}
