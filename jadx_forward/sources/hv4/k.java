package hv4;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f366839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ck6 f366840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hv4.l lVar, r45.ck6 ck6Var) {
        super(0);
        this.f366839d = lVar;
        this.f366840e = ck6Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hv4.l lVar = this.f366839d;
        android.view.View view = lVar.f366844i;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
            r45.ck6 ck6Var = this.f366840e;
            textView.setText(ck6Var.f453160i);
            view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2).animate().rotation(90.0f).setDuration(200L).start();
            hv4.o oVar = lVar.f366847o;
            if (oVar == null) {
                lVar.f366847o = new hv4.o(lVar, ck6Var, lVar.f366842g, view);
            } else {
                oVar.f366860e = ck6Var;
            }
            lVar.f366845m = true;
            hv4.o oVar2 = lVar.f366847o;
            if (oVar2 != null) {
                oVar2.r1(ck6Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
