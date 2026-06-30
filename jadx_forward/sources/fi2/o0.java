package fi2;

/* loaded from: classes10.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f344424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f344426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(fi2.x0 x0Var, java.lang.String str, boolean z17) {
        super(0);
        this.f344424d = x0Var;
        this.f344425e = str;
        this.f344426f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fi2.x0 x0Var = this.f344424d;
        int childCount = x0Var.f344462g.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = x0Var.f344462g.getChildAt(i17);
            if (childAt != null && (childAt instanceof wj2.c0)) {
                wj2.c0 c0Var = (wj2.c0) childAt;
                km2.q m174007xdd2aa071 = c0Var.m174007xdd2aa071();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m174007xdd2aa071 != null ? m174007xdd2aa071.f390703a : null, this.f344425e)) {
                    c0Var.d0(this.f344426f);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
