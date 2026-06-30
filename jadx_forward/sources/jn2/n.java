package jn2;

/* loaded from: classes5.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.w f382184d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jn2.w wVar) {
        super(1);
        this.f382184d = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        r45.hy1 smartBoxItem = (r45.hy1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smartBoxItem, "smartBoxItem");
        jn2.w wVar = this.f382184d;
        wVar.getClass();
        wVar.f382271y = true;
        android.widget.EditText editText = wVar.f382258i;
        if (editText != null) {
            editText.setText(smartBoxItem.f458086f);
        }
        jn2.w.c(wVar);
        te2.a9.f499416a.a(wVar.f382255f.h7(), 3, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        y0Var = wVar.f382254e;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.m(wVar, smartBoxItem, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
