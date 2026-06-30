package cw2;

/* loaded from: classes2.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f305635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90) {
        super(0);
        this.f305635d = c15178x4303ff90;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = this.f305635d;
        android.view.View findViewById = c15178x4303ff90.m61270xc98fb3b8().findViewById(com.p314xaae8f345.mm.R.id.ggw);
        findViewById.setOnClickListener(new cw2.w1(c15178x4303ff90));
        return findViewById;
    }
}
