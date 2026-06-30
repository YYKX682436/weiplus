package gm3;

/* loaded from: classes10.dex */
public final class h extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final gm3.f f355089e;

    public h(gm3.f listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f355089e = listener;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c4t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        gm3.c item = (gm3.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
        c22628xfde5d61d.m81387x205ac394(i65.a.b(holder.f374654e, 8));
        gm3.a aVar = item.f355080h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar != null ? aVar.f355070c : null)) {
            gm3.b bVar = item.f355081i;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar != null ? bVar.f355074a : null)) {
                gm3.b bVar2 = item.f355081i;
                java.lang.String str = bVar2 != null ? bVar2.f355074a : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                ll3.i1 i1Var = ll3.i1.f400715a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thumb_");
                byte[] bytes = str.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                sb6.append(kk.k.g(bytes));
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(i1Var.b(sb6.toString())).o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                o11.f fVar = new o11.f();
                fVar.f423611b = true;
                fVar.f423610a = true;
                fVar.f423615f = o17;
                java.lang.Object[] objArr = new java.lang.Object[1];
                gm3.b bVar3 = item.f355081i;
                objArr[0] = bVar3 != null ? bVar3.f355074a : null;
                fVar.f423635z = objArr;
                n11.a b17 = n11.a.b();
                gm3.b bVar4 = item.f355081i;
                b17.h(bVar4 != null ? bVar4.f355074a : null, c22628xfde5d61d, fVar.a());
            }
        } else {
            gm3.a aVar2 = item.f355080h;
            if (aVar2 != null) {
                long j17 = aVar2.f355068a;
                if (-1 == j17) {
                    o11.f fVar2 = new o11.f();
                    fVar2.f423610a = true;
                    fVar2.f423618i = 1;
                    n11.a.b().h(aVar2.f355070c, c22628xfde5d61d, fVar2.a());
                } else {
                    long j18 = aVar2.f355069b;
                    e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
                    java.lang.String str2 = aVar2.f355070c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ((o23.i) b1Var).Ai(c22628xfde5d61d, 2, str2, "", j17, j18);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.crz);
        c22699x3dcdb352.setVisibility(8);
        if (item.f355077e != 0) {
            c22699x3dcdb352.setVisibility(0);
        }
        c22699x3dcdb352.setOnClickListener(new gm3.g(this, i17, item));
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.oyt);
        if (item.f355082m > 0) {
            textView.setVisibility(0);
            int i19 = item.f355082m;
            if (i19 < 0) {
                textView.setText("--:--");
            } else {
                int a17 = lm3.d0.a(i19);
                java.lang.String valueOf = java.lang.String.valueOf(a17 % 60);
                if (valueOf.length() < 2) {
                    valueOf = "0".concat(valueOf);
                }
                textView.setText((a17 / 60) + ':' + valueOf);
            }
        } else {
            textView.setVisibility(8);
        }
        int i27 = item.f355083n;
        if (i27 != -1) {
            holder.f3639x46306858.setBackgroundResource(i27);
        } else {
            holder.f3639x46306858.setBackground(null);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
