package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class og extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18675x35ba4862 f255688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18675x35ba4862 activityC18675x35ba4862) {
        super(0);
        this.f255688d = activityC18675x35ba4862;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bi4.d1 d1Var = new bi4.d1();
        byte[] byteArrayExtra = this.f255688d.getIntent().getByteArrayExtra("SET_TEXT_PARAMS");
        if (byteArrayExtra != null) {
            d1Var.mo11468x92b714fd(byteArrayExtra);
        }
        return d1Var;
    }
}
