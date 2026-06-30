package g63;

/* loaded from: classes8.dex */
public final class c0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.f0 f350629d;

    public c0(g63.f0 f0Var) {
        this.f350629d = f0Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public final void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationPresenter", "onGameLifeContactStorageChange eventId:[%d]", java.lang.Integer.valueOf(w0Var.f398507b));
        if (w0Var.f398507b == 3) {
            java.lang.Object obj = w0Var.f398509d;
            g63.f0 f0Var = this.f350629d;
            f0Var.getClass();
            if (obj instanceof java.lang.String) {
                if (((java.lang.CharSequence) obj).length() > 0) {
                    java.util.LinkedList linkedList = f0Var.f350640b.f350663g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList) {
                        z53.i iVar = (z53.i) obj2;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f67668x5568d387, obj) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f67670x114ef53e, obj)) {
                            arrayList.add(obj2);
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        z53.i iVar2 = (z53.i) it.next();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationPresenter", "[onContactStorageChange] username=" + obj);
                        u45.f a17 = u45.e.a();
                        if (a17 != null) {
                            va3.m0 m0Var = (va3.m0) a17;
                            m0Var.wi(iVar2.f67669xbed8694c);
                            m0Var.wi(iVar2.f67668x5568d387);
                        }
                        z53.o.f551794a.b(iVar2, new g63.w(f0Var));
                    }
                }
            }
        }
    }
}
