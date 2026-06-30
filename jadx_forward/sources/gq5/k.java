package gq5;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq5.o f356174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(gq5.o oVar) {
        super(1);
        this.f356174d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        eq5.h hVar;
        eq5.h state = (eq5.h) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        eq5.g gVar = (eq5.g) state.a(eq5.g.class);
        gq5.o oVar = this.f356174d;
        if (gVar != null) {
            oVar.f356189n = gVar.f337446c;
            java.util.List list = gVar.f337445b;
            oVar.f356192q = list;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int f17 = i65.a.f(oVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561211ce);
            int f18 = i65.a.f(oVar.m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.amw);
            java.util.Iterator it = list.iterator();
            while (true) {
                android.graphics.Bitmap bitmap = null;
                if (!it.hasNext()) {
                    break;
                }
                eq5.a aVar = (eq5.a) it.next();
                r45.y77 y77Var = new r45.y77();
                y77Var.f472377e = aVar.f337441c;
                r45.z77 z77Var = aVar.f337440b;
                y77Var.f472376d = z77Var.f473317d;
                r45.a87 a87Var = new r45.a87();
                a87Var.f451365d = aVar.f337442d;
                a87Var.f451366e = aVar.f337443e;
                y77Var.f472378f = a87Var;
                arrayList.add(y77Var);
                if (arrayList2.isEmpty()) {
                    r45.z77 z77Var2 = r45.z77.Image;
                    java.lang.String str = aVar.f337439a;
                    if (z77Var == z77Var2) {
                        bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.T(str, f17, f18, true);
                    } else if (z77Var == r45.z77.Video) {
                        ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                        bitmap = ai3.d.p(str);
                    }
                    if (bitmap != null) {
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        arrayList2.add(new com.p314xaae8f345.mm.p2495xc50a8b8b.g(byteArray));
                    }
                }
            }
            j75.f Q6 = oVar.Q6();
            java.lang.String str2 = oVar.f356188m;
            if (Q6 != null && (hVar = (eq5.h) Q6.mo140437x75286adb()) != null) {
                hVar.f337453n = oVar.f356189n;
                java.util.Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    int ordinal = ((eq5.a) it6.next()).f337440b.ordinal();
                    if (ordinal == 0) {
                        hVar.f337450h++;
                    } else if (ordinal == 1) {
                        hVar.f337451i++;
                    } else if (ordinal == 2) {
                        hVar.f337452m++;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "imgCount:" + hVar.f337450h + ", videoCount:" + hVar.f337451i + ", fileCount:" + hVar.f337452m);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "prepareSendFile, contentInfo size:" + arrayList.size() + ", thumbnails size:" + arrayList2.size());
            aq5.x0 x0Var = new aq5.x0(arrayList, arrayList2);
            j75.f Q62 = oVar.Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.j(x0Var));
            }
            j75.f Q63 = oVar.Q6();
            if (Q63 != null) {
                Q63.B3(new eq5.i(15));
            }
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) oVar.f356155g).mo141623x754a37bb(), null, new gq5.m(x0Var, oVar, null), 1, null);
        }
        if (((eq5.d) state.a(eq5.d.class)) != null) {
            j75.f Q64 = oVar.Q6();
            if (Q64 != null) {
                Q64.B3(new eq5.i(1));
            }
            oVar.U6();
        }
        if (((eq5.f) state.a(eq5.f.class)) != null) {
            j75.f Q65 = oVar.Q6();
            if (Q65 != null) {
                Q65.B3(new eq5.i(1));
            }
            oVar.U6();
        }
        return jz5.f0.f384359a;
    }
}
