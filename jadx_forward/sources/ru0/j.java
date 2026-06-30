package ru0;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.me4 f481211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f481212e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f481213f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f481214g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.me4 me4Var, long j17, long j18, float f17) {
        super(1);
        this.f481211d = me4Var;
        this.f481212e = j17;
        this.f481213f = j18;
        this.f481214g = f17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject translation = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(translation, "translation");
        java.lang.String optString = translation.optString("lang");
        if (optString != null) {
            r45.me4 me4Var = this.f481211d;
            me4Var.f461948i = optString;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            java.util.List d17 = ru0.m.d(translation, optString, this.f481212e, this.f481213f, this.f481214g);
            if (d17 != null) {
                me4Var.f461946g.addAll(d17);
            }
        }
        return jz5.f0.f384359a;
    }
}
