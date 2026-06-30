package te2;

/* loaded from: classes10.dex */
public final class h9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f499597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(r45.z22 z22Var) {
        super(1);
        this.f499597d = z22Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        r45.z22 z22Var = this.f499597d;
        java.lang.String str = z22Var.f473160d;
        if (str != null) {
            bundle.putString("PARAM_FINDER_LIVE_SING_SONG_MID", str);
        }
        bundle.putBoolean("PARAM_FINDER_LIVE_SING_SONG_ONLY_SEGMENT", z22Var.f473161e);
        java.lang.String str2 = z22Var.f473162f;
        if (str2 != null) {
            bundle.putString("PARAM_FINDER_LIVE_SING_SONG_UNIQUE_ADD_ID", str2);
        }
        return jz5.f0.f384359a;
    }
}
