package id2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.l f372139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(id2.l lVar) {
        super(6);
        this.f372139d = lVar;
    }

    @Override // yz5.t
    public java.lang.Object J(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        android.app.Activity context = (android.app.Activity) obj;
        android.content.Intent intent = (android.content.Intent) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        android.content.DialogInterface.OnClickListener onClickListener = (android.content.DialogInterface.OnClickListener) obj4;
        android.content.DialogInterface.OnClickListener onClickListener2 = (android.content.DialogInterface.OnClickListener) obj5;
        android.content.DialogInterface.OnDismissListener onDismissListener = (android.content.DialogInterface.OnDismissListener) obj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        id2.m mVar = id2.m.f372195a;
        mVar.c("154");
        mVar.e("room_live_start_create_finder", "154");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("tag_live_core").getBoolean("anchor_verify", false);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkd) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dke);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context);
        z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569941sh);
        id2.l lVar = this.f372139d;
        android.widget.TextView textView = (android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f565512cm3);
        android.widget.TextView textView2 = (android.widget.TextView) z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.f565511cm2);
        android.view.View findViewById = z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        android.view.View findViewById2 = z2Var.f293591g.findViewById(com.p314xaae8f345.mm.R.id.khs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        com.p314xaae8f345.mm.ui.fk.a(textView2);
        textView.setText(string);
        textView2.setText(string2);
        findViewById.setOnClickListener(new id2.f(onClickListener2, z2Var));
        findViewById2.setOnClickListener(new id2.g(intent, lVar, context, intValue, onClickListener, z2Var));
        z2Var.l(new id2.h(onDismissListener));
        z2Var.C();
        return jz5.f0.f384359a;
    }
}
