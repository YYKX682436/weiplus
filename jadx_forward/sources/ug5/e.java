package ug5;

/* loaded from: classes3.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ug5.e f509119d = new ug5.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ug5.g gVar;
        yz5.l lVar;
        android.app.Activity activity = (android.app.Activity) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String stringExtra = activity.getIntent().getStringExtra("intent_key_view_performer");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove performerCache key: ");
            java.util.HashMap hashMap = ug5.v.f509190i;
            sb6.append(hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ViewFluentPerformer", sb6.toString());
            ug5.v vVar = (ug5.v) hashMap.remove(stringExtra);
            if (vVar != null && (gVar = vVar.f509191a) != null && (lVar = gVar.f509124e) != null) {
                lVar.mo146xb9724478(gVar);
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
