package x14;

/* loaded from: classes15.dex */
public final class x implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 f533002d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364) {
        this.f533002d = c17503x53f0d364;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        java.lang.String string;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2059x373aa5.C17503x53f0d364 c17503x53f0d364 = this.f533002d;
        android.widget.TextView textView = c17503x53f0d364.f243195i;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mItemStatusTextView");
            throw null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = c17503x53f0d364.f243196m;
        if (o4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mmkv");
            throw null;
        }
        if (o4Var.getBoolean(c17503x53f0d364.m69093x377efd36(), c17503x53f0d364.a(c17503x53f0d364.m69095xcf667dc5(), c17503x53f0d364.m69093x377efd36()))) {
            string = "";
        } else {
            android.content.Context context = c17503x53f0d364.f243191e;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                throw null;
            }
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ivr);
        }
        textView.setText(string);
    }
}
