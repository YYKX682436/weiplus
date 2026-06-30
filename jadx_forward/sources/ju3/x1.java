package ju3;

/* loaded from: classes10.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e f383572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e) {
        super(1);
        this.f383572d = c17025x1dde6f4e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17025x1dde6f4e c17025x1dde6f4e = this.f383572d;
        if (booleanValue) {
            ((android.widget.Switch) c17025x1dde6f4e.findViewById(com.p314xaae8f345.mm.R.id.gxj)).setChecked(true);
            ((android.widget.Switch) c17025x1dde6f4e.findViewById(com.p314xaae8f345.mm.R.id.f565581cu1)).setChecked(false);
        } else {
            ((android.widget.Switch) c17025x1dde6f4e.findViewById(com.p314xaae8f345.mm.R.id.gxj)).setChecked(false);
            ((android.widget.Switch) c17025x1dde6f4e.findViewById(com.p314xaae8f345.mm.R.id.f565581cu1)).setChecked(true);
        }
        return jz5.f0.f384359a;
    }
}
