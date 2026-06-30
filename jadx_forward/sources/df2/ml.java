package df2;

/* loaded from: classes3.dex */
public final class ml extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f312319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(df2.pl plVar) {
        super(1);
        this.f312319d = plVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.pl plVar = this.f312319d;
        if (booleanValue) {
            android.widget.RelativeLayout relativeLayout = plVar.f312622o;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15222x82447cec c15222x82447cec = plVar.f312633z;
            if (c15222x82447cec != null) {
                c15222x82447cec.setVisibility(0);
            }
            java.lang.Object obj2 = plVar.A.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            plVar.e7((android.widget.TextView) obj2);
            df2.pl.Z6(plVar);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15222x82447cec c15222x82447cec2 = plVar.f312633z;
            if (c15222x82447cec2 != null) {
                c15222x82447cec2.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout2 = plVar.f312622o;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
