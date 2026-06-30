package f12;

/* loaded from: classes4.dex */
public final class a0 implements p012xc85e97e9.p093xedfae76a.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340101a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340101a = activityC13254xf536ee79;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        android.os.Bundle extras = this.f340101a.getIntent().getExtras();
        if (extras == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        java.lang.String string = extras.getString("egg_name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        java.lang.String string2 = extras.getString("keyword");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        return new f12.j0(string, string2, extras.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd), extras.getString("trace_id"), extras.getString("background"));
    }
}
