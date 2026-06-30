package ch5;

/* loaded from: classes14.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 f123150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2) {
        super(0);
        this.f123150d = c22419xb3ed8ff2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2 = this.f123150d;
        float f17 = c22419xb3ed8ff2.R;
        if (f17 <= 0.0f) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(c22419xb3ed8ff2);
            if (C0 != null) {
                C0.a(1.0f);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C02 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(c22419xb3ed8ff2);
            if (C02 != null) {
                C02.c(false, false, 0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C03 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(c22419xb3ed8ff2);
            if (C03 != null) {
                C03.b();
            }
            yz5.a aVar = c22419xb3ed8ff2.f290337e.f314153f;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
            ofFloat.setDuration(300L);
            ch5.p pVar = new ch5.p(c22419xb3ed8ff2);
            ch5.o oVar = new ch5.o(c22419xb3ed8ff2, ofFloat, pVar);
            ofFloat.addUpdateListener(pVar);
            ofFloat.addListener(oVar);
            ofFloat.start();
        }
        return jz5.f0.f384359a;
    }
}
