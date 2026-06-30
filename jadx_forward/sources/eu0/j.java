package eu0;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f338249d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gu0.k2 k2Var) {
        super(1);
        this.f338249d = k2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gu0.k2 k2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        gu0.k2 k2Var2 = this.f338249d;
        boolean z17 = false;
        if (k2Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "onMusicPanelClose");
            k2Var2.f357267j = false;
        }
        if (!booleanValue) {
            gu0.k2 k2Var3 = this.f338249d;
            if (k2Var3 != null && k2Var3.f357266i) {
                z17 = true;
            }
            if (!z17 && (k2Var = this.f338249d) != null) {
                k2Var.t();
            }
        }
        return jz5.f0.f384359a;
    }
}
