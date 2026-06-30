package w11;

/* loaded from: classes12.dex */
public class c0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o45.yh f523520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.g0 f523521e;

    public c0(w11.g0 g0Var, o45.yh yhVar) {
        this.f523521e = g0Var;
        this.f523520d = yhVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        this.f523521e.f523568n = true;
        this.f523521e.mo804x5f9cdc6f(-1, 0, 0, "", new w11.e0(this.f523520d), null);
        return false;
    }
}
