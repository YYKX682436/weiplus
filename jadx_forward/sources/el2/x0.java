package el2;

/* loaded from: classes3.dex */
public final class x0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335474d;

    public x0(el2.i1 i1Var) {
        this.f335474d = i1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        jz5.l lVar = (jz5.l) obj;
        android.os.Bundle bundle = (android.os.Bundle) lVar.f384367e;
        boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_GIFT_SEND_BY_OUTER", false) : false;
        el2.i1 i1Var = this.f335474d;
        if (!z17) {
            i1Var.f335354p = false;
            i1Var.f335355q = false;
            i1Var.o(false);
            return;
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        i1Var.f335354p = booleanValue;
        if (booleanValue) {
            return;
        }
        i1Var.f335355q = false;
        i1Var.o(true);
        android.os.Bundle bundle2 = (android.os.Bundle) lVar.f384367e;
        if (bundle2 == null || (str = bundle2.getString("PARAM_FINDER_LIVE_GIFT_ID")) == null) {
            str = "";
        }
        i1Var.p(22, str, bundle2 != null ? bundle2.getInt("PARAM_FINDER_LIVE_GIFT_SEND_TOTAL_CNT", -1) : -1);
    }
}
