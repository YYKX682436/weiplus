package cs0;

/* loaded from: classes14.dex */
public final class c implements cs0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 f303569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f303570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f303571c;

    public c(com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862, java.lang.Integer num, int i17) {
        this.f303569a = c10899x89fee862;
        this.f303570b = num;
        this.f303571c = i17;
    }

    public void a(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMoveFinish >> ");
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = this.f303569a;
        sb6.append(c10899x89fee862.f150425r);
        sb6.append(", ");
        java.lang.Integer toDur = this.f303570b;
        sb6.append(toDur);
        sb6.append(' ');
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraFocusAndMeteringView", sb6.toString());
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(toDur, "$toDur");
            int intValue = toDur.intValue();
            int i17 = c10899x89fee862.f150425r;
            int i18 = this.f303571c;
            if (intValue < i17) {
                cs0.b bVar = c10899x89fee862.f150414d;
                if (bVar != null) {
                    ((com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) bVar).l(i18);
                }
            } else {
                cs0.b bVar2 = c10899x89fee862.f150414d;
                if (bVar2 != null) {
                    ((com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.C10897xb8eb1396) bVar2).k(i18);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(toDur, "$toDur");
            c10899x89fee862.f150425r = toDur.intValue();
        }
        c10899x89fee862.f150426s = false;
    }
}
