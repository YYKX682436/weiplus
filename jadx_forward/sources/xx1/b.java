package xx1;

/* loaded from: classes7.dex */
public class b implements java.lang.reflect.InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f539493a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f539494b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Field f539495c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.reflect.Field f539496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f539497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xx1.c f539498f;

    public b(xx1.c cVar, java.lang.Object obj) {
        this.f539498f = cVar;
        this.f539493a = obj;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init start");
            java.lang.Class<?> cls = java.lang.Class.forName("com.android.internal.view.IInputConnectionWrapper");
            java.lang.reflect.Field c17 = xx1.c.c(cVar, cls, "mH");
            this.f539495c = c17;
            c17.setAccessible(true);
            java.lang.reflect.Field declaredField = android.os.Handler.class.getDeclaredField("mCallback");
            this.f539496d = declaredField;
            declaredField.setAccessible(true);
            java.lang.reflect.Field c18 = xx1.c.c(cVar, cls, "DO_GET_TEXT_BEFORE_CURSOR");
            c18.setAccessible(true);
            this.f539497e = ((java.lang.Integer) c18.get(null)).intValue();
            this.f539494b = java.lang.Class.forName("com.android.internal.view.IInputConnectionWrapper");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init succ");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "MyProxy init fail");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GetTextBeforeCursorFix", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Class<? super java.lang.Object> cls = this.f539494b;
        if (cls != null) {
            xx1.c cVar = this.f539498f;
            if (cVar.d() && method.getName().equals("startInputOrWindowGainedFocus")) {
                int i17 = 0;
                while (true) {
                    if (i17 >= objArr.length) {
                        break;
                    }
                    java.lang.Object obj2 = objArr[i17];
                    if (obj2 == null || obj2.getClass().getSuperclass() != cls) {
                        i17++;
                    } else {
                        android.os.Handler handler = (android.os.Handler) this.f539495c.get(objArr[i17]);
                        java.lang.reflect.Field field = this.f539496d;
                        if (field.get(handler) == null) {
                            field.set(handler, new xx1.a(cVar, handler, this.f539497e));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "protect succ");
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetTextBeforeCursorFix", "add protected succ");
                    }
                }
            }
        }
        return method.invoke(this.f539493a, objArr);
    }
}
