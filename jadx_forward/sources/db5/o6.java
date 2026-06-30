package db5;

/* loaded from: classes11.dex */
public class o6 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.z6 f309990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f309991e;

    public o6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a, db5.z6 z6Var) {
        this.f309991e = c21516xe823d84a;
        this.f309990d = z6Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = this.f309991e;
        if (c21516xe823d84a.f279118q) {
            java.lang.String m79118xdb574fcd = c21516xe823d84a.m79118xdb574fcd();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m79118xdb574fcd)) {
                db5.z6 z6Var = this.f309990d;
                if (z6Var != null) {
                    int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(m79118xdb574fcd);
                    z6Var.getClass();
                    if (f17 > 36) {
                        z6Var.getClass();
                        int a17 = 36 - com.p314xaae8f345.mm.ui.p2740x696c9db.v4.a(m79118xdb574fcd);
                        if (a17 < m79118xdb574fcd.length()) {
                            m79118xdb574fcd = m79118xdb574fcd.substring(0, a17);
                        }
                    }
                }
                c21516xe823d84a.d(m79118xdb574fcd, true);
                db5.t6 t6Var = c21516xe823d84a.C;
                if (t6Var != null) {
                    t6Var.d(m79118xdb574fcd);
                }
                c21516xe823d84a.g();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
