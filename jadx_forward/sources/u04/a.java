package u04;

/* loaded from: classes12.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f505002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.x60 f505003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, r45.x60 x60Var) {
        super(0);
        this.f505002d = i17;
        this.f505003e = x60Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity;
        u04.d dVar = u04.d.f505008a;
        jz5.f0 f0Var = null;
        r45.x60 x60Var = this.f505003e;
        java.lang.String str = x60Var != null ? x60Var.f471346d : null;
        if (str == null) {
            str = "";
        }
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryHelper", "topActivity == null or isFinishing or isDestroyed");
        } else {
            if ((x60Var != null ? x60Var.f471348f : null) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryHelper", "recoveryObj == null ");
            } else {
                int i17 = al5.u4.f87591t;
                al5.t4 t4Var = new al5.t4(activity);
                t4Var.f87575e = str;
                t4Var.a(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.odr));
                t4Var.f87571a.f87547b = new u04.c(activity, this.f505002d, x60Var);
                t4Var.f87579i = 10000;
                t4Var.f87578h = i65.a.f(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.anq);
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str2 = x60Var.f471349g;
                objArr[0] = str2 == null || str2.length() == 0 ? "" : x60Var.f471349g;
                t4Var.f87576f = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.odt, objArr);
                t4Var.f87582l = true;
                t4Var.f87572b = 1;
                t4Var.g();
                s04.b bVar = s04.b.f483504a;
                java.util.Map map = s04.b.f483505b;
                ((java.util.LinkedHashMap) map).clear();
                java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
                java.lang.StackTraceElement stackTraceElement = (java.lang.StackTraceElement) kz5.z.U(stackTrace, 2);
                java.lang.String methodName = stackTraceElement != null ? stackTraceElement.getMethodName() : null;
                if (methodName == null) {
                    methodName = "unknown_method";
                }
                s04.a aVar = u04.d.f505011d;
                if (aVar != null) {
                    map.put("exit_wechat_timestamp", java.lang.Long.valueOf(aVar.f483501a));
                    java.lang.Integer num = (java.lang.Integer) s04.b.f483506c.get(java.lang.Integer.valueOf(aVar.f483502b));
                    map.put("watch_before_exiting_type", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryReporter", methodName + ": reportParams: " + map);
                    dy1.r a17 = bVar.a();
                    if (a17 != null) {
                        ((cy1.a) a17).Hj("toast_button", "view_exp", map, 33328);
                        f0Var = f0Var2;
                    }
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecoveryReporter", methodName.concat(": recoveryReportData is null"));
                }
            }
        }
        return f0Var2;
    }
}
