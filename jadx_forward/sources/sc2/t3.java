package sc2;

/* loaded from: classes2.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.u3 f487793d;

    public t3(sc2.u3 u3Var) {
        this.f487793d = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        sc2.u3 u3Var = this.f487793d;
        xc2.p0 p0Var = u3Var.f84680h;
        android.view.View view = u3Var.f84676d;
        if (p0Var == null || view == null) {
            return;
        }
        java.util.ArrayList arrayList = p0Var.Z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if ((((xc2.p0) next).f534790s == 35 ? 1 : 0) != 0) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() != u3Var.f487814y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TAG", "pag size err, need " + u3Var.f487814y + ", but get " + arrayList2.size());
            return;
        }
        for (java.lang.Object obj : arrayList2) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            xc2.p0 p0Var2 = (xc2.p0) obj;
            java.lang.Integer num = (java.lang.Integer) u3Var.A.get(java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) view.findViewById(num != null ? num.intValue() : com.p314xaae8f345.mm.R.id.tbz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22789xd23e9a9b);
            u3Var.G(p0Var2, c22789xd23e9a9b);
            i17 = i18;
        }
    }
}
