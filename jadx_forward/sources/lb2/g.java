package lb2;

/* loaded from: classes5.dex */
public final class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f399264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f399265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lb2.j f399266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f399267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f399268h;

    public g(android.widget.EditText editText, android.content.Context context, lb2.j jVar, java.lang.Object obj, int i17) {
        this.f399264d = editText;
        this.f399265e = context;
        this.f399266f = jVar;
        this.f399267g = obj;
        this.f399268h = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Object obj;
        lb2.j jVar = this.f399266f;
        java.lang.String obj2 = r26.n0.u0(this.f399264d.getText().toString()).toString();
        boolean z17 = obj2.length() == 0;
        android.content.Context context = this.f399265e;
        if (z17) {
            db5.t7.m123883x26a183b(context, "输入值不能为空", 0).show();
            return;
        }
        try {
            java.lang.Object obj3 = jVar.f399272g;
            if (obj3 instanceof java.lang.Integer) {
                obj = java.lang.Integer.valueOf(java.lang.Integer.parseInt(obj2));
            } else if (obj3 instanceof java.lang.Long) {
                obj = java.lang.Long.valueOf(java.lang.Long.parseLong(obj2));
            } else if (obj3 instanceof java.lang.Float) {
                obj = java.lang.Float.valueOf(java.lang.Float.parseFloat(obj2));
            } else {
                obj = obj2;
                if (!(obj3 instanceof java.lang.String)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                    db5.t7.m123883x26a183b(context, "不支持的类型: ".concat(obj3.getClass().getSimpleName()), 0).show();
                    return;
                }
            }
            java.lang.Object obj4 = obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj4, this.f399267g)) {
                return;
            }
            java.util.ArrayList arrayList = jVar.f399274i;
            int i18 = this.f399268h;
            if (arrayList != null) {
            }
            java.util.ArrayList arrayList2 = jVar.f399274i;
            if (arrayList2 != null) {
                arrayList2.add(new mb2.a(obj4, "自定义:" + obj4, null, 4, null));
            }
            jVar.i(i18);
            yz5.a aVar = jVar.f399280r;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } catch (java.lang.ClassCastException e17) {
            db5.t7.m123883x26a183b(context, "类型错误: " + e17.getMessage(), 0).show();
        }
    }
}
