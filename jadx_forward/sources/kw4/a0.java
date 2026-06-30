package kw4;

/* loaded from: classes8.dex */
public class a0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394676h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f394677i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17) {
        super(j17, bool);
        this.f394677i = c0Var;
        this.f394676h = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        kw4.c0 c0Var = this.f394677i;
        int i17 = c0Var.f394691d;
        int i18 = this.f394676h;
        boolean z17 = false;
        if (i18 == i17 && c0Var.e(i18) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) c0Var.f394696i).J9();
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
