package kw4;

/* loaded from: classes8.dex */
public class x extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f394737h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kw4.c0 f394738i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kw4.c0 c0Var, long j17, java.lang.Boolean bool, int i17) {
        super(j17, bool);
        this.f394738i = c0Var;
        this.f394737h = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        boolean z17;
        kw4.c0 c0Var = this.f394738i;
        int i17 = this.f394737h;
        kw4.b0 e17 = c0Var.e(i17);
        if (e17 != null) {
            if (i17 == c0Var.f394691d && c0Var.e(i17) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) c0Var.f394696i).J9();
            }
            java.util.List list = c0Var.f394690c;
            list.removeAll(c0Var.b(e17));
            android.view.ViewGroup c17 = c0Var.c(e17.f394681c);
            if (c17 != null) {
                ((java.util.LinkedList) list).remove(e17);
                c17.removeView((android.view.View) e17.f394679a.get());
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
