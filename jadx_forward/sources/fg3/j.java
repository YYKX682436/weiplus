package fg3;

/* loaded from: classes12.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.o f343968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fg3.o oVar) {
        super(2);
        this.f343968d = oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        fg3.o oVar = this.f343968d;
        if (str == null || str2 == null) {
            oVar.a0().a().setVisibility(8);
        } else {
            oVar.a0().a().setVisibility(0);
            em.s1 a07 = oVar.a0();
            if (a07.f336310f == null) {
                a07.f336310f = (android.widget.TextView) a07.f336305a.findViewById(com.p314xaae8f345.mm.R.id.vht);
            }
            a07.f336310f.setText(str);
            em.s1 a08 = oVar.a0();
            if (a08.f336307c == null) {
                a08.f336307c = (android.widget.TextView) a08.f336305a.findViewById(com.p314xaae8f345.mm.R.id.vhu);
            }
            a08.f336307c.setText(str2);
        }
        return jz5.f0.f384359a;
    }
}
