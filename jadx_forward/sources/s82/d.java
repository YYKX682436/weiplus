package s82;

/* loaded from: classes9.dex */
public class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s82.c f486285a;

    public d(s82.c cVar) {
        this.f486285a = cVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        if (compoundButton.getTag() == null) {
            return;
        }
        o72.r2 r2Var = (o72.r2) compoundButton.getTag();
        s82.c cVar = this.f486285a;
        if (z17) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.f67645x88be67a1);
            if (r2Var.B1) {
                r2Var.C1 = F;
                ((java.util.TreeMap) cVar.f486273d.f486299d).put(r2Var.D1, r2Var);
            } else {
                ((java.util.TreeMap) cVar.f486273d.f486299d).put(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f1(java.lang.Long.valueOf(r2Var.f67645x88be67a1)), F);
            }
        } else if (r2Var.B1) {
            ((java.util.TreeMap) cVar.f486273d.f486299d).remove(r2Var.D1);
        } else {
            ((java.util.TreeMap) cVar.f486273d.f486299d).remove(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f1(java.lang.Long.valueOf(r2Var.f67645x88be67a1)));
        }
        s82.h hVar = cVar.f486273d.f486300e;
        if (hVar != null) {
            hVar.F4(r2Var.f67645x88be67a1, z17);
        }
    }
}
