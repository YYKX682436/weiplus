package do2;

/* loaded from: classes15.dex */
public final class k extends ol5.e implements android.view.View.OnClickListener {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ol5.d[] dVarArr = {ol5.d.TOP};
        ol5.d dVar = dVarArr[0];
        if (dVar != null) {
            this.f427757h = dVar;
        } else {
            this.f427758i = dVarArr;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.C22696x87b656f6 c22696x87b656f6 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2759xbdc636c.C22696x87b656f6(context, null);
        c22696x87b656f6.m81981x9d1d3c75(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560026e));
        c22696x87b656f6.m81983x1f5a01c0(i65.a.b(context, 4));
        c22696x87b656f6.m81989x117a3461(0);
        c22696x87b656f6.m81987x9ea7f425(i65.a.b(context, 0));
        c22696x87b656f6.m81985x235d4067(i65.a.b(context, 0));
        this.f427753d = c22696x87b656f6;
        setCanceledOnTouchOutside(false);
        if (getWindow() != null) {
            getWindow().clearFlags(2);
        }
        this.f427754e = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dmq, (android.view.ViewGroup) null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoProgressRemindDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/megavideo/ui/FinderMegaVideoProgressRemindDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
