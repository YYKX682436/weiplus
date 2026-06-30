package gp4;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f355932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ju3.d0 d0Var) {
        super(1);
        this.f355932d = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wu3.h it = (wu3.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        r45.is m174465xb0c3d723 = it.m174465xb0c3d723();
        if (m174465xb0c3d723 != null) {
            it.setVisibility(4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_1_BYTEARRAY", m174465xb0c3d723.mo14344x5f01b1f6());
            this.f355932d.w(ju3.c0.f383437t2, bundle);
        }
        return jz5.f0.f384359a;
    }
}
