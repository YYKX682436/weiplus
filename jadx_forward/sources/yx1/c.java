package yx1;

/* loaded from: classes13.dex */
public class c extends yx1.d {
    public c(java.lang.Object obj) {
        super(obj);
        yx1.d.f549357b = "mHandler";
    }

    @Override // yx1.d, java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        java.lang.Object obj2 = this.f549358a;
        if (obj2 == null) {
            return null;
        }
        if (method.getName().equals("enqueueToast") && objArr[1].getClass().getName().equals("android.widget.Toast$TN")) {
            try {
                java.lang.reflect.Field declaredField = objArr[1].getClass().getDeclaredField(yx1.d.f549357b);
                declaredField.setAccessible(true);
                tx1.a.a(declaredField);
                declaredField.set(objArr[1], new yx1.b(this, (android.os.Handler) declaredField.get(objArr[1])));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INotificationManagerInvocationHandler", "replace Toast.TN.mShow succ");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.INotificationManagerInvocationHandler", e17.getMessage());
            }
        }
        return method.invoke(obj2, objArr);
    }
}
