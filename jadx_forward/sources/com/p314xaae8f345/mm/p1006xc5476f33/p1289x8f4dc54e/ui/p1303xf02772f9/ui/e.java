package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

/* loaded from: classes4.dex */
public final class e extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569785o6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a item = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jbb);
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jbe);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jbc);
        r45.zm zmVar = item.f176092d;
        java.lang.String str3 = zmVar.f473737g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zmVar.f473738h)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            textView.setText(c01.a2.e(str3));
        } else {
            textView.setText(zmVar.f473738h);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p943x351df9c2.g.a(str3);
        if (a17 != null) {
            imageView.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.s0(a17, false, a17.getWidth() / 2));
        } else {
            o11.f fVar = new o11.f();
            fVar.f423626q = com.p314xaae8f345.mm.R.C30861xcebc809e.bgo;
            fVar.f423612c = true;
            fVar.f423629t = true;
            n11.a.b().h(zmVar.f473739i, imageView, fVar.a());
        }
        java.util.LinkedList linkedList = zmVar.f473735e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(linkedList, "null cannot be cast to non-null type java.util.LinkedList<com.tencent.mm.protocal.protobuf.BizManageScopeItem>");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.fl) it.next()).f455950e);
        }
        java.lang.String[] wordings = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.f fVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.f.f176103a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d69039);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wordings, "wordings");
        if (wordings.length == 0) {
            str = c22624x85d69039.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ana);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        } else if (wordings.length == 1) {
            str = wordings[0];
        } else {
            int length = wordings.length;
            int i19 = 0;
            java.lang.String str4 = "";
            for (int i27 = 0; i27 < length; i27++) {
                str4 = fVar2.b(wordings, i27);
                if (fVar2.a(c22624x85d69039, str4)) {
                    break;
                }
                i19 = i27;
            }
            if (i19 < 1) {
                str = str4;
            } else {
                java.lang.String str5 = "";
                while (-1 < i19) {
                    java.lang.String b17 = fVar2.b(wordings, i19);
                    int length2 = (wordings.length - 1) - i19;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(b17);
                    if (length2 > 0) {
                        java.lang.String string = c22624x85d69039.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.and);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        str2 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(length2)}, 1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "format(...)");
                    } else {
                        str2 = "";
                    }
                    sb6.append(str2);
                    str5 = sb6.toString();
                    if (!fVar2.a(c22624x85d69039, str5)) {
                        break;
                    } else {
                        i19--;
                    }
                }
                str = str5;
            }
        }
        c22624x85d69039.b(str);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
