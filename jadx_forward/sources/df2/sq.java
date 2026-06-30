package df2;

/* loaded from: classes3.dex */
public final class sq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f312898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(df2.ar arVar) {
        super(0);
        this.f312898d = arVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.ar arVar = this.f312898d;
        int intValue = ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) arVar.f311275r).mo144003x754a37bb()).intValue();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = arVar.f311275r;
        if (intValue > 0) {
            android.widget.TextView d76 = arVar.d7();
            if (d76 != null) {
                d76.setText(no0.l.a(no0.m.f420263a, ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).intValue(), ":", false, false, false, 24, null));
            }
            android.widget.TextView d77 = arVar.d7();
            if (d77 != null) {
                d77.setVisibility(0);
            }
        } else if (((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).intValue() == 0) {
            android.widget.TextView d78 = arVar.d7();
            if (d78 != null) {
                d78.setText(arVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573088nq2));
            }
            android.widget.TextView d79 = arVar.d7();
            if (d79 != null) {
                d79.setVisibility(0);
            }
        }
        if (((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).mo144003x754a37bb()).intValue() > 0) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(java.lang.Integer.valueOf(((java.lang.Number) r2.mo144003x754a37bb()).intValue() - 1));
        }
        return jz5.f0.f384359a;
    }
}
