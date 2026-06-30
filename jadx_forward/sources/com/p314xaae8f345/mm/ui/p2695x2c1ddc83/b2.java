package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

@j95.b
/* loaded from: classes9.dex */
public final class b2 extends i95.w implements rv.c3 {
    public nm5.b Ai() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606 c22363xe804606 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288826d;
        c22363xe804606.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        java.util.List j17 = c22363xe804606.j();
        return j17.isEmpty() ^ true ? nm5.j.c(java.lang.Integer.valueOf(((rv.e) kz5.n0.X(j17)).f481374b), java.lang.Integer.valueOf(((rv.e) kz5.n0.i0(j17)).f481374b)) : nm5.j.c(0, 0);
    }

    public rv.n3 Bi(com.p314xaae8f345.mm.p2621x8fb0427b.l4 conversation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        int b17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.w3.b(conversation);
        return b17 != 0 ? b17 != 1 ? b17 != 2 ? rv.n3.f481417d : rv.n3.f481419f : rv.n3.f481418e : rv.n3.f481417d;
    }

    public java.util.List Di() {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 item;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288826d.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        yf5.j0 j0Var = (yf5.j0) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288828f.get();
        if (j0Var != null) {
            for (int i17 = 0; i17 < 20; i17++) {
                yf5.w0 w0Var = (yf5.w0) j0Var;
                if (i17 >= w0Var.f543518q.f543377a || (item = w0Var.getItem(i17)) == null) {
                    break;
                }
                arrayList.add(new rv.e(item, i17));
            }
        }
        return arrayList;
    }

    public int wi() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288826d.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        android.widget.ListView listView = (android.widget.ListView) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288827e.get();
        yf5.j0 j0Var = (yf5.j0) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.f288828f.get();
        if (j0Var != null && listView != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            int max = java.lang.Math.max(w0Var.f543518q.f543377a, 50);
            for (int i17 = 0; i17 < max; i17++) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = w0Var.getItem(i17);
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.k4(item != null ? item.h1() : null)) {
                    return i17;
                }
            }
        }
        return -1;
    }
}
