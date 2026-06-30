package db5;

/* loaded from: classes5.dex */
public final class t3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222 f310050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222 c21504xe1a6f222) {
        super(0);
        this.f310050d = c21504xe1a6f222;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21504xe1a6f222 c21504xe1a6f222 = this.f310050d;
        android.view.View findViewById = c21504xe1a6f222.findViewById(com.p314xaae8f345.mm.R.id.utc);
        findViewById.setOnClickListener(new db5.s3(c21504xe1a6f222));
        return findViewById;
    }
}
