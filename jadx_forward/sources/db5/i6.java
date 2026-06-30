package db5;

/* loaded from: classes11.dex */
public class i6 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f309928d;

    public i6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a) {
        this.f309928d = c21516xe823d84a;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.LinkedList linkedList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        int action = keyEvent.getAction();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = this.f309928d;
        if (action == 0 && 67 == i17) {
            c21516xe823d84a.F.getSelectionStart();
            c21516xe823d84a.F.getSelectionEnd();
            if (!(c21516xe823d84a.F.getSelectionStart() == 0 && c21516xe823d84a.F.getSelectionStart() == c21516xe823d84a.F.getSelectionEnd())) {
                yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            c21516xe823d84a.m();
            java.util.LinkedList linkedList2 = c21516xe823d84a.A;
            if (linkedList2 == null || linkedList2.isEmpty()) {
                yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            if (!c21516xe823d84a.f279117p && c21516xe823d84a.f279127z == null) {
                c21516xe823d84a.f279127z = (db5.b7) c21516xe823d84a.A.getLast();
                c21516xe823d84a.u(c21516xe823d84a.f279127z.f309829b, false, true);
                c21516xe823d84a.F.setCursorVisible(false);
            } else if (c21516xe823d84a.f279127z == null || (linkedList = c21516xe823d84a.A) == null || linkedList.getLast() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21516xe823d84a.f279127z.f309828a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((db5.b7) c21516xe823d84a.A.getLast()).f309828a) || c21516xe823d84a.f279127z.f309828a.equals(((db5.b7) c21516xe823d84a.A.getLast()).f309828a)) {
                java.lang.String str = ((db5.b7) c21516xe823d84a.A.getLast()).f309828a;
                c21516xe823d84a.p(str);
                db5.t6 t6Var = c21516xe823d84a.C;
                if (t6Var != null) {
                    t6Var.a(str);
                }
                c21516xe823d84a.h();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTagPanel", "change hight");
                c21516xe823d84a.h();
                c21516xe823d84a.f279127z = (db5.b7) c21516xe823d84a.A.getLast();
                c21516xe823d84a.u(c21516xe823d84a.f279127z.f309829b, false, true);
                c21516xe823d84a.F.setCursorVisible(false);
            }
        }
        db5.a7 a7Var = c21516xe823d84a.L;
        if (a7Var != null) {
            w82.b1 b1Var = (w82.b1) a7Var;
            if (67 == i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504 = b1Var.f525359a;
                if (c13624x28778504.M.size() > 0 && ((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13624x28778504.f183096x0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13624x28778504.f183097y0)) || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13624x28778504.f183096x0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c13624x28778504.f183097y0) && c13624x28778504.f183093l1 > 1))) {
                    java.util.ArrayList arrayList2 = c13624x28778504.M;
                    java.lang.Object obj = arrayList2.get(arrayList2.size() - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    c13624x28778504.y((w82.s0) obj, true, 19);
                    c13624x28778504.f183093l1 = 1;
                }
                c13624x28778504.f183093l1++;
            } else {
                b1Var.getClass();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
