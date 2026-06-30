package im2;

/* loaded from: classes2.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h01 f374121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r45.h01 h01Var, im2.z3 z3Var) {
        super(0);
        this.f374121d = h01Var;
        this.f374122e = z3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = new android.content.Intent();
        r45.h32 h32Var = (r45.h32) this.f374121d.m75936x14adae67(2);
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_INFO", h32Var != null ? h32Var.mo14344x5f01b1f6() : null);
        im2.z3 z3Var = this.f374122e;
        z3Var.m158354x19263085().setResult(-1, intent);
        z3Var.m158354x19263085().finish();
        z3Var.m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        return jz5.f0.f384359a;
    }
}
