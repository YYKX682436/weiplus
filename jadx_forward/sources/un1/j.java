package un1;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un1.l f510977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f510978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(un1.l lVar, qo1.f0 f0Var) {
        super(0);
        this.f510977d = lVar;
        this.f510978e = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 c17;
        un1.l lVar = this.f510977d;
        if (lVar.f484377i) {
            qo1.f0 f0Var = this.f510978e;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = f0Var.f447012e;
            java.lang.String b17 = (a2Var == null || (c17 = a2Var.c()) == null) ? "" : fo1.r.b(c17);
            if (f0Var instanceof qo1.c1) {
                android.widget.TextView textView = lVar.f510984n;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                    throw null;
                }
                textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.of9, b17));
            } else {
                android.widget.TextView textView2 = lVar.f510984n;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                    throw null;
                }
                textView2.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.of8, b17));
            }
        }
        return jz5.f0.f384359a;
    }
}
