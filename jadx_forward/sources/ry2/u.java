package ry2;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.y f483028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f483029e;

    public u(ry2.y yVar, java.util.ArrayList arrayList) {
        this.f483028d = yVar;
        this.f483029e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String i17;
        android.graphics.Bitmap J2;
        ry2.y yVar = this.f483028d;
        java.util.ArrayList arrayList = yVar.f483044v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
        int i18 = 0;
        for (java.lang.Object obj : arrayList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String file = (java.lang.String) obj;
            boolean z17 = i18 == 0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(file, "file");
            java.util.ArrayList arrayList2 = yVar.f483045w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList2);
            java.lang.Integer num = (java.lang.Integer) arrayList2.get(i18);
            java.util.ArrayList arrayList3 = this.f483029e;
            if (num != null && num.intValue() == 2) {
                if (arrayList3 == null || arrayList3.size() <= i18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) arrayList3.get(i18))) {
                    i17 = mv2.q.f413151a.e(file, null);
                } else {
                    java.lang.Object obj2 = arrayList3.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                    i17 = (java.lang.String) obj2;
                }
            } else if (arrayList3 == null || arrayList3.size() <= i18 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) arrayList3.get(i18)) || !com.p314xaae8f345.mm.vfs.w6.j((java.lang.String) arrayList3.get(i18))) {
                java.util.ArrayList arrayList4 = yVar.f483047y;
                if (arrayList4.size() > i18 && arrayList4.get(i18) != null) {
                    java.lang.Object obj3 = arrayList4.get(i18);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                    if (((r45.c07) ((r45.dd4) obj3).m75936x14adae67(6)) != null) {
                        mv2.q qVar = mv2.q.f413151a;
                        java.lang.Object obj4 = arrayList4.get(i18);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
                        r45.c07 c07Var = (r45.c07) ((r45.dd4) obj4).m75936x14adae67(6);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c07Var);
                        i17 = qVar.j(file, c07Var);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.PostMixMediaWidget", "no thumb & no thumbRect");
                i17 = mv2.q.f413151a.i(file);
            } else {
                java.lang.Object obj5 = arrayList3.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj5);
                i17 = (java.lang.String) obj5;
            }
            java.lang.String thumbFile = i17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFile, "thumbFile");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostMixMediaWidget", "showVideoThumb, thumbFile:" + thumbFile + ", showThumb:" + z17);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(thumbFile) && (J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(thumbFile, null)) != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ry2.x(yVar, thumbFile, z17, J2, J2));
            }
            if (z17) {
                android.widget.ImageView imageView = yVar.f483041s;
                if (imageView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoPlayIcon");
                    throw null;
                }
                imageView.setVisibility(8);
            }
            i18 = i19;
        }
    }
}
