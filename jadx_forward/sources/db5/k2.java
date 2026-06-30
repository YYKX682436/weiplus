package db5;

/* loaded from: classes5.dex */
public class k2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f309952d;

    public k2(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905) {
        this.f309952d = c21493x36e72905;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905 = this.f309952d;
        c21493x36e72905.f278914p--;
        c21493x36e72905.f278907f.setText(c21493x36e72905.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gwu, java.lang.Integer.valueOf(c21493x36e72905.f278914p)));
        if (c21493x36e72905.f278914p != 0) {
            return true;
        }
        c21493x36e72905.f278915q.d();
        c21493x36e72905.f278914p = c21493x36e72905.f278913o;
        c21493x36e72905.f278908g.setVisibility(0);
        c21493x36e72905.f278907f.setVisibility(8);
        return true;
    }
}
