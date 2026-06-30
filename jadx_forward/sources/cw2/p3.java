package cw2;

/* loaded from: classes8.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f305442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b f305443e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b) {
        super(0);
        this.f305442d = z17;
        this.f305443e = c15182x1607686b;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f305442d;
        float f17 = !z17 ? 1.0f : 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = this.f305443e;
        android.widget.ImageView imageView = c15182x1607686b.f212141o;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.a(imageView != null ? java.lang.Float.valueOf(imageView.getAlpha()) : null, f17)) {
            c15182x1607686b.Y("set coverImage alpha:" + f17);
            android.widget.ImageView imageView2 = c15182x1607686b.f212141o;
            if (imageView2 != null) {
                imageView2.setAlpha(f17);
            }
        }
        c15182x1607686b.e0(z17);
        return jz5.f0.f384359a;
    }
}
