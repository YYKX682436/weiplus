package ny2;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny2.h f422958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ny2.h hVar) {
        super(1);
        this.f422958d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ny2.h hVar = this.f422958d;
        if (booleanValue) {
            hVar.O6().setBackground(hVar.m158354x19263085().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a0t));
            hVar.O6().setTextColor(hVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            hVar.O6().setEnabled(true);
        } else {
            hVar.O6().setBackground(hVar.m158354x19263085().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a4c));
            hVar.O6().setTextColor(hVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
            hVar.O6().setEnabled(false);
        }
        return jz5.f0.f384359a;
    }
}
