package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988) {
        super(1);
        this.f92196d = c1059xa8272988;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17 = ((l1.a) obj).f396502a;
        boolean z17 = false;
        boolean z18 = i17 == 1;
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988 = this.f92196d;
        if (z18) {
            z17 = c1059xa8272988.isInTouchMode();
        } else {
            if (i17 == 2) {
                z17 = c1059xa8272988.isInTouchMode() ? c1059xa8272988.requestFocusFromTouch() : true;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
