package ml5;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22680xdd4da1e8 f409961e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22680xdd4da1e8 c22680xdd4da1e8) {
        super(0);
        this.f409960d = str;
        this.f409961e = c22680xdd4da1e8;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(this.f409960d, null);
        if (J2 != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22680xdd4da1e8 c22680xdd4da1e8 = this.f409961e;
            c22680xdd4da1e8.post(new ml5.h0(c22680xdd4da1e8, J2));
        }
        return jz5.f0.f384359a;
    }
}
