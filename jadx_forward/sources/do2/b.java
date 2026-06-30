package do2;

/* loaded from: classes15.dex */
public final class b extends ol5.e {

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f323609r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClickListener, "onClickListener");
        this.f323609r = onClickListener;
        ol5.d[] dVarArr = {ol5.d.BOTTOM};
        ol5.d dVar = dVarArr[0];
        if (dVar != null) {
            this.f427757h = dVar;
        } else {
            this.f427758i = dVarArr;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.C22696x87b656f6 c22696x87b656f6 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.C22696x87b656f6(context, null);
        c22696x87b656f6.m81981x9d1d3c75(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560033k));
        c22696x87b656f6.m81982x62174ca3(0);
        c22696x87b656f6.m81983x1f5a01c0(i65.a.b(context, 8));
        c22696x87b656f6.m81989x117a3461(0);
        c22696x87b656f6.m81987x9ea7f425(i65.a.b(context, 0));
        c22696x87b656f6.m81985x235d4067(i65.a.b(context, 0));
        c22696x87b656f6.setOnClickListener(new do2.a(this));
        this.f427753d = c22696x87b656f6;
        this.f427759m = true;
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        if (getWindow() != null) {
            getWindow().clearFlags(2);
        }
        this.f427754e = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dtp, (android.view.ViewGroup) null);
    }
}
